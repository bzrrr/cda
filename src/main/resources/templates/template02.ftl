<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.22"/>
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0002" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>门(急)诊病历</title>
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门(急)诊号标识 -->
            <id root="2.16.156.10011.1.11" extension="${mjzRecord.门急诊号!'门急诊号'}"/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension="${mjzRecordDetail.电子申请单编号!'电子申请单编号'}"/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'身份证号'}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!姓名}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!'性别'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!}"/>
                <age unit="岁" value="${mjzRecord.年龄岁!'岁'}"/>
            </patient>
            <providerOrganization>
                <id root="2.16.156.10011.1.26"/>
                <name>${mjzRecord.科室名称!'科室名称'}</name>
                <asOrganizationPartOf>
                    <wholeOrganization>
                        <!-- 机构代码 -->
                        <id root="2.16.156.10011.1.5" extension="${mjzRecord.医疗机构组织机构代码!'机构代码'}"/>
                        <name>${orgName!'机构名称'}</name>
                    </wholeOrganization>
                </asOrganizationPartOf>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 创建者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 就诊日期时间 -->
        <time value="${mjzRecord.就诊日期时间!'就诊日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension="${patient.建档者序号!'建档者序号'}"/>
            <!-- 就诊医师 -->
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 保管机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'文档保管的医疗机构标识'}"/>
                <name>${orgName!'保管机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <!-- 医师签名 -->
    <legalAuthenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension="医务人员编号"/>
            <code displayName="责任医生"/>
            <assignedPerson>
                <name>${mjzRecord.医师签名!'医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>


    <!-- 过敏史章节 -->
    <component>
        <section>
            <code code="48765-2" displayName="Allergies, adverse reactions, alerts"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 过敏史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.023.00" displayName="过敏史标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value="${mjzRecord.过敏史标志!'过敏史标志'}"></value>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.022.00" displayName="过敏史"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${mjzRecord.过敏史!'过敏史'}</value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 主诉章节 -->
    <component>
        <section>
            <code code="10154-3" displayName="CHIEF COMPLAINT"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 主诉条目 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.01.119.00" displayName="主诉"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.主诉!'主诉'}</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 现病史章节 -->
    <component>
        <section>
            <code code="10164-2" displayName="HISTORY OF PRESENT ILLNESS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 现病史条目 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.071.00" displayName="现病史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.现病史!'现病史'}</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 既往史章节 -->
    <component>
        <section>
            <code code="11348-0" displayName="HISTORY OF PAST ILLNESS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.099.00" displayName="既往史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.既往史!'既往史'}</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 体格检查章节 -->
    <component>
        <section>
            <code code="29545-1" displayName="PHYSICAL EXAMINATION"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 体格检查-一般状况检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.258.00" displayName="体格检查"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.体格检查!'体格检查'}</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 实验室检验章节 -->
    <component>
        <section>
            <code code="30954-2" displayName="STUDIES SUMMARY"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <organizer classCode="CLUSTER" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.010.00" displayName="辅助检查项目"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${mjzRecord.辅助检查项目!'辅助检查项目'}</value>
                        </observation>
                    </component>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.009.00" displayName="辅助检查结果"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${mjzRecord.辅助检查结果!'辅助检查结果'}</value>
                        </observation>
                    </component>
                </organizer>
            </entry>
        </section>
    </component>

    <!-- 诊断记录章节 -->
    <component>
        <section>
            <code code="29548-5" displayName="Diagnosis"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 初诊标志代码 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.196.00" displayName="初诊标志代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="${mjzRecord.初诊标志代码!'初诊标志代码'}" displayName="初诊"
                           codeSystem="2.16.156.10011.2.3.1.85" codeSystemName="初诊标志代码表"/>
                </observation>
            </entry>
            <!-- 中医"四诊"观察结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.028.00" displayName="中医“四诊”观察结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.中医四诊观察结果!'中医四诊观察结果'}</value>
                </observation>
            </entry>

            <!-- 条目:诊断 -->
            <entry>
                <organizer classCode="CLUSTER" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" displayName="诊断名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${mjzRecord.初步诊断_西医诊断名称!'初步诊断_西医诊断名称'}</value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" displayName="诊断代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${mjzRecord.初步诊断_西医诊断编码!'初步诊断_西医诊断编码'}" displayName=""
                                   codeSystem="2.16.156.10011.2.3.1.85" codeSystemName="诊断代码表(ICD-10)"></value>
                        </observation>
                    </component>
                </organizer>
            </entry>

            <entry>
                <organizer classCode="CLUSTER" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" displayName="中医病名名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                                <qualifier>
                                    <name displayName="中医病名名称"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="ST">${mjzRecord.初步诊断_中医病名名称!'初步诊断_中医病名名称'}</value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="中医病名代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                                <qualifier>
                                    <name displayName="中医病名代码"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="CD" code="${mjzRecord.初步诊断_中医病名代码!'初步诊断_中医病名代码'}" displayName=""
                                   codeSystem="2.16.156.10011.2.3.3.14" codeSystemName="中医病症分类与代码表(GB/T 15657)"></value>
                        </observation>
                    </component>
                </organizer>
            </entry>

            <entry>
                <organizer classCode="CLUSTER" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.172.00" displayName="中医证候名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                                <qualifier>
                                    <name displayName="中医证候名称"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="ST">${mjzRecord.初步诊断_中医证候名称!'初步诊断_中医证候名称'}</value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.130.00" displayName="中医证候代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                                <qualifier>
                                    <name displayName="中医证候代码"></name>
                                </qualifier>
                            </code>
                            <value xsi:type="CD" code="${mjzRecord.初步诊断_中医证候代码!'初步诊断_中医证候代码'}" displayName=""
                                   codeSystem="2.16.156.10011.2.3.3.14" codeSystemName="中医病症分类与代码表(GB/T 15657)"></value>
                        </observation>
                    </component>
                </organizer>
            </entry>
        </section>
    </component>

    <!-- 治疗计划章节 -->
    <component>
        <section>
            <code code="18776-5" displayName="TREATMENT PLAN"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 辨证依据描述 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.132.00" displayName="辨证依据"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.辨证依据!'辨证依据'}</value>
                </observation>
            </entry>
            <!-- 治则治法 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.300.00" displayName="治则治法"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${mjzRecord.治则治法!'治则治法'}</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 医嘱章节 -->
    <component>
        <section>
            <code code="46209-3" displayName="Provider Orders"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>

            <entry>
                <observation classCode="CLUSTER" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.289.00" displayName="医嘱项目类型"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${mjzRecordDetail.医嘱项目类型代码!'医嘱项目类型代码'}"
                                   codeSystem="2.16.156.10011.2.3.1.250" codeSystemName="医嘱项目类型代码表" displayName=""/>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.288.00" displayName="医嘱项目内容"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <effectiveTime>
                                <!-- 医嘱计划开始日期时间 -->
                                <low value=""/>
                                <!-- 医嘱计划结束日期时间 -->
                                <high value=""/>
                            </effectiveTime>
                            <!-- 医嘱计划信息 -->
                            <value xsi:type="ST">${mjzRecordDetail.医嘱项目内容!'医嘱项目内容'}</value>
                            <!-- 执行者 -->
                            <performer>
                                <!-- 医嘱执行日期时间:DE06.00.222.00 -->
                                <time value="${mjzRecordDetail.医嘱执行日期时间!'医嘱执行日期时间'}"/>
                                <assignedEntity>
                                    <id root="2.16.156.10011.1.4"/>
                                    <!-- 角色 -->
                                    <code displayName="医嘱执行者"/>
                                    <!-- 医嘱执行者签名:DE02.01.039.00 -->
                                    <assignedPerson>
                                        <name>${mjzRecordDetail.医嘱执行者签名!'医嘱执行者签名'}</name>
                                    </assignedPerson>
                                    <!-- 医嘱执行科室:DE08.10.026.00 -->
                                    <representedOrganization>
                                        <name>${mjzRecordDetail.医嘱执行科室!'医嘱执行科室'}</name>
                                    </representedOrganization>
                                </assignedEntity>
                            </performer>

                            <!-- 作者:医嘱开立者 -->
                            <author>
                                <!-- 医嘱开立日期时间:DE06.00.220.00 -->
                                <time value="${mjzRecordDetail.医嘱开立日期时间!'医嘱开立日期时间'}"/>
                                <assignedAuthor>
                                    <id root="2.16.156.10011.1.4"/>
                                    <!-- 角色 -->
                                    <code displayName="医嘱开立者"/>
                                    <!-- 医嘱开立者签名:DE02.01.039.00 -->
                                    <assignedPerson>
                                        <name>${mjzRecordDetail.医嘱开立者签名!'医嘱开立者签名'}</name>
                                    </assignedPerson>
                                    <!-- 医嘱开立科室:DE08.10.026.00 -->
                                    <representedOrganization>
                                        <name>${mjzRecordDetail.医嘱开立科室!'医嘱开立科室'}</name>
                                    </representedOrganization>
                                </assignedAuthor>
                            </author>

                            <!-- 医嘱审核 -->
                            <participant typeCode="ATND">
                                <!-- 医嘱审核日期时间:DE06.00.205.00 -->
                                <time value="${mjzRecordDetail.医嘱审核日期时间!'医嘱审核日期时间'}"/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4"/>
                                    <!-- 角色 -->
                                    <code displayName="医嘱审核人"/>
                                    <!-- 医嘱审核人签名:DE02.01.039.00 -->
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${mjzRecordDetail.医嘱审核者签名!'医嘱审核者签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>

                            <!-- 医嘱取消 -->
                            <participant typeCode="ATND">
                                <!-- 医嘱取消日期时间:DE06.00.234.00 -->
                                <time value="${mjzRecordDetail.医嘱取消日期时间!'医嘱取消日期时间'}"/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4"/>
                                    <!-- 角色 -->
                                    <code displayName="医嘱取消人"/>
                                    <!-- 取消医嘱者签名:DE02.01.039.00 -->
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${mjzRecordDetail.取消医嘱者签名!'取消医嘱者签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>

                            <!-- 医嘱备注信息 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.179.00" displayName="医嘱备注信息"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">${mjzRecordDetail.医嘱备注信息!'医嘱备注信息'}</value>
                                </observation>
                            </entryRelationship>

                            <!-- 医嘱执行状态 -->
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.290.00" displayName="医嘱执行状态"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">${mjzRecordDetail.医嘱执行状态!'医嘱执行状态'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </component>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>