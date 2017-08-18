/**
 * MoneyUtils.java
 */
package com.base.util;

import java.math.BigInteger;
import java.text.*;

/**
 * @fileName MoneyUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-8-31
 * @time 下午09:59:21
 */
public final class MoneyUtils {
	/**
	 * 输入中文小写数字，回传阿拉伯 数字. <br>
	 * Ex : 一百九十 => 190
	 */
	public static final String getArNumByLChnFmt(String littleChineseNum) {
		DecimalFormat fm = new DecimalFormat("#,###,###");
		return fm.format(Double.parseDouble(getArNumByLChn(littleChineseNum)));
	}

	/**
	 * eg. "一百二十三亿零七百零六万" 转化为 "12307060000"
	 * 
	 * @param littleChineseNum
	 * @return
	 */
	public static final String getArNumByLChn(String littleChineseNum) {
		Assert.hasText(littleChineseNum, "中文数字不能为空值");
		littleChineseNum = littleChineseNum.replaceAll("零", "");
		String ans[] = { "", "", "", "" };
		int thousandNums[] = { 0, 0, 0, 0 };

		for (int i = 0; i < NUM_UNIT.length; i++) {
			int pos = littleChineseNum.indexOf(NUM_UNIT[i]);
			if (pos != -1) {
				ans[i] = littleChineseNum.substring(0, pos);
				littleChineseNum = littleChineseNum.substring(pos + 1);
			}
		}
		ans[3] = littleChineseNum;

		for (int i = 0; i < ans.length; i++) {
			if (!ans[i].equals("")) {
				thousandNums[i] = getThousandNum(ans[i]);
			}
		}
		BigInteger bi1 = new BigInteger(String.valueOf(thousandNums[0]))
				.multiply(new BigInteger("1000000000000"));
		BigInteger bi2 = new BigInteger(String.valueOf(thousandNums[1]))
				.multiply(new BigInteger("100000000"));
		BigInteger bi3 = new BigInteger(String.valueOf(thousandNums[2]))
				.multiply(new BigInteger("10000"));
		BigInteger bi4 = new BigInteger(String.valueOf(thousandNums[3]));

		return bi1.add(bi2).add(bi3).add(bi4).toString();
	}

	/**
	 * 以罗马数字转变成中文小写的数字，如 198 => 一百九十八
	 */
	public static final String getLChnNumByAr(String num) {
		double numOper = Double.parseDouble(num);
		// 记录 兆，亿，万，个 前面的数字
		int unitNums[] = { 0, 0, 0, 0 };
		int count = 0;
		for (int i = 3; i >= 0; i--) {
			double d = Math.pow(10000d, i);
			if ((numOper / d) >= 1) {
				unitNums[count] = (int) (numOper / d);
			}
			numOper = numOper - unitNums[count] * d;
			count++;
		}
		String rslt = "";
		String temp = "";
		for (int i = 0; i < 3; i++) {
			temp = getThousandLChnNum(String.valueOf(unitNums[i]));
			if (unitNums[i] > 0 && temp.indexOf("千") == -1) {
				rslt = rslt + CHINESE_NUM[0];
			}
			rslt = rslt + temp;
			if (unitNums[i] != 0) {
				rslt += NUM_UNIT[i];
			}
		}

		if (unitNums[3] > 0 && unitNums[3] < 1000) {
			rslt = rslt + CHINESE_NUM[0];
		}

		rslt += getThousandLChnNum(String.valueOf(unitNums[3]));
		if (rslt.startsWith(CHINESE_NUM[0])) {
			rslt = rslt.substring(1);
		}
		// 当数字是 11, 12.....19 ，去掉前面的 一
		if (num.length() == 2 && num.startsWith("1")) {
			rslt = rslt.substring(1);
		}
		return rslt;
	}

	/**
	 * 由阿拉伯数字转型成中文小写，没有千百万的单位，只是直 1 对 1 的数字转换.
	 * <p>
	 * 例如 : 2002 => 二○○二
	 */
	public static final String getLChnNumStr(String num) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num.length(); i++) {
			int n = Character.digit(num.charAt(i), 10);
			if (n == -1)
				throw new java.lang.IllegalArgumentException("转型数字型式不符:" + num);
			sb.append(CHINESE_NUM[n]);
		}
		return sb.toString();
	}

	/**
	 * 取得数字的英文表示式 传入：数字（字串型态） 例：123456 传出：数字的英文表示式 例：ONE HUNDRED TWENTY THREE
	 * THOUSAND FOUR HUNDRED FIFTY SIX
	 */
	public static final String getNumberWP(String numberStr) {
		numberStr = new Integer(numberStr).toString();
		String result = "";
		int strLength = numberStr.length();
		switch (strLength) {
		case 1:
			if (Integer.parseInt(numberStr) == 0) {
				result = "ZERO";
			} else {
				result = engNumber(Integer.parseInt(numberStr));
			}
			break;
		case 2:
			result = result + doExchange2(numberStr.substring(0, 2));
			break;
		case 3:
			result = result + doExchange3(numberStr.substring(0, 3));
			break;
		case 4:
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(0, 1)))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(1, 4));
			break;
		case 5:
			result = result + doExchange2(numberStr.substring(0, 2))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(2, 5));
			break;
		case 6:
			result = result + doExchange3(numberStr.substring(0, 3))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(3, 6));
			break;
		case 7:
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(0, 1)))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(1, 4))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(4, 7));
			break;
		case 8:
			result = result + doExchange2(numberStr.substring(0, 2))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(2, 5))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(5, 8));
			break;
		case 9:
			result = result + doExchange3(numberStr.substring(0, 3))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(3, 6))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(6, 9));
			break;
		case 10:
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(0, 1)))
					+ " BILLION ";
			result = result + doExchange3(numberStr.substring(1, 4))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(4, 7))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(7, 10));
			break;
		case 11:
			result = result + doExchange2(numberStr.substring(0, 2))
					+ " BILLION ";
			result = result + doExchange3(numberStr.substring(2, 5))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(5, 8))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(8, 11));
			break;
		case 12:
			result = result + doExchange3(numberStr.substring(0, 3))
					+ " BILLION ";
			result = result + doExchange3(numberStr.substring(3, 6))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(6, 9))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(9, 12));
			break;
		case 13:
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(0, 1)))
					+ " TRILLION ";
			result = result + doExchange3(numberStr.substring(1, 4))
					+ " BILLION ";
			result = result + doExchange3(numberStr.substring(4, 7))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(7, 10))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(10, 13));
			break;
		case 14:
			result = result + doExchange2(numberStr.substring(0, 2))
					+ " TRILLION ";
			result = result + doExchange3(numberStr.substring(2, 5))
					+ " BILLION ";
			result = result + doExchange3(numberStr.substring(5, 8))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(8, 11))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(11, 14));
			break;
		case 15:
			result = result + doExchange3(numberStr.substring(0, 3))
					+ " TRILLION ";
			result = result + doExchange3(numberStr.substring(3, 6))
					+ " BILLION ";
			result = result + doExchange3(numberStr.substring(6, 9))
					+ " MILLION ";
			result = result + doExchange3(numberStr.substring(9, 12))
					+ " THOUSAND ";
			result = result + doExchange3(numberStr.substring(12, 15));
			break;
		}
		return result;
	}

	private static int getIntNum(String littleChineseNum) {
		if (littleChineseNum.startsWith("○")) {
			littleChineseNum = littleChineseNum.substring(1);
		}
		for (int i = 0; i < 10; i++) {
			if (CHINESE_NUM[i].equals(littleChineseNum)) {
				return i;
			}
		}
		throw new java.lang.RuntimeException("转型数字:[" + littleChineseNum
				+ "] 不是○,一, 二...八,九");
	}

	private static String getThousandLChnNum(String num) {
		String rslt = "";
		String unit[] = { "", "十", "百", "千" };
		int len = num.length();
		int count = -1;
		for (int i = len - 1; i >= 0; i--) {
			String s = num.substring(i, i + 1);
			count++;
			if (i == len - 1 && s.equals("0")) {
				continue;
			}
			if (!s.equals("0"))
				rslt = unit[count] + rslt;

			if (!rslt.startsWith(CHINESE_NUM[0])) {
				rslt = getLChnNum(s) + rslt;
			}
		}

		if (rslt.endsWith(CHINESE_NUM[0]) && rslt.length() > 1)
			rslt = rslt.substring(0, rslt.length() - 1);
		return rslt;
	}

	private static String getLChnNum(String c) {
		int num = Integer.parseInt(c);
		if (num < 0 || num > 9)
			throw new java.lang.RuntimeException("转型数字:[" + c
					+ "] 不是 0,1,2,3....8,9");
		return CHINESE_NUM[num];
	}

	private static int getThousandNum(String num) {
		int rslt = 0;
		int tPos = num.indexOf("千");
		int hPost = num.indexOf("百");
		int dPost = num.indexOf("十");
		int prevPost = 0;
		if (tPos != -1) {
			rslt = 1000 * getIntNum(num.substring(prevPost, tPos));
			prevPost = tPos + 1;
		}

		if (hPost != -1) {
			rslt = rslt + (100 * getIntNum(num.substring(prevPost, hPost)));
			prevPost = hPost + 1;
		}

		if (dPost != -1) {
			if (dPost != 0) {
				rslt = rslt + (10 * getIntNum(num.substring(prevPost, dPost)));
			} else {
				rslt = rslt + 10;
			}
			prevPost = dPost + 1;
		}

		if (prevPost < num.length())
			rslt = rslt + getIntNum(num.substring(prevPost));

		return rslt;
	}

	/**
	 * 取得二位数字的英文表示式 传入：数字（字串型态） 例：56 传出：数字的英文表示式 例：FIFTY SIX
	 */
	private static String doExchange2(String numberStr) {
		String result = "";
		if (numberStr.substring(0, 1).equals("1")
				|| numberStr.substring(1, 2).equals("0"))
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(0, 2)));
		else
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(0, 1)
							+ "0")) + " "
					+ engNumber(Integer.parseInt(numberStr.substring(1, 2)));
		return result;
	}

	/**
	 * 取得三位数字的英文表示式 传入：数字（字串型态） 例：456 传出：数字的英文表示式 例：FOUR HUNDRED FIFTY SIX
	 */
	private static String doExchange3(String numberStr) {
		String result = "";
		result = engNumber(Integer.parseInt(numberStr.substring(0, 1)))
				+ " HUNDRED ";
		if (numberStr.substring(1, 2).equals("1")
				|| numberStr.substring(2, 3).equals("0"))
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(1, 3)));
		else
			result = result
					+ engNumber(Integer.parseInt(numberStr.substring(1, 2)
							+ "0")) + " "
					+ engNumber(Integer.parseInt(numberStr.substring(2, 3)));
		return result;
	}

	/**
	 * 取得不规则数字的英文表示式 传入：数字（整数型态） 例：11 传出：数字的英文表示式 例：ELEVEN
	 */
	private static String engNumber(int numberStr) {
		String result = "";
		switch (numberStr) {
		case 1:
			result = "ONE";
			break;
		case 2:
			result = "TWO";
			break;
		case 3:
			result = "THREE";
			break;
		case 4:
			result = "FOUR";
			break;
		case 5:
			result = "FIVE";
			break;
		case 6:
			result = "SIX";
			break;
		case 7:
			result = "SEVEN";
			break;
		case 8:
			result = "EIGHT";
			break;
		case 9:
			result = "NINE";
			break;
		case 10:
			result = "TEN";
			break;
		case 11:
			result = "ELEVEN";
			break;
		case 12:
			result = "TWELVE";
			break;
		case 13:
			result = "THIRTEEN";
			break;
		case 14:
			result = "FOURTEEN";
			break;
		case 15:
			result = "FIFTEEN";
			break;
		case 16:
			result = "SIXTEEN";
			break;
		case 17:
			result = "SEVENTEEN";
			break;
		case 18:
			result = "EIGHTEEN";
			break;
		case 19:
			result = "NINETEEN";
			break;
		case 20:
			result = "TWENTY";
			break;
		case 30:
			result = "THIRTY";
			break;
		case 40:
			result = "FORTY";
			break;
		case 50:
			result = "FIFTY";
			break;
		case 60:
			result = "SIXTY";
			break;
		case 70:
			result = "SEVENTY";
			break;
		case 80:
			result = "EIGHTY";
			break;
		case 90:
			result = "NINETY";
			break;
		}
		return result;
	}

	/** 大写数字 */
	private static final String[] NUMBERS = { "零", "壹", "贰", "叁", "肆", "伍",
			"陆", "柒", "捌", "玖" };
	/** 整数部分的单位 */
	private static final String[] IUNIT = { "元", "拾", "佰", "仟", "万", "拾", "佰",
			"仟", "亿", "拾", "佰", "仟", "万", "拾", "佰", "仟" };
	/** 小数部分的单位 */
	private static final String[] DUNIT = { "角", "分", "厘" };

	/**
	 * 得到大写金额.
	 * <p>
	 * 默认不会在"元"后添加"整"。<br/>
	 * 如需要转换后的结果在"元"后添加"整"字，请参考{@link #toChinese(String, boolean)}
	 * </p>
	 * 
	 * @param str
	 *            要转换的数字
	 * @return 大定金额
	 */
	public static final String toChinese(String str) {
		return toChinese(str, false);
	}

	/**
	 * 得到大写金额
	 * 
	 * @param str
	 *            要转换的数字
	 * @param appendZheng
	 *            如果结果是整数,是否在其后加"整"
	 * @return 大定金额
	 */
	public static final String toChinese(String str, boolean appendZheng) {
		str = str.replaceAll(",", "");// 去掉","
		String integerStr;// 整数部分数字
		String decimalStr;// 小数部分数字

		// 初始化：分离整数部分和小数部分
		if (str.indexOf(".") > 0) {
			integerStr = str.substring(0, str.indexOf("."));
			decimalStr = str.substring(str.indexOf(".") + 1);
		} else if (str.indexOf(".") == 0) {
			integerStr = "";
			decimalStr = str.substring(1);
		} else {
			integerStr = str;
			decimalStr = "";
		}
		// integerStr去掉首0，不必去掉decimalStr的尾0(超出部分舍去)
		if (!integerStr.equals("")) {
			integerStr = Long.toString(Long.parseLong(integerStr));
			if (integerStr.equals("0")) {
				integerStr = "";
			}
		}
		// overflow超出处理能力，直接返回
		if (integerStr.length() > IUNIT.length) {
			System.out.println(str + ":超出处理能力");
			return str;
		}
		int[] integers = toArray(integerStr);// 整数部分数字
		boolean isMust5 = isMust5(integerStr);// 设置万单位
		int[] decimals = toArray(decimalStr);// 小数部分数字
		if (StringUtils.isEmpty(decimalStr)) {
			String result = getChineseInteger(integers, isMust5);
			if (appendZheng) {
				result = result + "整";
			}
			return result;
		} else {
			return getChineseInteger(integers, isMust5)
					+ getChineseDecimal(decimals);

		}
	}

	/**
	 * 整数部分和小数部分转换为数组，从高位至低位
	 */
	private static int[] toArray(String number) {
		int[] array = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			array[i] = Integer.parseInt(number.substring(i, i + 1));
		}
		return array;
	}

	/**
	 * 得到中文金额的整数部分。
	 */
	private static String getChineseInteger(int[] integers, boolean isMust5) {
		StringBuffer chineseInteger = new StringBuffer("");
		int length = integers.length;
		for (int i = 0; i < length; i++) {
			// 0出现在关键位置：1234(万)5678(亿)9012(万)3456(元)
			// 特殊情况：10(拾元、壹拾元、壹拾万元、拾万元)
			String key = "";
			if (integers[i] == 0) {
				if ((length - i) == 13)// 万(亿)(必填)
					key = IUNIT[4];
				else if ((length - i) == 9)// 亿(必填)
					key = IUNIT[8];
				else if ((length - i) == 5 && isMust5)// 万(不必填)
					key = IUNIT[4];
				else if ((length - i) == 1)// 元(必填)
					key = IUNIT[0];
				// 0遇非0时补零，不包含最后一位
				if ((length - i) > 1 && integers[i + 1] != 0)
					key += NUMBERS[0];
			}
			chineseInteger.append(integers[i] == 0 ? key
					: (NUMBERS[integers[i]] + IUNIT[length - i - 1]));
		}
		return chineseInteger.toString();
	}

	/**
	 * 得到中文金额的小数部分。
	 */
	private static String getChineseDecimal(int[] decimals) {
		StringBuffer chineseDecimal = new StringBuffer("");
		for (int i = 0; i < decimals.length; i++) {
			// 舍去3位小数之后的
			if (i == 3)
				break;
			chineseDecimal.append(decimals[i] == 0 ? ""
					: (NUMBERS[decimals[i]] + DUNIT[i]));
		}
		return chineseDecimal.toString();
	}

	/**
	 * 判断第5位数字的单位"万"是否应加。
	 */
	private static boolean isMust5(String integerStr) {
		int length = integerStr.length();
		if (length > 4) {
			String subInteger = "";
			if (length > 8) {
				// 取得从低位数，第5到第8位的字串
				subInteger = integerStr.substring(length - 8, length - 4);
			} else {
				subInteger = integerStr.substring(0, length - 4);
			}
			return Integer.parseInt(subInteger) > 0;
		} else {
			return false;
		}
	}

	public final static String[] CHINESE_NUM = { "○", "一", "二", "三", "四", "五",
			"六", "七", "八", "九" };
	public final static String[] CHINESE_UNIT = { "万", "千", "百", "十", "" };
	public final static String[] NUM_UNIT = { "兆", "亿", "万" };
}
