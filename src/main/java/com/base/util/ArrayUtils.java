/**
 * ArrayUtils.java
 */
package com.base.util;

/**
 * @fileName ArrayUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-9-9
 * @time 上午09:23:49
 */
public final class ArrayUtils {
	private ArrayUtils() {

	}

	public static final String toString(Object object) {
		return ArrayUtils.toString(object, "{}");
	}

	public static final String toString(Object object, String stringIfNull) {
		if (null == object) {
			return stringIfNull;
		}
		return null;
	}

	public static boolean isEmpty(Object[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(long[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(int[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(short[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(char[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(byte[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(double[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(float[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(boolean[] array) {
		if (array == null || array.length == 0) {
			return true;
		}
		return false;
	}

	public static boolean isNotEmpty(Object[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(long[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(int[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(short[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(char[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(byte[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(double[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(float[] array) {
		return (array != null && array.length != 0);
	}

	public static boolean isNotEmpty(boolean[] array) {
		return (array != null && array.length != 0);
	}
}
