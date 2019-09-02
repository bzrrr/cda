<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.47"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0027" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>麻醉知情同意书</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <!-- 患者信息 -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole>
            <!-- 门诊号 -->
            <id root="2.16.156.10011.1.11" extension="${anesthesiaInformedConsent.门急诊号!'门急诊号'}"/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${anesthesiaInformedConsent.住院号!'住院号'}"/>
            <!-- 知情同意书编号 -->
            <id root="2.16.156.10011.1.34" extension="${anesthesiaInformedConsent.知情同意书编号!'知情同意书编号'}"/>
            <patient>
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age value="${anesthesiaInformedConsent.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
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

    <legalAuthenticator typeCode="LA">
        <time value="${anesthesiaInformedConsent.麻醉医师签名日期时间!'麻醉医师签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson>
                <name>${anesthesiaInformedConsent.麻醉医师签名!'麻醉医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.3" extension=""/>
            <assignedPerson>
                <name>${anesthesiaInformedConsent.患者签名!'患者签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value="${anesthesiaInformedConsent.患者或法定代理人签名日期时间!'患者或法定代理人签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.3" extension=""/>
            <code code="${anesthesiaInformedConsent.法定代理人与患者的关系代码!'法定代理人与患者的关系代码'}" codeSystem="2.16.156.10011.2.3.3.8" codeSystemName="家庭关系代码表(GB/T 4761)" displayName="${anesthesiaInformedConsent.法定代理人与患者的关系!'法定代理人与患者的关系'}"/>
            <assignedPerson>
                <name>${anesthesiaInformedConsent.法定代理人签名!'法定代理人签名'}</name>
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
            <effectiveTime value=""/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name>${anesthesiaInformedConsent.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${anesthesiaInformedConsent.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${anesthesiaInformedConsent.科室名称!'科室名称'}</name>
                                                <!-- 病区 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${anesthesiaInformedConsent.病区名称!'病区名称'}</name>
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
            <!-- 术前诊断 -->
            <component>
                <section>
                    <code code="10219-4" displayName="Surgical operation note preoperative Dx"
                          codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="术前诊断编码"/>
                            <value xsi:type="CD" code="${anesthesiaInformedConsent.术前诊断编码!'术前诊断编码'}" displayName="${anesthesiaInformedConsent.术前诊断名称!'术前诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
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
                        <procedure classCode="PROC" moodCode="EVN">
                            <code code="${anesthesiaInformedConsent.拟实施麻醉方法代码!'拟实施麻醉方法代码'}" codeSystem="2.16.156.10011.2.3.1.159" codeSystemName="麻醉方法代码表"
                                  displayName="${anesthesiaInformedConsent.拟实施麻醉方法!'拟实施麻醉方法'}"/>
                            <statusCode code=""/>
                            <effectiveTime value="${anesthesiaInformedConsent.拟实施手术及操作日期时间!'拟实施手术及操作日期时间'}"/>
                            <entryRelationship typeCode="CAUS">
                                <procedure classCode="PROC" moodCode="EVN">
                                    <code code="${anesthesiaInformedConsent.拟实施手术及操作编码!'拟实施手术及操作编码'}" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术操作代码表"
                                          displayName="${anesthesiaInformedConsent.拟实施手术及操作名称!'拟实施手术及操作名称'}"/>
                                </procedure>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="执行有创操作和检测方法"/>
                                    <value xsi:type="ST">${anesthesiaInformedConsent.拟行有创操作和监测方法!'拟行有创操作和监测方法'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="DEF">
                                    <code code="DE05.10.146.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="基础疾病可能对麻醉产生的影响"/>
                                    <value xsi:type="ST">${anesthesiaInformedConsent.基础疾病对麻醉可能产生的影响!'基础疾病对麻醉可能产生的影响'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE04.01.121.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="患者基础疾病"/>
                                            <value xsi:type="ED">${anesthesiaInformedConsent.患者基础疾病!'患者基础疾病'}</value>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.240.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="使用麻醉镇痛汞标志"/>
                                    <value xsi:type="BL" value="${anesthesiaInformedConsent.使用麻醉钺痛泵标志!'使用麻醉钺痛泵标志'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE01.00.016.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="参加麻醉安排保险标志"/>
                                    <value xsi:type="BL" value="${anesthesiaInformedConsent.参加麻醉安全保险标志!'参加麻醉安全保险标志'}"/>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!--意见  -->
            <component>
                <section>
                    <code displayName="意见章节"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.018.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="医疗机构的意见">
                                <qualifier>
                                    <name displayName="医疗机构意见"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="ST">${anesthesiaInformedConsent.医疗机构意见!'医疗机构意见'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.018.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="患者意见">
                                <qualifier>
                                    <name displayName="患者意见"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="ST">${anesthesiaInformedConsent.患者或法定代理人意见!'患者或法定代理人意见'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 风险 -->
            <component>
                <section>
                    <code displayName="操作风险"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="DEF">
                            <code code="DE05.01.075.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="麻醉中,麻醉后可能发生的意外及并发症"/>
                            <value xsi:type="ST">${anesthesiaInformedConsent.可能发生的意外及并发症!'可能发生的意外及并发症'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>