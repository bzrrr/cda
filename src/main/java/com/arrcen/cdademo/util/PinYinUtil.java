package com.arrcen.cdademo.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class PinYinUtil {
	public static String getFirstLetter(String name) throws BadHanyuPinyinOutputFormatCombination {
		char[] charArray = name.toCharArray();
		StringBuilder pinyin = new StringBuilder();
		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
		// 设置大小写格式
		defaultFormat.setCaseType(HanyuPinyinCaseType.UPPERCASE);
		// 设置声调格式：
		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		for (int i = 0; i < charArray.length; i++) {
			//匹配中文,非中文转换会转换成null
			if (Character.toString(charArray[i]).matches("[\\u4E00-\\u9FA5]+")) {
				String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray(charArray[i], defaultFormat);
				if (hanyuPinyinStringArray != null) {
					pinyin.append(hanyuPinyinStringArray[0].charAt(0));
				}
			}
		}
		return pinyin.toString();
	}
}
