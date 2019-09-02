<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.48"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0028" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>输血治疗同意书</title>
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
            <id root="2.16.156.10011.1.11" extension="${bloodTransfusionCureConsent.门急诊号!'门急诊号'}"/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${bloodTransfusionCureConsent.住院号!'住院号'}"/>
            <!-- 知情同意书编号 -->
            <id root="2.16.156.10011.1.34" extension="${bloodTransfusionCureConsent.知情同意书编号!'知情同意书编号'}"/>
            <patient>
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age value="${bloodTransfusionCureConsent.年龄岁!'年龄岁'}" unit="岁"/>
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
        <time value="${bloodTransfusionCureConsent.医师签名日期时间!'医师签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${bloodTransfusionCureConsent.医师签名!'医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson>
                <name>${bloodTransfusionCureConsent.患者或法定代理人签名!'患者或法定代理人签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value="${bloodTransfusionCureConsent.患者或法定代理人签名日期时间!'患者或法定代理人签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.3" extension=""/>
            <code code="${bloodTransfusionCureConsent.法定代理人与患者的关系代码!'法定代理人与患者的关系代码'}" codeSystem="2.16.156.10011.2.3.3.8" codeSystemName="家庭关系代码表(GB/T 4761)" displayName="${bloodTransfusionCureConsent.法定代理人与患者的关系!'法定代理人与患者的关系'}"/>
            <assignedPerson>
                <name>${bloodTransfusionCureConsent.患者或法定代理人签名!'患者或法定代理人签名'}</name>
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
                                <name>${bloodTransfusionCureConsent.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${bloodTransfusionCureConsent.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${bloodTransfusionCureConsent.科室名称!'科室名称'}</name>
                                                <!-- 病区 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${bloodTransfusionCureConsent.病区名称!'病区名称'}</name>
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
            <!-- 诊断 -->
            <component>
                <section>
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="疾病诊断编码"/>
                            <value xsi:type="CD" code="${bloodTransfusionCureConsent.疾病诊断编码!'疾病诊断编码'}" displayName="${bloodTransfusionCureConsent.疾病诊断名称!'疾病诊断名称'}" codeSystem="2.16.156.10011.2.3.1.100"
                                   codeSystemName="ICD-10"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!--输血 -->
            <component>
                <section>
                    <code code="56836-0" displayName="History of blood transfusion" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.106.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName=""/>
                            <value xsi:type="CD" code="${bloodTransfusionCureConsent.输血史标识代码!'输血史标识代码'}" displayName="${bloodTransfusionCureConsent.输血史标识!'输血史标识'}" codeSystem="2.16.156.10011.2.3.1.100"
                                   codeSystemName="输血史标识代码表"/>
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
                            <code/>
                            <effectiveTime value="${bloodTransfusionCureConsent.拟定输血日期时间!'拟定输血日期时间'}"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.266.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="输血方式"/>
                                    <value xsi:type="ST">${bloodTransfusionCureConsent.输血方式!'输血方式'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="CAUS">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.340.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="输血指征"/>
                                    <value xsi:type="ST">${bloodTransfusionCureConsent.输血指征!'输血指征'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <substanceAdministration classCode="SBADM" moodCode="RQO">
                                    <consumable>
                                        <manufacturedProduct>
                                            <manufacturedMaterial>
                                                <code code="${bloodTransfusionCureConsent.输血品种代码!'输血品种代码'}" codeSystem="2.16.156.10011.2.3.1.251"
                                                      codeSystemName="输血品种代码表" displayName="${bloodTransfusionCureConsent.患者或法定代理人签名!'患者或法定代理人签名'}"/>
                                                <value xsi:type="ST">${bloodTransfusionCureConsent.输血品种!'输血品种'}</value>
                                            </manufacturedMaterial>
                                        </manufacturedProduct>
                                    </consumable>
                                </substanceAdministration>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.109.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="输血前有关检查项目及结果"/>
                                    <value xsi:type="ED">${bloodTransfusionCureConsent.输血前有关检查项目及结果!'输血前有关检查项目及结果'}</value>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!-- 意见章节 -->
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
                            <value xsi:type="ST">${bloodTransfusionCureConsent.医疗机构意见!'医疗机构意见'}</value>
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
                            <value xsi:type="ST">${bloodTransfusionCureConsent.患者或法定代理人意见!'患者或法定代理人意见'}</value>
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
                                  displayName="输血风险及可能发生的不良后果"/>
                            <value xsi:type="ST">${bloodTransfusionCureConsent.输血前有关检查项目及结果!'输血前有关检查项目及结果'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>