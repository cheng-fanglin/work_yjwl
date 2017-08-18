/**
 * Assert.java
 */
package com.base.util;

import java.util.Collection;
import java.util.Map;

/**
 * @fileName Assert.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-8-31
 * @time 下午10:07:26
 */
public final class Assert {
	private Assert() {

	}

	public static final void isTrue(boolean expr) {
		Assert.isTrue(expr, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "the expression must be true.");
	}

	public static final void isTrue(boolean expr, String message) {
		if (!expr) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void isNotTrue(boolean expr) {
		Assert.isNotTrue(expr, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "the expression must not be true.");
	}

	public static final void isNotTrue(boolean expr, String message) {
		if (expr) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void isNull(Object object) {
		Assert.isNull(object, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "object must be null.");
	}

	public static final void isNull(Object object, String message) {
		if (null != object) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notNull(Object object) {
		Assert.notNull(object, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "object must not be null.");
	}

	public static final void notNull(Object object, String message) {
		if (null == object) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void hasLength(String stringValue) {
		Assert.hasLength(stringValue, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "string must has length.");
	}

	public static final void hasLength(String stringValue, String message) {
		if (!StringUtils.hasLength(stringValue)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void hasText(String stringValue) {
		Assert.hasText(stringValue, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "string must has text.");
	}

	public static final void hasText(String stringValue, String message) {
		if (!StringUtils.hasText(stringValue)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void doesNotContain(String stringValue, String substring) {
		Assert.doesNotContain(stringValue, substring,
				Assert.ASSERT_FAILURE_MESSAGE_HEADER + "string [" + stringValue
						+ "] must not contain the substring [" + substring
						+ "]");
	}

	public static final void doesNotContain(String stringValue,
			String substring, String message) {
		if (StringUtils.hasLength(stringValue)
				&& StringUtils.hasLength(substring)
				&& stringValue.indexOf(substring) != -1) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(Object objectArray[]) {
		Assert.notEmpty(objectArray, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "array must not be empty.");
	}

	public static final void notEmpty(Object objectArray[], String message) {
		if (ObjectUtils.isEmpty(objectArray)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(String stringValue) {
		Assert.notEmpty(stringValue, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "string must not be empty.");
	}

	public static final void notEmpty(String stringValue, String message) {
		if (StringUtils.isEmpty(stringValue)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(boolean[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(boolean[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(byte[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(byte[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(char[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(char[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(short[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(short[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(int[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(int[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(long[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(long[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(float[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(float[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(double[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
	}

	public static final void notEmpty(double[] array, String message) {
		if (ArrayUtils.isEmpty(array)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void noNullElements(Object objectArray[]) {
		Assert.noNullElements(objectArray, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "array must not contain any null elements");
	}

	public static final void noNullElements(Object objectArray[], String message) {
		if (null != objectArray) {
			for (int i = 0; i < objectArray.length; i++) {
				if (null == objectArray[i]) {
					throw new IllegalArgumentException(message);
				}
			}
		}
	}

	public static final void notEmpty(Collection<? extends Object> collection) {
		Assert.notEmpty(collection, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "collection must not be empty.");
	}

	public static final void notEmpty(Collection<? extends Object> collection,
			String message) {
		if (CollectionUtils.isEmpty(collection)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(Map<Object, Object> map, String message) {
		if (CollectionUtils.isEmpty(map)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void notEmpty(Map<Object, Object> map) {
		Assert.notEmpty(map, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "map must not be empty.");
	}

	public static final void isInstanceOf(Class<?> clazz, Object object) {
		Assert.isInstanceOf(clazz, object, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "object must be an instanceof type.");
	}

	public static final void isInstanceOf(Class<?> type, Object obj,
			String message) {
		Assert.notNull(type, "Type to check against must not be null");
		if (!type.isInstance(obj)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static final void isAssignable(Class<?> superType, Class<?> subType) {
		isAssignable(superType, subType, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "superType must be assignable from subType.");
	}

	public static final void isAssignable(Class<?> superType, Class<?> subType,
			String message) {
		notNull(superType, "Type to check against must not be null");
		if (null == subType || !superType.isAssignableFrom(subType)) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void state(boolean expression, String message) {
		if (!expression) {
			throw new IllegalArgumentException(message);
		}
	}

	public static void state(boolean expression) {
		Assert.state(expression, Assert.ASSERT_FAILURE_MESSAGE_HEADER
				+ "state expression must be true");
	}

	public static final String ASSERT_FAILURE_MESSAGE_HEADER = "[Assertion failed]:";
}
