<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.34"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0014" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>待产记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension=""/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.patientId!}"/>
                <!-- 患者姓名 -->
                <name>${patient.patientName!}</name>
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

    <authenticator>
        <!-- 签名日期时间 -->
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="产程检查者"/>
            <assignedPerson>
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <!-- 签名日期时间 -->
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="记录人"/>
            <assignedPerson>
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <participant typeCode="NOT">
        <!-- 联系人 -->
        <associatedEntity classCode="ECON">
            <!-- 联系人电话 -->
            <telecom value="${patient.participantTelecom!}"/>
            <!-- 联系人 -->
            <associatedPerson>
                <!-- 姓名 -->
                <name>${patient.participantName!}</name>
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

    <!-- 主要健康问题章节 -->
    <component>
        <section>
            <code code="11450-4" displayName="PROBLEM LIST"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.197.00" displayName="待产日期时间"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="TS" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.01.108.00" displayName="孕次"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="INT" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.002.00" displayName="产次"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="INT" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.051.00" displayName="末次月经日期"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="TS" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.261.00" displayName="受孕形式代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.2.44" codeSystemName="受孕形式代码表"/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.098.00" displayName="预产期"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="TS" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.013.00" displayName="产前检查标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.161.00" displayName="产前检查异常情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.070.00" displayName="此次妊娠特殊情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 生命体征章节 -->
    <component>
        <section>
            <code code="8716-3" displayName="VITAL SIGNS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 体重 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.188.00" displayName="孕前体重(kg)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.167.00" displayName="身高"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.188.00" displayName="产前体重(kg)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>

            <entry>
                <organizer classCode="BATTERY" moodCode="EVN">
                    <statusCode/>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.174.00" displayName="收缩压"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" unit="" value=""></value>
                        </observation>
                    </component>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.176.00" displayName="舒张压"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" unit="" value=""></value>
                        </observation>
                    </component>
                </organizer>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.186.00" displayName="体温(°C)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.118.00" displayName="脉率(次/min)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.081.00" displayName="呼吸频率(次/min)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="" value=""></value>
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
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.061.00" displayName="手术史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.098.00" displayName="既往孕产史"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 产前检查章节 -->
    <component>
        <section>
            <code code="57073-9" displayName="Prenatal events"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.067.00" displayName="宫底高度(cm)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.052.00" displayName="腹围(cm)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.044.00" displayName="胎方位代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.1.106" codeSystemName="胎方位代码表"/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.183.00" displayName="胎心率(次/min)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.135.00" displayName="头位难产情况的评估"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.247.00" displayName="出口横径(cm)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.175.00" displayName="骶耻外径(cm)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.239.00" displayName="坐骨结间径(cm)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.245.00" displayName="宫缩情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.248.00" displayName="宫颈厚度"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.265.00" displayName="宫口情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.155.00" displayName="胎膜情况代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.1.10" codeSystemName="胎膜情况代码表"/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.256.00" displayName="破膜方式代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.2.46" codeSystemName="破膜方式代码表"/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.262.00" displayName="先露位置"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.062.00" displayName="羊水情况"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.257.00" displayName="膀胱充盈标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.01.123.00" displayName="肠胀气标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.139.00" displayName="检查方式代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.2.47" codeSystemName="检查方式代码表"/>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 处置计划章节 -->
    <component>
        <section>
            <code code="18776-5" displayName="TREATMENT PLAN"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.014.00" displayName="处置计划"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.011.00" displayName="计划选取的分娩方式"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.1.10" codeSystemName="分娩方式代码表"/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE09.00.053.00" displayName="产程记录日期时间"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="TS" value=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.190.00" displayName="产程经过"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST"></value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>
