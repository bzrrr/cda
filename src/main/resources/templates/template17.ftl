<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.37"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0017" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>一般护理记录</title>
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
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${generalCareRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <age value="${generalCareRecord.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
            <providerOrganization>
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </providerOrganization>
        </patientRole>
    </recordTarget>

    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension="${patient.建档者序号!'建档者唯一标识符'}"/>
            <code displayName="护士"/>
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

    <!-- 文档审核者 -->
    <authenticator>
        <time value="${generalCareRecord.签名日期时间!'签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="护士"/>
            <assignedPerson>
                <name>${generalCareRecord.护士签名!'护士签名'}</name>
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

    <componentOf typeCode="COMP">
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <code/>
            <effectiveTime nullFlavor="NI"/>
            <location typeCode="LOC">
                <healthCareFacility classCode="SDLOC">
                    <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension="${generalCareRecord.病床号!'病床号'}"/>
                                <name></name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension="${generalCareRecord.病房号!'病房号'}"/>
                                        <name></name>
                                        <!-- 病区名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.27" extension=""/>
                                                <name>${generalCareRecord.病区名称!'病区名称'}</name>
                                                <!-- 科室 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.26" extension=""/>
                                                        <name>${generalCareRecord.科室名称!'科室名称'}</name>
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

    <component>
        <structuredBody>
            <!-- 诊断记录 -->
            <component>
                <section>
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="疾病诊断编码"/>
                            <value xsi:type="CD" code="${generalCareRecord.疾病诊断编码!'疾病诊断编码'}" displayName="${generalCareRecord.疾病诊断名称!'疾病诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 过敏史 -->
            <component>
                <section>
                    <code code="48765-2" displayName="Allergies,adverse reactions,alerts"
                          codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.022.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="过敏史描述"/>
                            <value xsi:type="ST">${generalCareRecord.过敏史!'过敏史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 生命体征 -->
            <component>
                <section>
                    <code code="8716-3" displayName="VITAL SIGNS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.188.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体重(kg)"/>
                            <value xsi:type="PQ" value="${generalCareRecord.体重!'体重'}" unit="kg"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.186.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体温(C)"/>
                            <value xsi:type="PQ" value="${generalCareRecord.体温!'体温'}" unit="C"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.081.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="呼吸频率(次/min)"/>
                            <value xsi:type="PQ" value="${generalCareRecord.呼吸频率!'呼吸频率'}" unit="次/min"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.118.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="脉率(次/min)"/>
                            <value xsi:type="PQ" value="${generalCareRecord.脉率!'脉率'}" unit="次/min"/>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.10.174.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="收缩压"/>
                                    <value xsi:type="PQ" value="${generalCareRecord.收缩压!'收缩压'}" unit="mmHg"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.10.176.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="舒张压"/>
                                    <value xsi:type="PQ" value="${generalCareRecord.舒张压!'舒张压'}" unit="mmHg"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.149.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="血氧饱和度(%)"/>
                            <value xsi:type="PQ" value="${generalCareRecord.血氧饱和度!'血氧饱和度'}" unit="%"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 四肢 -->
            <component>
                <section>
                    <code code="10196-4" displayName="EXTREMITIES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.237.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="足背动脉搏动标志"/>
                            <value xsi:type="BL" value="${generalCareRecord.足背动脉搏动标志!'足背动脉搏动标志'}"/>
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
                            <code code="DE03.00.080.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮食情况代码"/>
                            <value xsi:type="CD" code="${generalCareRecord.饮食情况代码!'饮食情况代码'}" displayName="${generalCareRecord.饮食情况!'饮食情况'}" codeSystem="2.16.156.10011.2.3.2.34"
                                   codeSystemName="饮食情况代码"/>
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
                            <value xsi:type="CD" code="${generalCareRecord.饮食指导代码!'饮食指导代码'}" displayName="${generalCareRecord.饮食指导!'饮食指导'}" codeSystem="2.16.156.10011.2.3.1.263"
                                   codeSystemName="饮食指导代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 护理记录 -->
            <component>
                <section>
                    <code displayName="护理记录"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.211.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理等级代码"/>
                            <value xsi:type="CD" code="${generalCareRecord.护理等级代码!'护理等级代码'}" displayName="${generalCareRecord.护理等级!'护理等级'}" codeSystem="2.16.156.10011.2.3.1.259"
                                   codeSystemName="护理等级代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.212.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理类型代码"/>
                            <value xsi:type="CD" code="${generalCareRecord.护理类型代码!'护理类型代码'}" displayName="${generalCareRecord.护理类型!'护理类型'}" codeSystem="2.16.156.10011.2.3.1.259"
                                   codeSystemName="护理类型代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.209.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="导管护理描述"/>
                            <value xsi:type="ST">${generalCareRecord.导管护理描述!'导管护理描述'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.229.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="气管护理代码"/>
                            <value xsi:type="CD" code="${generalCareRecord.气管护理代码!'气管护理代码'}" displayName="${generalCareRecord.气管护理!'气管护理'}" codeSystem="2.16.156.10011.2.3.2.50"
                                   codeSystemName="气管护理代码"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.259.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体位护理"/>
                            <value xsi:type="ST">${generalCareRecord.体位护理!'体位护理'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.068.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="皮肤护理"/>
                            <value xsi:type="ST">${generalCareRecord.皮肤护理!'皮肤护理'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.292.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="营养护理"/>
                            <value xsi:type="ST">${generalCareRecord.营养护理!'营养护理'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.283.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="心理护理代码"/>
                            <value xsi:type="CD" code="${generalCareRecord.心理护理代码!'心理护理代码'}" displayName="${generalCareRecord.心理护理名称!'心理护理名称'}" codeSystem="2.16.156.10011.2.3.2.51"
                                   codeSystemName="心理护理代码"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.178.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="安全护理代码"/>
                            <value xsi:type="CD" code="${generalCareRecord.安全护理代码!'安全护理代码'}" displayName="${generalCareRecord.安全护理名称!'安全护理名称'}" codeSystem="2.16.156.10011.2.3.2.52"
                                   codeSystemName="安全护理代码"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 护理观察 -->
            <component>
                <section>
                    <code displayName="护理观察"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.181.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="简要病情"/>
                            <value xsi:type="ST">${generalCareRecord.简要病情!'简要病情'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.031.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理观察项目名称"/>
                            <value xsi:type="ST">${generalCareRecord.护理观察项目名称!'护理观察项目名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.028.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="护理观察结果"/>
                                    <value xsi:type="ST">${generalCareRecord.护理观察结果!'护理观察结果'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 护理操作 -->
            <component>
                <section>
                    <code displayName="护理操作"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.342.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理操作名称"/>
                            <value xsi:type="ST">${generalCareRecord.护理操作名称!'护理操作名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.210.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="护理操作项目类目名称"/>
                                    <value xsi:type="ST">${generalCareRecord.护理操作项目类目名称!'护理操作项目类目名称'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.209.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="护理操作结果"/>
                                            <value xsi:type="ST">${generalCareRecord.护理操作结果!'护理操作结果'}</value>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 手术评估标志 -->
            <component>
                <section>
                    <code displayName="手术评估标志"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.204.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="发出手术安全核对表标志">
                                <qualifier>
                                    <name displayName="发出手术安全核对表"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="BL" value="${generalCareRecord.发出手术安全核对表标志!'发出手术安全核对表标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.338.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="收回手术安全核对表标志">
                                <qualifier>
                                    <name displayName="收回手术安全核对表"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="BL" value="${generalCareRecord.收回手术安全核对表标志!'收回手术安全核对表标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.204.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="发出手术风险评估表标志">
                                <qualifier>
                                    <name displayName="发出手术风险评估表"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="BL" value="${generalCareRecord.发出手术风险评估表标志!'发出手术风险评估表标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.338.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="收回手术风险评估表标志">
                                <qualifier>
                                    <name displayName="收回手术风险评估表"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="BL" value="${generalCareRecord.收回手术风险评估表标志!'收回手术风险评估表标志'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 护理隔离 -->
            <component>
                <section>
                    <code displayName="护理隔离剂"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.201.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="隔离标志"/>
                            <value xsi:type="BL" value="${generalCareRecord.隔离标志!'隔离标志'}"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.202.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="隔离种类代码"/>
                                    <value xsi:type="CD" code="${generalCareRecord.隔离种类代码!'隔离种类代码'}" displayName="${generalCareRecord.隔离种类!'隔离种类'}" codeSystem="2.16.156.10011.2.3.1.261"
                                           codeSystemName="隔离种类代码"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>