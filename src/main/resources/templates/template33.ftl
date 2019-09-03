<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.53"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0033" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>中医住院病案首页</title>
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
            <id root="2.16.156.10011.1.12" extension="${cInpatientMedicalRecordHomepage.住院号!'住院号'}"/>
            <!-- 病案号 -->
            <id root="2.16.156.10011.1.13" extension="${cInpatientMedicalRecordHomepage.病案号!'病案号'}"/>
            <!-- 病理号 -->
            <id root="2.16.156.10011.1.8" extension="${cInpatientMedicalRecordHomepage.病理号!'病理号'}"/>
            <addr use="H">
                <houseNumber>${cInpatientMedicalRecordHomepage.现住址_门牌号码!'现住址_门牌号码'}</houseNumber>
                <streetName>${cInpatientMedicalRecordHomepage.现住址_村!'现住址_村'}</streetName>
                <township>${cInpatientMedicalRecordHomepage.现住址_乡!'现住址_乡'}</township>
                <county>${cInpatientMedicalRecordHomepage.现住址_县!'现住址_县'}</county>
                <city>${cInpatientMedicalRecordHomepage.现住址_市!'现住址_市'}</city>
                <state>${cInpatientMedicalRecordHomepage.现住址_省!'现住址_省'}</state>
            </addr>
            <telecom value="${cInpatientMedicalRecordHomepage.电话号码!'电话号码'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${cInpatientMedicalRecordHomepage.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${cInpatientMedicalRecordHomepage.现住址_省!'现住址_省'}</name>
                <administrativeGenderCode code="${cInpatientMedicalRecordHomepage.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${cInpatientMedicalRecordHomepage.性别!'性别'}"/>
                <birthTime value="${cInpatientMedicalRecordHomepage.出生日期!'出生日期'}"/>
                <maritalStatusCode code="${cInpatientMedicalRecordHomepage.婚姻状况代码!'婚姻状况代码'}" displayName="${cInpatientMedicalRecordHomepage.婚姻状况!'婚姻状况'}" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <ethnicGroupCode code="${cInpatientMedicalRecordHomepage.民族!'民族'}" displayName="${cInpatientMedicalRecordHomepage.民族名称!'民族名称'}" codeSystem="2.16.156.10011.2.3.3.3"
                                 codeSystemName="民族类别代码表(GB/T 3304)"/>
                <!-- 出生地 -->
                <birthplace>
                    <place classCode="PLC" determinerCode="INSTANCE">
                        <addr>
                            <county>${cInpatientMedicalRecordHomepage.出生地_县!'出生地_县'}</county>
                            <city>${cInpatientMedicalRecordHomepage.出生地_市!'出生地_市'}</city>
                            <state>${cInpatientMedicalRecordHomepage.出生地_省!'出生地_省'}</state>
                            <postalCode></postalCode>
                        </addr>
                    </place>
                </birthplace>
                <!-- 国籍 -->
                <nationality code="${cInpatientMedicalRecordHomepage.国籍代码!'国籍代码'}" codeSystem="2.16.156.10011.2.3.3.1" codeSystemName="世界各国和地区名称代码(GB/T 2659)"
                             displayName="${cInpatientMedicalRecordHomepage.国籍!'国籍'}"/>
                <age value="${cInpatientMedicalRecordHomepage.年龄岁!'年龄岁'}" unit="岁"/>
                <!-- 工作单位 -->
                <employerOrganization>
                    <name>${cInpatientMedicalRecordHomepage.工作单位名称!'工作单位名称'}</name>
                    <telecom value="${cInpatientMedicalRecordHomepage.工作单位电话号码!'工作单位电话号码'}"/>
                    <addr use="WP">
                        <houseNumber>${cInpatientMedicalRecordHomepage.工作单位地址_门牌号码!'工作单位地址_门牌号码'}</houseNumber>
                        <streetName>${cInpatientMedicalRecordHomepage.工作单位地址_村!'工作单位地址_村'}</streetName>
                        <township>${cInpatientMedicalRecordHomepage.工作单位地址_乡!'工作单位地址_乡'}</township>
                        <county>${cInpatientMedicalRecordHomepage.工作单位地址_县!'工作单位地址_县'}</county>
                        <city>${cInpatientMedicalRecordHomepage.工作单位地址_市!'工作单位地址_市'}</city>
                        <state>${cInpatientMedicalRecordHomepage.工作单位地址_省!'工作单位地址_省'}</state>
                        <postalCode>${cInpatientMedicalRecordHomepage.工作单位地址_邮政编码!'工作单位地址_邮政编码'}</postalCode>
                    </addr>
                </employerOrganization>
                <!-- 户口信息 -->
                <household>
                    <place classCode="PLC" determinerCode="INSTANCE">
                        <addr>
                            <houseNumber>${cInpatientMedicalRecordHomepage.户口地址_门牌号码!'户口地址_门牌号码'}</houseNumber>
                            <streetName>${cInpatientMedicalRecordHomepage.户口地址_村!'户口地址_村'}</streetName>
                            <township>${cInpatientMedicalRecordHomepage.户口地址_乡!'户口地址_乡'}</township>
                            <county>${cInpatientMedicalRecordHomepage.户口地址_县!'户口地址_县'}</county>
                            <city>${cInpatientMedicalRecordHomepage.户口地址_市!'户口地址_市'}</city>
                            <state>${cInpatientMedicalRecordHomepage.户口地址_省!'户口地址_省'}</state>
                            <postalCode>${cInpatientMedicalRecordHomepage.户口地址_邮政编码!'户口地址_邮政编码'}</postalCode>
                        </addr>
                    </place>
                </household>
                <!-- 籍贯信息 -->
                <nativePlace>
                    <place classCode="PLC" determinerCode="INSTANCE">
                        <addr>
                            <city>${cInpatientMedicalRecordHomepage.籍贯_市!'籍贯_市'}</city>
                            <state>${cInpatientMedicalRecordHomepage.籍贯_省!'籍贯_省'}</state>
                        </addr>
                    </place>
                </nativePlace>
                <!-- 职业情况 -->
                <occupation>
                    <occupationCode code="${cInpatientMedicalRecordHomepage.职业类别代码!'职业类别代码'}" displayName="${cInpatientMedicalRecordHomepage.职业类别!'职业类别'}" codeSystem="2.16.156.10011.2.3.3.13"
                                    codeSystemName="从业状况(个人身体)代码表(GB/T 2261.4)"/>
                </occupation>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${cInpatientMedicalRecordHomepage.医疗机构组织机构代码!'医疗机构组织机构代码'}"/>
                <name>${cInpatientMedicalRecordHomepage.医疗机构名称!'医疗机构名称'}</name>
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
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>${cInpatientMedicalRecordHomepage.医疗机构名称!'医疗机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <legalAuthenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="科主任"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.科主任签名!'科主任签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主任医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.主任医师签名!'主任医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主治医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.主治医师签名!'主治医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="住院医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.住院医师签名!'住院医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="责任护士"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.责任护士签名!'责任护士签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="进修医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.进修医师签名!'进修医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="实习医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.实习医师签名!'实习医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="编码员"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.编码员签名!'编码员签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 其他联系人 -->
    <participant typeCode="NOT">
        <associatedEntity classCode="ECON">
            <code code="${cInpatientMedicalRecordHomepage.联系人与患者的关系代码!'联系人与患者的关系代码'}" codeSystem="2.16.156.10011.2.3.3.8" displayName="${cInpatientMedicalRecordHomepage.联系人与患者的关系!'联系人与患者的关系'}" codeSystemName="家庭关系代码表(GB/T 4761)"/>
            <!-- 联系人地址 -->
            <addr use="H">
                <houseNumber>${cInpatientMedicalRecordHomepage.联系人地址_门牌号码!'联系人地址_门牌号码'}</houseNumber>
                <streetName>${cInpatientMedicalRecordHomepage.联系人地址_村!'联系人地址_村'}</streetName>
                <township>${cInpatientMedicalRecordHomepage.联系人地址_乡!'联系人地址_乡'}</township>
                <county>${cInpatientMedicalRecordHomepage.联系人地址_县!'联系人地址_县'}</county>
                <city>${cInpatientMedicalRecordHomepage.联系人地址_市!'联系人地址_市'}</city>
                <state>${cInpatientMedicalRecordHomepage.联系人地址_省!'联系人地址_省'}</state>
                <postalCode>${cInpatientMedicalRecordHomepage.现住址_省!'现住址_省'}</postalCode>
            </addr>
            <telecom use="H" value="${cInpatientMedicalRecordHomepage.联系人电话号码!'联系人电话号码'}"/>
            <associatedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${cInpatientMedicalRecordHomepage.联系人姓名!'联系人姓名'}</name>
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

    <componentOf typeCode="COMP">
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <code code="${cInpatientMedicalRecordHomepage.入院途径代码!'入院途径代码'}" displayName="${cInpatientMedicalRecordHomepage.入院途径!'入院途径'}" codeSystem="2.16.156.10011.2.3.1.270" codeSystemName="入院途径代码表"/>
            <effectiveTime>
                <low value="${cInpatientMedicalRecordHomepage.入院日期时间!'入院日期时间'}"/>
                <high value="${cInpatientMedicalRecordHomepage.出院日期时间!'出院日期时间'}"/>
            </effectiveTime>
            <location typeCode="LOC">
                <healthCareFacility classCode="SDLOC">
                    <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${cInpatientMedicalRecordHomepage.入院病房!'入院病房'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${cInpatientMedicalRecordHomepage.入院科别!'入院科别'}</name>
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
            <!-- 生命体征 -->
            <component>
                <section>
                    <code code="8716-3" displayName="VITAL SIGNS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.019.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="新生儿入院体重(g)"/>
                            <value xsi:type="PQ" value="${cInpatientMedicalRecordHomepage.新生儿入院体重!'新生儿入院体重'}" unit="g"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.019.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="新生儿出生体重(g)"/>
                            <value xsi:type="PQ" value="${cInpatientMedicalRecordHomepage.新生儿出生体重!'新生儿出生体重'}" unit="g"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 诊断记录 -->
            <component>
                <section>
                    <code code="29548-5" displayName="Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门诊急诊(中医诊断)名称">
                                        <qualifier>
                                            <name displayName="中医诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.门急诊诊断中医诊断名称!'门急诊诊断中医诊断名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门诊急诊(中医诊断)病名编码">
                                        <qualifier>
                                            <name displayName="中医诊断代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.门急诊诊断中医诊断病名编码!'门急诊诊断中医诊断病名编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${cInpatientMedicalRecordHomepage.门急诊诊断中医诊断病名名称!'门急诊诊断中医诊断病名名称'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(中医证候)名称">
                                        <qualifier>
                                            <name displayName="中医证候名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.门急诊诊断中医证候名称!'门急诊诊断中医证候名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(中医证候)证候编码">
                                        <qualifier>
                                            <name displayName="中医证候代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.门急诊诊断中医证候证候编码!'门急诊诊断中医证候证候编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医证候代码表(GB/T 15657-1995)" displayName="${cInpatientMedicalRecordHomepage.门急诊诊断中医证候名称!'门急诊诊断中医证候名称'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 门急诊 西医诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(西医诊断)名称">
                                        <qualifier>
                                            <name displayName="西医诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.门急诊诊断西医诊断名称!'门急诊诊断西医诊断名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="门急诊诊断(西医诊断)疾病编码">
                                        <qualifier>
                                            <name displayName="西医诊断代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.门急诊诊断西医诊断疾病编码!'门急诊诊断西医诊断疾病编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="ICD-10" displayName="${cInpatientMedicalRecordHomepage.门急诊诊断西医诊断疾病名称!'门急诊诊断西医诊断疾病名称'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 病理诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <id root="2.16.156.10011.1.8" extension=""/>
                                    <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="病理诊断名称">
                                        <qualifier>
                                            <name displayName="病理诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.病理诊断名称!'病理诊断名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="病理诊断编码">
                                        <qualifier>
                                            <name displayName="中医证候代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.病理诊断疾病编码!'病理诊断疾病编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="ICD-10" displayName="${cInpatientMedicalRecordHomepage.病理诊断疾病!'病理诊断疾病'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 主要问题 -->
            <component>
                <section>
                    <code code="11450-4" displayName="Problem list" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.304.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="治疗类别"/>
                            <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.治疗类别代码!'治疗类别代码'}" codeSystem="2.16.156.10011.2.3.3.14" codeSystemName="治疗类别代码表"
                                   displayName="${cInpatientMedicalRecordHomepage.治疗类别!'治疗类别'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSDOO.12.099" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="实施临床路径"/>
                            <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.实施临床路径标志代码!'实施临床路径标志代码'}" codeSystem="2.16.156.10011.2.3.2.57"
                                   codeSystemName="实施临床路径标志代码表" displayName="${cInpatientMedicalRecordHomepage.实施临床路径标志!'实施临床路径标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="住院者疾病状态代码"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.1.100"
                                   codeSystemName="住院者疾病状态代码表" displayName=""/>
                        </observation>
                    </entry>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.152.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="损伤中毒的外部原因"/>
                            <value xsi:type="ST">${cInpatientMedicalRecordHomepage.损伤中毒的外部原因!'损伤中毒的外部原因'}</value>
                            <entryRelationship typeCode="REFR" negationInd="false">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.078.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="损伤中毒的外部原因-疾病编码"/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.损伤中毒的外部原因疾病编码!'损伤中毒的外部原因疾病编码'}" displayName="${cInpatientMedicalRecordHomepage.损伤中毒的外部原因疾病!'损伤中毒的外部原因疾病'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <!-- 颅脑损伤患者入院 -->
                    <entry typeCode="COMP">
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.01" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院前昏迷时间-d"/>
                                    <value xsi:type="PQ" unit="d" value="${cInpatientMedicalRecordHomepage.颅脑损伤患者入院前昏迷时间D!'颅脑损伤患者入院前昏迷时间D'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.02" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院前昏迷时间-h"/>
                                    <value xsi:type="PQ" unit="h" value="${cInpatientMedicalRecordHomepage.颅脑损伤患者入院前昏迷时间H!'颅脑损伤患者入院前昏迷时间H'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.03" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院前昏迷时间-min"/>
                                    <value xsi:type="PQ" unit="min" value="${cInpatientMedicalRecordHomepage.颅脑损伤患者入院前昏迷时间M!'颅脑损伤患者入院前昏迷时间M'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 颅脑损伤患者入院后昏迷时间 -->
                    <entry typeCode="COMP">
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.01" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院后昏迷时间-d"/>
                                    <value xsi:type="PQ" unit="d" value="${cInpatientMedicalRecordHomepage.颅脑损伤患者入院后昏迷时间D!'颅脑损伤患者入院后昏迷时间D'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.02" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院后昏迷时间-h"/>
                                    <value xsi:type="PQ" unit="h" value="${cInpatientMedicalRecordHomepage.颅脑损伤患者入院后昏迷时间H!'颅脑损伤患者入院后昏迷时间H'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.138.03" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="颅脑损伤患者入院后昏迷时间-min"/>
                                    <value xsi:type="PQ" unit="min" value="${cInpatientMedicalRecordHomepage.颅脑损伤患者入院后昏迷时间M!'颅脑损伤患者入院后昏迷时间M'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 转科记录 -->
            <component>
                <section>
                    <code code="42349-1" displayName="REASON FOR REFERRAL" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 转科条目 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code/>
                            <!-- 转科原因 -->
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id/>
                                    <representedOrganization>
                                        <!-- 转科科室 -->
                                        <name>${cInpatientMedicalRecordHomepage.转科科别!'转科科别'}</name>
                                    </representedOrganization>
                                </assignedAuthor>
                            </author>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 出院诊断 -->
            <component>
                <section>
                    <code code="11535-2" displayName="Discharge Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主病名称">
                                        <qualifier>
                                            <name displayName="主病名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.出院中医诊断_主病名称!'出院中医诊断_主病名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主病编码">
                                        <qualifier>
                                            <name displayName="主病代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.出院中医诊断_主病编码!'出院中医诊断_主病编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${cInpatientMedicalRecordHomepage.出院中医诊断_主病名称!'出院中医诊断_主病名称'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主病-入院病情代码">
                                        <qualifier>
                                            <name displayName="中医主病入院病情"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.出院中医诊断_主病_入院病情代码!'出院中医诊断_主病_入院病情代码'}" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName="${cInpatientMedicalRecordHomepage.出院中医诊断_主病_入院病情!'出院中医诊断_主病_入院病情'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 出院中医主证诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主症名称">
                                        <qualifier>
                                            <name displayName="主症名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.出院中医诊断_主证名称!'出院中医诊断_主证名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主症代码">
                                        <qualifier>
                                            <name displayName="主症代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.出院中医诊断_主证编码!'出院中医诊断_主证编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${cInpatientMedicalRecordHomepage.出院中医诊断_主证名称!'出院中医诊断_主证名称'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院中医诊断-主症-入院病情代码">
                                        <qualifier>
                                            <name displayName="中医主症入院病情"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.出院中医诊断_主证_入院病情代码!'出院中医诊断_主证_入院病情代码'}" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName="${cInpatientMedicalRecordHomepage.出院中医诊断_主证_入院病情!'出院中医诊断_主证_入院病情'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 出院西医主要诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-疾病名称">
                                        <qualifier>
                                            <name displayName="主要诊断-疾病名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.出院西医诊断_主要诊断名称!'出院西医诊断_主要诊断名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-疾病编码">
                                        <qualifier>
                                            <name displayName="主要诊断疾病代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.出院西医诊断_主要诊断疾病编码!'出院西医诊断_主要诊断疾病编码'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="主要诊断疾病代码表(ICD-10)" displayName="${cInpatientMedicalRecordHomepage.出院西医诊断_住院诊断疾病名称!'出院西医诊断_住院诊断疾病名称'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-主要诊断-入院病情代码">
                                        <qualifier>
                                            <name displayName="入院病情代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName="${cInpatientMedicalRecordHomepage.出院西医诊断_主要诊断入院病情!'出院西医诊断_主要诊断入院病情'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 西医出院诊断 其他诊断 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-其他诊断名称">
                                        <qualifier>
                                            <name displayName="其他诊断名称"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.出院西医诊断_其他诊断名称!'出院西医诊断_其他诊断名称'}</value>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-其他诊断疾病编码">
                                        <qualifier>
                                            <name displayName="其他诊断疾病编码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.出院西医诊断_其他诊断疾病编码!'出院西医诊断_其他诊断疾病编码'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="ICD-10" displayName="${cInpatientMedicalRecordHomepage.出院西医诊断_其他诊断疾病名称!'出院西医诊断_其他诊断疾病名称'}"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE09.00.104.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院西医诊断-其他诊断-入院病情代码">
                                        <qualifier>
                                            <name displayName="其他诊断-入院病情代码"></name>
                                        </qualifier>
                                    </code>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.253"
                                           codeSystemName="入院病情代码表" displayName="${cInpatientMedicalRecordHomepage.出院西医诊断_其他诊断入院病情!'出院西医诊断_其他诊断入院病情'}"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 离院方式 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.223.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="离院方式"/>
                            <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.离院方式代码!'离院方式代码'}" codeSystem="2.16.156.10011.2.3.3.1.265"
                                   codeSystemName="离院方式代码表" displayName="${cInpatientMedicalRecordHomepage.离院方式!'离院方式'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.10.013.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="拟接受医疗机构名称"/>
                            <value xsi:type="ST">${cInpatientMedicalRecordHomepage.拟接收医疗机构名称!'拟接收医疗机构名称'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 过敏史 -->
            <component>
                <section>
                    <code code="48765-2" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"
                          displayName="Allergies,adverse reactions,alerts"/>
                    <text/>
                    <entry typeCode="DRIV">
                        <act classCode="ACT" moodCode="EVN">
                            <code/>
                            <entryRelationship typeCode="SUBJ">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.023.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.药物过敏标志!'药物过敏标志'}"/>
                                    <participant typeCode="CSM">
                                        <partivipantRole classCode="MANU">
                                            <playingEntity classCode="MMAT">
                                                <code code="DE02.10.022.00" codeSystem="2.16.156.10011.2.2.1"
                                                      codeSystemName="卫生信息数据元目录" displayName="过敏药物"/>
                                                <desc xsi:type="ST">${cInpatientMedicalRecordHomepage.过敏药物!'过敏药物'}</desc>
                                            </playingEntity>
                                        </partivipantRole>
                                    </participant>
                                </observation>
                            </entryRelationship>
                        </act>
                    </entry>
                </section>
            </component>
            <!-- 实验室检验 -->
            <component>
                <section>
                    <code code="30954-2" displayName="STUDIES SUMMARY" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry typeCode="COMP">
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component typeCode="COMP" contextConductionInd="true">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.001.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.ABO血型代码!'ABO血型代码'}" codeSystem="2.16.156.10011.2.3.1.85"
                                           codeSystemName="ABO血型代码表" displayName="${cInpatientMedicalRecordHomepage.ABO血型!'ABO血型'}"/>
                                </observation>
                            </component>
                            <component typeCode="COMP" contextConductionInd="true">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.010.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.RH血型代码!'RH血型代码'}" codeSystem="2.16.156.10011.2.3.1.85"
                                           codeSystemName="Rh血型代码表" displayName="${cInpatientMedicalRecordHomepage.RH血型!'RH血型'}"/>
                                </observation>
                            </component>
                        </organizer>
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
                            <code code="${cInpatientMedicalRecordHomepage.手术及操作编码!'手术及操作编码'}" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术操作代码表(ICD-9-CM)"
                                  displayName="${cInpatientMedicalRecordHomepage.手术及操作名称!'手术及操作名称'}"/>
                            <statusCode/>
                            <effectiveTime value="${cInpatientMedicalRecordHomepage.手术及操作日期!'手术及操作日期'}"/>
                            <performer>
                                <assignedEntity>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <assignedPerson>
                                        <name>${cInpatientMedicalRecordHomepage.手术者姓名!'手术者姓名'}</name>
                                    </assignedPerson>
                                </assignedEntity>
                            </performer>
                            <!-- 第一助手 -->
                            <participant typeCode="ATND">
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="第一助手"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${cInpatientMedicalRecordHomepage.Ｉ助姓名!'Ⅰ助姓名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <participant typeCode="ATND">
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="第二助手"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${cInpatientMedicalRecordHomepage.II助姓名!'Ⅱ助姓名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.094.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术操作名称"/>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.手术及操作名称!'手术及操作名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.255.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术级别"/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.手术级别代码!'手术级别代码'}" displayName="${cInpatientMedicalRecordHomepage.手术级别!'手术级别'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="手术级别代码表"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.257.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术切口类别代码表"/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.手术切口类别代码!'手术切口类别代码'}" displayName="${cInpatientMedicalRecordHomepage.手术切口类别!'手术切口类别'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="手术切口类别代码表"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.147.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术切口愈合等级"/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.手术切口愈合等级代码!'手术切口愈合等级代码'}" displayName="${cInpatientMedicalRecordHomepage.手术切口愈合等级!'手术切口愈合等级'}" codeSystem="2.16.156.10011.2.3.1.257"
                                           codeSystemName="手术切口愈合等级代码表"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="麻醉方法代码"/>
                                    <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.麻醉方式代码!'麻醉方式代码'}" displayName="${cInpatientMedicalRecordHomepage.麻醉方式!'麻醉方式'}" codeSystem="2.16.156.10011.2.3.1.159"
                                           codeSystemName="麻醉方法代码表"/>
                                    <performer>
                                        <assignedEntity>
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <assignedPerson>
                                                <name>${cInpatientMedicalRecordHomepage.麻醉医师姓名!'麻醉医师姓名'}</name>
                                            </assignedPerson>
                                        </assignedEntity>
                                    </performer>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!-- 既往史 -->
            <component>
                <section>
                    <code code="11336-5" displayName="HISTORY OF HOSPITALIZATIONS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.090.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="住院次数"/>
                            <value xsi:type="PQ" unit="次" value="${cInpatientMedicalRecordHomepage.住院次数!'住院次数'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 行政管理 -->
            <component>
                <section>
                    <code displayName="行政管理"/>
                    <text/>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.108.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="死亡患者尸检标志"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.死亡患者尸检标志!'死亡患者尸检标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.103.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="病案质量"/>
                            <effectiveTime xsi:type="IVL_T" value="${cInpatientMedicalRecordHomepage.质控日期!'质控日期'}"></effectiveTime>
                            <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.病案质量代码!'病案质量代码'}" displayName="${cInpatientMedicalRecordHomepage.病案质量!'病案质量'}" codeSystem="2.16.156.10011.2.3.2.29"
                                   codeSystemName="病案质量等级表"/>
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="质控医生"/>
                                    <assignedPerson>
                                        <name>${cInpatientMedicalRecordHomepage.质控医师签名!'质控医师签名'}</name>
                                    </assignedPerson>
                                </assignedAuthor>
                            </author>
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="质控护士"/>
                                    <assignedPerson>
                                        <name>${cInpatientMedicalRecordHomepage.质控护士签名!'质控护士签名'}</name>
                                    </assignedPerson>
                                </assignedAuthor>
                            </author>
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
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.310.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="实际住院天数"/>
                            <value xsi:type="PQ" unit="天" value="${cInpatientMedicalRecordHomepage.实际住院天数!'实际住院天数'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <act classCode="ACT" moodCode="EVN">
                            <code/>
                            <author>
                                <time/>
                                <assignedAuthor>
                                    <id/>
                                    <representedOrganization>
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${cInpatientMedicalRecordHomepage.出院病房!'出院病房'}</name>
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${cInpatientMedicalRecordHomepage.出院科别!'出院科别'}</name>
                                            </wholeOrganization>
                                        </asOrganizationPartOf>
                                    </representedOrganization>
                                </assignedAuthor>
                            </author>
                        </act>
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
                            <code code="DE06.00.194.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="出院31d内在住院标志"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.出院31天内再住院标志!'出院31天内再住院标志'}"/>
                            <entryRelationship typeCode="GEVL" negationInd="false">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.195.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="出院31d再住院目的"/>
                                    <value xsi:type="ST">${cInpatientMedicalRecordHomepage.出院31天内再住院目的!'出院31天内再住院目的'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 费用 -->
            <component>
                <section>
                    <code code="48768-6" displayName="PAYMENT SOURCES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE07.00.007.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="医疗付款方式代码"/>
                            <value xsi:type="CD" code="${cInpatientMedicalRecordHomepage.医疗付费方式代码!'医疗付费方式代码'}" displayName="${cInpatientMedicalRecordHomepage.医疗付费方式!'医疗付费方式'}" codeSystem="2.16.156.10011.2.3.1.269"
                                   codeSystemName="医疗付费方式代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSD00.12.169" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="住院总费用"/>
                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.住院总费用!'住院总费用'}" currency="元"/>
                            <entryRelationship typeCode="COMP" negationInd="false">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.170" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="住院总费用-自付金额(元)"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.住院总费用_自付金额!'住院总费用_自付金额'}" currency="元"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.174" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.综合医疗服务类_一般医疗服务费!'综合医疗服务类_一般医疗服务费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.175" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费-中医辩证论治费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.综合医疗服务类_中医辩证论治费!'综合医疗服务类_中医辩证论治费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.176" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费-中医辩证论治会诊费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.综合医疗服务类_中医辩证会诊费!'综合医疗服务类_中医辩证会诊费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.177" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-一般医疗服务费-一般治疗操作费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.综合医疗服务类_一般治疗操作费!'综合医疗服务类_一般治疗操作费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.172" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-护理费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.综合医疗服务类_护理费!'综合医疗服务类_护理费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.173" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="综合医疗服务费-其他费用"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.综合医疗服务类_其他费用!'综合医疗服务类_其他费用'}" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 诊断费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.136" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-病理诊断费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.诊断类_病理诊断费!'诊断类_病理诊断费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.138" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-实验室诊断费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.诊断类_实验室诊断费!'诊断类_实验室诊断费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.139" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-影像学诊断费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.诊断类_影像学诊断费!'诊断类_影像学诊断费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.137" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="诊断-临床诊断项目费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.诊断类_临床诊断项目费!'诊断类_临床诊断项目费'}" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 治疗服务费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.145" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="治疗-非手术治疗项目费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.治疗类_非手术治疗项目费!'治疗类_非手术治疗项目费'}" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.146" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="治疗-非手术治疗项目费-临床物理治疗费"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.治疗类_非手术_临床物理治疗费!'治疗类_非手术_临床物理治疗费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.147" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="治疗-手术治疗项目费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.治疗类_手术治疗费!'治疗类_手术治疗费'}" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.148" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="治疗-手术治疗费-麻醉费"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.治疗类_手术治疗费_麻醉费!'治疗类_手术治疗费_麻醉费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.149" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="治疗-手术治疗费-手术费"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.治疗类_手术治疗费_手术费!'治疗类_手术治疗费_手术费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 康复费类服务费 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSD00.12.062" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="康复费"/>
                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.康复类_康复费!'康复类_康复费'}" currency="元"/>
                        </observation>
                    </entry>
                    <!-- 以下三条标识类 true or false -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.243.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="使用医疗机构中药制剂"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.使用医疗机构中药制剂标志!'使用医疗机构中药制剂标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.245.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="使用中医诊疗技术标志"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.使用中医诊疗技术标志!'使用中医诊疗技术标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.180.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="辩证施护标志"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.辨证施护标志!'辨证施护标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.156" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中医诊断费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医诊断费!'中医类_中医诊断费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.157" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中医治疗费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费!'中医类_中医治疗费'}" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.163" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医外治"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费_中医外治费!'中医类_中医治疗费_中医外治费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.160" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医骨伤"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费_中医骨伤费!'中医类_中医治疗费_中医骨伤费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.158" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-针刺与灸法"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费_针刺与灸法费!'中医类_中医治疗费_针刺与灸法费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.162" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医推拿治疗"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费_中医推拿治疗!'中医类_中医治疗费_中医推拿治疗'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.159" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医肛肠治疗"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费_中医肛肠治疗!'中医类_中医治疗费_中医肛肠治疗'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.161" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-中医特殊治疗"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医治疗费_中医特殊治疗!'中医类_中医治疗费_中医特殊治疗'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.153" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中医其他治疗费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医其他费!'中医类_中医其他费'}" currency="元"/>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.155" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医其他费-中药特殊调配加工"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医其他费_调配加工费!'中医类_中医其他费_调配加工费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="HDSD00.12.154" codeSystem="2.16.156.10011.2.2.4"
                                                  codeSystemName="住院病案首页基本数据集" displayName="中医类-中医治疗费-辩证施膳"/>
                                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中医类_中医其他费_辩证施膳费!'中医类_中医其他费_辩证施膳费'}" currency="元"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 西药费 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDSD00.12.113" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="西药费"/>
                            <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.西药类_西药费!'西药类_西药费'}" currency="元"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.114" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="西药费-抗菌药物费用"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.西药类_西药费_抗菌药物费用!'西药类_西药费_抗菌药物费用'}" currency="元"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <!-- 中药费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.151" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中药费-中成药费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中药类_中成药费!'中药类_中成药费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.150" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="中药费-中草药费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.中药类_中草药费!'中药类_中草药费'}" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 血液和血液制品类服务费 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.130" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="血费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.血液和血液制品类_血费!'血液和血液制品类_血费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.126" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="白蛋白类制品费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.血液和血液制品类_白蛋白类费!'血液和血液制品类_白蛋白类费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.128" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="球蛋白类制品费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.血液和血液制品类_球蛋白类费!'血液和血液制品类_球蛋白类费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.127" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="凝血因子类制品费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.血液和血液制品类_凝血因子类费!'血液和血液制品类_凝血因子类费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.129" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="细胞白类制品费"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.血液和血液制品类_细胞因子类费!'血液和血液制品类_细胞因子类费'}" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 使用中医诊疗设备标志 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.244.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="使用中医诊疗设备标志"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.使用中医诊疗设备标志!'使用中医诊疗设备标志'}"/>
                        </observation>
                    </entry>
                    <!-- 耗材类费用 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.045" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="一次性医用材料费-检查费用"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.耗材类_检查用一次性医用材料费!'耗材类_检查用一次性医用材料费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.047" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="一次性医用材料费-治疗用"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.耗材类_治疗用一次性医用材料费!'耗材类_治疗用一次性医用材料费'}" currency="元"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="HDSD00.12.046" codeSystem="2.16.156.10011.2.2.4"
                                          codeSystemName="住院病案首页基本数据集" displayName="一次性医用材料费-手术用"/>
                                    <value xsi:type="MO" value="${cInpatientMedicalRecordHomepage.耗材类_手术用一次性医用材料费!'耗材类_手术用一次性医用材料费'}" currency="元"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 其他费 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="HDS00.12.092" codeSystem="2.16.156.10011.2.2.4" codeSystemName="住院病案首页基本数据集"
                                  displayName="其他费"/>
                            <value xsi:type="BL" value="${cInpatientMedicalRecordHomepage.其他类_其他费!'其他类_其他费'}"/>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>