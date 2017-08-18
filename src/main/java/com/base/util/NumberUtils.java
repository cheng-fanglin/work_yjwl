package com.base.util;

import java.util.Random;


/**
 * @fileName NumberUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-9-11
 * @time 上午10:01:11
 */
public final class NumberUtils {
	private NumberUtils() {
		super();
	}

	/** * 判断字符串是否是整数 */
	public static boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/** * 判断字符串是否是浮点数 */
	public static boolean isDouble(String value) {
		try {
			Double.parseDouble(value);
			if (value.contains("."))
				return true;
			return false;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/** * 判断字符串是否是数字 */
	public static boolean isNumber(String value) {
		return isInteger(value) || isDouble(value);
	}

	public static final int toInt(String stringValue) {
		return toInt(stringValue, 0);
	}

	public static final int toInt(String stringValue, int defaultValue) {
		if (stringValue == null) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(stringValue);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static final long toLong(String stringValue) {
		return toLong(stringValue, 0L);
	}

	public static final long toLong(String stringValue, long defaultValue) {
		if (stringValue == null) {
			return defaultValue;
		}
		try {
			return Long.parseLong(stringValue);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static final float toFloat(String stringValue) {
		return toFloat(stringValue, 0.0f);
	}

	public static final float toFloat(String stringValue, float defaultValue) {
		if (stringValue == null) {
			return defaultValue;
		}
		try {
			return Float.parseFloat(stringValue);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static final double toDouble(String stringValue) {
		return toDouble(stringValue, 0.0d);
	}

	public static final double toDouble(String stringValue, double defaultValue) {
		if (stringValue == null) {
			return defaultValue;
		}
		try {
			return Double.parseDouble(stringValue);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static final byte toByte(String stringValue) {
		return toByte(stringValue, (byte) 0);
	}

	public static final byte toByte(String stringValue, byte defaultValue) {
		if (stringValue == null) {
			return defaultValue;
		}
		try {
			return Byte.parseByte(stringValue);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static final short toShort(String stringValue) {
		return toShort(stringValue, (short) 0);
	}

	public static final short toShort(String stringValue, short defaultValue) {
		if (stringValue == null) {
			return defaultValue;
		}
		try {
			return Short.parseShort(stringValue);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static final long min(long[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		long min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}

	public static final int min(int[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		int min = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] < min) {
				min = array[j];
			}
		}
		return min;
	}

	public static final short min(short[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		short min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static final byte min(byte[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		byte min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static final double min(double[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (Double.isNaN(array[i])) {
				return Double.NaN;
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static final float min(float[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		float min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (Float.isNaN(array[i])) {
				return Float.NaN;
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static final long max(long[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		long max = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static final int max(int[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		int max = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static final short max(short[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		short max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static final byte max(byte[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		byte max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static final double max(double[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		double max = array[0];
		for (int j = 1; j < array.length; j++) {
			if (Double.isNaN(array[j])) {
				return Double.NaN;
			}
			if (array[j] > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static final float max(float[] array) {
		Assert.notEmpty(array, "Array cannot be empty.");
		float max = array[0];
		for (int j = 1; j < array.length; j++) {
			if (Float.isNaN(array[j])) {
				return Float.NaN;
			}
			if (array[j] > max) {
				max = array[j];
			}
		}
		return max;
	}

	public static final long min(long a, long b, long c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static final int min(int a, int b, int c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static final short min(short a, short b, short c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static final byte min(byte a, byte b, byte c) {
		if (b < a) {
			a = b;
		}
		if (c < a) {
			a = c;
		}
		return a;
	}

	public static final double min(double a, double b, double c) {
		return Math.min(Math.min(a, b), c);
	}

	public static final float min(float a, float b, float c) {
		return Math.min(Math.min(a, b), c);
	}

	public static final long max(long a, long b, long c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static final int max(int a, int b, int c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static final short max(short a, short b, short c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static final byte max(byte a, byte b, byte c) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		return a;
	}

	public static final double max(double a, double b, double c) {
		return Math.max(Math.max(a, b), c);
	}

	public static final float max(float a, float b, float c) {
		return Math.max(Math.max(a, b), c);
	}
	public static final int compare(double lhs, double rhs) {
		if (lhs < rhs) {
			return -1;
		}
		if (lhs > rhs) {
			return +1;
		}
		long lhsBits = Double.doubleToLongBits(lhs);
		long rhsBits = Double.doubleToLongBits(rhs);
		if (lhsBits == rhsBits) {
			return 0;
		}
		if (lhsBits < rhsBits) {
			return -1;
		} else {
			return +1;
		}
	}
	public static final boolean isDigits(String stringValue) {
		if (StringUtils.isEmpty(stringValue)) {
			return false;
		}
		for (int i = 0; i < stringValue.length(); i++) {
			if (!Character.isDigit(stringValue.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @description 生成文件名随机数4位（图片上传）
	 * @return
	 * @author wll 2016-1-12 下午3:56:49
	 */
	public static final String getRandom() {
		Random random = new Random();
		
		StringBuffer randomBf = new StringBuffer();
		for(int i=0;i<4;i++) {
			randomBf.append(String.valueOf(random.nextInt(9)));
		}
		
		return randomBf.toString();
	}
}
