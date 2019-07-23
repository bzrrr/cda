<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.45"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0025" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>出院评估与指导</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <!-- 患者信息 -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 健康卡号 -->
            <id root="2.16.156.10011.1.19" extension=""/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <birthTime value=""/>
                <age value="" unit="岁"/>
            </patient>
            <providerOrganization>
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
                                        <!-- 病区 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.27" extension=""/>
                                                <name></name>
                                                <!-- xx医院 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.5" extension=""/>
                                                        <name></name>
                                                    </wholeOrganization>
                                                </asOrganizationPartOf>
                                            </wholeOrganization>
                                        </asOrganizationPartOf>
                                    </wholeOrganization>
                                </asOrganizationPartOf>
                            </wholeOrganization>
                        </asOrganizationPartOf>
                    </wholeOrganization>
                </asOrganizationPartOf>
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


    <authenticator typeCode="AUTHEN">
        <time value=""/>
        <signatureCode/>
        <assignedEntity classCode="ASSIGNED">
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson classCode="PSN">
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>

    <component>
        <structuredBody>
            <!-- 出院诊断章节 -->
            <component>
                <section>
                    <code code="11535-2" displayName="Discharge Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName=""/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.017.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="出院日期时间"/>
                            <value xsi:type="TS" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE056.00.193.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="出院情况"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.223.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="离院方式代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.265"
                                   codeSystemName="离院方式代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 健康指导 -->
            <component>
                <section>
                    <code code="69730-0" displayName="Instructions" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.291.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮食指导代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.263"
                                   codeSystemName="饮食指导代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.238.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="生活方式指导"/>
                            <value xsi:type="ST" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE056.00.124.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="宣教内容"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.299.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="复诊指导"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="用药指导"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 健康评估 -->
            <component>
                <section>
                    <code code="51848-0" displayName="Assessment note" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.122.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="自理能力代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.263"
                                   codeSystemName="自理能力代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.080.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮食情况代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.2.34"
                                   codeSystemName="饮食情况代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>