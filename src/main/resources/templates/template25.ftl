<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.45"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0025" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>出院评估与指导</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <!-- 患者信息 -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 健康卡号 -->
            <id root="2.16.156.10011.1.19" extension="${patient.居民健康卡号!'居民健康卡号'}"/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${dischargeAssessGuideRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age value="${dischargeAssessGuideRecord.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
            <providerOrganization>
                <asOrganizationPartOf classCode="PART">
                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                        <id root="2.16.156.10011.1.22" extension=""/>
                        <name>${dischargeAssessGuideRecord.病床号!'病床号'}</name>
                        <!-- 病房号 -->
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.21" extension=""/>
                                <name>${dischargeAssessGuideRecord.病房号!'病房号'}</name>
                                <!-- 科室名称 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.26" extension=""/>
                                        <name>${dischargeAssessGuideRecord.科室名称!'科室名称'}</name>
                                        <!-- 病区 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.27" extension=""/>
                                                <name>${dischargeAssessGuideRecord.病区名称!'病区名称'}</name>
                                                <!-- xx医院 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.5" extension=""/>
                                                        <name>${orgName!'医疗机构名称'}</name>
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
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>

    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>


    <authenticator typeCode="AUTHEN">
        <time value="${dischargeAssessGuideRecord.签名日期时间!'签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity classCode="ASSIGNED">
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson classCode="PSN">
                <name>${dischargeAssessGuideRecord.护士签名!'护士签名'}</name>
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
                            <value xsi:type="CD" code="${dischargeAssessGuideRecord.出院诊断编码!'出院诊断编码'}" displayName="${dischargeAssessGuideRecord.出院诊断名称!'出院诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.017.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="出院日期时间"/>
                            <value xsi:type="TS" value="${dischargeAssessGuideRecord.出院日期时间!'出院日期时间'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE056.00.193.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="出院情况"/>
                            <value xsi:type="ST">${dischargeAssessGuideRecord.出院情况!'出院情况'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.223.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="离院方式代码"/>
                            <value xsi:type="CD" code="${dischargeAssessGuideRecord.离院方式代码!'离院方式代码'}" displayName="${dischargeAssessGuideRecord.离院方式!'离院方式'}" codeSystem="2.16.156.10011.2.3.1.265"
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
                            <value xsi:type="CD" code="${dischargeAssessGuideRecord.饮食指导代码!'饮食指导代码'}" displayName="${dischargeAssessGuideRecord.饮食指导!'饮食指导'}" codeSystem="2.16.156.10011.2.3.1.263"
                                   codeSystemName="饮食指导代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.238.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="生活方式指导"/>
                            <value xsi:type="ST" value="${dischargeAssessGuideRecord.生活方式指导!'生活方式指导'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE056.00.124.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="宣教内容"/>
                            <value xsi:type="ST">${dischargeAssessGuideRecord.宣教内容!'宣教内容'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.299.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="复诊指导"/>
                            <value xsi:type="ST">${dischargeAssessGuideRecord.复诊指导!'复诊指导'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="用药指导"/>
                            <value xsi:type="ST">${dischargeAssessGuideRecord.用药指导!'用药指导'}</value>
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
                            <value xsi:type="CD" code="${dischargeAssessGuideRecord.自理能力代码!'自理能力代码'}" displayName="${dischargeAssessGuideRecord.自理能力!'自理能力'}" codeSystem="2.16.156.10011.2.3.1.263"
                                   codeSystemName="自理能力代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.080.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮食情况代码"/>
                            <value xsi:type="CD" code="${dischargeAssessGuideRecord.饮食情况代码!'饮食情况代码'}" displayName="${dischargeAssessGuideRecord.饮食情况!'饮食情况'}" codeSystem="2.16.156.10011.2.3.2.34"
                                   codeSystemName="饮食情况代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>