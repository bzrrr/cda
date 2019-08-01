<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.73"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0053" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>出院小结</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <!-- 文档记录对象（患者） -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 健康卡号 -->
            <id root="2.16.156.10011.1.19" extension=""/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <addr use="H">
                <houserNumber></houserNumber>
                <streetName></streetName>
                <township></township>
                <county></county>
                <city></city>
                <state></state>
                <postalCode></postalCode>
            </addr>
            <!-- 患者电话 -->
            <telecom value=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <birthTime value=""/>
                <!-- 婚姻状况 -->
                <maritalStatusCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <age value="" unit="岁"/>
                <!-- 职业 -->
                <occupation>
                    <occupationCode code="" codeSystem="2.16.156.10011.2.3.3.13" codeSystemName="从业状况(个人身体)代码表"
                                    displayName=""/>
                </occupation>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>xx医院</name>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 文档创作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value=""/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <assignedPerson>
                <name>xx</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 文档生成机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>xx医院</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <!-- 法定审核者 -->
    <legalAuthenticator typeCode="LA">
        <!-- 签名日期 -->
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <!-- 住院医师 -->
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="住院医师"/>
            <assignedPerson>
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>
    <!-- 文档审核者 -->
    <authenticator typeCode="AUTHEN">
        <time value=""/>
        <signatureCode/>
        <assignedEntity classCode="ASSIGNED">
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="上级医师"/>
            <assignedPerson classCode="PSN">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>
    <participant typeCode="NOT">
        <!-- 联系人 -->
        <assignedEntity classCode="ECON">
            <telecom value=""/>
            <assignedPerson>
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </participant>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>

    <!-- 入院场景记录 -->
    <componentOf typeCode="COMP">
        <!-- 就诊 -->
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <!-- 就诊时间 -->
            <effectiveTime>
                <low value=""/>
                <high value=""/>
            </effectiveTime>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <!-- 病床号 -->
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="" extension=""/>
                                <name></name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="" extension=""/>
                                        <name></name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="" extension=""/>
                                                <name></name>
                                                <!-- 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="" extension=""/>
                                                        <name></name>
                                                    </wholeOrganization>
                                                </asOrganizationPartOf>
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

    <!-- Body -->
    <component>
        <structuredBody>
            <!-- 主要健康问题章节 -->
            <component>
                <section>
                    <code code="11450-4" displayName="PROBLEM LIST" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 入院情况条目 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.148.00" displayName="入院情况" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 入院诊断章节 -->
            <component>
                <section>
                    <code code="46241-6" displayName="HOSPITAL ADMISSION DX" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 入院诊断 西医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" displayName="入院诊断-西医诊断编码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.5"
                                   codeSystemName="疾病代码表(ICD-10)"/>
                        </observation>
                    </entry>
                    <!-- 入院诊断 中医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="入院诊断-中医病名代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                    <!-- 入院诊断 中医证候 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="入院诊断-中医证候代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 出院诊断章节 -->
            <component>
                <section>
                    <code code="11535-2" displayName="Discharge Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 出院诊断 西医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" displayName="出院诊断-西医诊断编码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.5"
                                   codeSystemName="疾病代码表(ICD-10)"/>
                        </observation>
                    </entry>
                    <!-- 出院诊断 中医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="出院诊断-中医病名代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                    <!-- 出院诊断 中医证候 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="出院诊断-中医证候代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                    <!-- 中医四诊观察结果 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.028.00" displayName="中医'四诊'观察结果" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <!-- 出院时症状和体征 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.117.00" displayName="出院时症状与体征" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <!-- 出院情况 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.193.00" displayName=" 出院情况" codeSystem="2.16.156.10011.2.2.1"
                            codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 手术操作章节 -->
            <component>
                <section>
                    <code code="47519-4" displayName="HISTORY OF PROCEDURES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 手术记录 -->
                    <entry>
                        <procedure classCode="PROC" moodCode="EVN">
                            <code code="" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                            <statusCode/>
                            <effectiveTime value=""/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.257.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术切口类别代码"/>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.251"
                                           codeSystemName="手术切口类别代码"/>
                                </observation>
                            </entryRelationship>
                            <!-- 切口愈合等级 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.147.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="切口愈合等级代码"/>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.252"
                                           codeSystemName="切口愈合等级代码"/>
                                </observation>
                            </entryRelationship>
                            <!-- 麻醉方法 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.2"
                                          codeSystemName="卫生信息数据元目录" displayName="麻醉方法代码"/>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.159"
                                           codeSystemName="麻醉方法代码"/>
                                </observation>
                            </entryRelationship>
                            <!-- 手术过程 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.063.00" codeSystem="2.16.156.10011.2.2.2"
                                          codeSystemName="卫生信息数据元目录" displayName="手术过程"/>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!-- 治疗计划章节 -->
            <component>
                <section>
                    <code code="18776-5" displayName="TREATMENT PLAN" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 治则治法 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.300.00" displayName="治则治法" codeSystem="2.16.156.10011.2.3.3.15"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 住院过程章节 -->
            <component>
                <section>
                    <code code="8648-8" displayName="Hospital Course" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 诊疗过程 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.296.00" displayName="诊疗过程描述" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <!-- 治疗结果 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.113.00" displayName="治疗结果代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.148" codeSystemName="治疗结果代码"/>
                        </observation>
                    </entry>
                    <!-- 实际住院天数 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.310.00" displayName="实际住院天数" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="" unit="天"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 医嘱章节 -->
            <component>
                <section>
                    <code code="46209-3" displayName="Provider Orders" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 中药煎煮方法 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.047.00" displayName="中药煎煮方法" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <!-- 中药用药方法 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" displayName="中药用药方法" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <!-- 出院医嘱 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.287.00" displayName="出院医嘱" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 实验室检查章节 -->
            <component>
                <section>
                    <code code="30954-2" displayName="STUDIES SUMMARY" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 阳性辅助检查结果 -->
                    <entry typeCode="COMP" contextConductionInd="">
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component typeCode="COMP" contextConductionInd="">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.128.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>