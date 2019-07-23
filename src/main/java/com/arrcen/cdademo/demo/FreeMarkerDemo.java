package com.arrcen.cdademo.demo;

import com.arrcen.cdademo.CdademoApplication;
import com.arrcen.cdademo.pojo.Patient;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CdademoApplication.class)
public class FreeMarkerDemo {

	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;

	@Test
	public void getXml() throws Exception {
		Configuration configuration = freeMarkerConfigurer.getConfiguration();
		//从config对象中获得模板对象。需要制定一个模板文件的名字。
		Template template = configuration.getTemplate("template1.ftl");
		//创建模板需要的数据集。可以是一个map对象也可以是一个pojo，把模板需要的数据都放入数据集。
		Map root = new HashMap<>();
		Patient patient = new Patient();
//		patient.setPatientName("张三");
		root.put("patient", patient);
		//创建一个Writer对象，指定生成的文件保存的路径及文件名。
//		Writer out = new FileWriter(new File("D:\\template.xml"));
		StringWriter stringWriter = new StringWriter();
		//调用模板对象的process方法生成静态文件。需要两个参数数据集和writer对象。
		template.process(root, stringWriter);
		//关闭writer对象。
//		out.flush();
//		out.close();
		System.out.println(stringWriter.toString());
	}
}
