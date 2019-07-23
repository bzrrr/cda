<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.71"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0051" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>死亡病例讨论记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
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
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <asOrganizationPartOf classCode="PART">
                    <effectiveTime value=""/>
                    <wholeOrganization>
                        <addr></addr>
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
    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="住院医师"/>
            <assignedPerson>
                <name></name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表" displayName=""/>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>
    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主治医师"/>
            <assignedPerson>
                <name></name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表" displayName=""/>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>
    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主任医师"/>
            <assignedPerson>
                <name></name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表" displayName=""/>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>
    <!-- 讨论成员 -->
    <participant typeCode="CON">
        <associatedEntity classCode="ECON">
            <associatedPerson>
                <name></name>
            </associatedPerson>
        </associatedEntity>
    </participant>
    <!-- 讨论主持人信息 -->
    <participant typeCode="ORG">
        <associatedEntity classCode="ECON">
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主持人"/>
            <associatedPerson>
                <name></name>
            </associatedPerson>
        </associatedEntity>
    </participant>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>
    <!-- 入院场景 -->
    <componentOf>
        <!-- 就诊 -->
        <encompassingEncounter>
            <!-- 就诊时间 -->
            <effectiveTime/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <!-- 病床号 -->
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
                                                <!-- 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name></name>
                                                        <!-- xx医院 -->
                                                        <asOrganizationPartOf classCode="PART">
                                                            <wholeOrganization classCode="ORG"
                                                                               determinerCode="INSTANCE">
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
                    </serviceProviderOrganization>
                </healthCareFacility>
            </location>
        </encompassingEncounter>
    </componentOf>
    <component>
        <structuredBody>
            <component>
                <section>
                    <code displayName="死亡原因"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="直接死亡原因名称"/>
                            <value xsi:type="ST"></value>
                            <entryRelationship typeCode="CAUS">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.021.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="直接死亡原因编码"/>
                                    <value xsi:type="CD" code="M82510/3" codeSystem="2.16.156.10011.2.3.3.11.2"
                                           codeSystemName="死亡代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 诊断章节 -->
            <component>
                <section>
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" displayName="死亡诊断名称" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.021.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="死亡诊断编码"/>
                                    <value xsi:type="CD" code="R99.x01" codeSystem="2.16.156.10011.2.3.3.11"
                                           codeSystemName="ICD-10诊断编码表" displayName="死亡"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 讨论内容 -->
            <component>
                <section>
                    <code code="DE06.00.181.00" displayName="死亡讨论记录" codeSystem="2.16.156.10011.2.2.1"
                          codeSystemName="卫生信息数据元目录"/>
                    <text/>
                </section>
            </component>
            <!-- 讨论总结 -->
            <component>
                <section>
                    <code code="DE06.00.018.00" displayName="主持人总结意见" codeSystem="2.16.156.10011.2.2.1"
                          codeSystemName="卫生信息数据元目录"/>
                    <text/>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>