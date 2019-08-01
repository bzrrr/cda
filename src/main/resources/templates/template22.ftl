<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.42"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0022" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>高值耗材使用记录</title>
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
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <age value="" unit="岁"/>
            </patient>
            <providerOrganization>
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

    <!-- 文档审核者 -->
    <authenticator typeCode="AUTHEN">
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="护士"/>
            <assignedPerson>
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

    <componentOf typeCode="COMP">
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <code/>
            <effectiveTime nullFlavor="NI">
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
                                            <!-- 病区名称 -->
                                            <asOrganizationPartOf classCode="PART">
                                                <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                    <id root="2.16.156.10011.1.27" extension=""/>
                                                    <name></name>
                                                    <!-- 科室 -->
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
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11"
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
                                <originalText></originalText>
                            </routeCode>
                            <doseQuantity value="" unit="mg"/>
                            <consumable>
                                <manufacturedProduct>
                                    <id/>
                                    <manufacturedMaterial>
                                        <code/>
                                        <name></name>
                                    </manufacturedMaterial>
                                </manufacturedProduct>
                                <manufacturerOrganization>
                                    <name>产品生产厂家</name>
                                    <asOrganizationPartOf>
                                        <wholeOrganization>
                                            <name>产品供应商</name>
                                        </wholeOrganization>
                                    </asOrganizationPartOf>
                                </manufacturerOrganization>
                            </consumable>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.035.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="产品供应商"/>
                                    <value xsi:type="ST"></value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.058.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="植入性耗材标志"/>
                                    <value xsi:type="BL" value="true"/>
                                </observation>
                            </entryRelationship>
                        </substanceAdministration>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>