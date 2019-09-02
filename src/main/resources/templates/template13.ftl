<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.33"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0013" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>输血记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门诊号标识 -->
            <id root="2.16.156.10011.1.11" extension="${bloodTransfusionRecord.门急诊号!'门急诊号'}"/>
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension="${bloodTransfusionRecord.住院号!'住院号'}"/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension="${bloodTransfusionRecord.电子申请单编号!'电子申请单编号'}"/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!'患者姓名'}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age unit="岁" value="${bloodTransfusionRecord.年龄岁!'年龄岁'}"/>
            </patient>
        </patientRole>
    </recordTarget>
    <!-- 文档创作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension="${patient.建档者序号!'建档者唯一标识符'}"/>
            <!-- 医师姓名 -->
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 保管机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <!-- 医师签名 -->
    <authenticator>
        <!-- 签名日期时间 -->
        <time value="${bloodTransfusionRecord.签名日期时间!'签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="麻醉医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${bloodTransfusionRecord.医师签名!'医师签名'}</name>
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

    <!-- 病床号、病房、病区、科室和医院的关联 -->
    <componentOf>
        <encompassingEncounter>
            <!-- 入院日期时间 -->
            <effectiveTime/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <!-- DE01.00.026.00 病床号 -->
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension="${bloodTransfusionRecord.病床号!'病床号'}"/>
                                <name></name>
                                <!-- DE01.00.019.00 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension="${bloodTransfusionRecord.病房号!'病房号'}"/>
                                        <name></name>
                                        <!-- DE08.10.026.00 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${bloodTransfusionRecord.科室名称!'科室名称'}</name>
                                                <!-- DE08.10.054.00 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${bloodTransfusionRecord.病区名称!'病区名称'}</name>
                                                        <!-- xx医院 -->
                                                        <asOrganizationPartOf classCode="PART">
                                                            <wholeOrganization classCode="ORG"
                                                                               determinerCode="INSTANCE">
                                                                <id root="2.16.156.10011.1.5" extension=""/>
                                                                <name>${orgName!'建档医疗机构组织机构名称'}</name>
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
                    </serviceProviderOrganization>
                </healthCareFacility>
            </location>
        </encompassingEncounter>
    </componentOf>

    <!-- 实验室检验章节 -->
    <component>
        <section>
            <code code="30954-2" displayName="STUDIES SUMMARY"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 血型 -->
            <entry typeCode="COMP">
                <organizer classCode="BATTERY" moodCode="EVN">
                    <statusCode/>
                    <!-- ABO血型 -->
                    <component typeCode="COMP" contextConductionInd="true">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.001.00" displayName="ABO血型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.ABO血型代码!'ABO血型代码'}" displayName="${bloodTransfusionRecord.ABO血型!'ABO血型'}"
                                   codeSystem="2.16.156.10011.2.3.1.85" codeSystemName="ABO血型代码表"/>
                        </observation>
                    </component>
                    <!-- Rh血型 -->
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.010.00" displayName="Rh(D)血型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.RH血型代码!'RH血型代码'}" displayName="${bloodTransfusionRecord.RH血型!'RH血型'}"
                                   codeSystem="2.16.156.10011.2.3.1.250" codeSystemName="Rh(D)血型代码表"/>
                        </observation>
                    </component>
                </organizer>
            </entry>
        </section>
    </component>

    <!-- 主要健康问题章节 -->
    <component>
        <section>
            <code code="11450-4" displayName="PROBLEM LIST"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 疾病诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="疾病诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="${bloodTransfusionRecord.疾病诊断编码!'疾病诊断编码'}" displayName="${bloodTransfusionRecord.疾病诊断名称!'疾病诊断名称'}"
                           codeSystem="2.16.156.10011.2.3.3.11.3" codeSystemName="诊断代码表(ICD-10)"/>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 输血章节 -->
    <component>
        <section>
            <code code="56836-0" displayName="History of blood transfusion"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <procedure classCode="PROC" moodCode="EVN">
                    <!-- 输血日期时间 -->
                    <effectiveTime>
                        <high value="${bloodTransfusionRecord.输血日期时间!'输血日期时间'}"/>
                    </effectiveTime>
                    <!-- 输血史标识代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.106.00" displayName="输血史标识代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.输血史标识代码!'输血史标识代码'}" displayName="${bloodTransfusionRecord.输血史标识!'输血史标识'}"
                                   codeSystem="2.16.156.10011.2.3.2.42" codeSystemName="输血史标识代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 输血性质代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.147.00" displayName="输血性质代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.输血性质代码!'输血性质代码'}" displayName="${bloodTransfusionRecord.输血性质!'输血性质'}"
                                   codeSystem="2.16.156.10011.2.3.2.43" codeSystemName="输血性质代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 申请ABO血型代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.001.00" displayName="申请ABO血型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.申请ABO血型代码!'申请ABO血型代码'}" displayName="${bloodTransfusionRecord.申请ABO血型!'申请ABO血型'}"
                                   codeSystem="2.16.156.10011.2.3.1.85" codeSystemName="ABO血型代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 申请Rh血型代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.010.00" displayName="申请Rh(D)血型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.申请RH血型代码!'申请RH血型代码'}" displayName="${bloodTransfusionRecord.申请RH血型!'申请RH血型'}"
                                   codeSystem="2.16.156.10011.2.3.1.250" codeSystemName="Rh(D)血型代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 输血指征 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.340.00" displayName="输血指征"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${bloodTransfusionRecord.输血指征!'输血指征'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 输血过程记录 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.181.00" displayName="输血过程记录"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${bloodTransfusionRecord.输血过程记录!'输血过程记录'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 输血品种代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.040.00" displayName="输血品种代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.输血品种代码!'输血品种代码'}" displayName="${bloodTransfusionRecord.输血品种!'输血品种'}"
                                   codeSystem="2.16.156.10011.2.3.1.251" codeSystemName="输血品种代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 血袋编码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE01.00.023.00" displayName="血袋编码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="INT" value="${bloodTransfusionRecord.医师签名!'医师签名'}"/>
                        </observation>
                    </entryRelationship>

                    <!-- 输血量(ml) -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.267.00" displayName="输血量(ml)"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" unit="ml" value="${bloodTransfusionRecord.输血量!'输血量'}"></value>
                        </observation>
                    </entryRelationship>

                    <!-- 输血量计量单位 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.036.00" displayName="输血量计量单位"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${bloodTransfusionRecord.输血量计量单位!'输血量计量单位'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 输血反应标志 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.264.00" displayName="输血反应标志"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="BL" value="">${bloodTransfusionRecord.输血反应标志!'输血反应标志'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 输血反应类型 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.265.00" displayName="输血反应类型"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${bloodTransfusionRecord.输血反应类型代码!'输血反应类型代码'}" displayName="${bloodTransfusionRecord.输血反应类型!'输血反应类型'}"
                                   codeSystem="2.16.156.10011.2.3.1.252" codeSystemName="输血反应类型代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 输血次数 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.263.00" displayName="输血次数"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="INT" value="${bloodTransfusionRecord.输血次数!'输血次数'}"/>
                        </observation>
                    </entryRelationship>

                    <!-- 输血原因 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.107.00" displayName="输血原因"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${bloodTransfusionRecord.输血原因!'输血原因'}</value>
                        </observation>
                    </entryRelationship>
                </procedure>
            </entry>
        </section>
    </component>
</ClinicalDocument>
