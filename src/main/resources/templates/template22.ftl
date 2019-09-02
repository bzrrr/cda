<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.42"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0022" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>高值耗材使用记录</title>
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
            <id root="2.16.156.10011.1.12" extension="${highValueThingUseRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name></name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <age value="${highValueThingUseRecord.年龄岁!'年龄岁'}" unit="岁"/>
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

    <!-- 文档审核者 -->
    <authenticator typeCode="AUTHEN">
        <time value="${highValueThingUseRecord.签名日期时间!'签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="护士"/>
            <assignedPerson>
                <name>${highValueThingUseRecord.护士签名!'护士签名'}</name>
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
            <effectiveTime nullFlavor="NI">
                <location typeCode="LOC">
                    <healthCareFacility classCode="SDLOC">
                        <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                            <asOrganizationPartOf classCode="PART">
                                <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                    <id root="2.16.156.10011.1.22" extension="${highValueThingUseRecord.病床号!'病床号'}"/>
                                    <name></name>
                                    <!-- 病房号 -->
                                    <asOrganizationPartOf classCode="PART">
                                        <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                            <id root="2.16.156.10011.1.21" extension="${highValueThingUseRecord.病房号!'病房号'}"/>
                                            <name></name>
                                            <!-- 病区名称 -->
                                            <asOrganizationPartOf classCode="PART">
                                                <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                    <id root="2.16.156.10011.1.27" extension=""/>
                                                    <name>${highValueThingUseRecord.病区名称!'病区名称'}</name>
                                                    <!-- 科室 -->
                                                    <asOrganizationPartOf classCode="PART">
                                                        <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                            <id root="2.16.156.10011.1.26" extension=""/>
                                                            <name>${highValueThingUseRecord.科室名称!'科室名称'}</name>
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
            </effectiveTime>
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
                            <value xsi:type="CD" code="${highValueThingUseRecord.疾病诊断编码!'疾病诊断编码'}" displayName="${highValueThingUseRecord.疾病诊断名称!'疾病诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 高值耗材 -->
            <component>
                <section>
                    <code code="10160-0" displayName="HISTORY OF MEDICATION USE" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <substanceAdministration classCode="SBADM" moodCode="EVN">
                            <text/>
                            <routeCode nullFlavor="OTH">
                                <originalText>${highValueThingUseRecord.使用途径!'使用途径'}</originalText>
                            </routeCode>
                            <doseQuantity value="${highValueThingUseRecord.数量!'数量'}" unit="${highValueThingUseRecord.耗材单位!'耗材单位'}"/>
                            <consumable>
                                <manufacturedProduct>
                                    <id>${highValueThingUseRecord.产品编码!'产品编码'}</id>
                                    <manufacturedMaterial>
                                        <code/>
                                        <name>${highValueThingUseRecord.材料名称!'材料名称'}</name>
                                    </manufacturedMaterial>
                                </manufacturedProduct>
                                <manufacturerOrganization>
                                    <name>${highValueThingUseRecord.产品生产厂家!'产品生产厂家'}</name>
                                    <asOrganizationPartOf>
                                        <wholeOrganization>
                                            <name>${highValueThingUseRecord.产品供应商!'产品供应商'}</name>
                                        </wholeOrganization>
                                    </asOrganizationPartOf>
                                </manufacturerOrganization>
                            </consumable>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.035.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="产品供应商"/>
                                    <value xsi:type="ST">${highValueThingUseRecord.产品供应商!'产品供应商'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.058.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="植入性耗材标志"/>
                                    <value xsi:type="BL" value="${highValueThingUseRecord.植入性耗材标志!'植入性耗材标志'}"/>
                                </observation>
                            </entryRelationship>
                        </substanceAdministration>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>