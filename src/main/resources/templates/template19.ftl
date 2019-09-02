<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ../sdschemas/SDA.xsd">
    <!-- Head -->
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.39"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0019" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>手术护理记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>

    <!-- 患者信息 -->
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门诊号标识 -->
            <id root="2.16.156.10011.1.11" extension="${surgicalCareRecord.门急诊号!'门急诊号'}"/>
            <!-- 住院号 -->
            <id root="2.16.156.10011.1.12" extension="${surgicalCareRecord.住院号!'住院号'}"/>
            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <name>${patient.患者姓名!'患者姓名'}</name>
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <age value="${surgicalCareRecord.年龄岁!'年龄岁'}" unit="岁"/>
            </patient>
            <providerOrganization>
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </providerOrganization>
        </patientRole>
    </recordTarget>

    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <code displayName="护士"/>
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>

    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构标识'}"/>
                <name>${orgName!'医疗机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <!-- 文档审核者 -->
    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="巡台护士"/>
            <assignedPerson>
                <name>${surgicalCareRecord.巡台护士签名!'巡台护士签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="器械护士"/>
            <assignedPerson>
                <name>${surgicalCareRecord.器械护士签名!'器械护士签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="交接护士"/>
            <assignedPerson>
                <name>${surgicalCareRecord.交接护士签名!'交接护士签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <authenticator>
        <time value=""/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="转运者"/>
            <assignedPerson>
                <name>${surgicalCareRecord.转运者签名!'转运者签名'}</name>
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

    <componentOf typeCode="COMP">
        <encompassingEncounter classCode="ENC" moodCode="EVN">
            <code/>
            <effectiveTime nullFlavor="NI"/>
            <location typeCode="LOC">
                <healthCareFacility classCode="SDLOC">
                    <serviceProviderOrganization classCode="ORG" determinerCode="INSTANCE">
                        <asOrganizationPartOf classCode="PART">
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension="${surgicalCareRecord.病床号!'病床号'}"/>
                                <name></name>
                                <!-- 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension="${surgicalCareRecord.病房号!'病房号'}"/>
                                        <name></name>
                                        <!-- 病区名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.27" extension=""/>
                                                <name>${surgicalCareRecord.病区名称!'病区名称'}</name>
                                                <!-- 科室 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.26" extension=""/>
                                                        <name>${surgicalCareRecord.科室名称!'科室名称'}</name>
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
            <!-- 术前诊断 -->
            <component>
                <section>
                    <code code="10219-4" displayName="Surgical operation note preoperative Dx"
                          codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.01.024.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="疾病诊断编码"/>
                            <value xsi:type="CD" code="${surgicalCareRecord.术前诊断编码!'术前诊断编码'}" displayName="${surgicalCareRecord.术前诊断名称!'术前诊断名称'}" codeSystem="2.16.156.10011.2.3.3.11"
                                   codeSystemName="ICD-10"/>
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
                            <code code="DE04.10.188.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="体重(kg)"/>
                            <value xsi:type="PQ" value="${surgicalCareRecord.体重!'体重'}" unit="kg"/>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 实验室检查 -->
            <component>
                <section>
                    <code code="30954-2" displayName="STUDIES SUMMARY" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <organizer classCode="BATTERY" moodCode="EVN">
                            <statusCode/>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.001.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="CD" code="${surgicalCareRecord.ABO血型代码!'ABO血型代码'}" displayName="${surgicalCareRecord.ABO血型!'ABO血型'}" codeSystem="2.16.156.10011.2.3.1.85"
                                           codeSystemName="ABO血型代码表"/>
                                </observation>
                            </component>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.010.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName=""/>
                                    <value xsi:type="CD" code="${surgicalCareRecord.RH血型代码!'RH血型代码'}" displayName="${surgicalCareRecord.RH血型!'RH血型'}" codeSystem="2.16.156.10011.2.3.1.250"
                                           codeSystemName="Rh(d)血型代码表"/>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 皮肤 -->
            <component>
                <section>
                    <code code="29302-7" displayName="INTEGUMENTARY SUSTEM" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.10.126.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="皮肤检查描述"/>
                            <value xsi:type="PQ" value="${surgicalCareRecord.皮肤检查描述!'皮肤检查描述'}" unit="kg"/>
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
                    <entry typeCode="DRIV">
                        <act classCode="ACT" moodCode="EVN">
                            <code/>
                            <entryRelationship typeCode="SUBJ">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.023.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="过敏史标志"/>
                                    <value xsi:type="BL" value="${surgicalCareRecord.过敏史标志!'过敏史标志'}"/>
                                    <participant typeCode="CSM">
                                        <participantRole classCode="MANU">
                                            <playingEntity classCode="MMAT">
                                                <code code="DE02.10.022.00" codeSystem="2.16.156.10011.2.2.1"
                                                      codeSystemName="卫生信息数据元目录" displayName="过敏史"/>
                                                <desc xsi:type="ST">${surgicalCareRecord.过敏史!'过敏史'}</desc>
                                            </playingEntity>
                                        </participantRole>
                                    </participant>
                                </observation>
                            </entryRelationship>
                        </act>
                    </entry>
                </section>
            </component>
            <!-- 护理记录 -->
            <component>
                <section>
                    <code displayName="护理记录"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.211.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理等级代码"/>
                            <value xsi:type="CD" code="${surgicalCareRecord.护理等级代码!'护理等级代码'}" displayName="${surgicalCareRecord.护理等级!'护理等级'}" codeSystem="2.16.156.10011.2.3.1.259"
                                   codeSystemName="护理等级代码表"/>
                        </observation>
                    </entry>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.212.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理类型代码"/>
                            <value xsi:type="CD" code="${surgicalCareRecord.护理类型代码!'护理类型代码'}" displayName="${surgicalCareRecord.护理类型!'护理类型'}" codeSystem="2.16.156.10011.2.3.1.259"
                                   codeSystemName="护理类型代码表"/>
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
                            <value xsi:type="ST">${surgicalCareRecord.护理观察项目名称!'护理观察项目名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE02.10.028.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="护理观察结果"/>
                                    <value xsi:type="ST">${surgicalCareRecord.护理观察结果!'护理观察结果'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 护理操作 -->
            <component>
                <section>
                    <code displayName="护理操作"/>
                    <text/>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.342.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="护理操作名称"/>
                            <value xsi:type="ST">${surgicalCareRecord.护理操作名称!'护理操作名称'}</value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.210.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="护理操作项目类目名称"/>
                                    <value xsi:type="ST">${surgicalCareRecord.护理操作项目类目名称!'护理操作项目类目名称'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.209.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="护理操作结果"/>
                                            <value xsi:type="ST">${surgicalCareRecord.护理操作结果!'护理操作结果'}</value>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </entry>
                </section>
            </component>
            <!-- 器械物品核对 -->
            <component>
                <section>
                    <code displayName="术前器械物品核对"/>
                    <text/>
                    <!-- 术前 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <code/>
                            <statusCode code="completed"/>
                            <!-- 巡台护士 -->
                            <participant typeCode="ATND">
                                <time value=""/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="巡台护士"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.巡台护士签名!'巡台护士签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <!-- 器械护士 -->
                            <participant typeCode="ATND">
                                <time value=""/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="器械护士"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.器械护士签名!'器械护士签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.042.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="术中所用物品名称"/>
                                    <value xsi:type="ST">${surgicalCareRecord.术中所用物品名称!'术中所用物品名称'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE09.00.111.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="术前清点标志"/>
                                            <value xsi:type="BL" value="${surgicalCareRecord.术前清点标志!'术前清点标志'}"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 关前核对 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <code/>
                            <statusCode/>
                            <!-- 巡台护士 -->
                            <participant typeCode="ATND">
                                <time value=""/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="巡台护士"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.巡台护士签名!'巡台护士签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <!-- 器械护士 -->
                            <participant typeCode="ATND">
                                <time value=""/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="器械护士"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.器械护士签名!'器械护士签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.042.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="术中所用物品名称"/>
                                    <value xsi:type="ST">${surgicalCareRecord.术中所用物品名称!'术中所用物品名称'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.204.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="关前核对标志"/>
                                            <value xsi:type="BL" value="${surgicalCareRecord.关前核对标志!'关前核对标志'}"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                    <!-- 关后核对 -->
                    <entry>
                        <organizer classCode="CLUSTER" moodCode="EVN">
                            <code/>
                            <statusCode code="completed"/>
                            <!-- 巡台护士 -->
                            <participant typeCode="ATND">
                                <time value=""/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="巡台护士"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.巡台护士签名!'巡台护士签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <!-- 器械护士 -->
                            <participant typeCode="ATND">
                                <time value=""/>
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="器械护士"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.器械护士签名!'器械护士签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                            <component>
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.042.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="术中所用物品名称"/>
                                    <value xsi:type="ST">${surgicalCareRecord.术中所用物品名称!'术中所用物品名称'}</value>
                                    <entryRelationship typeCode="COMP">
                                        <observation classCode="OBS" moodCode="EVN">
                                            <code code="DE06.00.204.00" codeSystem="2.16.156.10011.2.2.1"
                                                  codeSystemName="卫生信息数据元目录" displayName="关后核对标志"/>
                                            <value xsi:type="BL" value="${surgicalCareRecord.关后核对标志!'关后核对标志'}"/>
                                        </observation>
                                    </entryRelationship>
                                </observation>
                            </component>
                        </organizer>
                    </entry>
                </section>
            </component>
            <!-- 手术操作 -->
            <component>
                <section>
                    <code code="47519-4" displayName="HISTORY OF PROCEDURES" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <text/>
                    <entry>
                        <procedure classCode="PROC" moodCode="EVN">
                            <code code="${surgicalCareRecord.手术及操作编码!'手术及操作编码'}" displayName="${surgicalCareRecord.手术及操作名称!'手术及操作名称'}" codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术操作代码表(ICD-9-CM)"/>
                            <statusCode/>
                            <effectiveTime>
                                <low value="${surgicalCareRecord.手术开始日期时间!'手术开始日期时间'}"/>
                                <high value="${surgicalCareRecord.手术结束日期时间!'手术结束日期时间'}"/>
                            </effectiveTime>
                            <!-- 手术目标部位 -->
                            <targetSiteCode code="" displayName="${surgicalCareRecord.手术目标部位名称!'手术目标部位名称'}" codeSystem="2.16.156.10011.2.3.1.266"
                                            codeSystemName="手术目标部位编码"/>
                            <performer>
                                <assignedEntity>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="手术操作者"/>
                                    <assignedPerson>
                                        <name>${surgicalCareRecord.手术者姓名!'手术者姓名'}</name>
                                    </assignedPerson>
                                </assignedEntity>
                            </performer>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.30.060.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="术中病理标志"/>
                                    <value xsi:type="BL" value="${surgicalCareRecord.术中病理标志!'术中病理标志'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.317.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="准备事项"/>
                                    <value xsi:type="BL" value="${surgicalCareRecord.准备事项!'准备事项'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE06.00.256.00" codeSystem="2.16.156.10011.2.2.1"
                                          codeSystemName="卫生信息数据元目录" displayName="手术间编号"/>
                                    <value xsi:type="BL" value="${surgicalCareRecord.手术间编号!'手术间编号'}"/>
                                </observation>
                            </entryRelationship>
                            <entryRelationship typeCode="COMP">
                                <organizer classCode="BATTERY" moodCode="EVN">
                                    <statusCode/>
                                    <effectiveTime>
                                        <low value="${surgicalCareRecord.入手术室日期吋间!'入手术室日期吋间'}"/>
                                        <high value="${surgicalCareRecord.出手术室日期时间!'出手术室日期时间'}"/>
                                    </effectiveTime>
                                </organizer>
                            </entryRelationship>
                        </procedure>
                    </entry>
                </section>
            </component>
            <!-- 住院过程 术后交接-->
            <component>
                <section>
                    <code code="8648-8" displayName="Hospital Course" codeSystem="2.16.840.1.113883.6.1"
                          codeSystemName="LOINC"/>
                    <title>住院过程</title>
                    <entry>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.206.00" codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"
                                  displayName="病人交接核对项目"/>
                            <value xsi:type="ST">${surgicalCareRecord.病人交接核对项目!'病人交接核对项目'}</value>
                            <!-- 交接护士 -->
                            <author>
                                <time value="${surgicalCareRecord.交接日期时间!'交接日期时间'}"/>
                                <assignedAuthor>
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="交接护士"/>
                                    <assignedPerson>
                                        <name>${surgicalCareRecord.交接护士签名!'交接护士签名'}</name>
                                    </assignedPerson>
                                </assignedAuthor>
                            </author>
                            <!-- 转运者 -->
                            <participant typeCode="ATND">
                                <participantRole classCode="ASSIGNED">
                                    <id root="2.16.156.10011.1.4" extension=""/>
                                    <code displayName="转运者"/>
                                    <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                        <name>${surgicalCareRecord.转运者签名!'转运者签名'}</name>
                                    </playingEntity>
                                </participantRole>
                            </participant>
                        </observation>
                    </entry>
                </section>
            </component>
        </structuredBody>
    </component>
</ClinicalDocument>