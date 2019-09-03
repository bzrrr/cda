package com.arrcen.cdademo.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSONObject;
import com.arrcen.cdademo.dao.*;
import com.arrcen.cdademo.pojo.*;
import com.arrcen.cdademo.service.CDAgenerateService;
import com.arrcen.cdademo.service.impl.generate.GenerateService;
import com.arrcen.cdademo.util.FastDFSClientWrapper;
import com.arrcen.cdademo.util.FileUtils;
import com.arrcen.cdademo.util.PinYinUtil;
import com.arrcen.cdademo.util.XMLSchemaUtil;
import com.github.wenhao.jpa.Specifications;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CDAgenerateServiceImpl implements CDAgenerateService {
	@Autowired
	private FastDFSClientWrapper fastDFSClientWrapper;
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
	@Autowired
	private PatientCdaDocumentDao patientCdaDocumentDao;
	@Autowired
	private GenerateService generateService;

	private static HashBasedTable<Object, Object, Object> templateMap;

	static {
		templateMap = HashBasedTable.create();
		templateMap.put("01", "property", "建档日期时间");
		templateMap.put("02", "property", "就诊日期时间");
		templateMap.put("03", "property", "就诊日期时间");
		templateMap.put("04", "property", "处方开立日期");
		templateMap.put("05", "property", "建档日期时间");
		templateMap.put("06", "property", "建档日期时间");
		templateMap.put("07", "property", "建档日期时间");
		templateMap.put("08", "property", "建档日期时间");
		templateMap.put("09", "property", "建档日期时间");
		templateMap.put("10", "property", "建档日期时间");
		templateMap.put("11", "property", "建档日期时间");
		templateMap.put("12", "property", "建档日期时间");
		templateMap.put("13", "property", "建档日期时间");
		templateMap.put("14", "property", "建档日期时间");
		templateMap.put("15", "property", "建档日期时间");
		templateMap.put("16", "property", "建档日期时间");
		templateMap.put("17", "property", "建档日期时间");
		templateMap.put("18", "property", "建档日期时间");
		templateMap.put("19", "property", "建档日期时间");
		templateMap.put("20", "property", "建档日期时间");
		templateMap.put("21", "property", "建档日期时间");
		templateMap.put("22", "property", "建档日期时间");
		templateMap.put("23", "property", "建档日期时间");
		templateMap.put("24", "property", "建档日期时间");
		templateMap.put("25", "property", "建档日期时间");
		templateMap.put("26", "property", "建档日期时间");
		templateMap.put("27", "property", "建档日期时间");
	}

	//生成电子病历文档,上传文件至服务器,并返回文档内容的xml以及文档信息
	@Override
	public String getXml(String index, String systemId) throws Exception {
		String docId = IdUtil.randomUUID();
		String effectiveTime = DateUtil.format(DateUtil.date(), "yyyyMMddHHmmss");
		Configuration configuration = freeMarkerConfigurer.getConfiguration();
		//从config对象中获得模板对象。需要制定一个模板文件的名字。
		String templateName = "template" + index + ".ftl";
		Template template = configuration.getTemplate(templateName);

		//创建模板需要的数据集。可以是一个map对象也可以是一个pojo，把模板需要的数据都放入数据集。
		Map sourceMap = new HashMap<>();
		Patient patient = patientDao.getOne(systemId);
		packageSourceMap(systemId, sourceMap, docId, effectiveTime, patient,index);

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

		String patientName = patient.get患者姓名();
		String firstLetter = PinYinUtil.getFirstLetter(patientName);
		String docName = firstLetter + "_" + effectiveTime + "_C00" + index;

		upload(document, index, systemId, docId, effectiveTime, docName);

		return document.asXML();
	}

	//查询分页列表
	@Override
	public Map<String, Object> getPage(String templateIndex, int page, int size, String order, String properties, String startTime, String endTime, String systemId, String patientId, String patientName) throws Exception {
		Sort sort = new Sort(Sort.Direction.fromString(order), properties);
		Pageable pageable = PageRequest.of(page - 1, size, sort);

		String start = DateUtil.format(DateUtil.parse(startTime), "yyyyMMdd") + " 000000";
		String end = DateUtil.format(DateUtil.parse(endTime), "yyyyMMdd") + " 235959";

		Specification specification = Specifications.and()
				.eq(StringUtils.isNotBlank(systemId), "系统序号", systemId)
				.eq(StringUtils.isNotBlank(patientId), "患者身份证件号码", patientId)
				.eq(StringUtils.isNotBlank(patientName), "患者姓名", patientName)
				.gt(StringUtils.isNotBlank(startTime), (String) templateMap.get(templateIndex, "property"), start)
				.lt(StringUtils.isNotBlank(endTime), (String) templateMap.get(templateIndex, "property"), end)
				.build();

		Map<String, Object> map = getMapByTemplateIndex(templateIndex, pageable, specification);
		return map;
	}

	//根据模板序号获取对应的数据
	private Map<String, Object> getMapByTemplateIndex(String templateIndex, Pageable pageable, Specification specification) {
		switch (templateIndex) {
			case "01":
				Page geted = patientDao.findAll(specification, pageable);
				List list = Lists.newArrayList();
				geted.forEach(single -> {
					list.add(single);
				});
				return createPageMap(pageable, geted, list);
		}

		return null;
	}

	//组装分页返回值
	private Map<String, Object> createPageMap(Pageable pageable, Page geted, List list) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", list);
		map.put("pageNumber", pageable.getPageNumber() + 1);
		map.put("first", !geted.hasPrevious());
		map.put("last", !geted.hasNext());
		map.put("size", geted.getSize());
		map.put("totalPages", geted.getTotalPages());
		map.put("totalElements", geted.getTotalElements());
		return map;
	}

	/**
	 * 将生成的文档上传至文件服务器,并将文件地址存入数据库
	 *
	 * @param document
	 * @throws IOException
	 */
	private void upload(Document document, String index, String systemId, String docId, String effectiveTime, String docName) throws IOException {
		StringWriter stringWriter = new StringWriter();
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8"); //设置XML文档的编码类型
		format.setIndent(true); //设置是否缩进
		format.setIndent("	"); //缩进方式
		format.setNewlines(true); //设置是否换行
		XMLWriter writer = new XMLWriter(stringWriter, format);
		writer.write(document);
		writer.flush();
		String xml = stringWriter.getBuffer().toString();
		String uploadName = docId + ".xml";
		File file = FileUtil.touch("D://cda//" + uploadName);
		FileUtil.writeString(xml, file, "UTF-8");
		String url = fastDFSClientWrapper.uploadFile(file);

		String patientId = patientDao.getOne(systemId).get患者身份证件号码();

		Integer i = patientCdaDocumentDao.findMax();
		int max = i == null ? 0 : i;

		PatientCdaDocument patientCdaDocument = new PatientCdaDocument();
		patientCdaDocument.set系统序号(max + 1 + "");
		patientCdaDocument.setDocid(docId);
		patientCdaDocument.setDocurl(url);
		patientCdaDocument.setPatientid(patientId);
		patientCdaDocument.setTemplateindex(index);
		patientCdaDocument.setDocname(docName + ".xml");
		patientCdaDocument.setEffectivetime(effectiveTime);
		patientCdaDocumentDao.save(patientCdaDocument);

		writer.close();
		stringWriter.close();
		FileUtil.del(file.toPath());
	}

	/**
	 * 填充模板需要的数据集
	 *  @param systemId
	 * @param sourceMap
	 * @param index
	 */
	private void packageSourceMap(String systemId, Map sourceMap, String docId, String effectiveTime, Patient patient, String index) {

		DocInfo docInfo = new DocInfo();
		docInfo.setDocId(docId);
		docInfo.setEffectiveTime(effectiveTime);
		sourceMap.put("docInfo", docInfo);

		patient.set婚姻状况(patientDao.find婚姻状况By婚姻状况代码(patient.get婚姻状况代码()));
		patient.set民族名称(patientDao.find名族名称By名族(patient.get民族()));
		patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
		patient.set职业类别(patientDao.find职业类别By职业类别代码(patient.get职业类别代码()));
		sourceMap.put("patient", patient);

		String orgId = patient.get建档医疗机构组织机构();
		String orgName = medicalOrganizationInfoDao.findOrgNameByCode(orgId);
		sourceMap.put("orgName", orgName);

		generateService.addData(sourceMap,patient,index);

//		String patientHealthCardId = patient.get居民健康卡号();
//		PatientHealthDocInfo patientHealthDocInfo = patientHealthDocInfoDao.findBy居民健康卡号(patientHealthCardId);
//		sourceMap.put("patientHealthDocInfo", patientHealthDocInfo);
//
//		HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);
//		sourceMap.put("healthIncidentInfo", healthIncidentInfo);
//
//		MedicalExpenseRecord medicalExpenseRecord = medicalExpenseRecordDao.findBy居民健康卡号(patientHealthCardId);
//		sourceMap.put("medicalExpenseRecord", medicalExpenseRecord);
	}


	@Override
	public void update(String templateIndex, String docInfo) {
		if ("1".equals(templateIndex)) {
			Patient obj = JSONObject.parseObject(docInfo, Patient.class);
			patientDao.save(obj);
		}
	}

	@Override
	public void insert(String templateIndex, String docInfo) {
		if ("1".equals(templateIndex)) {
			Integer i = patientDao.findMax();
			int max = i == null ? 0 : i;
			Patient obj = JSONObject.parseObject(docInfo, Patient.class);
			obj.set系统序号(max + 1 + "");
			String effectiveTime = DateUtil.format(DateUtil.date(), "yyyyMMdd HHmmss");
			obj.set建档日期时间(effectiveTime);
			patientDao.save(obj);
		}
	}

	@Override
	public void delele(String templateIndex, List<String> systemIds) {
		if ("1".equals(templateIndex)) {
			for (String systemId : systemIds) {
				patientDao.deleteById(systemId);
			}
		}
	}

	@Override
	public void uploadFile(MultipartFile multipartFile) throws Exception {
		InputStream is = multipartFile.getInputStream();
		File file = FileUtil.touch("D://cda//TempDoc.xml");
		FileWriter writer = FileWriter.create(file);
		file = writer.writeFromStream(is);

		Document doc = FileUtils.readFile(file);
		boolean flag = XMLSchemaUtil.validateXML(doc.asXML());

		if (flag) {
			Element root = doc.getRootElement();
			Element eleId = root.element("recordTarget").element("patientRole").element("patient").element("id");
			String patientId = eleId.attributeValue("extension");

			String url = fastDFSClientWrapper.uploadFile(file);

			Integer i = patientCdaDocumentDao.findMax();
			int max = i == null ? 0 : i;

			String docId = root.element("id").attributeValue("extension");
			String index = root.element("code").attributeValue("code");
			index = index.substring(index.length() - 2, index.length());
			String effectiveTime = root.element("effectiveTime").attributeValue("value");
			String patientName = root.element("recordTarget").element("patientRole").element("patient").element("name").getText();

			String firstLetter = PinYinUtil.getFirstLetter(patientName);
			String docName = firstLetter + "_" + effectiveTime + "_C00" + index;

			PatientCdaDocument patientCdaDocument = new PatientCdaDocument();
			patientCdaDocument.set系统序号(max + 1 + "");
			patientCdaDocument.setDocid(docId);
			patientCdaDocument.setDocurl(url);
			patientCdaDocument.setPatientid(patientId);
			patientCdaDocument.setTemplateindex(index);
			patientCdaDocument.setDocname(docName + ".xml");
			patientCdaDocument.setEffectivetime(effectiveTime);
			patientCdaDocumentDao.save(patientCdaDocument);
			FileUtil.del(file.toPath());
		} else {
			FileUtil.del(file.toPath());
			throw new RuntimeException("校验未通过");
		}
	}

	@Override
	public File download(PatientCdaDocument doc) throws IOException {
		String fileUrl = doc.getDocurl();
		String fileName = doc.getDocname();
		byte[] download = fastDFSClientWrapper.downloadFile(fileUrl);
		File file = FileUtil.touch("D://cda//" + fileName);
		FileUtil.writeBytes(download, file);
		return file;
	}

	@Override
	public File download(PatientCdaDocument doc, String path) throws IOException {
		String fileUrl = doc.getDocurl();
		String fileName = doc.getDocname();
		byte[] download = fastDFSClientWrapper.downloadFile(fileUrl);
		File file = FileUtil.touch(path + "//" + fileName);
		FileUtil.writeBytes(download, file);
		return file;
	}
}
