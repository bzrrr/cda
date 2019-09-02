<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.61"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0041" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>交接班记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${handoverRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${handoverRecord.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${handoverRecord.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${handoverRecord.性别!'性别'}"/>
                <birthTime value=""/>
                <age value="${handoverRecord.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
        </patientRole>
    </recordTarget>

    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <code displayName="文档创作者"/>
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

    <authenticator>
        <time value="${handoverRecord.交班日期时间!'交班日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="交班者"/>
            <assignedPerson>
                <name>${handoverRecord.交班者签名!'交班者签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value="${handoverRecord.接班日期时间!'接班日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="接班者"/>
            <assignedPerson>
                <name>${handoverRecord.接班者签名!'接班者签名'}</name>
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

    <componentOf>
        <encompassingEncounter>
            <code displayName="入院日期时间"/>
            <effectiveTime value=""/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name>${handoverRecord.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${handoverRecord.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${handoverRecord.科室名称!'科室名称'}</name>
                                                <!-- 病区 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${handoverRecord.病区名称!'病区名称'}</name>
                                                        <!-- xx医院 -->
                                                        <asOrganizationPartOf classCode="PART">
                                                            <wholeOrganization classCode="ORG"
                                                                               determinerCode="INSTANCE">
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
                    </serviceProviderOrganization>
                </healthCareFacility>
            </location>
        </encompassingEncounter>
    </componentOf>

    <component>
        <structuredBody>
            <!-- 主诉 -->
            <component>
                <section>
                    <code code="10154-3" displayName="CHIEF COMPLAINT" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry typeCode="" contextConductionInd="true">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="主诉"/>
                            <value xsi:type="ST">${handoverRecord.主诉!'主诉'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 入院诊断 -->
            <component>
                <section>
                    <code code="46241-6" displayName="HOSPITAL ADMISSION DX" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.148.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院情况"/>
                            <value xsi:type="ST">${handoverRecord.入院情况!'入院情况'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院诊断-西医诊断编码"/>
                            <value xsi:type="CD" code="${handoverRecord.入院诊断_西医诊断编码!'入院诊断_西医诊断编码'}" codeSystem="2.16.156.10011.2.3.3.14" codeSystemName="ICD-10"
                                   displayName="${handoverRecord.入院诊断_西医诊断名称!'入院诊断_西医诊断名称'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院诊断-中医病名代码">
                                <qualifier>
                                    <name displayName="中医病名代码"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="CD" code="${handoverRecord.入院诊断_中医病名代码!'入院诊断_中医病名代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${handoverRecord.入院诊断_中医病名名称!'入院诊断_中医病名名称'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院诊断-中医证候代码">
                                <qualifier>
                                    <name displayName="中医证候代码"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="CD" code="${handoverRecord.入院诊断_中医证候代码!'入院诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${handoverRecord.入院诊断_中医证候名称!'入院诊断_中医证候名称'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 诊断 -->
            <component>
                <section>
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.184.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="目前情况"/>
                            <value xsi:type="ST">${handoverRecord.目前情况!'目前情况'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="目前诊断-西医诊断编码"/>
                            <value xsi:type="CD" code="${handoverRecord.目前诊断_西医诊断编码!'目前诊断_西医诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="诊断代码表(ICD-10)" displayName="${handoverRecord.目前诊断_西医诊断名称!'目前诊断_西医诊断名称'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="目前诊断-中医病名代码">
                                <qualifier>
                                    <name displayName="中医病名代码"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="CD" code="${handoverRecord.目前诊断_中医病名代码!'目前诊断_中医病名代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${handoverRecord.目前诊断_中医病名名称!'目前诊断_中医病名名称'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="目前诊断-中医证候代码">
                                <qualifier>
                                    <name displayName="中医证候代码"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="CD" code="${handoverRecord.目前诊断_中医证候代码!'目前诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${handoverRecord.目前诊断_中医证候名称!'目前诊断_中医证候名称'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.028.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="中医四诊观察结果"/>
                            <value xsi:type="ST">${handoverRecord.中医四诊观察结果!'中医四诊观察结果'}</value>
                        </observation>
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
                            <code code="DE06.00.298.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="转入诊疗计划"/>
                            <value xsi:type="ST">${handoverRecord.接班诊疗计划!'接班诊疗计划'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.300.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="治则治法"/>
                            <value xsi:type="ST">${handoverRecord.治则治法!'治则治法'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="注意事项"/>
                            <value xsi:type="ST">${handoverRecord.注意事项!'注意事项'}</value>
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
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.296.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="诊疗过程描述"/>
                            <value xsi:type="ST">${handoverRecord.诊疗过程描述!'诊疗过程描述'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>