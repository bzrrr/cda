package com.arrcen.cdademo.util;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.util.List;

public class XML2jsonUtil {

	public static void main(String[] args) {
		StringBuffer xml = new StringBuffer();
		String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\"\n" +
				"                  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
				"                  xsi:schemaLocation=\"urn:hl7-org:v3 ../sdschemas/SDA.xsd\">\n" +
				"    <!-- Head -->\n" +
				"    <realmCode code=\"CN\"/>\n" +
				"    <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
				"    <templateId root=\"2.16.156.10011.2.1.1.73\"/>\n" +
				"    <!-- 文档流水号 -->\n" +
				"    <id root=\"2.16.156.10011.1.1\" extension=\"\"/>\n" +
				"    <code code=\"C0053\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
				"    <title>出院小结</title>\n" +
				"    <!-- 文档机器生成时间 -->\n" +
				"    <effectiveTime value=\"\"/>\n" +
				"    <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\"\n" +
				"                         displayName=\"正常访问保密级别\"/>\n" +
				"    <languageCode code=\"zh-CN\"/>\n" +
				"    <setId/>\n" +
				"    <versionNumber/>\n" +
				"    <!-- 文档记录对象（患者） -->\n" +
				"    <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
				"        <patientRole classCode=\"PAT\">\n" +
				"            <!-- 健康卡号 -->\n" +
				"            <id root=\"2.16.156.10011.1.19\" extension=\"\"/>\n" +
				"            <!-- 住院号 -->\n" +
				"            <id root=\"2.16.156.10011.1.12\" extension=\"\"/>\n" +
				"            <addr use=\"H\">\n" +
				"                <houserNumber></houserNumber>\n" +
				"                <streetName></streetName>\n" +
				"                <township></township>\n" +
				"                <county></county>\n" +
				"                <city></city>\n" +
				"                <state></state>\n" +
				"                <postalCode></postalCode>\n" +
				"            </addr>\n" +
				"            <!-- 患者电话 -->\n" +
				"            <telecom value=\"\"/>\n" +
				"            <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"                <!-- 患者身份证 -->\n" +
				"                <id root=\"2.16.156.10011.1.3\" extension=\"\"/>\n" +
				"                <name></name>\n" +
				"                <administrativeGenderCode code=\"2\" codeSystem=\"2.16.156.10011.2.3.3.4\"\n" +
				"                                          codeSystemName=\"生理性别代码表(GB/T 2261.1)\" displayName=\"女性\"/>\n" +
				"                <birthTime value=\"\"/>\n" +
				"                <!-- 婚姻状况 -->\n" +
				"                <maritalStatusCode code=\"\" displayName=\"\" codeSystem=\"2.16.156.10011.2.3.3.5\"\n" +
				"                                   codeSystemName=\"婚姻状况代码表(GB/T 2261.2)\"/>\n" +
				"                <age value=\"\" unit=\"岁\"/>\n" +
				"                <!-- 职业 -->\n" +
				"                <occupation>\n" +
				"                    <occupationCode code=\"\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemName=\"从业状况(个人身体)代码表\"\n" +
				"                                    displayName=\"\"/>\n" +
				"                </occupation>\n" +
				"            </patient>\n" +
				"            <!-- 提供患者服务机构 -->\n" +
				"            <providerOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                <id root=\"2.16.156.10011.1.5\" extension=\"\"/>\n" +
				"                <name>xx医院</name>\n" +
				"            </providerOrganization>\n" +
				"        </patientRole>\n" +
				"    </recordTarget>\n" +
				"    <!-- 文档创作者 -->\n" +
				"    <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
				"        <time value=\"\"/>\n" +
				"        <assignedAuthor classCode=\"ASSIGNED\">\n" +
				"            <id root=\"2.16.156.10011.1.7\" extension=\"\"/>\n" +
				"            <assignedPerson>\n" +
				"                <name>xx</name>\n" +
				"            </assignedPerson>\n" +
				"        </assignedAuthor>\n" +
				"    </author>\n" +
				"    <!-- 文档生成机构 -->\n" +
				"    <custodian typeCode=\"CST\">\n" +
				"        <assignedCustodian classCode=\"ASSIGNED\">\n" +
				"            <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                <id root=\"2.16.156.10011.1.5\" extension=\"\"/>\n" +
				"                <name>xx医院</name>\n" +
				"            </representedCustodianOrganization>\n" +
				"        </assignedCustodian>\n" +
				"    </custodian>\n" +
				"    <!-- 法定审核者 -->\n" +
				"    <legalAuthenticator typeCode=\"LA\">\n" +
				"        <!-- 签名日期 -->\n" +
				"        <time value=\"\"/>\n" +
				"        <signatureCode/>\n" +
				"        <assignedEntity>\n" +
				"            <!-- 住院医师 -->\n" +
				"            <id root=\"2.16.156.10011.1.4\" extension=\"\"/>\n" +
				"            <code displayName=\"住院医师\"/>\n" +
				"            <assignedPerson>\n" +
				"                <name></name>\n" +
				"            </assignedPerson>\n" +
				"        </assignedEntity>\n" +
				"    </legalAuthenticator>\n" +
				"    <!-- 文档审核者 -->\n" +
				"    <authenticator typeCode=\"AUTHEN\">\n" +
				"        <time value=\"\"/>\n" +
				"        <signatureCode/>\n" +
				"        <assignedEntity classCode=\"ASSIGNED\">\n" +
				"            <id root=\"2.16.156.10011.1.4\" extension=\"\"/>\n" +
				"            <code displayName=\"上级医师\"/>\n" +
				"            <assignedPerson classCode=\"PSN\">\n" +
				"                <name></name>\n" +
				"            </assignedPerson>\n" +
				"        </assignedEntity>\n" +
				"    </authenticator>\n" +
				"    <participant typeCode=\"NOT\">\n" +
				"        <!-- 联系人 -->\n" +
				"        <assignedEntity classCode=\"ECON\">\n" +
				"            <telecom value=\"\"/>\n" +
				"            <assignedPerson>\n" +
				"                <name></name>\n" +
				"            </assignedPerson>\n" +
				"        </assignedEntity>\n" +
				"    </participant>\n" +
				"\n" +
				"    <relatedDocument typeCode=\"RPLC\">\n" +
				"        <parentDocument>\n" +
				"            <id/>\n" +
				"            <setId/>\n" +
				"            <versionNumber/>\n" +
				"        </parentDocument>\n" +
				"    </relatedDocument>\n" +
				"\n" +
				"    <!-- 入院场景记录 -->\n" +
				"    <componentOf typeCode=\"COMP\">\n" +
				"        <!-- 就诊 -->\n" +
				"        <encompassingEncounter classCode=\"ENC\" moodCode=\"EVN\">\n" +
				"            <!-- 就诊时间 -->\n" +
				"            <effectiveTime>\n" +
				"                <low value=\"\"/>\n" +
				"                <high value=\"\"/>\n" +
				"            </effectiveTime>\n" +
				"            <location>\n" +
				"                <healthCareFacility>\n" +
				"                    <serviceProviderOrganization>\n" +
				"                        <asOrganizationPartOf classCode=\"PART\">\n" +
				"                            <!-- 病床号 -->\n" +
				"                            <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                                <id root=\"\" extension=\"\"/>\n" +
				"                                <name></name>\n" +
				"                                <!-- 病房号 -->\n" +
				"                                <asOrganizationPartOf classCode=\"PART\">\n" +
				"                                    <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                                        <id root=\"\" extension=\"\"/>\n" +
				"                                        <name></name>\n" +
				"                                        <!-- 科室名称 -->\n" +
				"                                        <asOrganizationPartOf classCode=\"PART\">\n" +
				"                                            <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                                                <id root=\"\" extension=\"\"/>\n" +
				"                                                <name></name>\n" +
				"                                                <!-- 病区名称 -->\n" +
				"                                                <asOrganizationPartOf classCode=\"PART\">\n" +
				"                                                    <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                                                        <id root=\"\" extension=\"\"/>\n" +
				"                                                        <name></name>\n" +
				"                                                    </wholeOrganization>\n" +
				"                                                </asOrganizationPartOf>\n" +
				"                                            </wholeOrganization>\n" +
				"                                        </asOrganizationPartOf>\n" +
				"                                    </wholeOrganization>\n" +
				"                                </asOrganizationPartOf>\n" +
				"                            </wholeOrganization>\n" +
				"                        </asOrganizationPartOf>\n" +
				"                    </serviceProviderOrganization>\n" +
				"                </healthCareFacility>\n" +
				"            </location>\n" +
				"        </encompassingEncounter>\n" +
				"    </componentOf>\n" +
				"\n" +
				"    <!-- Body -->\n" +
				"    <component>\n" +
				"        <structuredBody>\n" +
				"            <!-- 主要健康问题章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"11450-4\" displayName=\"PROBLEM LIST\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 入院情况条目 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.148.00\" displayName=\"入院情况\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 入院诊断章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"46241-6\" displayName=\"HOSPITAL ADMISSION DX\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 入院诊断 西医 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.01.024.00\" displayName=\"入院诊断-西医诊断编码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.11.5\"\n" +
				"                                   codeSystemName=\"疾病代码表(ICD-10)\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 入院诊断 中医 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.130.00\" displayName=\"入院诊断-中医病名代码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\"\n" +
				"                                   codeSystemName=\"中医病名分类(GB/T 15657)\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 入院诊断 中医证候 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.130.00\" displayName=\"入院诊断-中医证候代码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\"\n" +
				"                                   codeSystemName=\"中医病名分类(GB/T 15657)\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 出院诊断章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"11535-2\" displayName=\"Discharge Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 出院诊断 西医 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.01.024.00\" displayName=\"出院诊断-西医诊断编码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.11.5\"\n" +
				"                                   codeSystemName=\"疾病代码表(ICD-10)\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 出院诊断 中医 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.130.00\" displayName=\"出院诊断-中医病名代码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\"\n" +
				"                                   codeSystemName=\"中医病名分类(GB/T 15657)\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 出院诊断 中医证候 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.130.00\" displayName=\"出院诊断-中医证候代码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.3.14\"\n" +
				"                                   codeSystemName=\"中医病名分类(GB/T 15657)\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 中医四诊观察结果 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.028.00\" displayName=\"中医'四诊'观察结果\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 出院时症状和体征 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE04.01.117.00\" displayName=\"出院时症状与体征\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 出院情况 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.193.00\" displayName=\" 出院情况\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                            codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 手术操作章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 手术记录 -->\n" +
				"                    <entry>\n" +
				"                        <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
				"                            <code code=\"\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表(ICD-9-CM)\"/>\n" +
				"                            <statusCode/>\n" +
				"                            <effectiveTime value=\"\"/>\n" +
				"                            <entryRelationship typeCode=\"COMP\">\n" +
				"                                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                                    <code code=\"DE06.00.257.00\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                          codeSystemName=\"卫生信息数据元目录\" displayName=\"手术切口类别代码\"/>\n" +
				"                                    <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.1.251\"\n" +
				"                                           codeSystemName=\"手术切口类别代码\"/>\n" +
				"                                </observation>\n" +
				"                            </entryRelationship>\n" +
				"                            <!-- 切口愈合等级 -->\n" +
				"                            <entryRelationship typeCode=\"COMP\">\n" +
				"                                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                                    <code code=\"DE05.10.147.00\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                          codeSystemName=\"卫生信息数据元目录\" displayName=\"切口愈合等级代码\"/>\n" +
				"                                    <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.1.252\"\n" +
				"                                           codeSystemName=\"切口愈合等级代码\"/>\n" +
				"                                </observation>\n" +
				"                            </entryRelationship>\n" +
				"                            <!-- 麻醉方法 -->\n" +
				"                            <entryRelationship typeCode=\"COMP\">\n" +
				"                                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                                    <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.2\"\n" +
				"                                          codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉方法代码\"/>\n" +
				"                                    <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.1.159\"\n" +
				"                                           codeSystemName=\"麻醉方法代码\"/>\n" +
				"                                </observation>\n" +
				"                            </entryRelationship>\n" +
				"                            <!-- 手术过程 -->\n" +
				"                            <entryRelationship typeCode=\"COMP\">\n" +
				"                                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                                    <code code=\"DE05.10.063.00\" codeSystem=\"2.16.156.10011.2.2.2\"\n" +
				"                                          codeSystemName=\"卫生信息数据元目录\" displayName=\"手术过程\"/>\n" +
				"                                    <value xsi:type=\"ST\"></value>\n" +
				"                                </observation>\n" +
				"                            </entryRelationship>\n" +
				"                        </procedure>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 治疗计划章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"18776-5\" displayName=\"TREATMENT PLAN\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 治则治法 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.300.00\" displayName=\"治则治法\" codeSystem=\"2.16.156.10011.2.3.3.15\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 住院过程章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"8648-8\" displayName=\"Hospital Course\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 诊疗过程 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.296.00\" displayName=\"诊疗过程描述\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 治疗结果 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.113.00\" displayName=\"治疗结果代码\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"\" codeSystem=\"2.16.156.10011.2.3.1.148\" codeSystemName=\"治疗结果代码\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 实际住院天数 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.310.00\" displayName=\"实际住院天数\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"PQ\" value=\"\" unit=\"天\"/>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 医嘱章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"46209-3\" displayName=\"Provider Orders\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 中药煎煮方法 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE08.50.047.00\" displayName=\"中药煎煮方法\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 中药用药方法 -->\n" +
				"                    <entry>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.136.00\" displayName=\"中药用药方法\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                    <!-- 出院医嘱 -->\n" +
				"                    <entry typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.287.00\" displayName=\"出院医嘱\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                  codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\"></value>\n" +
				"                        </observation>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"            <!-- 实验室检查章节 -->\n" +
				"            <component>\n" +
				"                <section>\n" +
				"                    <code code=\"30954-2\" displayName=\"STUDIES SUMMARY\" codeSystem=\"2.16.840.1.113883.6.1\"\n" +
				"                          codeSystemName=\"LOINC\"/>\n" +
				"                    <text/>\n" +
				"                    <!-- 阳性辅助检查结果 -->\n" +
				"                    <entry typeCode=\"COMP\" contextConductionInd=\"\">\n" +
				"                        <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
				"                            <statusCode/>\n" +
				"                            <component typeCode=\"COMP\" contextConductionInd=\"\">\n" +
				"                                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                                    <code code=\"DE04.50.128.00\" codeSystem=\"2.16.156.10011.2.2.1\"\n" +
				"                                          codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                                    <value xsi:type=\"ST\"></value>\n" +
				"                                </observation>\n" +
				"                            </component>\n" +
				"                        </organizer>\n" +
				"                    </entry>\n" +
				"                </section>\n" +
				"            </component>\n" +
				"        </structuredBody>\n" +
				"    </component>\n" +
				"</ClinicalDocument>";

		xml.append(str);

		SAXReader reader =new SAXReader();

		try {
			Document document =reader.read(new ByteArrayInputStream(xml.toString().getBytes()));
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
		returnObj.put("attrs", attrObj);


//子节点

		JSONArray childArray = new JSONArray();

		for (Object child : childs) {

			childArray.add(xml2Obj((Element) child));
		}

		rootObj.put("childs", childArray);


//叶子节点，文本

		if (childs.isEmpty()) {

			rootObj.put("text", element.getText());
			returnObj.put("text", element.getText());

		}


//返回值包裹处理

//		returnObj.put(element.getName(), rootObj);
		returnObj.put("elementName", element.getName());
		returnObj.put("childs", childArray);

		return returnObj;

	}

	public static JSONObject testTrans(Element element) {

		JSONObject returnObj =new JSONObject();

		JSONObject rootObj =new JSONObject();


		List<?> attrs = element.attributes();

		List<?> childs = element.elements();


//属性

		JSONObject attrObj =new JSONObject();

		for (Object object : attrs) {

			Attribute attr = (Attribute)object;

			attrObj.put(attr.getName(),attr.getValue());

		}

		rootObj.put("attrs",attrObj);



//子节点

		JSONArray childArray =new JSONArray();

		for (Object child : childs) {

			childArray.add(testTrans((Element)child));

		}

		rootObj.put("childs",childArray);


//叶子节点，文本

		if (childs.isEmpty()) {

			rootObj.put("text",element.getText());

		}


//返回值包裹处理

		returnObj.put(element.getName(),rootObj);


		return returnObj;

	}

	public static Element obj2Xml(JSONObject obj)throws Exception {

		if (obj.keySet().size() > 1) {

			throw new Exception("json数据最外层必须为只有一个key， 代表根节点");

		}

		String rootKey = (String)obj.keySet().toArray()[0];

		Element rootEle = DocumentHelper.createElement(rootKey);

		JSONObject rootObj =obj.getJSONObject(rootKey);


		JSONObject attrsObj =rootObj.getJSONObject("attrs");

		for (String attrKey : attrsObj.keySet()) {

			rootEle.addAttribute(attrKey,attrsObj.getString(attrKey));

		}


		JSONArray childs =rootObj.getJSONArray("childs");

		if(childs.isEmpty()) {

			String text =rootObj.getString("text");

			if (text !=null) {

				rootEle.setText(text);

			}

		}

		for (Object child : childs) {

			rootEle.add(obj2Xml((JSONObject)child));

		}


		return rootEle;

	}


}
