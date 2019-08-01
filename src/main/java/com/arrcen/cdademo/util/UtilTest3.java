package com.arrcen.cdademo.util;

import cn.hutool.core.io.file.FileReader;

public class UtilTest3 {
	public static void main(String[] args) {
		FileReader fileReader = new FileReader("../../../../templates/template1.ftl");
		String output = fileReader.readString();
		System.out.println(output);
	}
}
