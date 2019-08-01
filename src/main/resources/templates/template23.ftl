<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.43"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0023" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>入院评估</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <!-- 患者信息 -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 健康卡号 -->
            <id root="2.16.156.10011.1.19" extension=""/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <!-- 患者电话 -->
            <telecom use="MP" value=""/>
            <!-- 工作单位电话号码 -->
            <telecom use="WP" value=""/>
            <!-- 患者电子邮件地址 -->
            <telecom use="EM" value=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <maritalStatusCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <ethnicGroupCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.3"
                                 codeSystemName="民族类别代码表(GB/T 3304)"/>
                <nationality code="" codeSystem="2.16.156.10011.2.3.3.1" codeSystemName="世界各国和地区名称代码(GB/T 2659)"
                             displayName=""/>
                <age value="" unit="岁"/>
                <educationLevel>
                    <educationLevelCode code="" displayName="" codeSystem="2016.156.10011.2.3.3.6"
                                        codeSystemName="学历代码表(GB/T 4659)"/>
                </educationLevel>
                <occupation>
                    <occupationCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.13"
                                    codeSystemName="从业状况代码表(GB/T 2261.4)"/>
                </occupation>
            </patient>
        </patientRole>
    </recordTarget>

    <author typeCode="AUT" contextControlCode="OP">
        <time value=""/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <assignedPerson>
                <name>xx</name>
            </assignedPerson>
        </assignedAuthor>
    </author>

    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>xx医院</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <legalAuthenticator typeCode="LA">
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson>
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <!-- 文档审核者 -->
    <authenticator typeCode="AUTHEN">
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <assignedPerson>
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <participant typeCode="NOT">
        <associatedEntity classCode="ECON">
            <code/>
            <telecom value=""/>
            <associatedPerson>
                <name></name>
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
            <code/>
            <effectiveTime nullFlavor="NI">
                <location typeCode="LOC">
                    <healthCareFacility classCode="SDLOC">
                        <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                            <asOrganizationPartOf classCode="PART">
                                <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                    <id root="2.16.156.10011.1.21" extension=""/>
                                    <name></name>
                                    <!-- 病房号 -->
                                    <asOrganizationPartOf classCode="PART">
                                        <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                            <id root="2.16.156.10011.1.21" extension=""/>
                                            <name></name>
                                            <!-- 科室名称 -->
                                            <asOrganizationPartOf classCode="PART">
                                                <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                    <id root="2.16.156.10011.1.26" extension=""/>
                                                    <name></name>
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
            <!-- 入院信息 -->
            <component>
                <section>
                    <code displayName="入院信息"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.053.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院原因"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.339.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院途径代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.270"
                                   codeSystemName="入院途径代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.237.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入病房方式"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 症状 -->
            <component>
                <section>
                    <code code="11450-4" displayName="PROBLEM LIST" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.01.118.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="主要症状名称"/>
                            <value xsi:type="ST"></value>
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
                                  displayName="体温"/>
                            <value xsi:type="PQ" value="" unit="摄氏度"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.118.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="脉率"/>
                            <value xsi:type="PQ" value="" unit="次/min"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.081.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="呼吸频次"/>
                            <value xsi:type="PQ" value="" unit="次/min"/>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.10.174.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="收缩压"/>
                                    <value xsi:type="PQ" value="" unit="mmHg"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.10.176.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="舒张压"/>
                                    <value xsi:type="PQ" value="" unit="mmHg"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.188.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体重"/>
                            <value xsi:type="PQ" value="" unit="kg"/>
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
                            <code code="DE02.10.026.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="疾病史"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.008.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="传染病史"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.101.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="预防接种史"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.061.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术史"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.100.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="输血史"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.031.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="一般健康状况标志"/>
                            <value xsi:type="BL" value="true"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.119.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="患者传染性标志"/>
                            <value xsi:type="BL" value="true"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 过敏史 -->
            <component>
                <section>
                    <code code="48765-2" displayName="Allergies,adverse reactions,alerts"
                          codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                    <observation classCode="OBS" moodCode="EVN">
                        <code code="DE04.01.118.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                              displayName="过敏史"/>
                        <value xsi:type="ST"></value>
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
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 健康评估 -->
            <component>
                <section>
                    <code code="51848-0" displayName="Assessment note" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.001.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="Apgar评分值"/>
                            <value xsi:type="INT" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.022.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="发育程度代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.2.53"
                                   codeSystemName="发育程度代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.142.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="精神状态正常标志"/>
                            <value xsi:type="BL" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.065.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="睡眠状况"/>
                            <value xsi:type="ST" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.158.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="特殊情况"/>
                            <value xsi:type="ST" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.084.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="心理状态代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.1.140"
                                   codeSystemName="心理状态代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.097.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="营养状态代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.2.54"
                                   codeSystemName="营养状态代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.122.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="自理能力代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.2.55"
                                   codeSystemName="自理能力代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 生活方式 -->.
            <component>
                <section>
                    <code displayName="生活方式"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.070.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="吸烟标志"/>
                            <value xsi:type="BL" value="true"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.073.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="吸烟状况代码表"/>
                            <value xsi:type="BL" value="true"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.053.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="日吸烟量"/>
                            <value xsi:type="PQ" value="" unit="支"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.065.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="停止吸烟天数"/>
                            <value xsi:type="PQ" value="" unit="d"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.030.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮酒标志"/>
                            <value xsi:type="BL" value="true"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.076.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮酒频率代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="饮酒频率代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.054.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="日饮酒量(ml)"/>
                            <value xsi:type="PQ" value="" unit="ml"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE03.00.080.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="饮食情况代码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.2.34"
                                   codeSystemName="饮食情况代码表"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 入院诊断 -->
            <component>
                <section>
                    <code code="46241-6" displayName="HISTORY ADMISSION DX" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="入院诊断编码"/>
                            <value xsi:type="CD" code="" displayName="" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
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
                                    <value xsi:type="ST"></value>
                                </observation>
                            </entryRelationship>
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
                            <code code="DE06.00.280.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="通知医师标志"/>
                            <value xsi:type="BL" value="true"/>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.279.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="通知医师日期时间"/>
                                    <value xsi:type="TS" value=""/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.144.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="评估日期时间"/>
                            <value xsi:type="TS" value=""/>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>