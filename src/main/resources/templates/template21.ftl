<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.41"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0021" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>出入量记录</title>
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
            <id root="2.16.156.10011.1.12" extension="${inOutRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <age value="${inOutRecord.年龄岁!'年龄岁'}" unit="岁"/>
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
    <authenticator typeCode="AUTHEN">
        <time value="${inOutRecord.签名日期时间!'签名日期时间'}"/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="护士"/>
            <assignedPerson>
                <name>${inOutRecord.护士签名!'护士签名'}</name>
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
                                    <id root="2.16.156.10011.1.22" extension="${inOutRecord.病床号!'病床号'}"/>
                                    <name></name>
                                    <!-- 病房号 -->
                                    <asOrganizationPartOf classCode="PART">
                                        <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                            <id root="2.16.156.10011.1.21" extension="${inOutRecord.病房号!'病房号'}"/>
                                            <name></name>
                                            <!-- 病区名称 -->
                                            <asOrganizationPartOf classCode="PART">
                                                <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                    <id root="2.16.156.10011.1.27" extension=""/>
                                                    <name>${inOutRecord.病区名称!'病区名称'}</name>
                                                    <!-- 科室 -->
                                                    <asOrganizationPartOf classCode="PART">
                                                        <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                            <id root="2.16.156.10011.1.26" extension=""/>
                                                            <name>${inOutRecord.科室名称!'科室名称'}</name>
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
                            <value xsi:type="CD" code="${inOutRecord.疾病诊断编码!'疾病诊断编码'}" displayName="${inOutRecord.疾病诊断名称!'疾病诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
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
                            <value xsi:type="PQ" value="${inOutRecord.体重!'体重'}" unit="kg"/>
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
                            <value xsi:type="CD" code="${inOutRecord.护理等级代码!'护理等级代码'}" displayName="${inOutRecord.护理等级!'护理等级'}" codeSystem="2.16.156.10011.2.3.1.259"
                                   codeSystemName="护理等级代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.212.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理类型代码"/>
                            <value xsi:type="CD" code="${inOutRecord.护理类型代码!'护理类型代码'}" displayName="${inOutRecord.护理类型!'护理类型'}" codeSystem="2.16.156.10011.2.3.1.260"
                                   codeSystemName="护理类型代码表"/>
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
                            <code code="DE02.10.031.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理观察项目名称"/>
                            <value xsi:type="ST"></value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.028.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="护理观察结果"/>
                                    <value xsi:type="ST">${inOutRecord.护理观察结果!'护理观察结果'}</value>
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
                            <value xsi:type="ST">${inOutRecord.护理操作名称!'护理操作名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.210.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="护理操作项目类目名称"/>
                                    <value xsi:type="ST">${inOutRecord.护理操作项目类目名称!'护理操作项目类目名称'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.209.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="护理操作结果"/>
                                            <value xsi:type="ST">${inOutRecord.护理操作结果!'护理操作结果'}</value>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 用药 -->
            <component>
                <section>
                    <code code="10160-0" displayName="HISTORY OF MEDICATION USE" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <substanceAdministration classCode="SBADM" moodCode="EVN">
                            <text/>
                            <routeCode code="${inOutRecordDetail.用药途径代码!'用药途径代码'}" displayName="${inOutRecordDetail.用药途径!'用药途径'}" codeSystem="2.16.156.10011.2.3.1.158" codeSystemName="用药途径代码表"/>
                            <doseQuantity value="${inOutRecordDetail.药物使用次剂量!'药物使用次剂量'}" unit="mg"/>
                            <rateQuantity value="${inOutRecordDetail.药物使用频率!'药物使用频率'}" unit="次/日"/>
                            <consumable>
                                <manufacturedProduct>
                                    <manufacturedMaterial>
                                        <code/>
                                        <name>${inOutRecordDetail.药物名称!'药物名称'}</name>
                                    </manufacturedMaterial>
                                </manufacturedProduct>
                            </consumable>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.136.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="药物用法"/>
                                    <value xsi:type="ST">${inOutRecordDetail.药物用法!'药物用法'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.164.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="中药使用类别代码"/>
                                    <value xsi:type="CD" code="${inOutRecordDetail.中药使用类别代码!'中药使用类别代码'}" displayName="${inOutRecordDetail.中药使用类别!'中药使用类别'}" codeSystem="2.16.156.10011.2.3.1.157"
                                           codeSystemName="中药使用类别代码"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.135.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="药物使用总剂量"/>
                                    <value xsi:type="PQ" value="${inOutRecordDetail.药物使用总剂量!'药物使用总剂量'}" unit="${inOutRecordDetail.药物使用剂量单位!'药物使用剂量单位'}"/>
                                </observation>
                            </entryRelationship>
                        </substanceAdministration>
                    </entry>
                </section>
            </component>
            <!-- 护理标志 -->
            <component>
                <section>
                    <code displayName="护理标志"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.048.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="呕吐标志"/>
                            <value xsi:type="BL" value="${inOutRecord.呕吐标志!'呕吐标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.051.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="排尿困难标志"/>
                            <value xsi:type="BL" value="${inOutRecord.排尿困难标志!'排尿困难标志'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>