package com.arrcen.cdademo.util;

import cn.hutool.core.io.FileUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.*;


public class FileUtils {
	public static Document readFile(File file) throws DocumentException {
		SAXReader reader = new SAXReader();
		InputStream in = FileUtil.getInputStream(file);
		Document doc = reader.read(in);
		return doc;
	}
}
