/**
 * StringUtils.java
 */
package com.base.util;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @fileName StringUtils.java
 * @author <a href="mailto:tom.cui@bstek.com">tom.cui@bstek.com</a>
 * @date 2010-8-20
 * @time 上午08:47:09
 */
public final class StringUtils {
	private StringUtils() {

	}

	public static final boolean hasLength(CharSequence charSequence) {
		return null != charSequence && 0 < charSequence.length();
	}

	public static final boolean hasLength(String stringValue) {
		return StringUtils.hasLength((CharSequence) stringValue);
	}

	public static final boolean hasText(CharSequence charSequence) {
		if (!StringUtils.hasLength(charSequence)) {
			return false;
		}
		boolean hasNotWhitespaceChar = false;
		int length = charSequence.length();
		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(charSequence.charAt(i))) {
				hasNotWhitespaceChar = true;
				break;
			}
		}
		return hasNotWhitespaceChar;
	}

	public static final boolean hasText(String stringValue) {
		return StringUtils.hasText((CharSequence) stringValue);
	}

	public static final String trimWhitespace(String stringValue) {
		if (!StringUtils.hasLength(stringValue)) {
			return stringValue;
		}
		StringBuffer stringBuffer = new StringBuffer(stringValue);
		while (stringBuffer.length() > 0
				&& Character.isWhitespace(stringBuffer.charAt(0))) {
			stringBuffer.deleteCharAt(0);
		}
		while (stringBuffer.length() > 0
				&& Character.isWhitespace(stringBuffer.charAt(stringBuffer
						.length() - 1))) {
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		}
		return stringBuffer.toString();
	}

	public static final String trimAllWhitespace(String stringValue) {
		if (!StringUtils.hasLength(stringValue)) {
			return stringValue;
		}
		int index = 0;
		StringBuffer stringBuffer = new StringBuffer(stringValue);
		do {
			if (Character.isWhitespace(stringBuffer.charAt(index))) {
				stringBuffer.deleteCharAt(index);
			} else {
				index++;
			}
		} while (index < stringBuffer.length());
		return stringBuffer.toString();
	}

	public static final String trimLeadingWhitespace(String stringValue) {
		if (!StringUtils.hasLength(stringValue)) {
			return stringValue;
		}
		StringBuffer stringBuffer = new StringBuffer(stringValue);
		while (stringBuffer.length() > 0
				&& Character.isWhitespace(stringBuffer.charAt(0))) {
			stringBuffer.deleteCharAt(0);
		}
		return stringBuffer.toString();
	}

	public static final String trimTrailingWhitespace(String stringValue) {
		if (!StringUtils.hasLength(stringValue)) {
			return stringValue;
		}
		StringBuffer stringBuffer = new StringBuffer(stringValue);
		while (stringBuffer.length() > 0
				&& Character.isWhitespace(stringBuffer.charAt(stringBuffer
						.length() - 1))) {
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		}
		return stringBuffer.toString();
	}

	public static final String trimLeadingCharacter(String stringValue,
			char leadingCharacter) {
		if (!StringUtils.hasLength(stringValue)) {
			return stringValue;
		}
		StringBuffer stringBuffer = new StringBuffer(stringValue);
		while (stringBuffer.length() > 0
				&& stringBuffer.charAt(0) == leadingCharacter) {
			stringBuffer.deleteCharAt(0);
		}
		return stringBuffer.toString();
	}

	public static final String trimTrailingCharacter(String stringValue,
			char trailingCharacter) {
		if (!StringUtils.hasLength(stringValue)) {
			return stringValue;
		}
		StringBuffer stringBuffer = new StringBuffer(stringValue);
		while (stringBuffer.length() > 0
				&& stringBuffer.charAt(stringBuffer.length() - 1) == trailingCharacter) {
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		}
		return stringBuffer.toString();
	}

	public static final boolean startsWith(String stringValue, String prefix) {
		if (null == stringValue || null == prefix) {
			return false;
		}
		if (stringValue.length() < prefix.length()) {
			return false;
		}
		return stringValue.startsWith(prefix);
	}

	public static final boolean startsWithIgnoreCase(String stringValue,
			String prefix) {
		if (null == stringValue || null == prefix) {
			return false;
		}
		if (stringValue.length() < prefix.length()) {
			return false;
		}
		String stringValueHeader = stringValue.substring(0, prefix.length());
		return stringValueHeader.equalsIgnoreCase(prefix);
	}

	public static final boolean endsWith(String stringValue, String suffix) {
		if (null == stringValue || null == suffix) {
			return false;
		}
		if (stringValue.length() < suffix.length()) {
			return false;
		}
		return stringValue.endsWith(suffix);
	}

	public static final boolean endsWithIgnoreCase(String stringValue,
			String suffix) {
		if (null == stringValue || null == suffix) {
			return false;
		}
		if (stringValue.length() < suffix.length()) {
			return false;
		}
		String stringValueTail = stringValue.substring(stringValue.length()
				- suffix.length());
		return stringValueTail.equalsIgnoreCase(suffix);
	}

	public static final int countOccurrencesOf(String stringValue,
			String subString) {
		if (!StringUtils.hasLength(stringValue)
				|| !StringUtils.hasLength(subString)) {
			return 0;
		}
		int count = 0;
		int index = -1;
		int position = 0;
		while (-1 != (index = stringValue.indexOf(subString, position))) {
			count++;
			position = index + subString.length();
		}
		return count;
	}

	public static final String replace(String stringValue, String oldPattern,
			String newPattern) {
		if (null == stringValue || null == oldPattern || null == newPattern) {
			return stringValue;
		}
		StringBuffer stringBuffer = new StringBuffer();
		int index = -1;
		int position = 0;
		do {
			index = stringValue.indexOf(oldPattern, position);
			if (-1 != index) {
				stringBuffer.append(stringValue.substring(position, index));
				stringBuffer.append(newPattern);
				position = index + oldPattern.length();
			} else {
				break;
			}
		} while (true);
		stringBuffer.append(stringValue.substring(position));
		return stringBuffer.toString();
	}

	public static final String delete(String stringValue,
			String stringToBeDelete) {
		return StringUtils.replace(stringValue, stringToBeDelete, "");
	}

	public static final String deleteAnyChar(String stringValue,
			String charsToDelete) {
		if (!StringUtils.hasLength(stringValue)
				|| !StringUtils.hasLength(charsToDelete)) {
			return stringValue;
		}
		StringBuffer out = new StringBuffer();
		int length = stringValue.length();
		for (int i = 0; i < length; i++) {
			char c = stringValue.charAt(i);
			if (charsToDelete.indexOf(c) == -1) {
				out.append(c);
			}
		}

		return out.toString();
	}

	public static final String deleteWhitespace(String stringValue) {
		if (StringUtils.isEmpty(stringValue)) {
			return stringValue;
		}
		final int length = stringValue.length();
		char[] notWhitespaceChars = new char[length];
		int count = 0;
		for (int i = 0; i < length; i++) {
			char ch = stringValue.charAt(i);
			if (!Character.isWhitespace(ch)) {
				notWhitespaceChars[count++] = ch;
			}
		}
		if (length == count) {
			return stringValue;
		}
		return new String(notWhitespaceChars, 0, count);
	}

	public static final boolean isEmpty(String stringValue) {
		return !StringUtils.hasLength(stringValue);
	}

	public static final boolean isNotEmpty(String stringValue) {
		return StringUtils.hasLength(stringValue);
	}

	public static final boolean isBlank(String stringValue) {
		if (!StringUtils.hasLength(stringValue)) {
			return true;
		}
		int length = stringValue.length();
		boolean hasNotWhitespaceChar = false;
		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(stringValue.charAt(i))) {
				hasNotWhitespaceChar = true;
				break;
			}
		}
		return !hasNotWhitespaceChar;
	}

	public static final boolean isNotBlank(String stringValue) {
		return !StringUtils.isBlank(stringValue);
	}

	public static final String trim(String stringValue) {
		return stringValue == null ? null : stringValue.trim();
	}

	public static final boolean equals(String stringValue1, String stringValue2) {
		return null == stringValue1 ? null == stringValue2 : stringValue1
				.equals(stringValue2);
	}

	public static final boolean equalsIgnoreCase(String stringValue1,
			String stringValue2) {
		return null == stringValue1 ? null == stringValue2 : stringValue1
				.equalsIgnoreCase(stringValue2);
	}

	public static final boolean contains(String stringValue, char searchChar) {
		if (StringUtils.isEmpty(stringValue)) {
			return false;
		}
		return stringValue.indexOf(searchChar) != -1;
	}

	public static final boolean contains(String stringValue, String searchString) {
		if (stringValue == null || searchString == null) {
			return false;
		}
		return stringValue.indexOf(searchString) != -1;
	}

	public static final boolean containsIgnoreCase(String stringValue,
			String searchString) {
		if (null == stringValue || null == searchString) {
			return false;
		}
		if (equalsIgnoreCase(stringValue, searchString)) {
			return true;
		}
		int searchStringLength = searchString.length();
		int maxSearchIndex = stringValue.length() - searchStringLength;
		boolean contains = false;
		for (int i = 0; i < maxSearchIndex; i++) {
			if (stringValue.regionMatches(true, i, searchString, 0,
					searchStringLength)) {
				contains = true;
				break;
			}
		}
		return contains;
	}

	public static final String substring(String stringValue, int beginIndex) {
		if (null == stringValue) {
			return stringValue;
		}
		if (0 > beginIndex) {
			beginIndex = 0;
		}
		if (beginIndex > stringValue.length()) {
			return StringUtils.EMPTY_STRING;
		}
		return stringValue.substring(beginIndex);
	}

	public static final String substring(String stringValue, int beginIndex,
			int endIndex) {
		if (null == stringValue) {
			return stringValue;
		}
		if (endIndex < 0) {
			endIndex = stringValue.length() + endIndex;
		}
		if (beginIndex < 0) {
			beginIndex += stringValue.length();
		}
		if (endIndex > stringValue.length()) {
			endIndex = stringValue.length();
		}
		if (beginIndex > endIndex) {
			return StringUtils.EMPTY_STRING;
		}
		if (beginIndex < 0) {
			beginIndex = 0;
		}
		if (endIndex < 0) {
			endIndex = 0;
		}
		return stringValue.substring(beginIndex, endIndex);
	}

	public static final String left(String stringValue, int length) {
		if (null == stringValue) {
			return stringValue;
		}
		if (0 > length) {
			return StringUtils.EMPTY_STRING;
		}
		if (length > stringValue.length()) {
			return stringValue;
		}
		return stringValue.substring(0, length);
	}

	public static final String right(String stringValue, int length) {
		if (null == stringValue) {
			return stringValue;
		}
		if (0 > length) {
			return StringUtils.EMPTY_STRING;
		}
		if (length > stringValue.length()) {
			return stringValue;
		}
		return stringValue.substring(stringValue.length() - length);

	}

	public static final String mid(String stringValue, int beginIndex,
			int length) {
		if (null == stringValue) {
			return stringValue;
		}
		if (beginIndex > stringValue.length() || length < 0) {
			return StringUtils.EMPTY_STRING;
		}
		if (beginIndex < 0) {
			beginIndex = 0;
		}
		if (beginIndex + length > stringValue.length()) {
			return stringValue.substring(beginIndex);
		}
		return stringValue.substring(beginIndex, beginIndex + length);
	}

	public static final int countOccurrencesOf(String stringValue,
			String[] stringValues) {
		if (null == stringValue || null == stringValues) {
			return 0;
		}
		int count = 0;
		for (String str : stringValues) {
			if (StringUtils.equals(str, stringValue)) {
				count++;
			}
		}
		return count;
	}

	public static final int countOccurrencesOfIgnoreCase(String stringValue,
			String[] stringValues) {
		if (null == stringValue || null == stringValues) {
			return 0;
		}
		int count = 0;
		for (String str : stringValues) {
			if (StringUtils.equalsIgnoreCase(str, stringValue)) {
				count++;
			}
		}
		return count;
	}

	public static final int countOccurrencesOf(String stringValue,
			Collection<String> stringValues) {
		if (null == stringValue || null == stringValues) {
			return 0;
		}
		int count = 0;
		for (String str : stringValues) {
			if (StringUtils.equals(str, stringValue)) {
				count++;
			}
		}
		return count;

	}

	public static final int countOccurrencesOfIgnoreCase(String stringValue,
			Collection<String> stringValues) {
		if (null == stringValue || null == stringValues) {
			return 0;
		}
		int count = 0;
		for (String str : stringValues) {
			if (StringUtils.equalsIgnoreCase(str, stringValue)) {
				count++;
			}
		}
		return count;

	}

	public static final boolean isIn(String stringValue, String[] stringValues) {
		return 0 != StringUtils.countOccurrencesOf(stringValue, stringValues);
	}

	public static final boolean isInIgnoreCase(String stringValue,
			String[] stringValues) {
		return 0 != StringUtils.countOccurrencesOfIgnoreCase(stringValue,
				stringValues);
	}

	public static final boolean isIn(String stringValue,
			Collection<String> stringValues) {
		return 0 != StringUtils.countOccurrencesOf(stringValue, stringValues);
	}

	public static final boolean isInIgnoreCase(String stringValue,
			Collection<String> stringValues) {
		return 0 != StringUtils.countOccurrencesOfIgnoreCase(stringValue,
				stringValues);
	}

	public static final String unescape(String stringValue) {
		if (StringUtils.isEmpty(stringValue)) {
			return stringValue;
		}
		StringBuffer unicodeWord = new StringBuffer(4);
		StringBuffer resultBuffer = new StringBuffer();
		final int stringLength = stringValue.length();
		boolean hadSlash = false;
		boolean inCode = false;
		boolean inUnicode = false;
		char lastSlash = '\0';
		for (int i = 0; i < stringLength; ++i) {
			char ch = stringValue.charAt(i);
			if (inCode) {
				if (hadSlash) {
					hadSlash = false;
					if (ch == 'u') {
						inUnicode = true;
					} else {
						unicodeWord.append(ch);
					}
				} else {
					unicodeWord.append(ch);
					if (unicodeWord.length() != ((inUnicode) ? 4 : 2))
						continue;
					try {
						int value = Integer
								.parseInt(unicodeWord.toString(), 16);
						resultBuffer.append((char) value);
						unicodeWord.setLength(0);
						inCode = false;
						inUnicode = false;
					} catch (NumberFormatException e) {
						throw new IllegalArgumentException(
								"Unable to parse unicode value: " + unicodeWord);
					}
				}
			} else if ((ch == '%')) {
				hadSlash = true;
				lastSlash = ch;
				inCode = true;
			} else {
				resultBuffer.append(ch);
			}
		}
		if (hadSlash) {
			resultBuffer.append(lastSlash);
		}
		return resultBuffer.toString();
	}

	public static final String EMPTY_STRING = "";
	/**
	 * 当前系统使用行分隔符.
	 */
	public static final String LINE_SEP = System.getProperty("line.separator");
}
