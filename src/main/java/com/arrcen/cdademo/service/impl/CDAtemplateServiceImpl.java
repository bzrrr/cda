package com.arrcen.cdademo.service.impl;

import com.arrcen.cdademo.dao.CDAdocumentDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.service.CDAtemplateService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CDAtemplateServiceImpl implements CDAtemplateService {
	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	@Autowired
	private PatientDao patientDao;

	@Override
	public String getXml(String index) throws Exception {
		Configuration configuration = freeMarkerConfigurer.getConfiguration();
		//从config对象中获得模板对象。需要制定一个模板文件的名字。
		String templateName = "template" + index + ".ftl";
		Template template = configuration.getTemplate(templateName);
		//创建模板需要的数据集。可以是一个map对象也可以是一个pojo，把模板需要的数据都放入数据集。
		Map sourceMap = new HashMap<>();
		Patient patient = patientDao.getOne("A!");
		sourceMap.put("patient", patient);
		//创建一个Writer对象，指定生成的文件保存的路径及文件名。
//		Writer out = new FileWriter(new File("D:\\template.xml"));
		StringWriter out = new StringWriter(2048);
		//调用模板对象的process方法生成静态文件。需要两个参数数据集和writer对象。
		template.process(sourceMap, out);
		//关闭writer对象。
//		System.out.println(XMLSchemaUtil.validateXMLSchema("templates/SDA.xsd", out.toString()));
		String output = out.toString();
		out.flush();
		out.close();

		return output;
	}

	@Override
	public String getTemplate(String index) throws Exception {
		Configuration configuration = freeMarkerConfigurer.getConfiguration();
		//从config对象中获得模板对象。需要制定一个模板文件的名字。
		String templateName = "template" + index + ".ftl";
		Template template = configuration.getTemplate(templateName);
		//创建模板需要的数据集。可以是一个map对象也可以是一个pojo，把模板需要的数据都放入数据集。
		Map sourceMap = new HashMap<>();
		Patient patient = new Patient();
		sourceMap.put("patient", patient);
		//创建一个Writer对象，指定生成的文件保存的路径及文件名。
//		Writer out = new FileWriter(new File("D:\\template.xml"));
		StringWriter out = new StringWriter(2048);
		//调用模板对象的process方法生成静态文件。需要两个参数数据集和writer对象。
		template.process(sourceMap, out);
		//关闭writer对象。
//		System.out.println(XMLSchemaUtil.validateXMLSchema("templates/SDA.xsd", out.toString()));
		String output = out.toString();
		out.flush();
		out.close();

		return output;
	}

	@Autowired
	CDAdocumentDao cdAdocumentDao;

	@Override
	public List<String> getTitles() {

		return cdAdocumentDao.getAllDocNames();
	}
}
