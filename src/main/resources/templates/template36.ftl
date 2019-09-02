<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.56"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0036" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>24小时内入院死亡记录</title>
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
            <id root="2.16.156.10011.1.12" extension="${admissionDeathRecord24H.住院号!'住院号'}"/>
            <addr use="H">
                <houseNumber>${admissionDeathRecord24H.地址_门牌号码!'地址_门牌号码'}</houseNumber>
                <streetName>${admissionDeathRecord24H.地址_村!'地址_村'}</streetName>
                <township>${admissionDeathRecord24H.地址_乡!'地址_乡'}</township>
                <county>${admissionDeathRecord24H.地址_县!'地址_县'}</county>
                <city>${admissionDeathRecord24H.地址_市!'地址_市'}</city>
                <state>${admissionDeathRecord24H.地址_省!'地址_省'}</state>
            </addr>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${admissionDeathRecord24H.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${admissionDeathRecord24H.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${admissionDeathRecord24H.性别!'性别'}"/>
                <maritalStatusCode code="${admissionDeathRecord24H.婚姻状况代码!'婚姻状况代码'}" displayName="${admissionDeathRecord24H.婚姻状况!'婚姻状况'}" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <ethnicGroupCode code="${admissionDeathRecord24H.民族!'民族'}" displayName="${admissionDeathRecord24H.民族名称!'民族名称'}" codeSystem="2.16.156.10011.2.3.3.3"
                                 codeSystemName="民族类别代码表(GB/T 3304)"/>
                <age value="${admissionDeathRecord24H.年龄岁!'年龄岁'}" unit="岁"/>
                <occupation>
                    <occupationCode code="${admissionDeathRecord24H.职业类别代码!'职业类别代码'}" displayName="${admissionDeathRecord24H.职业类别!'职业类别'}" codeSystem="2.16.156.10011.2.3.3.13"
                                    codeSystemName="从业状况(个人身体)代码表(GB/T 2261.4)"/>
                </occupation>
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

    <!-- 病史称述者 -->
    <informant>
        <assignedEntity>
            <id/>
            <code code="${admissionDeathRecord24H.陈述者与患者的关系代码!'陈述者与患者的关系代码'}" displayName="${admissionDeathRecord24H.陈述者与患者的关系!'陈述者与患者的关系'}" codeSystem="2.16.156.10011.2.3.3.8" codeSystemName="家庭关系代码表(GB/T 4761)"/>
            <assignedPerson>
                <name>${admissionDeathRecord24H.病史陈述者姓名!'病史陈述者姓名'}</name>
            </assignedPerson>
        </assignedEntity>
    </informant>

    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <legalAuthenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="主任医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${admissionDeathRecord24H.主任医师签名!'主任医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="接诊医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${admissionDeathRecord24H.接诊医师签名!'接诊医师签名'}</name>
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
                <name>${admissionDeathRecord24H.住院医师签名!'住院医师签名'}</name>
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
                <name>${admissionDeathRecord24H.主治医师签名!'主治医师签名'}</name>
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
            <!-- 入院时间 -->
            <effectiveTime>
                <low value="${admissionDeathRecord24H.入院日期时间!'入院日期时间'}"/>
            </effectiveTime>
        </encompassingEncounter>
    </componentOf>

    <component>
        <structuredBody>
            <!-- 主诉 -->
            <component>
                <section>
                    <code code="10154-3" displayName="CHIEF COMPLAINT" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="主诉"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 主要健康问题 -->
            <component>
                <section>
                    <code code="11450-4" displayName="Problem list" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.143.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="称述内容可靠标志"/>
                            <value xsi:type="BL" value="${admissionDeathRecord24H.陈述内容可靠标志!'陈述内容可靠标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.028.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="中医四诊观察结果"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.中医四诊观察结果!'中医四诊观察结果'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 入院诊断 -->
            <component>
                <section>
                    <code code="46241-6" displayName="HOSPITAL ADMISSION DX" codeSystem="2.16.840.1.113883.6.1"
                    codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院诊断-西医诊断名称"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.入院诊断_西医诊断名称!'入院诊断_西医诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断-西医诊断编码"/>
                                    <value xsi:type="CD" code="${admissionDeathRecord24H.入院诊断_西医诊断编码!'入院诊断_西医诊断编码'}" displayName="${admissionDeathRecord24H.入院诊断_西医诊断名称!'入院诊断_西医诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="鉴别诊断-中医病名名称"></code>
                            <value xsi:type="ST">${admissionDeathRecord24H.入院诊断_中医病名名称!'入院诊断_中医病名名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断-中医病名代码"/>
                                    <value xsi:type="CD" code="${admissionDeathRecord24H.入院诊断_中医病名代码!'入院诊断_中医病名代码'}" displayName="${admissionDeathRecord24H.入院诊断_中医病名名称!'入院诊断_中医病名名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断-中医证候名称"/>
                                    <value xsi:type="ST">${admissionDeathRecord24H.入院诊断_中医证候名称!'入院诊断_中医证候名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断-中医证候代码"/>
                                    <value xsi:type="CD" code="${admissionDeathRecord24H.入院诊断_中医证候代码!'入院诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${admissionDeathRecord24H.入院诊断_中医证候名称!'入院诊断_中医证候名称'}"/>
                                </observation>
                            </entryRelationship>
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
                            <code code="DE06.00.300.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="治则治法"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.治则治法!'治则治法'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 住院过程章节 -->
            <component>
                <section>
                    <code code="8648-8" displayName="Hospital  Course" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.148.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院情况"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.入院情况!'入院情况'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.296.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="诊疗过程描述"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.诊疗过程描述!'诊疗过程描述'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.01.036.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="死亡日期时间"/>
                            <effectiveTime>
                                <high value="${admissionDeathRecord24H.死亡日期时间!'死亡日期时间'}"/>
                            </effectiveTime>
                            <value xsi:type="ST">${admissionDeathRecord24H.死亡日期时间!'死亡日期时间'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.099.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="死亡原因"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.死亡原因!'死亡原因'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="死亡诊断-西医诊断名称"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.死亡诊断_西医诊断名称!'死亡诊断_西医诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="死亡诊断-西医诊断编码"/>
                                    <value xsi:type="CD" code="${admissionDeathRecord24H.死亡诊断_西医诊断编码!'死亡诊断_西医诊断编码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="诊断代码表(ICD-10)" displayName="${admissionDeathRecord24H.死亡诊断_西医诊断名称!'死亡诊断_西医诊断名称'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="死亡诊断-中医病名名称"/>
                            <value xsi:type="ST">${admissionDeathRecord24H.死亡诊断_中医病名名称!'死亡诊断_中医病名名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="死亡诊断-中医病名代码"/>
                                    <value xsi:type="CD" code="${admissionDeathRecord24H.死亡诊断_中医病名代码!'死亡诊断_中医病名代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${admissionDeathRecord24H.死亡诊断_中医病名名称!'死亡诊断_中医病名名称'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="死亡诊断-中医证候名称"/>
                                    <value xsi:type="ST">${admissionDeathRecord24H.死亡诊断_中医证候名称!'死亡诊断_中医证候名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断-中医证候代码"/>
                                    <value xsi:type="CD" code="${admissionDeathRecord24H.死亡诊断_中医证候代码!'死亡诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${admissionDeathRecord24H.死亡诊断_中医证候名称!'死亡诊断_中医证候名称'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>