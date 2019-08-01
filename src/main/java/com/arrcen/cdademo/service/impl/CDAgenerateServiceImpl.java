package com.arrcen.cdademo.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import com.arrcen.cdademo.dao.*;
import com.arrcen.cdademo.pojo.*;
import com.arrcen.cdademo.service.CDAgenerateService;
import com.arrcen.cdademo.util.XML2jsonUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

@Service
public class CDAgenerateServiceImpl implements CDAgenerateService {
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
		packageSourceMap(systemId, sourceMap);
		//创建一个Writer对象，指定生成的文件保存的路径及文件名。
//		Writer out = new FileWriter(new File("D:\\template.xml"));
		StringWriter out = new StringWriter(2048);
		//调用模板对象的process方法生成静态文件。需要两个参数数据集和writer对象。
		template.process(sourceMap, out);
		//关闭writer对象。
		String output = out.toString();
//		boolean result = XMLSchemaUtil.validateXML(output);

		SAXReader reader = new SAXReader();
		Document document = reader.read(new ByteArrayInputStream(output.getBytes("UTF-8")));
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


		out.flush();
		out.close();

		return document.asXML();
	}

	/**
	 * 填充模板需要的数据集
	 *
	 * @param systemId
	 * @param sourceMap
	 */
	private void packageSourceMap(String systemId, Map sourceMap) {
		DocInfo docInfo = new DocInfo();
		docInfo.setDocId(IdUtil.randomUUID());
		docInfo.setEffectiveTime(DateUtil.format(DateUtil.date(), "yyyyMMddHHmmss"));
		sourceMap.put("docInfo", docInfo);

		Patient patient = patientDao.getOne(systemId);
		patient.set婚姻状况(patientDao.find婚姻状况By婚姻状况代码(patient.get婚姻状况代码()));
		patient.set民族名称(patientDao.find名族名称By名族(patient.get民族()));
		patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
		patient.set职业类别(patientDao.find职业类别By职业类别代码(patient.get职业类别代码()));
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
	}
}
