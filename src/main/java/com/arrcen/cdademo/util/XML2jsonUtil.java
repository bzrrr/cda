package com.arrcen.cdademo.util;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.util.List;

public class XML2jsonUtil {

	public static void main(String[] args) {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ../sdschemas/SDA.xsd\">\n" +
				"<!-- Head -->\n" +
				"  <realmCode code=\"CN\"/>\n" +
				"  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
				"  <templateId root=\"2.16.156.10011.2.1.1.56\"/>\n" +
				"  <!-- 文档流水号 -->\n" +
				"  <id root=\"2.16.156.10011.1.1\" extension=\"\"/>\n" +
				"  <code code=\"C0036\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
				"  <title>24小时内入院死亡记录</title>\n" +
				"  <!-- 文档机器生成时间 -->\n" +
				"  <effectiveTime value=\"\"/>\n" +
				"  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
				"  <languageCode code=\"zh-CN\"/>\n" +
				"  <setId/>\n" +
				"  <versionNumber/>\n" +
				"  \n" +
				"  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
				"    <patientRole classCode=\"PAT\">\n" +
				"  \t\t<!-- 住院号 -->\n" +
				"      <id root=\"2.16.156.10011.1.12\" extension=\"\"/>\n" +
				"\t  <addr use=\"H\">\n" +
				"\t\t  <houseNumber></houseNumber>\n" +
				"\t\t  <streetName></streetName>\n" +
				"\t\t  <township></township>\n" +
				"\t\t  <county></county>\n" +
				"\t\t  <city></city>\n" +
				"\t\t  <state></state>\n" +
				"\t  </addr>\n" +
				"      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"  \t\t  <!-- 患者身份证 -->\n" +
				"        <id root=\"2.16.156.10011.1.3\" extension=\"\"/>\n" +
				"        <name></name>\n" +
				"        <administrativeGenderCode code=\"2\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表(GB/T 2261.1)\" displayName=\"女性\"/>\n" +
				"\t\t<maritalStatusCode code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表(GB/T 2261.2)\"/>\n" +
				"\t\t<ethnicGroupCode code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.3\" codeSystemName=\"民族类别代码表(GB/T 3304)\"/>\n" +
				"  \t\t<birthTime value=\"\"/>\n" +
				"        <age value=\"\" unit=\"岁\"/>\n" +
				"\t\t<occupation>\n" +
				"\t\t\t<occupationCode code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemName=\"从业状况(个人身体)代码表(GB/T 2261.4)\"/>\n" +
				"\t\t</occupation>\n" +
				"      </patient>\n" +
				"    </patientRole>\n" +
				"  </recordTarget>\n" +
				"  \n" +
				"  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
				"   <time value=\"\"/>\n" +
				"   <assignedAuthor classCode=\"ASSIGNED\">\n" +
				"     <id root=\"2.16.156.10011.1.7\" extension=\"\"/>\n" +
				"     <assignedPerson>\n" +
				"  \t\t<name>xx</name>\n" +
				"     </assignedPerson>\n" +
				"   </assignedAuthor>\n" +
				"  </author>\n" +
				"  \n" +
				"  <!-- 病史称述者 -->\n" +
				"  <informant>\n" +
				"\t  <assignedEntity>\n" +
				"\t\t  <id/>\n" +
				"\t\t  <code code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.8\" codeSystemName=\"家庭关系代码表(GB/T 4761)\"/>\n" +
				"\t\t  <assignedPerson>\n" +
				"\t\t\t  <name></name>\n" +
				"\t\t  </assignedPerson>\n" +
				"\t  </assignedEntity>\n" +
				"  </informant>\n" +
				"  \n" +
				"  <custodian typeCode=\"CST\">\n" +
				"    <assignedCustodian classCode=\"ASSIGNED\">\n" +
				"      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"        <id root=\"2.16.156.10011.1.5\" extension=\"\"/>\n" +
				"        <name>xx医院</name>\n" +
				"      </representedCustodianOrganization>\n" +
				"    </assignedCustodian>\n" +
				"  </custodian>\n" +
				"  \n" +
				"  <legalAuthenticator>\n" +
				"    <time value=\"\"/>\n" +
				"    <signatureCode/>\n" +
				"    <assignedEntity>\n" +
				"      <id root=\"2.16.156.10011.1.4\" extension=\"\"/>\n" +
				"      <code displayName=\"主任医师\"/>\n" +
				"      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"        <name></name>\n" +
				"      </assignedPerson>\n" +
				"    </assignedEntity>\n" +
				"  </legalAuthenticator>\n" +
				"  \n" +
				"  <authenticator>\n" +
				"    <time value=\"\"/>\n" +
				"    <signatureCode/>\n" +
				"    <assignedEntity>\n" +
				"      <id root=\"2.16.156.10011.1.4\" extension=\"\"/>\n" +
				"      <code displayName=\"接诊医师\"/>\n" +
				"      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"        <name></name>\n" +
				"      </assignedPerson>\n" +
				"    </assignedEntity>\n" +
				"  </authenticator>\n" +
				"  \n" +
				"  <authenticator>\n" +
				"    <time value=\"\"/>\n" +
				"    <signatureCode/>\n" +
				"    <assignedEntity>\n" +
				"      <id root=\"2.16.156.10011.1.4\" extension=\"\"/>\n" +
				"      <code displayName=\"住院医师\"/>\n" +
				"      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"        <name></name>\n" +
				"      </assignedPerson>\n" +
				"    </assignedEntity>\n" +
				"  </authenticator>\n" +
				"  \n" +
				"  <authenticator>\n" +
				"    <time value=\"\"/>\n" +
				"    <signatureCode/>\n" +
				"    <assignedEntity>\n" +
				"      <id root=\"2.16.156.10011.1.4\" extension=\"\"/>\n" +
				"      <code displayName=\"主治医师\"/>\n" +
				"      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"        <name></name>\n" +
				"      </assignedPerson>\n" +
				"    </assignedEntity>\n" +
				"  </authenticator>\n" +
				"  \n" +
				"  <relatedDocument typeCode=\"RPLC\">\n" +
				"    <parentDocument>\n" +
				"      <id/>\n" +
				"      <setId/>\n" +
				"      <versionNumber/>\n" +
				"    </parentDocument>\n" +
				"  </relatedDocument>\n" +
				"  \n" +
				"  <componentOf>\n" +
				"  \t  <encompassingEncounter>\n" +
				"\t\t  <!-- 入院时间 -->\n" +
				"  \t\t  <effectiveTime>\n" +
				"\t\t\t  <low value=\"\"/>\n" +
				"\t\t  </effectiveTime>\n" +
				"  \t  </encompassingEncounter>\n" +
				"  </componentOf>\n" +
				"  \n" +
				"  <component>\n" +
				"\t  <structuredBody>\n" +
				"\t\t  <!-- 主诉 -->\n" +
				"\t\t  <component>\n" +
				"\t\t\t  <section>\n" +
				"\t\t\t\t  <code code=\"10154-3\" displayName=\"CHIEF COMPLAINT\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"\t\t\t\t  <text/>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE04.01.119.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"主诉\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t  </section>\n" +
				"\t\t  </component>\n" +
				"\t\t  <!-- 主要健康问题 -->\n" +
				"\t\t  <component>\n" +
				"\t\t\t  <section>\n" +
				"\t\t\t\t  <code code=\"11450-4\" displayName=\"Problem list\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"\t\t\t\t  <text/>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.10.143.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"称述内容可靠标志\"></code>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"BL\" value=\"false\"/>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"中医四诊观察结果\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t  </section>\n" +
				"\t\t  </component>\n" +
				"\t\t  <!-- 入院诊断 -->\n" +
				"\t\t  <component>\n" +
				"\t\t\t  <section>\n" +
				"\t\t\t\t  <code code=\"46241-6\" displayName=\"HOSPITAL ADMISSION DX\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"\t\t\t\t  <text/>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-西医诊断名称\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-西医诊断编码\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"CD\" code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表(ICD-10)\"/>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"鉴别诊断-中医病名名称\"></code>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医病名代码\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"CD\" code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"中医病症分类与代码表(GB/T 15657)\"/>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医证候名称\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医证候代码\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病症分类与代码表(GB/T 15657-1995)\" displayName=\"\"/>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t  </section>\n" +
				"\t\t  </component>\n" +
				"\t\t\t  <!-- 治疗计划 -->\n" +
				"\t\t  <component>\n" +
				"\t\t\t  <section>\n" +
				"\t\t\t\t  <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"\t\t\t\t  <text/>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE06.00.300.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"治则治法\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t  </section>\n" +
				"\t\t  </component>\n" +
				"\t\t  <!-- 住院过程章节 -->\n" +
				"\t\t  <component>\n" +
				"\t\t\t  <section>\n" +
				"\t\t\t\t  <code code=\"8648-8\" displayName=\"Hospital  Course\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"\t\t\t\t  <text/>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.10.148.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院情况\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE06.00.296.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"诊疗过程描述\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE02.01.036.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡日期时间\"/>\n" +
				"\t\t\t\t\t\t  <effectiveTime>\n" +
				"\t\t\t\t\t\t\t  <high value=\"\"/>\n" +
				"\t\t\t\t\t\t  </effectiveTime>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.10.099.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡原因\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-西医诊断名称\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-西医诊断编码\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"诊断代码表(ICD-10)\" displayName=\"\"/>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t\t  <entry>\n" +
				"\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t  <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医病名名称\"/>\n" +
				"\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医病名代码\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病症分类与代码表(GB/T 15657-1995)\" displayName=\"\"/>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.10.172.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断-中医证候名称\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"ST\"></value>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t\t  <entryRelationship typeCode=\"COMP\">\n" +
				"\t\t\t\t\t\t\t  <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"\t\t\t\t\t\t\t\t  <code code=\"DE05.10.130.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断-中医证候代码\"/>\n" +
				"\t\t\t\t\t\t\t\t  <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\" codeSystemName=\"中医病症分类与代码表(GB/T 15657-1995)\" displayName=\"\"/>\n" +
				"\t\t\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t\t\t  </entryRelationship>\n" +
				"\t\t\t\t\t  </observation>\n" +
				"\t\t\t\t  </entry>\n" +
				"\t\t\t  </section>\n" +
				"\t\t  </component>\n" +
				"\t  </structuredBody>\n" +
				"  </component>\n" +
				"</ClinicalDocument>";

		SAXReader reader =new SAXReader();

		try {
			Document document =reader.read(new ByteArrayInputStream(xml.getBytes()));
			JSONObject obj = xml2Obj(document.getRootElement());
			System.out.println(obj.toJSONString());
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

	public static JSONObject xml2Obj(Element element) {

		JSONObject returnObj = new JSONObject();

		JSONObject rootObj = new JSONObject();


		List<?> attrs = element.attributes();

		List<?> childs = element.elements();


//属性

		JSONObject attrObj = new JSONObject();

		for (Object object : attrs) {

			Attribute attr = (Attribute) object;

			attrObj.put(attr.getName(), attr.getValue());

		}

		rootObj.put("attrs", attrObj);


//子节点

		JSONArray childArray = new JSONArray();

		for (Object child : childs) {

			childArray.add(xml2Obj((Element) child));

		}

		rootObj.put("childs", childArray);


//叶子节点，文本

		if (childs.isEmpty()) {

			rootObj.put("text", element.getText());

		}


//返回值包裹处理

		returnObj.put(element.getName(), rootObj);


		return returnObj;

	}
}
