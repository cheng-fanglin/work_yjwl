/**
 * ClassUtils.java
 */
package com.base.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @fileName ClassUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-9-8
 * @time 下午03:14:06
 */
public final class ClassUtils {
	private ClassUtils() {

	}

	public static final char PACKAGE_SEPARATOR_CHAR = '.';
	public static final String PACKAGE_SEPARATOR = ".";
	public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
	public static final String INNER_CLASS_SEPARATOR = "$";
	public static final String ARRAY_CLASSNAME_SUFFIX = "[]";

	private static final Map<String, String> abbreviationMap = new HashMap<String, String>();
	private static final Map<String, String> reverseAbbreviationMap = new HashMap<String, String>();
	static {
		addAbbreviation("int", "I");
		addAbbreviation("boolean", "Z");
		addAbbreviation("float", "F");
		addAbbreviation("long", "J");
		addAbbreviation("short", "S");
		addAbbreviation("byte", "B");
		addAbbreviation("double", "D");
		addAbbreviation("char", "C");
	}

	private static final void addAbbreviation(String primary,
			String abbreviation) {
		ClassUtils.abbreviationMap.put(primary, abbreviation);
		ClassUtils.reverseAbbreviationMap.put(abbreviation, primary);
	}

	public static final Set<Class<?>> getAllSuperClasses(Object object) {
		if (null == object) {
			return EMPTY_CLASSES_SET;
		}
		return ClassUtils.getAllSuperClasses(object.getClass());
	}

	public static final Set<Class<?>> getAllSuperClasses(Class<?> clazz) {
		if (null == clazz) {
			return EMPTY_CLASSES_SET;
		}
		Set<Class<?>> superClasses = new LinkedHashSet<Class<?>>();
		Class<?> superClass = clazz.getSuperclass();
		while (null != superClass) {
			superClasses.add(superClass);
			superClass = superClass.getSuperclass();
		}
		return superClasses;
	}

	public static final Set<Class<?>> getAllInterfaces(Object object) {
		if (null == object) {
			return EMPTY_CLASSES_SET;
		}
		return ClassUtils.getAllInterfaces(object.getClass());
	}

	public static final Set<Class<?>> getAllInterfaces(Class<?> clazz) {
		if (null == clazz) {
			return ClassUtils.EMPTY_CLASSES_SET;
		}
		Set<Class<?>> interfaces = new LinkedHashSet<Class<?>>();
		while (null != clazz) {
			Class<?>[] interfacesFound = clazz.getInterfaces();
			for (Class<?> interfaceClass : interfacesFound) {
				interfaces.add(interfaceClass);
				interfaces.addAll(ClassUtils.getAllInterfaces(interfaceClass));
			}
			clazz = clazz.getSuperclass();
		}
		return interfaces;
	}

	public static final boolean isAssignable(Class<?> clazz, Class<?> toClazz) {
		return ClassUtils.isAssignable(clazz, toClazz, true);
	}

	public static final boolean isAssignable(Class<?> clazz, Class<?> toClazz,
			boolean useAutoBoxing) {
		if (null == toClazz) {
			return false;
		}
		if (null == clazz) {
			return !toClazz.isPrimitive();
		}
		if (useAutoBoxing) {
			if (clazz.isPrimitive() && !toClazz.isPrimitive()) {
				clazz = ClassUtils.primitiveToWrapper(clazz);
				if (null == clazz) {
					return false;
				}
			}
			if (!clazz.isPrimitive() && toClazz.isPrimitive()) {
				toClazz = ClassUtils.primitiveToWrapper(toClazz);
				if (null == toClazz) {
					return false;
				}
			}
		}
		if (clazz.equals(toClazz)) {
			return true;
		}
		if (clazz.isPrimitive()) {
			if (toClazz.isPrimitive() == false) {
				return false;
			} else if (Integer.TYPE.equals(clazz)) {
				return ClassUtils.getIntegerAssignableClasses().contains(
						toClazz);
			} else if (Long.TYPE.equals(clazz)) {
				return ClassUtils.getLongAssignableClasses().contains(toClazz);
			} else if (Boolean.TYPE.equals(clazz)) {
				return ClassUtils.getBooleanAssignableClasses().contains(
						toClazz);
			} else if (Double.TYPE.equals(clazz)) {
				return ClassUtils.getDoubleAssignableClasses()
						.contains(toClazz);
			} else if (Float.TYPE.equals(clazz)) {
				return ClassUtils.getFloatAssignableClasses().contains(toClazz);
			} else if (Character.TYPE.equals(clazz)) {
				return ClassUtils.getCharacterAssignableClasses().contains(
						toClazz);
			} else if (Short.TYPE.equals(clazz)) {
				return ClassUtils.getShortAssignableClasses().contains(toClazz);
			} else if (Byte.TYPE.equals(clazz)) {
				return ClassUtils.getByteAssignableClasses().contains(toClazz);
			} else {

				// 不可能发生
				return false;
			}
		}
		return toClazz.isAssignableFrom(clazz);
	}

	public static final Class<?> primitiveToWrapper(Class<?> clazz) {
		Class<?> convertedClass = clazz;
		if (clazz != null && clazz.isPrimitive()) {
			convertedClass = primitiveWrapperMap.get(clazz);
		}
		return convertedClass;
	}

	public static final boolean isInnerClass(Class<?> clazz) {
		if (null == clazz) {
			return false;
		}
		return -1 != clazz.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR);
	}

	public static final Class<?> getClass(ClassLoader classLoader,
			String className, boolean initialize) throws ClassNotFoundException {
		Class<?> clazz = null;
		Assert.notEmpty(className);
		if (ClassUtils.abbreviationMap.containsKey(className)) {
			className = "[" + ClassUtils.abbreviationMap.get(className);
			clazz = Class.forName(className, initialize, classLoader)
					.getComponentType();
		} else {
			clazz = Class.forName(ClassUtils.getJLSClassName(className),
					initialize, classLoader);
		}
		return clazz;
	}

	public static final Class<?> getClass(ClassLoader classLoader,
			String className) throws ClassNotFoundException {
		return ClassUtils.getClass(classLoader, className, true);
	}

	public static final Class<?> getClass(String className, boolean initialize)
		throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		if (null == classLoader) {
			classLoader = ClassUtils.class.getClassLoader();
		}
		return ClassUtils.getClass(classLoader, className, initialize);
	}

	public static final Class<?> getClass(String className)
		throws ClassNotFoundException {
		return ClassUtils.getClass(className, true);
	}

	public static final String getJLSClassName(String className) {
		className = StringUtils.deleteWhitespace(className);
		Assert.hasText(className, "Class name cann't be blank.");
		if (StringUtils.endsWith(className, ClassUtils.ARRAY_CLASSNAME_SUFFIX)) {
			StringBuffer classNameBuffer = new StringBuffer(16);
			while (StringUtils.endsWith(className,
					ClassUtils.ARRAY_CLASSNAME_SUFFIX)) {
				className = className.substring(0, className.length()
						- ClassUtils.ARRAY_CLASSNAME_SUFFIX.length());
				classNameBuffer.append("[");
			}
			String abbrivation = ClassUtils.abbreviationMap.get(className);
			if (StringUtils.isNotEmpty(abbrivation)) {
				classNameBuffer.append(abbrivation);
			} else {
				classNameBuffer.append("L" + className + ";");
			}
			className = classNameBuffer.toString();
		}
		return className;
	}

	public static final Method getPublicMethod(Class<?> clazz,
			String methodName, Class<?>[] parameterTypes)
		throws SecurityException, NoSuchMethodException {
		Assert.notNull(clazz, "Class cann't be null.");
		Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
		if(Modifier.isPublic(method.getModifiers())){
			return method;
		}
		Set<Class<?>> candidateClasses=new LinkedHashSet<Class<?>>();
		candidateClasses.addAll(ClassUtils.getAllInterfaces(clazz));
		candidateClasses.addAll(ClassUtils.getAllSuperClasses(clazz));
		for(Class<?> cls:candidateClasses){
			if(!Modifier.isPublic(cls.getModifiers())){
				continue;
			}
			try{
				method=cls.getDeclaredMethod(methodName, parameterTypes);
				
			}catch(NoSuchMethodException e){
				continue;
			}catch(SecurityException e){
				continue;
			}
			
			if(Modifier.isPublic(method.getModifiers())){
				return method;
			}
		}
		throw new NoSuchMethodException("Cann't find a public method named:"+methodName);
	}

	public static final List<Class<?>> getCharacterAssignableClasses() {
		return ClassUtils.CHARACTER_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getBooleanAssignableClasses() {
		return ClassUtils.BOOLEAN_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getByteAssignableClasses() {
		return ClassUtils.BYTE_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getShortAssignableClasses() {
		return ClassUtils.SHORT_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getIntegerAssignableClasses() {
		return ClassUtils.INTEGER_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getLongAssignableClasses() {
		return ClassUtils.LONG_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getFloatAssignableClasses() {
		return ClassUtils.FLOAT_ASSIGNABLE_CLASSES;
	}

	public static final List<Class<?>> getDoubleAssignableClasses() {
		return ClassUtils.DOUBLE_ASSIGNABLE_CLASSES;
	}

	private static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<Class<?>, Class<?>>();
	static {
		primitiveWrapperMap.put(Boolean.TYPE, Boolean.class);
		primitiveWrapperMap.put(Byte.TYPE, Byte.class);
		primitiveWrapperMap.put(Character.TYPE, Character.class);
		primitiveWrapperMap.put(Short.TYPE, Short.class);
		primitiveWrapperMap.put(Integer.TYPE, Integer.class);
		primitiveWrapperMap.put(Long.TYPE, Long.class);
		primitiveWrapperMap.put(Double.TYPE, Double.class);
		primitiveWrapperMap.put(Float.TYPE, Float.class);
		primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
	}
	private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<Class<?>, Class<?>>();
	static {
		for (Iterator<Class<?>> it = primitiveWrapperMap.keySet().iterator(); it
				.hasNext();) {
			Class<?> primitiveClass = it.next();
			Class<?> wrapperClass = primitiveWrapperMap.get(primitiveClass);
			if (!primitiveClass.equals(wrapperClass)) {
				wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
			}
		}
	}
	private static final List<Class<?>> CHARACTER_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		CHARACTER_ASSIGNABLE_CLASSES.add(Character.TYPE);
		CHARACTER_ASSIGNABLE_CLASSES.add(Integer.TYPE);
		CHARACTER_ASSIGNABLE_CLASSES.add(Long.TYPE);
		CHARACTER_ASSIGNABLE_CLASSES.add(Float.TYPE);
		CHARACTER_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}
	private static final List<Class<?>> BYTE_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		BYTE_ASSIGNABLE_CLASSES.add(Byte.TYPE);
		BYTE_ASSIGNABLE_CLASSES.add(Short.TYPE);
		BYTE_ASSIGNABLE_CLASSES.add(Integer.TYPE);
		BYTE_ASSIGNABLE_CLASSES.add(Long.TYPE);
		BYTE_ASSIGNABLE_CLASSES.add(Float.TYPE);
		BYTE_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}
	private static final List<Class<?>> BOOLEAN_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		BOOLEAN_ASSIGNABLE_CLASSES.add(Boolean.TYPE);
	}
	private static final List<Class<?>> SHORT_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		SHORT_ASSIGNABLE_CLASSES.add(Short.TYPE);
		SHORT_ASSIGNABLE_CLASSES.add(Integer.TYPE);
		SHORT_ASSIGNABLE_CLASSES.add(Long.TYPE);
		SHORT_ASSIGNABLE_CLASSES.add(Float.TYPE);
		SHORT_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}
	private static final List<Class<?>> INTEGER_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		INTEGER_ASSIGNABLE_CLASSES.add(Integer.TYPE);
		INTEGER_ASSIGNABLE_CLASSES.add(Long.TYPE);
		INTEGER_ASSIGNABLE_CLASSES.add(Float.TYPE);
		INTEGER_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}
	private static final List<Class<?>> LONG_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		LONG_ASSIGNABLE_CLASSES.add(Long.TYPE);
		LONG_ASSIGNABLE_CLASSES.add(Float.TYPE);
		LONG_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}
	private static final List<Class<?>> FLOAT_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		FLOAT_ASSIGNABLE_CLASSES.add(Float.TYPE);
		FLOAT_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}
	private static final List<Class<?>> DOUBLE_ASSIGNABLE_CLASSES = new LinkedList<Class<?>>();
	static {
		DOUBLE_ASSIGNABLE_CLASSES.add(Double.TYPE);
	}

	public static final List<Class<?>> EMPTY_CLASSES_LIST = new ArrayList<Class<?>>();
	public static final Set<Class<?>> EMPTY_CLASSES_SET = new HashSet<Class<?>>();
}
