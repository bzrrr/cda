package com.arrcen.cdademo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.hibernate.internal.util.xml.XmlDocument;

public class UtilTest2 {
	public static void main(String[] args) throws Exception {
		String json = "{\"ClinicalDocument\":{\"childs\":[{\"realmCode\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"CN\"}}},{\"typeId\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"POCD_MT000040\",\"root\":\"2.16.840.1.113883.1.3\"}}},{\"templateId\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"root\":\"2.16.156.10011.2.1.1.30\"}}},{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.1\"}}},{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"C0010\",\"codeSystem\":\"2.16.156.10011.2.4\",\"codeSystemName\":\"卫生信息共享文档规范编码体系\"}}},{\"title\":{\"text\":\"麻醉术前访视记录\",\"childs\":[],\"attrs\":{}}},{\"effectiveTime\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"value\":\"\"}}},{\"confidentialityCode\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"N\",\"codeSystem\":\"2.16.840.1.113883.5.25\",\"codeSystemName\":\"Confidentiality\",\"displayName\":\"正常访问保密级别\"}}},{\"languageCode\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"zh-CN\"}}},{\"setId\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"versionNumber\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"recordTarget\":{\"childs\":[{\"patientRole\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.11\"}}},{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.12\"}}},{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.24\"}}},{\"patient\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"${patient.patientId!}\",\"root\":\"2.16.156.10011.1.3\"}}},{\"name\":{\"text\":\"${patient.patientName!}\",\"childs\":[],\"attrs\":{}}},{\"administrativeGenderCode\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"${patient.genderCode!}\",\"codeSystem\":\"2.16.156.10011.2.3.3.4\",\"codeSystemName\":\"生理性别代码表(GB/T 2261.1)\"}}},{\"birthTime\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"value\":\"${patient.birthTime!}\"}}},{\"age\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"unit\":\"岁\",\"value\":\"\"}}}],\"attrs\":{\"classCode\":\"PSN\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"PAT\"}}}],\"attrs\":{\"contextControlCode\":\"OP\",\"typeCode\":\"RCT\"}}},{\"author\":{\"childs\":[{\"time\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"value\":\"\"}}},{\"assignedAuthor\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.7\"}}},{\"assignedPerson\":{\"childs\":[{\"name\":{\"text\":\"${patient.archiverName!}\",\"childs\":[],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{\"classCode\":\"ASSIGNED\"}}}],\"attrs\":{\"contextControlCode\":\"OP\",\"typeCode\":\"AUT\"}}},{\"custodian\":{\"childs\":[{\"assignedCustodian\":{\"childs\":[{\"representedCustodianOrganization\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.5\"}}},{\"name\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}}],\"attrs\":{\"classCode\":\"ORG\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"ASSIGNED\"}}}],\"attrs\":{\"typeCode\":\"CST\"}}},{\"authenticator\":{\"childs\":[{\"time\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"signatureCode\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"assignedEntity\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.4\"}}},{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"displayName\":\"麻醉医师\"}}},{\"assignedPerson\":{\"childs\":[{\"name\":{\"text\":\"${patient.archiverName!}\",\"childs\":[],\"attrs\":{}}}],\"attrs\":{\"classCode\":\"PSN\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"relatedDocument\":{\"childs\":[{\"parentDocument\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"setId\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"versionNumber\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{\"typeCode\":\"RPLC\"}}},{\"componentOf\":{\"childs\":[{\"encompassingEncounter\":{\"childs\":[{\"effectiveTime\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"location\":{\"childs\":[{\"healthCareFacility\":{\"childs\":[{\"serviceProviderOrganization\":{\"childs\":[{\"asOrganizationPartOf\":{\"childs\":[{\"wholeOrganization\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.22\"}}},{\"name\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"asOrganizationPartOf\":{\"childs\":[{\"wholeOrganization\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.21\"}}},{\"name\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"asOrganizationPartOf\":{\"childs\":[{\"wholeOrganization\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.26\"}}},{\"name\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"asOrganizationPartOf\":{\"childs\":[{\"wholeOrganization\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.27\"}}},{\"name\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"asOrganizationPartOf\":{\"childs\":[{\"wholeOrganization\":{\"childs\":[{\"id\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"extension\":\"\",\"root\":\"2.16.156.10011.1.5\"}}},{\"name\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}}],\"attrs\":{\"classCode\":\"ORG\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"PART\"}}}],\"attrs\":{\"classCode\":\"ORG\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"PART\"}}}],\"attrs\":{\"classCode\":\"ORG\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"PART\"}}}],\"attrs\":{\"classCode\":\"ORG\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"PART\"}}}],\"attrs\":{\"classCode\":\"ORG\",\"determinerCode\":\"INSTANCE\"}}}],\"attrs\":{\"classCode\":\"PART\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"section\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"10219-4\",\"codeSystem\":\"2.16.840.1.113883.6.1\",\"codeSystemName\":\"LOINC\",\"displayName\":\"Surgical operation note preoperative Dx\"}}},{\"text\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE05.01.024.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"术前诊断编码\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"\",\"codeSystem\":\"2.16.156.10011.2.3.3.11.3\",\"codeSystemName\":\"诊断代码表(ICD-10)\",\"displayName\":\"\",\"type\":\"CD\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE05.01.076.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"术前合并疾病\"}}},{\"value\":{\"text\":\"患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"section\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"10164-2\",\"codeSystem\":\"2.16.840.1.113883.6.1\",\"codeSystemName\":\"LOINC\",\"displayName\":\"HISTORY OF PRESENT ILLNESS\"}}},{\"text\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE05.10.140.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"简要病史\"}}},{\"value\":{\"text\":\"对患者病史的简要描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"section\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"11348-0\",\"codeSystem\":\"2.16.840.1.113883.6.1\",\"codeSystemName\":\"LOINC\",\"displayName\":\"HISTORY OF PAST ILLNESS\"}}},{\"text\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE02.10.022.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"过敏史\"}}},{\"value\":{\"text\":\"患者既往发生过敏情况的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"section\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"29545-1\",\"codeSystem\":\"2.16.840.1.113883.6.1\",\"codeSystemName\":\"LOINC\",\"displayName\":\"PHYSICAL EXAMINATION\"}}},{\"text\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.188.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"体重\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"unit\":\"kg\",\"type\":\"PQ\",\"value\":\"\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.219.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"一般状况检查结果\"}}},{\"value\":{\"text\":\"对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE05.10.142.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"精神状态正常标志\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"type\":\"BL\",\"value\":\"\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.207.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"心脏听诊结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对心脏听诊结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.031.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"肺部听诊结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对患者肺部听诊检查结果的描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.179.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"四肢检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对四肢检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.093.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"脊柱检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对脊柱检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.046.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"腹部检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对腹部检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE06.00.230.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"气管检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对气管检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.10.264.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"牙齿检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对牙齿检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"section\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"30954-2\",\"codeSystem\":\"2.16.840.1.113883.6.1\",\"codeSystemName\":\"LOINC\",\"displayName\":\"STUDIES SUMMARY\"}}},{\"text\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"organizer\":{\"childs\":[{\"statusCode\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"component\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.001.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"ABO血型代码\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"\",\"codeSystem\":\"2.16.156.10011.2.3.1.85\",\"codeSystemName\":\"ABO血型代码表\",\"displayName\":\"\",\"type\":\"CD\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.010.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"Rh(D)血型代码\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"\",\"codeSystem\":\"2.16.156.10011.2.3.1.250\",\"codeSystemName\":\"Rh(D)血型代码表\",\"displayName\":\"\",\"type\":\"CD\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{\"classCode\":\"BATTERY\",\"moodCode\":\"EVN\"}}}],\"attrs\":{\"typeCode\":\"COMP\"}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.30.043.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"心电图检查结果\"}}},{\"value\":{\"text\":\"对患者心电图检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.30.045.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"胸部X线检查结果\"}}},{\"value\":{\"text\":\"对患者胸部X线检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.30.005.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"CT检查结果\"}}},{\"value\":{\"text\":\"CT检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.30.002.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"B超检查结果\"}}},{\"value\":{\"text\":\"B超检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.30.009.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"MRI检查结果\"}}},{\"value\":{\"text\":\"MRI检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.30.009.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"MRI检查结果\"}}},{\"value\":{\"text\":\"患者肺功能检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.128.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"血常规检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对患者血常规检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.048.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"尿常规检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对患者尿常规检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.142.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"凝血功能检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对患者凝血功能检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.026.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"肝功能检查结果\"}}},{\"value\":{\"text\":\"对患者肝功能检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE04.50.128.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"血气分析检查结果\"}}},{\"value\":{\"text\":\"麻醉术前访视时，对患者血气分析检查结果的详细描述\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}},{\"component\":{\"childs\":[{\"section\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"18776-5\",\"codeSystem\":\"2.16.840.1.113883.6.1\",\"codeSystemName\":\"LOINC\",\"displayName\":\"TREATMENT PLAN\"}}},{\"text\":{\"text\":\"\",\"childs\":[],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE06.00.093.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"拟实施手术及操作编码\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"\",\"codeSystem\":\"2.16.156.10011.2.3.3.12\",\"codeSystemName\":\"手术(操作)代码表(ICD-9-CM)\",\"displayName\":\"\",\"type\":\"CD\"}}},{\"entryRelationship\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE06.00.256.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"患者实施手术所在的手术室编号\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{\"typeCode\":\"COMP\"}}}],\"attrs\":{\"classCode\":\"PROC\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}},{\"entry\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE06.00.073.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"拟实施麻醉方法代码\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"\",\"codeSystem\":\"2.16.156.10011.2.3.3.12\",\"codeSystemName\":\"麻醉方法代码表\",\"displayName\":\"\",\"type\":\"CD\"}}},{\"entryRelationship\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE06.00.287.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"术前麻醉医嘱\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"INT\"}}}],\"attrs\":{\"typeCode\":\"COMP\"}}},{\"entryRelationship\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE06.00.227.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"麻醉适应症\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"INT\"}}}],\"attrs\":{\"typeCode\":\"COMP\"}}},{\"entryRelationship\":{\"childs\":[{\"observation\":{\"childs\":[{\"code\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"code\":\"DE09.00.119.00\",\"codeSystem\":\"2.16.156.10011.2.2.1\",\"codeSystemName\":\"卫生信息数据元目录\",\"displayName\":\"注意事项\"}}},{\"value\":{\"text\":\"\",\"childs\":[],\"attrs\":{\"type\":\"ST\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{\"typeCode\":\"COMP\"}}}],\"attrs\":{\"classCode\":\"OBS\",\"moodCode\":\"EVN\"}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{}}}],\"attrs\":{\"xmlns=\\\"urn:hl7-org:v3\\\" xmlns:mif=\\\"urn:hl7-org:v3/mif\\\"\\n                  xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\"\\n                  xsi:schemaLocation=\\\"urn:hl7-org:v3 ..\\\\sdschemas\\\\SDA.xsd\\\"\"}}}\n";
		String output = XML2jsonUtil.obj2Xml(JSON.parseObject(json)).asXML();
		System.out.println(output);
	}

}
