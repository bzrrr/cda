package com.arrcen.cdademo.util;

import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;

public class UtilTest {
	public static void main(String[] args) throws Exception {
		String output = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\"\n" +
				"                  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
				"                  xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\SDA.xsd\">\n" +
				"    <realmCode code=\"CN\"/>\n" +
				"    <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
				"    <templateId root=\"2.16.156.10011.2.1.1.21\"/>\n" +
				"    <id root=\"2.16.156.10011.1.1\" extension=\"${docInfo.docId!'文档流水号标识'}\"/>\n" +
				"    <code code=\"C0001\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
				"    <title>病历概要</title>\n" +
				"    <effectiveTime value=\"${docInfo.effectiveTime!'文档机器生成时间'}\"/>\n" +
				"    <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\"\n" +
				"                         displayName=\"正常访问保密级别\"/>\n" +
				"    <languageCode code=\"zh-CN\"/>\n" +
				"    <setId/>\n" +
				"    <versionNumber/>\n" +
				"    <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
				"        <patientRole classCode=\"PAT\">\n" +
				"            <!-- 健康档案标识号 -->\n" +
				"            <id root=\"2.16.156.10011.1.2\" extension=\"${patient.城乡居民健康档案编号!'城乡居民健康档案编号'}\"/>\n" +
				"            <!-- 健康卡号 -->\n" +
				"            <id root=\"2.16.156.10011.1.19\" extension=\"${patient.居民健康卡号!'居民健康卡号'}\"/>\n" +
				"            <addr use=\"H\">\n" +
				"                <houseNumber>${patient.地址_门牌号码!'地址_门牌号码'}</houseNumber>\n" +
				"                <streetName>${patient.地址_村!'地址_村'}</streetName>\n" +
				"                <township>${patient.地址_乡!'地址_乡'}</township>\n" +
				"                <county>${patient.地址_县!'地址_县'}</county>\n" +
				"                <city>${patient.地址_市!'地址_市'}</city>\n" +
				"                <state>${patient.地址_省!'地址_省'}</state>\n" +
				"                <postalCode>${patient.邮政编码!'邮政编码'}</postalCode>\n" +
				"            </addr>\n" +
				"            <!-- 患者电话 -->\n" +
				"            <telecom value=\"${patient.患者电话号码!'患者电话号码'}\"/>\n" +
				"            <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"                <!-- 患者身份证号标识 -->\n" +
				"                <id root=\"2.16.156.10011.1.3\" extension=\"${patient.患者身份证件号码!'患者身份证件号码'}\"/>\n" +
				"                <!-- 患者姓名 -->\n" +
				"                <name>${patient.患者姓名!'患者姓名'}</name>\n" +
				"                <!-- 性别代码 -->\n" +
				"                <administrativeGenderCode code=\"${patient.性别代码!'性别代码'}\" codeSystem=\"2.16.156.10011.2.3.3.4\"\n" +
				"                                          codeSystemName=\"生理性别代码表(GB/T 2261.1)\" displayName=\"${patient.性别!'性别'}\"/>\n" +
				"                <birthTime value=\"${patient.出生日期!}\"/>\n" +
				"                <!-- 婚姻状况代码 -->\n" +
				"                <maritalStatusCode code=\"${patient.婚姻状况代码!'婚姻状况代码'}\" displayName=\"${patient.婚姻状况!'婚姻状况'}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表(GB/T 2261.2)\"/>\n" +
				"                <!-- 民族 -->\n" +
				"                <ethnicGroupCode code=\"${patient.民族!'民族'}\" displayName=\"${patient.民族名称!'民族名称'}\"\n" +
				"                                 codeSystem=\"2.16.156.10011.2.3.3.3\" codeSystemName=\"民族类别代码表(GB 3304)\"/>\n" +
				"                <!-- 工作单位 -->\n" +
				"                <employerOrganization>\n" +
				"                    <name>${patient.工作单位名称!'工作单位名称'}</name>\n" +
				"                    <telecom value=\"${patient.工作单位电话号码!'工作单位电话号码'}\"></telecom>\n" +
				"                </employerOrganization>\n" +
				"                <!-- 职业状况 -->\n" +
				"                <occupation>\n" +
				"                    <occupationCode code=\"${patient.职业类别代码!'职业类别代码'}\" codeSystem=\"2.16.156.10011.2.3.3.13\"\n" +
				"                                    codeSystemName=\"从业状况(个人身体)代码表(GB/T 2261.4)\"\n" +
				"                                    displayName=\"${patient.职业类别!'职业类别'}\"/>\n" +
				"                </occupation>\n" +
				"            </patient>\n" +
				"        </patientRole>\n" +
				"    </recordTarget>\n" +
				"    <!-- 创建者 -->\n" +
				"    <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
				"        <!-- 建档日期 -->\n" +
				"        <time value=\"${patient.建档日期时间!'建档日期时间'}\"/>\n" +
				"        <assignedAuthor classCode=\"ASSIGNED\">\n" +
				"            <id root=\"2.16.156.10011.1.7\" extension=\"${patient.建档者序号!'建档者唯一标识符'}\"/>\n" +
				"            <!-- 建档者姓名 -->\n" +
				"            <assignedPerson>\n" +
				"                <name>${patient.建档者姓名!'建档者姓名'}</name>\n" +
				"            </assignedPerson>\n" +
				"            <!-- 建档机构 -->\n" +
				"            <representedOrganization>\n" +
				"                <id root=\"2.16.156.10011.1.5\" extension=\"${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}\"/>\n" +
				"                <name>${orgName!'医疗机构名称'}</name>\n" +
				"            </representedOrganization>\n" +
				"        </assignedAuthor>\n" +
				"    </author>\n" +
				"    <!-- 保管机构 -->\n" +
				"    <custodian typeCode=\"CST\">\n" +
				"        <assignedCustodian classCode=\"ASSIGNED\">\n" +
				"            <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
				"                <id root=\"2.16.156.10011.1.5\" extension=\"${patient.建档医疗机构组织机构!'文档保管的医疗机构标识'}\"/>\n" +
				"                <name>${orgName!'保管机构名称'}</name>\n" +
				"            </representedCustodianOrganization>\n" +
				"        </assignedCustodian>\n" +
				"    </custodian>\n" +
				"    <!-- 其他参与者(联系人) -->\n" +
				"    <participant typeCode=\"NOT\">\n" +
				"        <!-- 联系人 -->\n" +
				"        <associatedEntity classCode=\"ECON\">\n" +
				"            <!-- 联系人类别,表示与患者之间的关系 -->\n" +
				"            <code/>\n" +
				"            <!-- 联系人地址 -->\n" +
				"            <addr>\n" +
				"                <houseNumber></houseNumber>\n" +
				"                <streetName></streetName>\n" +
				"                <township></township>\n" +
				"                <county></county>\n" +
				"                <city></city>\n" +
				"                <state></state>\n" +
				"                <postalCode></postalCode>\n" +
				"            </addr>\n" +
				"            <!-- 电话号码 -->\n" +
				"            <telecom use=\"H\" value=\"${patient.联系人电话号码!'联系人电话号码'}\"/>\n" +
				"            <!-- 联系人 -->\n" +
				"            <associatedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
				"                <!-- 姓名 -->\n" +
				"                <name>${patient.联系人姓名!'联系人姓名'}</name>\n" +
				"            </associatedPerson>\n" +
				"        </associatedEntity>\n" +
				"    </participant>\n" +
				"    <relatedDocument typeCode=\"RPLC\">\n" +
				"        <parentDocument>\n" +
				"            <id/>\n" +
				"            <setId/>\n" +
				"            <versionNumber/>\n" +
				"        </parentDocument>\n" +
				"    </relatedDocument>\n" +
				"\n" +
				"    <!-- 实验室检验章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"30954-2\" displayName=\"STUDIES SUMMARY\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 血型 -->\n" +
				"            <entry>\n" +
				"                <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
				"                    <statusCode/>\n" +
				"                    <!-- ABO血型 -->\n" +
				"                    <component typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE04.50.001.00\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${patientHealthDocInfo.ABO血型代码!}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.85\" codeSystemName=\"ABO血型代码表\" displayName=\"\"/>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"                    <!-- Rh血型 -->\n" +
				"                    <component typeCode=\"COMP\" contextConductionInd=\"true\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE04.50.001.00\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${patientHealthDocInfo.RH血型代码!}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.250\" codeSystemName=\"rH血型代码表\" displayName=\"\"/>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"                </organizer>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 既往史章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"11348-0\" displayName=\"HISTORY OF PAST ILLNESS\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 疾病史(含外伤) -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.026.00\" displayName=\"疾病史(含外伤)\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.疾病史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"            <!-- 传染病史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.008.00\" displayName=\"传染病史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.传染病史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"            <!-- 手术史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.061.00\" displayName=\"手术史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.手术史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"            <!-- 婚育史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.098.00\" displayName=\"婚育史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.婚育史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 输血章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"56836-0\" displayName=\"History of blood transfusion\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 输血史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.100.00\" displayName=\"输血史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.输血史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 过敏史章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"48765-2\" displayName=\"Allergies, adverse reactions, alerts\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 过敏史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.022.00\" displayName=\"过敏史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.过敏史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 预防接种史章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"11369-6\" displayName=\"HISTORY OF IMMUNIZATIONS\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 预防接种史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.022.00\" displayName=\"预防接种史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.预防接种史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 个人史章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"29762-2\" displayName=\"Social history\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 个人史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.097.00\" displayName=\"个人史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.个人史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 月经史章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"49033-4\" displayName=\"Menstrual History\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 月经史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.102.00\" displayName=\"月经史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.月经史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 家族史章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code code=\"10157-6\" displayName=\"HISTORY OF FAMILY MEMBER DISEASES\"\n" +
				"                  codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
				"            <text/>\n" +
				"            <!-- 家族史 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.10.103.00\" displayName=\"家族史\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${patientHealthDocInfo.家族史!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"\n" +
				"    <!-- 卫生事件章节 -->\n" +
				"    <component>\n" +
				"        <section>\n" +
				"            <code displayName=\"卫生事件\"></code>\n" +
				"            <text/>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE08.10.026.00\" displayName=\"医疗机构科室名称\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.医疗机构科室名称!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.01.060.00\" displayName=\"患者类型代码\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"CD\" code=\"${healthIncidentInfo.患者类型代码!}\" codeSystem=\"2.16.156.10011.2.3.1.271\"\n" +
				"                           codeSystemName=\"患者类型代码表\"></value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE01.00.010.00\" displayName=\"门(急)诊号\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.门急诊号!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE01.00.014.00\" displayName=\"住院号\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.住院号!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
				"                    <statusCode/>\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.092.00\" displayName=\"入院日期时间\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"TS\" value=\"${healthIncidentInfo.入院日期时间!}\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.017.00\" displayName=\"出院日期时间\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"TS\" value=\"${healthIncidentInfo.出院日期时间!}\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"                </organizer>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE04.01.018.00\" displayName=\"发病日期时间\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"TS\" value=\"${healthIncidentInfo.发病日期时间!}\"></value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE05.10.053.00\" displayName=\"就诊原因\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <!-- 就诊日期时间 -->\n" +
				"                    <effectiveTime value=\"${healthIncidentInfo.就诊日期时间!}\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.就诊原因!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <!-- 条目:诊断 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE05.01.024.00\" displayName=\"西医诊断编码\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\">\n" +
				"                        <qualifier>\n" +
				"                            <name displayName=\"西医诊断编码\"></name>\n" +
				"                        </qualifier>\n" +
				"                    </code>\n" +
				"                    <value xsi:type=\"CD\" code=\"${healthIncidentInfo.西医诊断编码!}\" codeSystem=\"2.16.156.10011.2.3.3.11.1\"\n" +
				"                           codeSystemName=\"诊断代码表(ICD-10)\" displayName=\"\"/>\n" +
				"                    <entryRelationship typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.113.00\" displayName=\"病情转归代码\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${healthIncidentInfo.病情转归代码!}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.148\"\n" +
				"                                   codeSystemName=\"病情转归代码表\" displayName=\"\"/>\n" +
				"                        </observation>\n" +
				"                    </entryRelationship>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <!-- 条目:诊断 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE05.01.024.00\" displayName=\"其他西医诊断编码\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\">\n" +
				"                        <qualifier>\n" +
				"                            <name displayName=\"西医诊断编码\"></name>\n" +
				"                        </qualifier>\n" +
				"                    </code>\n" +
				"                    <value xsi:type=\"CD\" code=\"${healthIncidentInfo.其他西医诊断编码!}\" codeSystem=\"2.16.156.10011.2.3.3.11.1\"\n" +
				"                           codeSystemName=\"诊断代码表(ICD-10)\" displayName=\"\"/>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <!-- 条目:诊断 -->\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE05.10.130.00\" displayName=\"中医病名代码\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\">\n" +
				"                        <qualifier>\n" +
				"                            <name displayName=\"中医病名代码\"></name>\n" +
				"                        </qualifier>\n" +
				"                    </code>\n" +
				"                    <value xsi:type=\"CD\" code=\"${healthIncidentInfo.中医病名代码!}\" codeSystem=\"2.16.156.10011.2.3.3.14\"\n" +
				"                           codeSystemName=\"中医病症分类与代码表(GB/T 15657)\" displayName=\"\"/>\n" +
				"                    <entryRelationship typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.130.00\" displayName=\"中医证候代码\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <qualifier>\n" +
				"                                <name displayName=\"中医证候代码\"></name>\n" +
				"                            </qualifier>\n" +
				"                            <value xsi:type=\"CD\" code=\"${healthIncidentInfo.中医证候代码!}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.3.14\"\n" +
				"                                   codeSystemName=\"中医病症分类与代码表(GB/T 15657)\" displayName=\"\"/>\n" +
				"                        </observation>\n" +
				"                    </entryRelationship>\n" +
				"\n" +
				"                    <entryRelationship typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE05.10.113.00\" displayName=\"病情转归代码\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${healthIncidentInfo.病情转归代码!}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.148\"\n" +
				"                                   codeSystemName=\"病情转归代码表\" displayName=\"\"/>\n" +
				"                        </observation>\n" +
				"                    </entryRelationship>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
				"                    <!-- 手术及操作编码 DE06.00.093.00 -->\n" +
				"                    <code code=\"${healthIncidentInfo.手术及操作编码!}\" codeSystem=\"2.16.156.10011.2.3.3.12\"\n" +
				"                          codeSystemName=\"手术(操作)代码表(ICD-9-CM)\"/>\n" +
				"                </procedure>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE08.50.022.00\" displayName=\"关键药物名称\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.关键药物名称!}</value>\n" +
				"                    <entryRelationship typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.136.00\" displayName=\"关键药物用法\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\">${healthIncidentInfo.关键药物用法!}</value>\n" +
				"                        </observation>\n" +
				"                    </entryRelationship>\n" +
				"                    <entryRelationship typeCode=\"COMP\">\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.129.00\" displayName=\"药物不良反应情况\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"ST\">${healthIncidentInfo.药物不良反应情况!}</value>\n" +
				"                        </observation>\n" +
				"                    </entryRelationship>\n" +
				"                    <entryRelationship typeCode=\"COMP\">\n" +
				"                        <obervation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE06.00.164.00\" displayName=\"中药使用类别代码\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${healthIncidentInfo.中药使用类别代码!}\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.157\"\n" +
				"                                   codeSystemName=\"中药使用类别代码\"></value>\n" +
				"                        </obervation>\n" +
				"                    </entryRelationship>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE06.00.251.00\" displayName=\"其他医学处置\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.其他医学处置!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE05.01.021.00\" displayName=\"根本死因代码\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"CD\" code=\"${healthIncidentInfo.根本死因代码!}\"\n" +
				"                           codeSystem=\"2.16.156.10011.2.3.3.11.2\" codeSystemName=\"死因代码表(ICD-10)\"></value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <entry>\n" +
				"                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                    <code code=\"DE02.01.039.00\" displayName=\"责任医师姓名\"\n" +
				"                          codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                    <value xsi:type=\"ST\">${healthIncidentInfo.责任医师姓名!}</value>\n" +
				"                </observation>\n" +
				"            </entry>\n" +
				"\n" +
				"            <!-- 费用条目 -->\n" +
				"            <entry>\n" +
				"                <organizer classCode=\"CLUSTER\" moodCode=\"EVN\">\n" +
				"                    <statusCode/>\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE02.01.044.00\" displayName=\"医疗保险类别代码\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${medicalExpenseRecord.医疗保险类别代码!}\" displayName=\"\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.248\" codeSystemName=\"医疗保险类别代码表\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE07.00.007.00\" displayName=\"医疗付费方式代码\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"CD\" code=\"${medicalExpenseRecord.医疗付费方式代码!}\" displayName=\"\"\n" +
				"                                   codeSystem=\"2.16.156.10011.2.3.1.248\" codeSystemName=\"医疗付费方式代码表\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE07.00.004.00\" displayName=\"门诊费用金额\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"MO\" value=\"${medicalExpenseRecord.门诊费用金额!}\" currency=\"元\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE07.00.010.00\" displayName=\"住院费用金额\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"MO\" value=\"${medicalExpenseRecord.住院费用金额!}\" currency=\"元\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"\n" +
				"                    <component>\n" +
				"                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
				"                            <code code=\"DE07.00.001.00\" displayName=\"个人承担费用金额\"\n" +
				"                                  codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
				"                            <value xsi:type=\"MO\" value=\"${medicalExpenseRecord.个人承担费用金额!}\" currency=\"元\"></value>\n" +
				"                        </observation>\n" +
				"                    </component>\n" +
				"                </organizer>\n" +
				"            </entry>\n" +
				"        </section>\n" +
				"    </component>\n" +
				"</ClinicalDocument>";
		SAXReader reader = new SAXReader();
		Document document = reader.read(new ByteArrayInputStream(output.getBytes("UTF-8")));
//		HashMap nsMap=new HashMap();
//		nsMap.put("ns","urn:hl7-org:v3");
//		nsMap.put("mif","urn:hl7-org:v3/mif");
//		nsMap.put("xsi","http://www.w3.org/2001/XMLSchema-instance");
//		nsMap.put("schemaLocation","urn:hl7-org:v3 ../sdschemas/SDA.xsd");
		String nsURI = document.getRootElement().getNamespaceURI();
		System.out.println(nsURI);
		Element rootElement = document.getRootElement();
		String namespacePrefix = rootElement.getNamespacePrefix();
		System.out.println(namespacePrefix);
		JSONObject obj = XML2jsonUtil.testTrans(document.getRootElement());

		JSONObject clinicalDocument = obj.getJSONObject("ClinicalDocument");
		clinicalDocument.put("attrs", "xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\"\n" +
				"                  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
				"                  xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\SDA.xsd\"");

		String json = obj.toJSONString();
		System.out.println(json);
	}
}
