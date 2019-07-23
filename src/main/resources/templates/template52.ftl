<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.72"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0052" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>住院医嘱</title>
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
            <!-- 患者电话 -->
            <telecom value=""/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension=""/>
                <name></name>
                <administrativeGenderCode code="2" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="女性"/>
                <birthTime value=""/>
                <!-- 婚姻状况 -->
                <maritalStatusCode code="" displayName="" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <age value="" unit="岁"/>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>xx医院</name>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 文档作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value=""/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <code displayName="医嘱开立者"/>
            <assignedPerson>
                <name>xx</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 文档生成机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>xx医院</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <relatedDocument typeCode="RPLC">
        <parentDocument>
            <id/>
            <setId/>
            <versionNumber/>
        </parentDocument>
    </relatedDocument>
    <!-- 入院场景 -->
    <componentOf typeCode="COMP">
        <!-- 就诊 -->
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <!-- 就诊时间 -->
            <effectiveTime/>
            <location typeCode="LOC">
                <healthCareFacility classCode="SDLOC">
                    <!-- 机构角色 -->
                    <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                        <asOrganizationPartOf classCode="PART">
                            <!-- 病床号 -->
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <name></name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name></name>
                                        <!-- 病区名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.27" extension=""/>
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
                            </wholeOrganization>
                        </asOrganizationPartOf>
                    </serviceProviderOrganization>
                </healthCareFacility>
            </location>
        </encompassingEncounter>
    </componentOf>
    <component>
        <structuredBody>
            <!-- 生命体征章节 -->
            <component>
                <section>
                    <code code="8716-3" displayName="VITAL SIGNS" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.188.00" displayName="体重" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="" unit="kg"/>
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
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.286.00" displayName="医嘱类别" codeSystem="2.16.156.10011.2.2.1"
                                  codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" displayName="" value="" codeSystem="2.16.156.10011.2.3.2.58"
                                   codeSystemName="医嘱类别代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.289.00" displayName="医嘱项目类型" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="CD" code="" displayName="" value=""
                                           codeSystem="2.16.156.10011.2.3.1.268" codeSystemName="医嘱项目类型代码表"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.288.00" displayName="医嘱项目内容" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录"/>
                                    <effectiveTime>
                                        <low value=""/>
                                        <high value=""/>
                                    </effectiveTime>
                                    <value xsi:type="ST"></value>
                                    <!-- 医嘱开立者 -->
                                    <author>
                                        <time value=""/>
                                        <assignedAuthor>
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱开立者"/>
                                            <assignedPerson>
                                                <name></name>
                                            </assignedPerson>
                                            <representedOrganiztion>
                                                <name></name>
                                            </representedOrganiztion>
                                        </assignedAuthor>
                                    </author>
                                    <!-- 医嘱审核 -->
                                    <participant typeCode="ATND">
                                        <time value=""/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱审核人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name></name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱核对 -->
                                    <participant typeCode="ATND">
                                        <time value=""/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱核对人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name></name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱停止 -->
                                    <participant typeCode="ATND">
                                        <time value=""/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱停止人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name></name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱取消 -->
                                    <participant typeCode="ATND">
                                        <time value=""/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱取消人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name></name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱备注信息 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.179.00" displayName="医嘱备注信息"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST"></value>
                                        </observation>
                                    </entryReationship>
                                    <!-- 医嘱执行状态 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.290.00" displayName="医嘱执行状态"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST"></value>
                                            <!-- 执行者 -->
                                            <performer>
                                                <time value=""/>
                                                <assignedEntity>
                                                    <id root="2.16.156.10011.1.4" extension=""/>
                                                    <code displayName="医嘱执行者"/>
                                                    <assignedPerson>
                                                        <name></name>
                                                    </assignedPerson>
                                                    <representedOrganiztion>
                                                        <name></name>
                                                    </representedOrganiztion>
                                                </assignedEntity>
                                            </performer>
                                        </observation>
                                    </entryReationship>
                                    <!-- 电子申请单编号 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE01.00.008.00" displayName="电子申请单编号"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST"></value>
                                        </observation>
                                    </entryReationship>
                                    <!-- 处方药品组号 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE08.50.056.00" displayName="处方药品组号"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST"></value>
                                        </observation>
                                    </entryReationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>