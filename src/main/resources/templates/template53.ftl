<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.73"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0053" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>出院小结</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <!-- 文档记录对象（患者） -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 健康卡号 -->
            <id root="2.16.156.10011.1.19" extension="${dischargeSummary.居民健康卡号!'居民健康卡号'}"/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${dischargeSummary.住院号!'住院号'}"/>
            <addr use="H">
                <houserNumber>${dischargeSummary.地址_门牌号码!'地址_门牌号码'}</houserNumber>
                <streetName>${dischargeSummary.地址_村!'地址_村'}</streetName>
                <township>${dischargeSummary.地址_乡!'地址_乡'}</township>
                <county>${dischargeSummary.地址_县!'地址_县'}</county>
                <city>${dischargeSummary.地址_市!'地址_市'}</city>
                <state>${dischargeSummary.地址_省!'地址_省'}</state>
                <postalCode>${dischargeSummary.邮政编码!'邮政编码'}</postalCode>
            </addr>
            <!-- 患者电话 -->
            <telecom value="${dischargeSummary.患者电话号码!'患者电话号码'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${dischargeSummary.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${dischargeSummary.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${dischargeSummary.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <!-- 婚姻状况 -->
                <maritalStatusCode code="${dischargeSummary.婚姻状况代码!'婚姻状况代码'}" displayName="${dischargeSummary.婚姻状况!'婚姻状况'}" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <age value="${dischargeSummary.年龄岁!'年龄岁'}" unit="岁"/>
                <!-- 职业 -->
                <occupation>
                    <occupationCode code="${dischargeSummary.职业类别代码!'职业类别代码'}" codeSystem="2.16.156.10011.2.3.3.13" codeSystemName="从业状况(个人身体)代码表"
                                    displayName="${dischargeSummary.职业类别名称!'职业类别名称'}"/>
                </occupation>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>${orgName!'医疗机构名称'}</name>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 文档创作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 文档生成机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <!-- 法定审核者 -->
    <legalAuthenticator typeCode="LA">
        <!-- 签名日期 -->
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <!-- 住院医师 -->
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="住院医师"/>
            <assignedPerson>
                <name>${dischargeSummary.住院医师签名!'住院医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>
    <!-- 文档审核者 -->
    <authenticator typeCode="AUTHEN">
        <time value=""/>
        <signatureCode/>
        <assignedEntity classCode="ASSIGNED">
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="上级医师"/>
            <assignedPerson classCode="PSN">
                <name>${dischargeSummary.上级医师签名!'上级医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>
    <participant typeCode="NOT">
        <!-- 联系人 -->
        <assignedEntity classCode="ECON">
            <telecom value="${dischargeSummary.联系人电话号码!'联系人电话号码'}"/>
            <assignedPerson>
                <name>${dischargeSummary.联系人姓名!'联系人姓名'}</name>
            </assignedPerson>
        </assignedEntity>
    </participant>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>

    <!-- 入院场景记录 -->
    <componentOf typeCode="COMP">
        <!-- 就诊 -->
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <!-- 就诊时间 -->
            <effectiveTime>
                <low value="${dischargeSummary.入院日期时间!'入院日期时间'}"/>
                <high value="${dischargeSummary.出院日期时间!'出院日期时间'}"/>
            </effectiveTime>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <!-- 病床号 -->
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name>${dischargeSummary.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${dischargeSummary.病房号!'病房号'}</name>
                                        <!-- 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${dischargeSummary.科室名称!'科室名称'}</name>
                                                <!-- 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${dischargeSummary.病区名称!'病区名称'}</name>
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

    <!-- Body -->
    <component>
        <structuredBody>
            <!-- 主要健康问题章节 -->
            <component>
                <section>
                    <code code="11450-4" displayName="PROBLEM LIST" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 入院情况条目 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.148.00" displayName="入院情况" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.入院情况!'入院情况'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 入院诊断章节 -->
            <component>
                <section>
                    <code code="46241-6" displayName="HOSPITAL ADMISSION DX" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 入院诊断 西医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" displayName="入院诊断-西医诊断编码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${dischargeSummary.入院诊断_西医诊断编码!'入院诊断_西医诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11.5"
                                   codeSystemName="疾病代码表(ICD-10)"/>
                        </observation>
                    </entry>
                    <!-- 入院诊断 中医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="入院诊断-中医病名代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${dischargeSummary.入院诊断_中医病名代码!'入院诊断_中医病名代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                    <!-- 入院诊断 中医证候 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="入院诊断-中医证候代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${dischargeSummary.入院诊断_中医证候代码!'入院诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 出院诊断章节 -->
            <component>
                <section>
                    <code code="11535-2" displayName="Discharge Diagnosis" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 出院诊断 西医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" displayName="出院诊断-西医诊断编码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${dischargeSummary.出院诊断_西医诊断编码!'出院诊断_西医诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11.5"
                                   codeSystemName="疾病代码表(ICD-10)"/>
                        </observation>
                    </entry>
                    <!-- 出院诊断 中医 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="出院诊断-中医病名代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${dischargeSummary.出院诊断_中医病名代码!'出院诊断_中医病名代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                    <!-- 出院诊断 中医证候 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="出院诊断-中医证候代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${dischargeSummary.出院诊断_中医证候代码!'出院诊断_中医证候代码'}" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病名分类(GB/T 15657)"/>
                        </observation>
                    </entry>
                    <!-- 中医四诊观察结果 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.028.00" displayName="中医'四诊'观察结果" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.中医四诊观察结果!'中医四诊观察结果'}</value>
                        </observation>
                    </entry>
                    <!-- 出院时症状和体征 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.117.00" displayName="出院时症状与体征" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.出院时症状与体征!'出院时症状与体征'}</value>
                        </observation>
                    </entry>
                    <!-- 出院情况 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.193.00" displayName=" 出院情况" codeSystem="2.16.156.10011.2.2.1"
                            codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.出院情况!'出院情况'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 手术操作章节 -->
            <component>
                <section>
                    <code code="47519-4" displayName="HISTORY OF PROCEDURES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 手术记录 -->
                    <entry>
                        <procedure classCode="PROC" moodCode="EVN">
                            <code code="" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                            <statusCode/>
                            <effectiveTime value="${dischargeSummary.手术及操作开始日期时间!'手术及操作开始日期时间'}"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.257.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术切口类别代码"/>
                                    <value xsi:type="CD" code="${dischargeSummary.手术切口类别代码!'手术切口类别代码'}" codeSystem="2.16.156.10011.2.3.1.251"
                                           codeSystemName="手术切口类别代码"/>
                                </observation>
                            </entryRelationship>
                            <!-- 切口愈合等级 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.147.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="切口愈合等级代码"/>
                                    <value xsi:type="CD" code="${dischargeSummary.手术切口愈合等级代码!'手术切口愈合等级代码'}" displayName="${dischargeSummary.手术切口愈合等级!'手术切口愈合等级'}" codeSystem="2.16.156.10011.2.3.1.252"
                                           codeSystemName="切口愈合等级代码"/>
                                </observation>
                            </entryRelationship>
                            <!-- 麻醉方法 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.2"
                                          codeSystemName="卫生信息数据元目录" displayName="麻醉方法代码"/>
                                    <value xsi:type="CD" code="${dischargeSummary.麻醉方法代码!'麻醉方法代码'}" codeSystem="2.16.156.10011.2.3.1.159"
                                           codeSystemName="麻醉方法代码">${dischargeSummary.麻醉方法名称!'麻醉方法名称'}</value>
                                </observation>
                            </entryRelationship>
                            <!-- 手术过程 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.10.063.00" codeSystem="2.16.156.10011.2.2.2"
                                          codeSystemName="卫生信息数据元目录" displayName="手术过程"/>
                                    <value xsi:type="ST">${dischargeSummary.手术过程!'手术过程'}</value>
                                </observation>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!-- 治疗计划章节 -->
            <component>
                <section>
                    <code code="18776-5" displayName="TREATMENT PLAN" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 治则治法 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.300.00" displayName="治则治法" codeSystem="2.16.156.10011.2.3.3.15"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.治则治法!'治则治法'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 住院过程章节 -->
            <component>
                <section>
                    <code code="8648-8" displayName="Hospital Course" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 诊疗过程 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.296.00" displayName="诊疗过程描述" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.诊疗过程描述!'诊疗过程描述'}</value>
                        </observation>
                    </entry>
                    <!-- 治疗结果 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.113.00" displayName="治疗结果代码" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.148" codeSystemName="治疗结果代码"/>
                        </observation>
                    </entry>
                    <!-- 实际住院天数 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.310.00" displayName="实际住院天数" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="${dischargeSummary.实际住院天数!'实际住院天数'}" unit="天"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 医嘱章节 -->
            <component>
                <section>
                    <code code="46209-3" displayName="Provider Orders" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 中药煎煮方法 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.047.00" displayName="中药煎煮方法" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.中药煎煮方法!'中药煎煮方法'}</value>
                        </observation>
                    </entry>
                    <!-- 中药用药方法 -->
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" displayName="中药用药方法" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.中药用药方法!'中药用药方法'}</value>
                        </observation>
                    </entry>
                    <!-- 出院医嘱 -->
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.287.00" displayName="出院医嘱" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${dischargeSummary.出院医嘱!'出院医嘱'}</value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 实验室检查章节 -->
            <component>
                <section>
                    <code code="30954-2" displayName="STUDIES SUMMARY" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <!-- 阳性辅助检查结果 -->
                    <entry typeCode="COMP" contextConductionInd="">
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component typeCode="COMP" contextConductionInd="">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.128.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">${dischargeSummary.阳性辅助检查结果!'阳性辅助检查结果'}</value>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>