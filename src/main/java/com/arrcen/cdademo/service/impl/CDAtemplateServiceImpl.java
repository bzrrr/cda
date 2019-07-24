package com.arrcen.cdademo.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.arrcen.cdademo.dao.*;
import com.arrcen.cdademo.pojo.*;
import com.arrcen.cdademo.service.CDAtemplateService;
import com.arrcen.cdademo.util.XML2jsonUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.ByteArrayInputStream;
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
	@Autowired
	private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
	@Autowired
	private PatientHealthDocInfoDao patientHealthDocInfoDao;
	@Autowired
	private HealthIncidentInfoDao healthIncidentInfoDao;
	@Autowired
	private MedicalExpenseRecordDao medicalExpenseRecordDao;

	@Override
	public String getXml(String index, String systemId) throws Exception {
		Configuration configuration = freeMarkerConfigurer.getConfiguration();
		//从config对象中获得模板对象。需要制定一个模板文件的名字。
		String templateName = "template" + index + ".ftl";
		Template template = configuration.getTemplate(templateName);
		//创建模板需要的数据集。可以是一个map对象也可以是一个pojo，把模板需要的数据都放入数据集。
		Map sourceMap = new HashMap<>();
		DocInfo docInfo = new DocInfo();
		docInfo.setDocId(IdUtil.randomUUID());
		docInfo.setEffectiveTime(DateUtil.format(DateUtil.date(), "yyyyMMddHHmmss"));
		sourceMap.put("docInfo", docInfo);

		Patient patient = patientDao.getOne(systemId);
		sourceMap.put("patient", patient);

		String orgId = patient.get建档医疗机构组织机构();
		String orgName = medicalOrganizationInfoDao.findOrgNameByCode(orgId);
		sourceMap.put("orgName", orgName);

		String patientHealthCardId = patient.get居民健康卡号();
		PatientHealthDocInfo patientHealthDocInfo = patientHealthDocInfoDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("patientHealthDocInfo", patientHealthDocInfo);

		HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("healthIncidentInfo", healthIncidentInfo);

		MedicalExpenseRecord medicalExpenseRecord = medicalExpenseRecordDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("medicalExpenseRecord", medicalExpenseRecord);
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
		DocInfo docInfo = new DocInfo();
		sourceMap.put("docInfo", docInfo);
		String orgName = "";
		sourceMap.put("orgName", orgName);
		PatientHealthDocInfo patientHealthDocInfo = new PatientHealthDocInfo();
		sourceMap.put("patientHealthDocInfo", patientHealthDocInfo);
		HealthIncidentInfo healthIncidentInfo = new HealthIncidentInfo();
		sourceMap.put("healthIncidentInfo", healthIncidentInfo);
		MedicalExpenseRecord medicalExpenseRecord = new MedicalExpenseRecord();
		sourceMap.put("medicalExpenseRecord", medicalExpenseRecord);
		//创建一个Writer对象，指定生成的文件保存的路径及文件名。
//		Writer out = new FileWriter(new File("D:\\template.xml"));
		StringWriter out = new StringWriter(2048);
		//调用模板对象的process方法生成静态文件。需要两个参数数据集和writer对象。
		template.process(sourceMap, out);
		//关闭writer对象。
//		System.out.println(XMLSchemaUtil.validateXMLSchema("templates/SDA.xsd", out.toString()));
		String output = out.toString();
		SAXReader reader = new SAXReader();
		Document document =reader.read(new ByteArrayInputStream(output.getBytes("UTF-8")));
		com.alibaba.fastjson.JSONObject obj = XML2jsonUtil.xml2Obj(document.getRootElement());
		String json = obj.toJSONString();
		out.flush();
		out.close();

		return json;
	}

	@Autowired
	CDAdocumentDao cdAdocumentDao;

	@Override
	public List<String> getTitles() {

		return cdAdocumentDao.getAllDocNames();
	}
}
