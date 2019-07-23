<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.68"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0048" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>术后首次病程记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <age value="" unit="岁"/>
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

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="医师"/>
            <assignedPerson>
                <name></name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <participant typeCode="NOT">
        <associatedEntity classCode="ECON">
            <telecom value=""/>
            <assignedPerson>
                <name></name>
            </assignedPerson>
        </associatedEntity>
    </participant>

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
                                                <!-- 病区 -->
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

    <component>
        <structuredBody>
            <!-- 手术操作 -->
            <component>
                <section>
                    <code code="47519-4" displayName="HISTORY OF PROCEDURES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <procedure classCode="PROC" moodCode="EVN">
                            <code xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.12"
                                  codeSystemName="手术(操作)代码表(ICD-9-CM)" displayName=""/>
                        </procedure>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.094.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术名称"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.187.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术目标部位名称"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.221.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术日期时间"/>
                            <value xsi:type="TS" value=""/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.073.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="麻醉方法代码"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.159"
                                   codeSystemName="麻醉方法代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.063.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="手术过程"/>
                            <value xsi:type="ST"></value>
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
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.025.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="术后诊断名称"/>
                            <value xsi:type="ST"></value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="术后诊断编码"/>
                                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.3"
                                           codeSystemName="ICD-10诊断编码表" displayName=""/>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.063.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="诊断依据"/>
                            <value xsi:type="ST"></value>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 注意事项章节 -->
            <component>
                <section>
                    <code code="DE09.00.119.00" displayName="注意事项章节" codeSystem="2.16.156.10011.2.2.1"
                          codeSystemName="卫生信息数据元目录"/>
                    <text/>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>