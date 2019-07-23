<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.21"/>
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0001" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>病历概要</title>
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 健康档案标识号 -->
            <id root="2.16.156.10011.1.2" extension="${patient.城乡居民健康档案编号!}"/>
            <!-- 健康卡号 -->
            <id root="2.16.156.10011.1.19" extension="${patient.居民健康卡号!}"/>
            <addr use="H">
                <houseNumber>${patient.地址_门牌号码!}</houseNumber>
                <streetName>${patient.地址_村!}</streetName>
                <township>${patient.地址_乡!}</township>
                <county>${patient.地址_县!}</county>
                <city>${patient.地址_市!}</city>
                <state>${patient.地址_省!}</state>
                <postalCode>${patient.邮政编码!}</postalCode>
            </addr>
            <!-- 患者电话 -->
            <telecom value="${patient.患者电话号码!}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)"/>
                <birthTime value="${patient.出生日期!}"/>
                <!-- 婚姻状况代码 -->
                <maritalStatusCode code="${patient.婚姻状况代码!}" displayName="${patient.maritalStatusName!}"
                                   codeSystem="2.16.156.10011.2.3.3.5" codeSystemName=""/>
                <!-- 民族 -->
                <ethnicGroupCode code="${patient.民族!}" displayName="${patient.ethnicGroupName!}"
                                 codeSystem="2.16.156.10011.2.3.3.3" codeSystemName="民族类别代码表(GB 3304)"/>
                <!-- 工作单位 -->
                <employerOrganization>
                    <name>${patient.工作单位名称!}</name>
                    <telecom value="${patient.工作单位电话号码!}"></telecom>
                </employerOrganization>
                <!-- 职业状况 -->
                <occupation>
                    <occupationCode code="${patient.职业类别代码!}" codeSystem="2.16.156.10011.2.3.3.13"
                                    codeSystemName="从业状况(个人身体)代码表(GB/T 2261.4)"
                                    displayName="${patient.occupationName!}"/>
                </occupation>
            </patient>
        </patientRole>
    </recordTarget>
    <!-- 创建者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 建档日期 -->
        <time value="${patient.建档日期时间!}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <!-- 建档者姓名 -->
            <assignedPerson>
                <name>${patient.建档者姓名!}</name>
            </assignedPerson>
            <!-- 建档机构 -->
            <representedOrganization>
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!}"/>
                <name><#--${patient.medicalOrganization.organizationName!}--></name>
            </representedOrganization>
        </assignedAuthor>
    </author>
    <!-- 保管机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name></name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <!-- 其他参与者(联系人) -->
    <participant typeCode="NOT">
        <!-- 联系人 -->
        <associatedEntity classCode="ECON">
            <!-- 联系人类别,表示与患者之间的关系 -->
            <code/>
            <!-- 联系人地址 -->
            <addr>
                <houseNumber></houseNumber>
                <streetName></streetName>
                <township></township>
                <county></county>
                <city></city>
                <state></state>
                <postalCode></postalCode>
            </addr>
            <!-- 电话号码 -->
            <telecom use="H" value="${patient.联系人电话号码!}"/>
            <!-- 联系人 -->
            <associatedPerson classCode="PSN" determinerCode="INSTANCE">
                <!-- 姓名 -->
                <name>${patient.联系人姓名!}</name>
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

    <!-- 实验室检验章节 -->
    <component>
        <section>
            <code code="30954-2" displayName="STUDIES SUMMARY"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 血型 -->
            <entry>
                <organizer classCode="BATTERY" moodCode="EVN">
                    <statusCode/>
                    <!-- ABO血型 -->
                    <component typeCode="COMP" contextConductionInd="true">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.001.00"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code=""
                                   codeSystem="2.16.156.10011.2.3.1.85" codeSystemName="ABO血型代码表" displayName=""/>
                        </observation>
                    </component>
                    <!-- Rh血型 -->
                    <component typeCode="COMP" contextConductionInd="true">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.001.00"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code=""
                                   codeSystem="2.16.156.10011.2.3.1.250" codeSystemName="rH血型代码表" displayName=""/>
                        </observation>
                    </component>
                </organizer>
            </entry>
        </section>
    </component>

    <!-- 既往史章节 -->
    <component>
        <section>
            <code code="11348-0" displayName="HISTORY OF PAST ILLNESS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 疾病史(含外伤) -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.026.00" displayName="疾病史(含外伤)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">疾病史(含外伤)描述</value>
                </observation>
            </entry>
            <!-- 传染病史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.008.00" displayName="传染病史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
            <!-- 手术史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.061.00" displayName="手术史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
            <!-- 婚育史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.098.00" displayName="婚育史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 输血章节 -->
    <component>
        <section>
            <code code="56836-0" displayName="History of blood transfusion"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 输血史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.100.00" displayName="输血史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 过敏史章节 -->
    <component>
        <section>
            <code code="48765-2" displayName="Allergies, adverse reactions, alerts"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 过敏史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.022.00" displayName="过敏史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 预防接种史章节 -->
    <component>
        <section>
            <code code="11369-6" displayName="HISTORY OF IMMUNIZATIONS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 预防接种史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.022.00" displayName="预防接种史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 个人史章节 -->
    <component>
        <section>
            <code code="29762-2" displayName="Social history"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 个人史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.097.00" displayName="个人史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <#if (patient.genderCode?? && patient.genderCode == "2")>
        <!-- 月经史章节 -->
        <component>
            <section>
                <code code="49033-4" displayName="Menstrual History"
                      codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                <text/>
                <!-- 月经史 -->
                <entry>
                    <observation classCode="OBS" moodCode="EVN">
                        <code code="DE02.10.102.00" displayName="月经史"
                              codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                        <value xsi:type="ST">描述</value>
                    </observation>
                </entry>
            </section>
        </component>
    </#if>

    <!-- 家族史章节 -->
    <component>
        <section>
            <code code="10157-6" displayName="HISTORY OF FAMILY MEMBER DISEASES"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 家族史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.103.00" displayName="家族史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 卫生事件章节 -->
    <component>
        <section>
            <code displayName="卫生事件"></code>
            <text/>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.026.00" displayName="医疗机构科室名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">名称</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.01.060.00" displayName="患者类型代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.271"
                           codeSystemName="患者类型代码表"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE01.00.010.00" displayName="门(急)诊号"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">门(急)诊号</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE01.00.014.00" displayName="住院号"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">住院号</value>
                </observation>
            </entry>

            <entry>
                <organizer classCode="BATTERY" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.092.00" displayName="入院日期时间"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="TS" value=""></value>
                        </observation>
                    </component>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.017.00" displayName="出院日期时间"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="TS" value=""></value>
                        </observation>
                    </component>
                </organizer>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.01.018.00" displayName="发病日期时间"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="TS" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.053.00" displayName="就诊原因"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <!-- 就诊日期时间 -->
                    <effectiveTime value=""/>
                    <value xsi:type="ST">就诊原因描述</value>
                </observation>
            </entry>

            <!-- 条目:诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="西医诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="西医诊断编码"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.1"
                           codeSystemName="诊断代码表(ICD-10)" displayName=""/>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.113.00" displayName="病情转归代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.148"
                                   codeSystemName="病情转归代码表" displayName=""/>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>

            <!-- 条目:诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="其他西医诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="西医诊断编码"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.1"
                           codeSystemName="诊断代码表(ICD-10)" displayName=""/>
                </observation>
            </entry>

            <!-- 条目:诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.130.00" displayName="中医病名代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="中医病名代码"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                           codeSystemName="中医病症分类与代码表(GB/T 15657)" displayName=""/>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="中医证候代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <qualifier>
                                <name displayName="中医证候代码"></name>
                            </qualifier>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                                   codeSystemName="中医病症分类与代码表(GB/T 15657)" displayName=""/>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.113.00" displayName="病情转归代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.148"
                                   codeSystemName="病情转归代码表" displayName=""/>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>

            <entry>
                <procedure classCode="PROC" moodCode="EVN">
                    <!-- 手术及操作编码 DE06.00.093.00 -->
                    <code code="" codeSystem="2.16.156.10011.2.3.3.12"
                          codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                </procedure>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.50.022.00" displayName="关键药物名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">关键药物名称</value>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" displayName="关键药物用法"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">关键药物用法</value>
                        </observation>
                    </entryRelationship>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.129.00" displayName="药物不良反应情况"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">药物不良反应情况记录</value>
                        </observation>
                    </entryRelationship>
                    <entryRelationship typeCode="COMP">
                        <obervation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.164.00" displayName="中药使用类别代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.157"
                                   codeSystemName="中药使用类别代码"></value>
                        </obervation>
                    </entryRelationship>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.251.00" displayName="其他医学处置"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">其他医学处置</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.021.00" displayName="根本死因代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code=""
                           codeSystem="2.16.156.10011.2.3.3.11.2" codeSystemName="死因代码表(ICD-10)"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.01.039.00" displayName="责任医师姓名"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">责任医师姓名</value>
                </observation>
            </entry>

            <!-- 费用条目 -->
            <entry>
                <organizer classCode="CLUSTER" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.01.044.00" displayName="医疗保险类别代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" displayName=""
                                   codeSystem="2.16.156.10011.2.3.1.248" codeSystemName="医疗保险类别代码表"></value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE07.00.007.00" displayName="医疗付费方式代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" displayName=""
                                   codeSystem="2.16.156.10011.2.3.1.248" codeSystemName="医疗付费方式代码表"></value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE07.00.004.00" displayName="门诊费用金额"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="MO" value="" currency="元"></value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE07.00.010.00" displayName="住院费用金额"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="MO" value="" currency="元"></value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE07.00.001.00" displayName="个人承担费用金额"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="MO" value="" currency="元"></value>
                        </observation>
                    </component>
                </organizer>
            </entry>
        </section>
    </component>
</ClinicalDocument>