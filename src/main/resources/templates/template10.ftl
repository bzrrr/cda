<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.30"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0010" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>麻醉术前访视记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门诊号标识 -->
            <id root="2.16.156.10011.1.11" extension=""/>
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension=""/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.patientId!}"/>
                <!-- 患者姓名 -->
                <name>${patient.patientName!}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.genderCode!}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)"/>
                <birthTime value="${patient.birthTime!}"/>
                <age unit="岁" value=""/>
            </patient>
        </patientRole>
    </recordTarget>
    <!-- 文档创作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value=""/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <!-- 医师姓名 -->
            <assignedPerson>
                <name>${patient.archiverName!}</name>
            </assignedPerson>
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

    <!-- 麻醉医师签名 -->
    <authenticator>
        <!-- 签名日期时间 -->
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="麻醉医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
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

    <!-- 病床号、病房、病区、科室和医院的关联 -->
    <componentOf>
        <encompassingEncounter>
            <!-- 入院日期时间 -->
            <effectiveTime/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <!-- DE01.00.026.00 病床号 -->
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name></name>
                                <!-- DE01.00.019.00 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name></name>
                                        <!-- DE08.10.026.00 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name></name>
                                                <!-- DE08.10.054.00 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name></name>
                                                        <!-- xx医院 -->
                                                        <asOrganizationPartOf classCode="PART">
                                                            <wholeOrganization classCode="ORG"
                                                                               determinerCode="INSTANCE">
                                                                <id root="2.16.156.10011.1.5" extension=""/>
                                                                <name></name>
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

    <!-- 术前诊断章节 -->
    <component>
        <section>
            <code code="10219-4" displayName="Surgical operation note preoperative Dx"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 术前诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="术前诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.3.11.3" codeSystemName="诊断代码表(ICD-10)"/>
                </observation>
            </entry>

            <!-- 术前合并疾病 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.076.00" displayName="术前合并疾病"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者在接受手术前，除与手术相关的诊断外，同时合并的其他疾病</value>
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
            <!-- 简要病史条目 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.140.00" displayName="简要病史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">对患者病史的简要描述</value>
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
            <!-- 过敏史条目 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.022.00" displayName="过敏史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者既往发生过敏情况的详细描述</value>
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
            <!-- 体重 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.188.00" displayName="体重"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit="kg"></value>
                </observation>
            </entry>

            <!-- 一般状况检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.219.00" displayName="一般状况检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">对患者一般状况检查结果的详细描述，包括其发育状况、营养状况、体味、步态、面容与表情、意识，检查能否合作等</value>
                </observation>
            </entry>

            <!-- 精神状态正常标志 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.142.00" displayName="精神状态正常标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value=""></value>
                </observation>
            </entry>

            <!-- 心脏听诊结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.207.00" displayName="心脏听诊结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对心脏听诊结果的详细描述</value>
                </observation>
            </entry>

            <!-- 肺部听诊结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.031.00" displayName="肺部听诊结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对患者肺部听诊检查结果的描述</value>
                </observation>
            </entry>

            <!-- 四肢检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.179.00" displayName="四肢检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对四肢检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 脊柱检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.093.00" displayName="脊柱检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对脊柱检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 腹部检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.046.00" displayName="腹部检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对腹部检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 气管检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.230.00" displayName="气管检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对气管检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 牙齿检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.264.00" displayName="牙齿检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对牙齿检查结果的详细描述</value>
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
            <!-- 血型 -->
            <entry typeCode="COMP">
                <organizer classCode="BATTERY" moodCode="EVN">
                    <statusCode/>
                    <!-- ABO血型 -->
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.001.00" displayName="ABO血型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" displayName=""
                                   codeSystem="2.16.156.10011.2.3.1.85" codeSystemName="ABO血型代码表"/>
                        </observation>
                    </component>
                    <!-- Rh血型 -->
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.010.00" displayName="Rh(D)血型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" displayName=""
                                   codeSystem="2.16.156.10011.2.3.1.250" codeSystemName="Rh(D)血型代码表"/>
                        </observation>
                    </component>
                </organizer>
            </entry>

            <!-- 心电图检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.043.00" displayName="心电图检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">对患者心电图检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 胸部X线检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.045.00" displayName="胸部X线检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">对患者胸部X线检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- CT检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.005.00" displayName="CT检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">CT检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- B超检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.002.00" displayName="B超检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">B超检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- MRI检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.009.00" displayName="MRI检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">MRI检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 肺功能检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.009.00" displayName="MRI检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者肺功能检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 血常规检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.128.00" displayName="血常规检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对患者血常规检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 尿常规检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.048.00" displayName="尿常规检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对患者尿常规检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 凝血功能检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.142.00" displayName="凝血功能检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对患者凝血功能检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 肝功能检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.026.00" displayName="肝功能检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">对患者肝功能检查结果的详细描述</value>
                </observation>
            </entry>

            <!-- 血气分析检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.128.00" displayName="血气分析检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">麻醉术前访视时，对患者血气分析检查结果的详细描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 治疗计划章节 -->
    <component>
        <section>
            <code code="18776-5" displayName="TREATMENT PLAN"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 拟实施手术及操作编码 DE06.00.093.00 -->
            <entry>
                <observation classCode="PROC" moodCode="EVN">
                    <code code="DE06.00.093.00" displayName="拟实施手术及操作编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                    <!-- 手术间编号 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.256.00" displayName="患者实施手术所在的手术室编号"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
            <!-- 拟实施麻醉方法代码 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.073.00" displayName="拟实施麻醉方法代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="麻醉方法代码表"/>
                    <!-- 术前麻醉医嘱 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="INT">
                            <code code="DE06.00.287.00" displayName="术前麻醉医嘱"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entryRelationship>

                    <!-- 麻醉适应症 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="INT">
                            <code code="DE06.00.227.00" displayName="麻醉适应症"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entryRelationship>

                    <!-- 注意事项 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE09.00.119.00" displayName="注意事项"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>