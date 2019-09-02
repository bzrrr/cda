<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.64"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0044" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>抢救记录</title>
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
            <id root="2.16.156.10011.1.12" extension="${rescueRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${rescueRecord.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${rescueRecord.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${rescueRecord.性别!'性别'}"/>
                <birthTime value=""/>
                <age value="${rescueRecord.年龄岁!'年龄岁'}" unit="岁"/>
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

    <authenticator>
        <time value="${rescueRecord.签名日期时间!'签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="医师"/>
            <assignedPerson>
                <name>${rescueRecord.医师签名!'医师签名'}</name>
                <professionalTechnicalPosition>
                    <professionaltechnicalpositionCode code="${rescueRecord.专业技术职务类别代码!'专业技术职务类别代码'}" codeSystem="2.16.156.10011.2.3.1.209"
                                                       codeSystemName="专业技术职务类别代码表"
                                                       displayName="${rescueRecord.专业技术职务类别名称!'专业技术职务类别名称'}"></professionaltechnicalpositionCode>
                </professionalTechnicalPosition>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <participant typeCode="CON">
        <associatedEntity classCode="ECON">
            <assignedPerson>
                <name>${rescueRecord.参加抢救人员名单!'参加抢救人员名单'}</name>
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
            <effectiveTime xsi:type="IVL_TS" value="${rescueRecord.住院号!'住院号'}"/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name>${rescueRecord.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${rescueRecord.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${rescueRecord.科室名称!'科室名称'}</name>
                                                <!-- 病区 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${rescueRecord.病区名称!'病区名称'}</name>
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
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="疾病诊断名称"/>
                            <value xsi:type="ST">${rescueRecord.疾病诊断名称!'疾病诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="疾病诊断编码"/>
                                    <value xsi:type="CD" code="${rescueRecord.疾病诊断编码!'疾病诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11"
                                           codeSystemName="诊断代码表(ICD-10)" displayName="${rescueRecord.疾病诊断名称!'疾病诊断名称'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.134.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="病情变化情况"/>
                            <value xsi:type="ST">${rescueRecord.病情变化情况!'病情变化情况'}</value>
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
                            <code code="DE09.00.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="注意事项"/>
                            <value xsi:type="ST">${rescueRecord.注意事项!'注意事项'}</value>
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
                        <procedure classCode="PROC" moodCode="EVN">
                            <code code="${rescueRecord.手术及操作编码!'手术及操作编码'}" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术操作代码表(ICD-9-CM)"/>
                            <statusCode/>
                            <targetSiteCode code="" codeSystem="2.16.156.10011.2.3.1.266" codeSystemName="操作部位代码表">${rescueRecord.手术及操作目标部位名称!'手术及操作目标部位名称'}</targetSiteCode>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.094.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术及操作名称"/>
                                    <value xsi:type="ST">${rescueRecord.手术及操作名称!'手术及操作名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.037.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="介入物名称"/>
                                    <value xsi:type="ST">${rescueRecord.介人物名称!'介人物名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.251.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="操作方法"/>
                                    <value xsi:type="ST">${rescueRecord.操作方法!'操作方法'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.250.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="操作次数"/>
                                    <value xsi:type="PQ" value="${rescueRecord.操作次数!'操作次数'}" unit="次"/>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                    <entry>
                        <observation classCode="ACT" moodCode="EVN">
                            <code code="DE06.00.094.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="抢救措施"/>
                            <value xsi:type="ST">${rescueRecord.抢救措施!'抢救措施'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.221.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="抢救开始时间"/>
                            <value xsi:type="TS" value="${rescueRecord.抢救开始日期时间!'抢救开始日期时间'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.218.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="抢救结束日期时间"/>
                            <value xsi:type="TS" value="${rescueRecord.抢救结束日期时间!'抢救结束日期时间'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 实验室检查 -->
            <component>
                <section>
                    <code code="30954-2" displayName="STUDIES SUMMARY" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.020.00" codeSystem="2.16.156.10011.2.3.3.11" codeSystemName="卫生信息数据元目录"
                                  displayName="检查/检验项目名称"/>
                            <value xsi:type="ST">${rescueRecord.检查或检验项目名称!'检查或检验项目名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.30.009.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="检查/检验结果"/>
                                    <value xsi:type="ST">${rescueRecord.检査或检验结果!'检査或检验结果'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.30.015.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="检查/检验定量结果"/>
                                    <value xsi:type="PQ" value="${rescueRecord.检查或检验定量结果!'检查或检验定量结果'}" unit="mmHg"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.30.017.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="检查/检验结果代码"/>
                                    <value xsi:type="CD" code="${rescueRecord.检查或检验结果代码!'检查或检验结果代码'}" codeSystem="2.16.156.10011.2.3.2.38"
                                           codeSystemName="检查结果代码表">${rescueRecord.检査或检验结果!'检査或检验结果'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>