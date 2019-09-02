<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.72"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0052" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>住院医嘱</title>
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
            <id root="2.16.156.10011.1.12" extension="${residentDoctor.住院号!'住院号'}"/>
            <!-- 患者电话 -->
            <telecom value="${patient.患者电话号码!'患者电话号码'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${residentDoctor.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${residentDoctor.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${residentDoctor.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <!-- 婚姻状况 -->
                <maritalStatusCode code="${patient.婚姻状况代码!'婚姻状况代码'}" displayName="${patient.婚姻状况!'婚姻状况'}" codeSystem="2.16.156.10011.2.3.3.5"
                                   codeSystemName="婚姻状况代码表(GB/T 2261.2)"/>
                <age value="${residentDoctor.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
            <!-- 提供患者服务机构 -->
            <providerOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension=""/>
                <name>${orgName!'医疗机构名称'}</name>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 文档作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <code displayName="医嘱开立者"/>
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
                                <name>${residentDoctor.病床号!'病床号'}</name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
                                        <name>${residentDoctor.病房号!'病房号'}</name>
                                        <!-- 病区名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.27" extension=""/>
                                                <name>${residentDoctor.病区名称!'病区名称'}</name>
                                                <!-- 科室名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.26" extension=""/>
                                                        <name>${residentDoctor.科室名称!'科室名称'}</name>
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
                            <value xsi:type="PQ" value="${residentDoctor.体重!'体重'}" unit="kg"/>
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
                            <value xsi:type="CD" code="${residentDoctor.医嘱类别代码!'医嘱类别代码'}" displayName="${residentDoctor.医嘱类别名称!'医嘱类别名称'}" value="" codeSystem="2.16.156.10011.2.3.2.58"
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
                                    <value xsi:type="CD" code="${residentDoctor.医嘱项目类型代码!'医嘱项目类型代码'}" displayName="${residentDoctor.医嘱项目类型名称!'医嘱项目类型名称'}" value=""
                                           codeSystem="2.16.156.10011.2.3.1.268" codeSystemName="医嘱项目类型代码表"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.288.00" displayName="医嘱项目内容" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录"/>
                                    <effectiveTime>
                                        <low value="${residentDoctor.医嘱计划开始日期吋间!'医嘱计划开始日期吋间'}"/>
                                        <high value="${residentDoctor.医嘱计划结束日期时间!'医嘱计划结束日期时间'}"/>
                                    </effectiveTime>
                                    <value xsi:type="ST">${residentDoctor.医嘱项目内容!'医嘱项目内容'}</value>
                                    <!-- 医嘱开立者 -->
                                    <author>
                                        <time value="${residentDoctor.医嘱开立日期时间!'医嘱开立日期时间'}"/>
                                        <assignedAuthor>
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱开立者"/>
                                            <assignedPerson>
                                                <name>${residentDoctor.医嘱开立者签名!'医嘱开立者签名'}</name>
                                            </assignedPerson>
                                            <representedOrganiztion>
                                                <name>${residentDoctor.医嘱开立科室!'医嘱开立科室'}</name>
                                            </representedOrganiztion>
                                        </assignedAuthor>
                                    </author>
                                    <!-- 医嘱审核 -->
                                    <participant typeCode="ATND">
                                        <time value="${residentDoctor.医嘱审核日期时间!'医嘱审核日期时间'}"/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱审核人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name>${residentDoctor.医嘱审核人签名!'医嘱审核人签名'}</name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱核对 -->
                                    <participant typeCode="ATND">
                                        <time value="${residentDoctor.医嘱核对日期时间!'医嘱核对日期时间'}"/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱核对人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name>${residentDoctor.核对医嘱护士签名!'核对医嘱护士签名'}</name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱停止 -->
                                    <participant typeCode="ATND">
                                        <time value="${residentDoctor.医嘱停止日期时间!'医嘱停止日期时间'}"/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱停止人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name>${residentDoctor.停止医嘱者签名!'停止医嘱者签名'}</name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱取消 -->
                                    <participant typeCode="ATND">
                                        <time value="${residentDoctor.医嘱取消日期时间!'医嘱取消日期时间'}"/>
                                        <participantRole classCode="ASSIGNED">
                                            <id root="2.16.156.10011.1.4" extension=""/>
                                            <code displayName="医嘱取消人"/>
                                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                                <name>${residentDoctor.取消医嘱者签名!'取消医嘱者签名'}</name>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                    <!-- 医嘱备注信息 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.179.00" displayName="医嘱备注信息"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST">${residentDoctor.医嘱备注信息!'医嘱备注信息'}</value>
                                        </observation>
                                    </entryReationship>
                                    <!-- 医嘱执行状态 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.290.00" displayName="医嘱执行状态"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST">${residentDoctor.医嘱执行状态!'医嘱执行状态'}</value>
                                            <!-- 执行者 -->
                                            <performer>
                                                <time value="${residentDoctor.医嘱执行日期时间!'医嘱执行日期时间'}"/>
                                                <assignedEntity>
                                                    <id root="2.16.156.10011.1.4" extension=""/>
                                                    <code displayName="医嘱执行者"/>
                                                    <assignedPerson>
                                                        <name>${residentDoctor.医嘱执行者签名!'医嘱执行者签名'}</name>
                                                    </assignedPerson>
                                                    <representedOrganiztion>
                                                        <name>${residentDoctor.医嘱执行科室!'医嘱执行科室'}</name>
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
                                            <value xsi:type="ST">${residentDoctor.电子申请单编号!'电子申请单编号'}</value>
                                        </observation>
                                    </entryReationship>
                                    <!-- 处方药品组号 -->
                                    <entryReationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE08.50.056.00" displayName="处方药品组号"
                                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                            <value xsi:type="ST">${residentDoctor.处方药品组号!'处方药品组号'}</value>
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