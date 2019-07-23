<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.53"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0033" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>中医住院病案首页</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <!-- 病案号 -->
            <id root="2.16.156.10011.1.13" extension=""/>
            <!-- 病理号 -->
            <id root="2.16.156.10011.1.8" extension=""/>
            <addr use="H">
                <houseNumber></houseNumber>
                <streetName></streetName>
                <township></township>
                <county></county>
                <city></city>
                <state></state>
            </addr>
            <telecom value=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <birthTime value=""/>
                <maritalStatusCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <ethnicGroupCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.3"
                                 codeSystemName="民族类别代码表(GB/T 3304)"/>
                <!-- 出生地 -->
                <birthplace>
                    <place classCode="PLC" determinerCode="INSTANCE">
                        <addr>
                            <county></county>
                            <city></city>
                            <state></state>
                            <postalCode></postalCode>
                        </addr>
                    </place>
                </birthplace>
                <!-- 国籍 -->
                <nationality code="" codeSystem="2.16.156.10011.2.3.3.1" codeSystemName="世界各国和地区名称代码(GB/T 2659)"
                             displayName="中国"/>
                <age value="" unit="岁"/>
                <!-- 工作单位 -->
                <employerOrganization>
                    <name></name>
                    <telecom value=""/>
                    <addr use="WP">
                        <houseNumber></houseNumber>
                        <streetName></streetName>
                        <township></township>
                        <county></county>
                        <city></city>
                        <state></state>
                        <postalCode></postalCode>
                    </addr>
                </employerOrganization>
                <!-- 户口信息 -->
                <household>
                    <place classCode="PLC" determinerCode="INSTANCE">
                        <addr>
                            <houseNumber></houseNumber>
                            <streetName></streetName>
                            <township></township>
                            <county></county>
                            <city></city>
                            <state></state>
                            <postalCode></postalCode>
                        </addr>
                    </place>
                </household>
                <!-- 籍贯信息 -->
                <nativePlace>
                    <place classCode="PLC" determinerCode="INSTANCE">
                        <addr>
                            <city></city>
                            <state></state>
                        </addr>
                    </place>
                </nativePlace>
                <!-- 职业情况 -->
                <occupation>
                    <occupationCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.13"
                                    codeSystemName="从业状况(个人身体)代码表(GB/T 2261.4)"/>
                </occupation>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name></name>
            </providerOrganization>
        </patientRole>
    </recordTarget>

    <author typeCode="AUT" contextControlCode="OP">
        <time value=""/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <assignedPerson>
                <name>xx</name>
            </assignedPerson>
        </assignedAuthor>
    </author>

    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>xx医院</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <legalAuthenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="科主任"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主任医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主治医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="住院医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="责任护士"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="进修医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="实习医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="编码员"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 其他联系人 -->
    <participant typeCode="NOT">
        <associatedEntity classCode="ECON">
            <code code="" codeSystem="2.16.156.10011.2.3.3.8" displayName="" codeSystemName="家庭关系代码表(GB/T 4761)"/>
            <!-- 联系人地址 -->
            <addr use="H">
                <houseNumber></houseNumber>
                <streetName></streetName>
                <township></township>
                <county></county>
                <city></city>
                <state></state>
                <postalCode></postalCode>
            </addr>
            <telecom use="H" value=""/>
            <associatedPerson classCode="PSN" determinerCode="INSTANCE">
                <name></name>
            </associatedPerson>
        </associatedEntity>
    </participant>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>

    <componentOf typeCode="COMP">
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <code code="" displayName="" codeSystem="2.16.156.10011.2.3.1.270" codeSystemName="入院途径代码表"/>
            <effectiveTime>
                <low value=""/>
                <high value=""/>
            </effectiveTime>
            <location typeCode="LOC">
                <healthCareFacility classCode="SDLOC">
                    <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name></name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name></name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name></name>
                                            </wholeOrganization>
                                        </asOrganizationPartOf>
                                    </wholeOrganization>
                                </asOrganizationPartOf>
                            </wholeOrganization>
                        </asOrganizationPartOf>
                    </serviceProviderOrganization>
                </healthCareFacility>
            </location>
        </encompassingEncounter>
    </componentOf>

    <component>
        <structuredBody>
            <!-- 生命体征 -->
            <component>
                <section>
                    <code code="8716-3" displayName="VITAL SIGNS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.019.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="新生儿入院体重(g)"/>
                            <value xsi:type="PQ" value="" unit="g"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.019.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="新生儿出生体重(g)"/>
                            <value xsi:type="PQ" value="" unit="g"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 诊断记录 -->
            <component>
                <section>
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门诊急诊(中医诊断)名称">
                                        <qualifier>
                                            <name displayName="中医诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门诊急诊(中医诊断)病名编码">
                                        <qualifier>
                                            <name displayName="中医诊断代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(中医证候)名称">
                                        <qualifier>
                                            <name displayName="中医证候名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(中医证候)证候编码">
                                        <qualifier>
                                            <name displayName="中医证候代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医证候代码表(GB/T 15657-1995)" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 门急诊 西医诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(西医诊断)名称">
                                        <qualifier>
                                            <name displayName="西医诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(西医诊断)疾病编码">
                                        <qualifier>
                                            <name displayName="西医诊断代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="ICD-10" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 病理诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <id root="2.16.156.10011.1.8" extension=""/>
                                    <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="病理诊断名称">
                                        <qualifier>
                                            <name displayName="病理诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="病理诊断编码">
                                        <qualifier>
                                            <name displayName="中医证候代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="ICD-10" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 主要问题 -->
            <component>
                <section>
                    <code code="11450-4" displayName="Problem list" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.304.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="治疗类别"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14" codeSystemName="治疗类别代码表"
                                   displayName=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSDOO.12.099" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="实施临床路径"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.2.57"
                                   codeSystemName="实施临床路径标志代码表" displayName=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="住院者疾病状态代码"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.1.100"
                                   codeSystemName="住院者疾病状态代码表" displayName=""/>
                        </observation>
                    </entry>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.152.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="损伤中毒的外部原因"/>
                            <value xsi:type="ST"></value>
                            <entryRelationship typeCode="REFR" negationInd="false">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.078.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="损伤中毒的外部原因-疾病编码"/>
                                    <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <!-- 颅脑损伤患者入院 -->
                    <entry typeCode="COMP">
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.01" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院前昏迷时间-d"/>
                                    <value xsi:type="PQ" unit="d" value=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.02" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院前昏迷时间-h"/>
                                    <value xsi:type="PQ" unit="h" value=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.03" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院前昏迷时间-min"/>
                                    <value xsi:type="PQ" unit="min" value=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 颅脑损伤患者入院后昏迷时间 -->
                    <entry typeCode="COMP">
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.01" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院后昏迷时间-d"/>
                                    <value xsi:type="PQ" unit="d" value=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.02" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院后昏迷时间-h"/>
                                    <value xsi:type="PQ" unit="h" value=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.03" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院后昏迷时间-min"/>
                                    <value xsi:type="PQ" unit="min" value=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 转科记录 -->
            <component>
                <section>
                    <code code="42349-1" displayName="REASON FOR REFERRAL" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 转科条目 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code/>
                            <!-- 转科原因 -->
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id/>
                                    <representedOrganization>
                                        <!-- 转科科室 -->
                                        <name></name>
                                    </representedOrganization>
                                </assignedAuthor>
                            </author>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 出院诊断 -->
            <component>
                <section>
                    <code code="11535-2" displayName="Discharge Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主病名称">
                                        <qualifier>
                                            <name displayName="主病名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主病编码">
                                        <qualifier>
                                            <name displayName="主病代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主病-入院病情代码">
                                        <qualifier>
                                            <name displayName="中医主病入院病情"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 出院中医主证诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主症名称">
                                        <qualifier>
                                            <name displayName="主症名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主症代码">
                                        <qualifier>
                                            <name displayName="主症代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主症-入院病情代码">
                                        <qualifier>
                                            <name displayName="中医主症入院病情"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 出院西医主要诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-疾病名称">
                                        <qualifier>
                                            <name displayName="主要诊断-疾病名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-疾病编码">
                                        <qualifier>
                                            <name displayName="主要诊断疾病代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="主要诊断疾病代码表(ICD-10)" displayName=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-主要诊断-入院病情代码">
                                        <qualifier>
                                            <name displayName="入院病情代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 西医出院诊断 其他诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-其他诊断名称">
                                        <qualifier>
                                            <name displayName="其他诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-其他诊断疾病编码">
                                        <qualifier>
                                            <name displayName="其他诊断疾病编码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="ICD-10" displayName=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-其他诊断-入院病情代码">
                                        <qualifier>
                                            <name displayName="其他诊断-入院病情代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 离院方式 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.223.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="离院方式"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.1.265"
                                   codeSystemName="离院方式代码表" displayName=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.10.013.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟接受医疗机构名称"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 过敏史 -->
            <component>
                <section>
                    <code code="48765-2" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"
                          displayName="Allergies,adverse reactions,alerts"/>
                    <text/>
                    <entry typeCode="DRIV">
                        <act classCode="ACT" moodCode="EVN">
                            <code/>
                            <entryRelationship typeCode="SUBJ">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.023.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="BL" value=""/>
                                    <participant typeCode="CSM">
                                        <partivipantRole classCode="MANU">
                                            <playingEntity classCode="MMAT">
                                                <code code="DE02.10.022.00" codeSystem="2.16.156.10011.2.2.1"
                                                      codeSystemName="卫生信息数据元目录" displayName="过敏药物"/>
                                                <desc xsi:type="ST"></desc>
                                            </playingEntity>
                                        </partivipantRole>
                                    </participant>
                                </observation>
                            </entryRelationship>
                        </act>
                    </entry>
                </section>
            </component>
            <!-- 实验室检验 -->
            <component>
                <section>
                    <code code="30954-2" displayName="STUDIES SUMMARY" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry typeCode="COMP">
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component typeCode="COMP" contextConductionInd="true">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.001.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.85"
                                           codeSystemName="ABO血型代码表" displayName=""/>
                                </observation>
                            </component>
                            <component typeCode="COMP" contextConductionInd="true">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.010.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.85"
                                           codeSystemName="Rh血型代码表" displayName=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 手术操作 -->
            <component>
                <section>
                    <code code="47519-4" displayName="HISTORY OF PROCEDURES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <procedure classCode="PROC" moodCode="EVN">
                            <code code="" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术操作代码表(ICD-9-CM)"
                                  displayName=""/>
                            <statusCode/>
                            <effectiveTime value=""/>
                            <performer>
                                <assignedEntity>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <assignedPerson>
                                        <name></name>
                                    </assignedPerson>
                                </assignedEntity>
                            </performer>
                            <!-- 第一助手 -->
                            <participant typeCode="ATND">
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="第一助手"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name></name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <participant typeCode="ATND">
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="第二助手"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name></name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.094.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术操作名称"/>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.255.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术级别"/>
                                    <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="手术级别代码表"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.257.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术切口类别代码表"/>
                                    <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="手术切口类别代码表"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.147.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术切口愈合等级"/>
                                    <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.257"
                                           codeSystemName="手术切口愈合等级代码表"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="麻醉方法代码"/>
                                    <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.159"
                                           codeSystemName="麻醉方法代码表"/>
                                    <performer>
                                        <assignedEntity>
                                            <id root="2.16.156.10011.1.4" extension/>
                                            <assignedPerson>
                                                <name></name>
                                            </assignedPerson>
                                        </assignedEntity>
                                    </performer>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!-- 既往史 -->
            <component>
                <section>
                    <code code="11336-5" displayName="HISTORY OF HOSPITALIZATIONS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.090.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="住院次数"/>
                            <value xsi:type="PQ" unit="次" value=""/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 行政管理 -->
            <component>
                <section>
                    <code displayName="行政管理"/>
                    <text/>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.108.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="死亡患者尸检标志"/>
                            <value xsi:type="BL" value="true"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.103.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="病案质量"/>
                            <effectiveTime xsi:type="IVL_T" value=""></effectiveTime>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.2.29"
                                   codeSystemName="病案质量等级表"/>
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="质控医生"/>
                                    <assignedPerson>
                                        <name></name>
                                    </assignedPerson>
                                </assignedAuthor>
                            </author>
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="质控护士"/>
                                    <assignedPerson>
                                        <name></name>
                                    </assignedPerson>
                                </assignedAuthor>
                            </author>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 住院过程 -->
            <component>
                <section>
                    <code code="8648-8" displayName="Hospital Course" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.310.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="实际住院天数"/>
                            <value xsi:type="PQ" unit="天" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <act classCode="ACT" moodCode="EVN">
                            <code/>
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id/>
                                    <representedOrganization>
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name></name>
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name></name>
                                            </wholeOrganization>
                                        </asOrganizationPartOf>
                                    </representedOrganization>
                                </assignedAuthor>
                            </author>
                        </act>
                    </entry>
                </section>
            </component>
            <!-- 治疗计划 -->
            <component>
                <section>
                    <code code="18776-5" displayName="TREATMENT PLAN" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.194.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="出院31d内在住院标志"/>
                            <value xsi:type="BL" value=""/>
                            <entryRelationship typeCode="GEVL" negationInd="false">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.195.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院31d再住院目的"/>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 费用 -->
            <component>
                <section>
                    <code code="48768-6" displayName="PAYMENT SOURCES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE07.00.007.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="医疗付款方式代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.269"
                                   codeSystemName="医疗付费方式代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSD00.12.169" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="住院总费用"/>
                            <value xsi:type="MO" value="" currency="元"/>
                            <entryRelationship typeCode="COMP" negationInd="false">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.170" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="住院总费用-自付金额(元)"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.174" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.175" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费-中医辩证论治费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.176" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费-中医辩证论治会诊费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.177" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费-一般治疗操作费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.172" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-护理费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.173" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-其他费用"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 诊断费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.136" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-病理诊断费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.138" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-实验室诊断费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.139" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-影像学诊断费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.137" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-临床诊断项目费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 治疗服务费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.145" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="治疗-非手术治疗项目费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.146" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="治疗-非手术治疗项目费-临床物理治疗费"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.147" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="治疗-手术治疗项目费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.148" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="治疗-手术治疗费-麻醉费"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.149" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="治疗-手术治疗费-手术费"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 康复费类服务费 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSD00.12.062" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="康复费"/>
                            <value xsi:type="MO" value="" currency="元"/>
                        </observation>
                    </entry>
                    <!-- 以下三条标识类 true or false -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.243.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="使用医疗机构中药制剂"/>
                            <value xsi:type="BL" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.245.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="使用中医诊疗技术标志"/>
                            <value xsi:type="BL" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.180.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="辩证施护标志"/>
                            <value xsi:type="BL" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.156" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中医诊断费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.157" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中医治疗费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.163" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医外治"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.160" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医骨伤"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.158" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-针刺与灸法"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.162" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医推拿治疗"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.159" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医肛肠治疗"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.161" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医特殊治疗"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.153" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中医其他治疗费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.155" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医其他费-中药特殊调配加工"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.154" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-辩证施膳"/>
                                            <value xsi:type="MO" value="" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 西药费 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSD00.12.113" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="西药费"/>
                            <value xsi:type="MO" value="" currency="元"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.114" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="西药费-抗菌药物费用"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <!-- 中药费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.151" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中药费-中成药费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.150" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中药费-中草药费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 血液和血液制品类服务费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.130" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="血费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.126" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="白蛋白类制品费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.128" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="球蛋白类制品费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.127" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="凝血因子类制品费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.129" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="细胞白类制品费"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 使用中医诊疗设备标志 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.244.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="使用中医诊疗设备标志"/>
                            <value xsi:type="BL" value=""/>
                        </observation>
                    </entry>
                    <!-- 耗材类费用 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.045" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="一次性医用材料费-检查费用"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.047" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="一次性医用材料费-治疗用"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.046" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="一次性医用材料费-手术用"/>
                                    <value xsi:type="MO" value="" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 其他费 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDS00.12.092" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="其他费"/>
                            <value xsi:type="BL" value=""/>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>