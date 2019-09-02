<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.54"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0034" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>入院记录</title>
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
            <id root="2.16.156.10011.1.12" extension="${admissionRecord.住院号!'住院号'}"/>
            <addr use="H">
                <houseNumber>${admissionRecord.地址_门牌号码!'地址_门牌号码'}</houseNumber>
                <streetName>${admissionRecord.地址_村!'地址_村'}</streetName>
                <township>${admissionRecord.地址_乡!'地址_乡'}</township>
                <county>${admissionRecord.地址_县!'地址_县'}</county>
                <city>${admissionRecord.地址_市!'地址_市'}</city>
                <state>${admissionRecord.地址_省!'地址_省'}</state>
            </addr>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <maritalStatusCode code="${admissionRecord.婚姻状况代码!'婚姻状况代码'}" displayName="${admissionRecord.婚姻状况!'婚姻状况'}" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <ethnicGroupCode code="${admissionRecord.民族!'民族'}" displayName="${admissionRecord.民族名称!'民族名称'}" codeSystem="2.16.156.10011.2.3.3.3"
                                 codeSystemName="民族类别代码表(GB/T 3304)"/>
                <age value="" unit="岁"/>
                <occupation>
                    <occupationCode code="${admissionRecord.职业类别代码!'职业类别代码'}" displayName="${admissionRecord.职业类别!'职业类别'}" codeSystem="2.16.156.10011.2.3.3.13"
                                    codeSystemName="从业状况(个人身体)代码表(GB/T 2261.4)"/>
                </occupation>
            </patient>
        </patientRole>
    </recordTarget>

    <author typeCode="AUT" contextControlCode="OP">
        <time xsi:type="TS" value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>

    <informant>
        <assignedEntity>
            <id root="2.16.156.10011.1.3" extension=""/>
            <code code="${admissionRecord.陈述者与患者的关系代码!'陈述者与患者的关系代码'}" displayName="${admissionRecord.陈述者与患者的关系!'陈述者与患者的关系'}" codeSystem="2.16.156.10011.2.3.3.8" codeSystemName="家庭关系代码表(GB/T 4761)"/>
            <assignedPerson>
                <name>${admissionRecord.病史陈述者姓名!'病史陈述者姓名'}</name>
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
                <name>${admissionRecord.主任医师签名!'主任医师签名'}</name>
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
                <name>${admissionRecord.接诊医师签名!'接诊医师签名'}</name>
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
                <name>${admissionRecord.住院医师签名!'住院医师签名'}</name>
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
                <name>${admissionRecord.主治医师签名!'主治医师签名'}</name>
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
            <effectiveTime/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name>${admissionRecord.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${admissionRecord.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${admissionRecord.科室名称!'科室名称'}</name>
                                                <!-- 病区 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${admissionRecord.病区名称!'病区名称'}</name>
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
                            <value xsi:type="ST">${admissionRecord.主诉!'主诉'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 现病史 -->
            <component>
                <section>
                    <code code="10164-2" displayName="HISTORY OF PRESENT ILLNESS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.071.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="现病史"/>
                            <value xsi:type="ST">${admissionRecord.现病史!'现病史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 既往史 -->
            <component>
                <section>
                    <code code="11348-0" displayName="HISTORY OF PAST ILLNESS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.031.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="一般健康状况标志"/>
                            <value xsi:type="BL" value="${admissionRecord.一般健康状况标志!'一般健康状况标志'}"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.026.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="疾病史(含外伤)"/>
                                    <value xsi:type="ST">${admissionRecord.疾病史!'疾病史'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="患者传染性标志"/>
                            <value xsi:type="BL" value="${admissionRecord.患者传染性标志!'患者传染性标志'}"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.008.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="传染病史"/>
                                    <value xsi:type="ST">${admissionRecord.传染病史!'传染病史'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.098.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="婚育史"/>
                            <value xsi:type="ST">${admissionRecord.婚育史!'婚育史'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.022.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="过敏史"/>
                            <value xsi:type="ST">${admissionRecord.过敏史!'过敏史'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.061.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术史"/>
                            <value xsi:type="ST">${admissionRecord.手术史!'手术史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 预防接种 -->
            <component>
                <section>
                    <code code="11369-6" displayName="HISTORY OF IMMUNIZATIONS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.101.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="预防接种史"/>
                            <value xsi:type="ST">${admissionRecord.预防接种史!'预防接种史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 输血 -->
            <component>
                <section>
                    <code code="56836-0" displayName="History of blood transfusion" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.100.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="输血史"/>
                            <value xsi:type="ST">${admissionRecord.输血史!'输血史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 个人史 -->
            <component>
                <section>
                    <code code="29762-2" displayName="Social history" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.097.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="个人史"/>
                            <value xsi:type="ST">${admissionRecord.个人史!'个人史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 月经史 -->
            <component>
                <section>
                    <code code="49033-4" displayName="Menstrual History" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.102.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="月经史"/>
                            <value xsi:type="ST">${admissionRecord.月经史!'月经史'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 家族史 -->
            <component>
                <section>
                    <code code="10157-6" displayName="HISTORY OF FAMILY MEMBER DISEASES"
                          codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.103.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="家族史"/>
                            <value xsi:type="ST">${admissionRecord.家族史!'家族史'}</value>
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
                            <code code="DE04.10.186.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体温(摄氏度)"/>
                            <value xsi:type="PQ" value="${admissionRecord.体格检查_体温!'体格检查_体温'}" unit=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.118.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="脉率(次/min)"/>
                            <value xsi:type="PQ" value="${admissionRecord.体格检查_脉率!'体格检查_脉率'}" unit=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.082.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="呼吸频率(次/min)"/>
                            <value xsi:type="PQ" value="${admissionRecord.体格检查_呼吸频率!'体格检查_呼吸频率'}" unit=""/>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <code displayName="血压"/>
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.10.174.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="收缩压"/>
                                    <value xsi:type="PQ" value="${admissionRecord.体格检查_收缩压!'体格检查_收缩压'}" unit=""/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.10.176.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="舒张压"/>
                                    <value xsi:type="PQ" value="${admissionRecord.体格检查_舒张压!'体格检查_舒张压'}" unit=""/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.167.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="身高(cm)"/>
                            <value xsi:type="PQ" value="${admissionRecord.体格检查_身高!'体格检查_身高'}" unit=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.188.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体重(kg)"/>
                            <value xsi:type="PQ" value="${admissionRecord.体格检查_体重!'体格检查_体重'}" unit=""/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 体格检查 -->
            <component>
                <section>
                    <code code="29545-1" displayName="PHYSICAL EXAMINATION" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.219.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="一般状况检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_一般状况检查结果!'体格检查_一般状况检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.126.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="皮肤和粘膜检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_皮肤和粘膜检查结果!'体格检查_皮肤和粘膜检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.114.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="全身浅表淋巴结检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_浅表淋巴结检查结果!'体格检查_浅表淋巴结检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.261.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="头部及其器官检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_头部及其器官检查结果!'体格检查_头部及其器官检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.255.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="颈部检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_颈部检查结果!'体格检查_颈部检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.263.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="胸部检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_胸部检查结果!'体格检查_胸部检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.046.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="腹部检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_腹部检查结果!'体格检查_腹部检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.065.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="肛门指诊检查结果描述"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_肛门指诊检查结果描述!'体格检查_肛门指诊检查结果描述'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.195.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="外生殖器检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_外生殖器检查结果!'体格检查_外生殖器检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.093.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="脊柱检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_脊柱检查结果!'体格检查_脊柱检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.179.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="四肢检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_四肢检查结果!'体格检查_四肢检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.149.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="神经系统检查结果"/>
                            <value xsi:type="ST">${admissionRecord.体格检查_神经系统检查结果!'体格检查_神经系统检查结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.10.061.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="转科情况"/>
                            <value xsi:type="ST">${admissionRecord.专科情况!'专科情况'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 辅助检查 -->
            <component>
                <section>
                    <code displayName="辅助检查"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.009.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="辅助检查结果"/>
                            <value xsi:type="ST">${admissionRecord.辅助检查结果!'辅助检查结果'}</value>
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
                            <value xsi:type="BL" value="${admissionRecord.陈述内容可靠标志!'陈述内容可靠标志'}"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="初步诊断-西医诊断名称"/>
                            <effectiveTime value="${admissionRecord.初步诊断日期!'初步诊断日期'}"/>
                            <value xsi:type="ST">${admissionRecord.初步诊断_西医诊断名称!'初步诊断_西医诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="初步诊断-西医诊断编码"/>
                                    <value xsi:type="CD" code="${admissionRecord.初步诊断_西医诊断编码!'初步诊断_西医诊断编码'}" displayName="${admissionRecord.初步诊断_西医诊断名称!'初步诊断_西医诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.028.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="中医四诊观察结果"/>
                            <value xsi:type="ST">${admissionRecord.中医四诊观察结果!'中医四诊观察结果'}</value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="初步诊断-中医病名名称"></code>
                            <value xsi:type="ST">${admissionRecord.初步诊断_中医病名名称!'初步诊断_中医病名名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="初步诊断-中医病名代码"/>
                                    <value xsi:type="CD" code="${admissionRecord.初步诊断_中医病名代码!'初步诊断_中医病名代码'}" displayName="${admissionRecord.初步诊断_中医病名名称!'初步诊断_中医病名名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="初步诊断-中医证候名称"/>
                                    <value xsi:type="ST">${admissionRecord.初步诊断_中医证候名称!'初步诊断_中医证候名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="初步诊断-中医证候代码"/>
                                    <value xsi:type="CD" code="${admissionRecord.初步诊断_中医证候代码!'初步诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${admissionRecord.初步诊断_中医证候名称!'初步诊断_中医证候名称'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="修正诊断-西医诊断名称"/>
                            <effectiveTime value="${admissionRecord.修正诊断日期!'修正诊断日期'}"/>
                            <value xsi:type="ST">${admissionRecord.修正诊断_西医诊断名称!'修正诊断_西医诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="初步诊断-西医诊断编码"/>
                                    <value xsi:type="CD" code="${admissionRecord.修正诊断_西医诊断编码!'修正诊断_西医诊断编码'}" displayName="${admissionRecord.修正诊断_西医诊断名称!'修正诊断_西医诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="修正诊断-中医病名名称"></code>
                            <value xsi:type="ST">${admissionRecord.修正诊断_中医病名名称!'修正诊断_中医病名名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="修正诊断-中医病名代码"/>
                                    <value xsi:type="CD" code="${admissionRecord.修正诊断_中医病名代码!'修正诊断_中医病名代码'}" displayName="${admissionRecord.修正诊断_中医病名名称!'修正诊断_中医病名名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="修正诊断-中医证候名称"/>
                                    <value xsi:type="ST">${admissionRecord.修正诊断_中医证候名称!'修正诊断_中医证候名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="修正诊断-中医证候代码"/>
                                    <value xsi:type="CD" code="${admissionRecord.修正诊断_中医证候代码!'修正诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${admissionRecord.修正诊断_中医证候名称!'修正诊断_中医证候名称'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="确定诊断-西医诊断名称"/>
                            <effectiveTime value="${admissionRecord.确定诊断日期!'确定诊断日期'}"/>
                            <value xsi:type="ST">${admissionRecord.确定诊断_西医诊断名称!'确定诊断_西医诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="确定诊断-西医诊断编码"/>
                                    <value xsi:type="CD" code="${admissionRecord.确定诊断_西医诊断编码!'确定诊断_西医诊断编码'}" displayName="${admissionRecord.确定诊断_西医诊断名称!'确定诊断_西医诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="确定诊断-中医病名名称"></code>
                            <effectiveTime value="${admissionRecord.确定诊断日期!'确定诊断日期'}"/>
                            <value xsi:type="ST">${admissionRecord.确定诊断_中医病名名称!'确定诊断_中医病名名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="确定诊断-中医病名代码"/>
                                    <value xsi:type="CD" code="${admissionRecord.确定诊断_中医病名代码!'确定诊断_中医病名代码'}" displayName="${admissionRecord.确定诊断_中医病名名称!'确定诊断_中医病名名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.172.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="确定诊断-中医证候名称"/>
                                    <value xsi:type="ST">${admissionRecord.确定诊断_中医证候名称!'确定诊断_中医证候名称'}</value>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.130.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="确定诊断-中医证候代码"/>
                                    <value xsi:type="CD" code="${admissionRecord.确定诊断_中医证候代码!'确定诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                           codeSystemName="中医病症分类与代码表(GB/T 15657-1995)" displayName="${admissionRecord.确定诊断_中医证候名称!'确定诊断_中医证候名称'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="补充诊断-西医诊断名称"/>
                            <effectiveTime value="${admissionRecord.补充诊断日期!'补充诊断日期'}"/>
                            <value xsi:type="ST">${admissionRecord.补充诊断名称!'补充诊断名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="补充诊断-西医诊断编码"/>
                                    <value xsi:type="CD" code="${admissionRecord.补充诊断编码!'补充诊断编码'}" displayName="${admissionRecord.补充诊断名称!'补充诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="诊断代码表(ICD-10)"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.080.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="入院诊断顺位"/>
                                    <value xsi:type="INT" value="${admissionRecord.入院诊断顺位!'入院诊断顺位'}"/>
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
                            <value xsi:type="ST">${admissionRecord.治则治法!'治则治法'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>