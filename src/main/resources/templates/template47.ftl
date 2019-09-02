<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.67"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0047" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>术前讨论</title>
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
            <id root="2.16.156.10011.1.12" extension="${preoperativeDiscussion.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${preoperativeDiscussion.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${preoperativeDiscussion.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${preoperativeDiscussion.性别!'性别'}"/>
                <age value="${preoperativeDiscussion.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
            <!-- 讨论日期和地点 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <asOrganizationPartOf classCode="PART">
                    <effectiveTime value="${preoperativeDiscussion.讨论日期时间!'讨论日期时间'}"></effectiveTime>
                    <wholeOrganization>
                        <addr>${preoperativeDiscussion.讨论地点!'讨论地点'}</addr>
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
            <code displayName="手术者"/>
            <assignedPerson>
                <name>${preoperativeDiscussion.手术者签名!'手术者签名'}</name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="${preoperativeDiscussion.专业技术职务类别代码!'专业技术职务类别代码'}" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表"
                                                       displayName="${preoperativeDiscussion.专业技术职务类别名称!'专业技术职务类别名称'}"></professionaltechnicalpositionCode>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="麻醉医师"/>
            <assignedPerson>
                <name>${preoperativeDiscussion.麻醉医师签名!'麻醉医师签名'}</name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="${preoperativeDiscussion.专业技术职务类别代码!'专业技术职务类别代码'}" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表"
                                                       displayName="${preoperativeDiscussion.专业技术职务类别名称!'专业技术职务类别名称'}"></professionaltechnicalpositionCode>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="医师"/>
            <assignedPerson>
                <name>${preoperativeDiscussion.医师签名!'医师签名'}</name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="${preoperativeDiscussion.专业技术职务类别代码!'专业技术职务类别代码'}" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表"
                                                       displayName="${preoperativeDiscussion.专业技术职务类别名称!'专业技术职务类别名称'}"></professionaltechnicalpositionCode>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <participant typeCode="CON">
        <associatedEntity classCode="ECON">
            <assignedPerson>
                <name>${preoperativeDiscussion.参加讨论人员名单!'参加讨论人员名单'}</name>
            </assignedPerson>
            <scopingOrganization>
                <addr>${preoperativeDiscussion.讨论地点!'讨论地点'}</addr>
            </scopingOrganization>
        </associatedEntity>
    </participant>

    <participant typeCode="ORG">
        <associatedEntity classCode="ECON">
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson>
                <name>${preoperativeDiscussion.主持人姓名!'主持人姓名'}</name>
            </assignedPerson>
        </associatedEntity>
    </participant>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>

    <componentOf>
        <encompassingEncounter>
            <effectiveTime/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name>${preoperativeDiscussion.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${preoperativeDiscussion.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${preoperativeDiscussion.科室名称!'科室名称'}</name>
                                                <!-- 病区 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${preoperativeDiscussion.病区名称!'病区名称'}</name>
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
                            <value xsi:type="CD" code="${preoperativeDiscussion.术前诊断编码!'术前诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                   codeSystemName="ICD-10 诊断编码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.092.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院日期时间"/>
                            <value xsi:type="TS" value="${preoperativeDiscussion.入院日期时间!'入院日期时间'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 治疗计划章节 -->
            <component>
                <section>
                    <code code="18776-5" displayName="TREATMENT PLAN" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.094.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟实施手术及操作名称"/>
                            <value xsi:type="ST">${preoperativeDiscussion.拟实施手术及操作名称!'拟实施手术及操作名称'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.093.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟实施手术及操作编码"/>
                            <value xsi:type="CD" code="${preoperativeDiscussion.拟实施手术及操作编码!'拟实施手术及操作编码'}" codeSystem="2.16.156.10011.2.3.3.12"
                                   codeSystemName="ICD-9-CM-3"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.187.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟实施手术目标部位名称"/>
                            <value xsi:type="ST">${preoperativeDiscussion.拟实施手术目标部位名称!'拟实施手术目标部位名称'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.221.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟实施手术及操作日期时间"/>
                            <value xsi:type="TS" value="${preoperativeDiscussion.拟实施手术及操作日期时间!'拟实施手术及操作日期时间'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟实施麻醉方法代码"/>
                            <value xsi:type="CD" code="${preoperativeDiscussion.拟实施麻醉方法代码!'拟实施麻醉方法代码'}" codeSystem="2.16.156.10011.2.3.1.159"
                                   codeSystemName="实施麻醉方法代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 手术操作 -->
            <component>
                <section>
                    <code code="47519-4" displayName="HISTORY OF PROCEDURES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.254.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术要点"/>
                            <value xsi:type="ST">${preoperativeDiscussion.手术要点!'手术要点'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.271.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="术前准备"/>
                            <value xsi:type="ST">${preoperativeDiscussion.术前准备!'术前准备'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.340.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术指征"/>
                            <value xsi:type="ST">${preoperativeDiscussion.手术指征!'手术指征'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.301.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术方案"/>
                            <value xsi:type="ST">${preoperativeDiscussion.手术方案!'手术方案'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="注意事项"/>
                            <value xsi:type="ST">${preoperativeDiscussion.注意事项!'注意事项'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 术前总结章节 -->
            <component>
                <section>
                    <code displayName="讨论总结"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.018.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="讨论意见"/>
                            <value xsi:type="ST">${preoperativeDiscussion.讨论意见!'讨论意见'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.018.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="讨论结论"/>
                            <value xsi:type="ST">${preoperativeDiscussion.讨论结论!'讨论结论'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>