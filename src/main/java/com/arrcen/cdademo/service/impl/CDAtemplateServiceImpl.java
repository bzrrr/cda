package com.arrcen.cdademo.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import com.alibaba.fastjson.JSON;
import com.arrcen.cdademo.dao.CDAdocumentDao;
import com.arrcen.cdademo.service.CDAtemplateService;
import com.arrcen.cdademo.util.XML2jsonUtil;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

@Service
public class CDAtemplateServiceImpl implements CDAtemplateService {

	@Override
	public String getTemplate(String index) throws Exception {
		String templateName = "template" + index + ".ftl";
		File file = FileUtil.file("classpath:templates//" + templateName);
		FileReader fileReader = new FileReader(file, "UTF-8");
		String output = fileReader.readString();
		SAXReader reader = new SAXReader();
		Document document = reader.read(new ByteArrayInputStream(output.getBytes("UTF-8")));
		com.alibaba.fastjson.JSONObject obj = XML2jsonUtil.xml2Obj(document.getRootElement());
		obj.put("attrs", "");

		String json = obj.toJSONString();

		return json;
	}

	@Autowired
	CDAdocumentDao cdAdocumentDao;

	@Override
	public List<String> getTitles() {
		List<String> titles = cdAdocumentDao.getAllDocNames();
		Collections.sort(titles);
		titles.replaceAll(x -> x.replace("EMR00", ""));
		return titles;
	}

	@Override
	public void updateTemplate(String json, String index) throws Exception {
		com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(json);
		String xml = XML2jsonUtil.obj2Xml(jsonObject).asXML();
		SAXReader reader = new SAXReader();
		Document document = reader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
		Element root = document.getRootElement();
		Attribute attribute1 = root.attribute("xsi:schemaLocation");
		Attribute attribute2 = root.attribute("schemaLocation");
		if (attribute1 != null) {
			root.remove(attribute1);
		}
		if (attribute2 != null) {
			root.remove(attribute2);
		}
		root.addNamespace("", "urn:hl7-org:v3")
				.addAttribute("xmlns:mif", "urn:hl7-org:v3/mif")
				.addAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
				.addAttribute("xsi:schemaLocation", "urn:hl7-org:v3 ..\\sdschemas\\SDA.xsd");
		StringWriter stringWriter = new StringWriter();
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8"); //设置XML文档的编码类型
		format.setIndent(true); //设置是否缩进
		format.setIndent("	"); //缩进方式
		format.setNewlines(true); //设置是否换行
		XMLWriter writer = new XMLWriter(stringWriter, format);
		writer.write(document);
		writer.flush();
		xml = stringWriter.getBuffer().toString();
		String templateName = "template" + index + ".ftl";
		File file = FileUtil.file("D://cda//templates//" + templateName);
		FileWriter fileWriter = new FileWriter(file, "UTF-8");
		fileWriter.write(xml);
	}
}
