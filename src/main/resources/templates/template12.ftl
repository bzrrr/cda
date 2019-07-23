<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.32"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0012" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>麻醉术后访视记录</title>
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
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <!-- 机构标识号 -->
                <id root="2.16.156.10011.1.5" extension=""/>
                <!-- 住院机构名称 -->
                <name></name>
            </providerOrganization>
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
        <time value=""/>
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

    <!-- 生命体征章节 -->
    <component>
        <section>
            <code code="8716-3" displayName="VITAL SIGNS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 入院体重 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.188.00" displayName="入院体重"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>

            <!-- 出生体重 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.019.00" displayName="出生体重"
                          codeSystem="2.16.156.10011.2.2.2" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 一般状况检查章节 -->
    <component>
        <section>
            <code code="10210-3" displayName="GENERAL STATUS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 一般状况检查结果 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE04.10.219.00" displayName="一般状况检查结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
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
                    <component typeCode="COMP" contextConductionInd="true">
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
        </section>
    </component>

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
        </section>
    </component>

    <!-- 术后诊断章节 -->
    <component>
        <section>
            <code code="10218-6" displayName="Surgical operation note postoperative Dx"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 术后诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="术后诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.3.11.3" codeSystemName="诊断代码表(ICD-10)"/>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 手术操作章节 -->
    <component>
        <section>
            <code code="47519-4" displayName="HISTORY OF PROCEDURES"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 手术及操作编码 DE06.00.093.00 -->
            <entry>
                <procedure classCode="PROC" moodCode="EVN">
                    <code xsi:type="CD" code="" displayName=""
                          codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                </procedure>
            </entry>
        </section>
    </component>

    <!-- 麻醉章节 -->
    <component>
        <section>
            <code code="59774-0" displayName="Procedure anesthesia"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <!-- 麻醉方法代码 -->
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.073.00" displayName="麻醉方法代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.1.159" codeSystemName="麻醉方法代码表"/>
                    <!-- 麻醉适应症 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.227.00" displayName="麻醉适应症"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 主要健康问题章节 -->
    <component>
        <section>
            <code code="11450-4" displayName="PROBLEM LIST"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 麻醉恢复情况 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.225.00" displayName="麻醉恢复情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <!-- 清醒日期时间 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.233.00" displayName="清醒日期时间"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="TS" value=""/>
                </observation>
            </entry>

            <!-- 拔除气管插管标志 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.165.00" displayName="拔除气管插管标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value=""/>
                </observation>
            </entry>

            <!-- 特殊情况 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.158.00" displayName="特殊情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>