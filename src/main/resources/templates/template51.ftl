<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.71"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0051" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>死亡病例讨论记录</title>
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
            <id root="2.16.156.10011.1.12" extension="${deathCaseDiscussionRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${deathCaseDiscussionRecord.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${deathCaseDiscussionRecord.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${deathCaseDiscussionRecord.性别!'性别'}"/>
                <age value="${deathCaseDiscussionRecord.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <asOrganizationPartOf classCode="PART">
                    <effectiveTime value="${deathCaseDiscussionRecord.讨论日期时间!'讨论日期时间'}"/>
                    <wholeOrganization>
                        <addr>${deathCaseDiscussionRecord.讨论地点!'讨论地点'}</addr>
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

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="住院医师"/>
            <assignedPerson>
                <name></name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="${deathCaseDiscussionRecord.住院号!'住院号'}" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表" displayName="${deathCaseDiscussionRecord.住院号!'住院号'}"/>
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
                <name>${deathCaseDiscussionRecord.主治医师签名!'主治医师签名'}</name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="${deathCaseDiscussionRecord.专业技术职务类别代码!'专业技术职务类别代码'}" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表" displayName="${deathCaseDiscussionRecord.专业技术职务类别名称!'专业技术职务类别名称'}"/>
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
                <name>${deathCaseDiscussionRecord.主任医师签名!'主任医师签名'}</name>
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
                <name>${deathCaseDiscussionRecord.参加讨论人员名单!'参加讨论人员名单'}</name>
            </associatedPerson>
        </associatedEntity>
    </participant>
    <!-- 讨论主持人信息 -->
    <participant typeCode="ORG">
        <associatedEntity classCode="ECON">
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主持人"/>
            <associatedPerson>
                <name>${deathCaseDiscussionRecord.主持人姓名!'主持人姓名'}</name>
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
                                <name>${deathCaseDiscussionRecord.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${deathCaseDiscussionRecord.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${deathCaseDiscussionRecord.科室名称!'科室名称'}</name>
                                                <!-- 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${deathCaseDiscussionRecord.病区名称!'病区名称'}</name>
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
            <component>
                <section>
                    <code displayName="死亡原因"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="直接死亡原因名称"/>
                            <value xsi:type="ST">${deathCaseDiscussionRecord.直接死亡原因名称!'直接死亡原因名称'}</value>
                            <entryRelationship typeCode="CAUS">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.021.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="直接死亡原因编码"/>
                                    <value xsi:type="CD" code="${deathCaseDiscussionRecord.直接死亡原因编码!'直接死亡原因编码'}" codeSystem="2.16.156.10011.2.3.3.11.2"
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
                            <value xsi:type="ST">${deathCaseDiscussionRecord.死亡诊断名称!'死亡诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.021.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="死亡诊断编码"/>
                                    <value xsi:type="CD" code="${deathCaseDiscussionRecord.死亡诊断编码!'死亡诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11"
                                           codeSystemName="ICD-10诊断编码表" displayName="${deathCaseDiscussionRecord.死亡诊断名称!'死亡诊断名称'}"/>
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
                    <text>${deathCaseDiscussionRecord.死亡讨论记录!'死亡讨论记录'}</text>
                </section>
            </component>
            <!-- 讨论总结 -->
            <component>
                <section>
                    <code code="DE06.00.018.00" displayName="主持人总结意见" codeSystem="2.16.156.10011.2.2.1"
                          codeSystemName="卫生信息数据元目录"/>
                    <text>${deathCaseDiscussionRecord.主持人总结意见!'主持人总结意见'}</text>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>