<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.29"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0009" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>一般手术记录</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门诊号标识 -->
            <id root="2.16.156.10011.1.11" extension="${generalSurgicalRecord.门急诊号!'门急诊号'}"/>
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension="${generalSurgicalRecord.住院号!'住院号'}"/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension="${generalSurgicalRecord.电子申请单编号!'电子申请单编号'}"/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!'患者姓名'}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age unit="岁" value="${generalSurgicalRecord.年龄岁!'年龄岁'}"/>
            </patient>
        </patientRole>
    </recordTarget>
    <!-- 文档创作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension="${patient.建档者序号!'建档者唯一标识符'}"/>
            <!-- 医师姓名 -->
            <assignedPerson>
                <name>${patient.建档者姓名!'建档者姓名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 保管机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${patient.建档医疗机构组织机构!'建档医疗机构组织机构'}"/>
                <name>${orgName!'建档医疗机构组织机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>

    <!-- 手术者签名 -->
    <authenticator>
        <!-- 签名日期时间 -->
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="手术者"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${generalSurgicalRecord.手术者签名!'手术者签名'}</name>
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
                                <id root="2.16.156.10011.1.22" extension="${generalSurgicalRecord.病床号!'病床号'}"/>
                                <name></name>
                                <!-- DE01.00.019.00 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension="${generalSurgicalRecord.病房号!'病房号'}"/>
                                        <name></name>
                                        <!-- DE08.10.026.00 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${generalSurgicalRecord.科室名称!'科室名称'}</name>
 .                                               <!-- DE08.10.054.00 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${generalSurgicalRecord.病区名称!'病区名称'}</name>
                                                        <!-- xx医院 -->
                                                        <asOrganizationPartOf classCode="PART">
                                                            <wholeOrganization classCode="ORG"
                                                                               determinerCode="INSTANCE">
                                                                <id root="2.16.156.10011.1.5" extension=""/>
                                                                <name>${orgName!'建档医疗机构组织机构名称'}</name>
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

    <!-- 既往史章节 -->
    <component>
        <section>
            <code code="11348-0" displayName="HISTORY OF PAST ILLNESS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 手术史 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.062.00" displayName="手术史标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value="${generalSurgicalRecord.手术史标志!'手术史标志'}"></value>
                </observation>
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
                    <value xsi:type="CD" code="${generalSurgicalRecord.术前诊断编码!'术前诊断编码'}" displayName="${generalSurgicalRecord.术前诊断名称!'术前诊断名称'}"
                           codeSystem="2.16.156.10011.2.3.3.11.3" codeSystemName="诊断代码表(ICD-10)"/>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 手术章节 -->
    <component>
        <section>
            <code code="47519-4" displayName="HISTORY OF PROCEDURES"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <!-- 手术记录 -->
                <procedure classCode="PROC" moodCode="EVN">
                    <code code="DE05.01.024.00"
                          codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                    <!-- 操作日期/时间 -->
                    <effectiveTime>
                        <!-- 手术开始日期时间 -->
                        <low value="${generalSurgicalRecord.手术开始日期时间!'手术开始日期时间'}"/>
                        <!-- 手术结束日期时间 -->
                        <high value="${generalSurgicalRecord.手术结束日期时间!'手术结束日期时间'}"/>
                    </effectiveTime>
                    <!-- 手术者 -->
                    <performer typeCode="PRF">
                        <assignedEntity>
                            <id root="2.16.156.10011.1.4" extension=""/>
                            <assignedPerson>
                                <name>${generalSurgicalRecord.手术者签名!'手术者签名'}</name>
                            </assignedPerson>
                        </assignedEntity>
                    </performer>
                    <!-- 第一助手 -->
                    <participant typeCode="ATND">
                        <participantRole classCode="ASSIGNED">
                            <id root="2.16.156.10011.1.4" extension=""/>
                            <code displayName="Ⅰ助"/>
                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                <name>${generalSurgicalRecord.ｉ助姓名!'ｉ助姓名'}</name>
                            </playingEntity>
                        </participantRole>
                    </participant>

                    <!-- 第二助手 -->
                    <participant typeCode="ATND">
                        <participantRole classCode="ASSIGNED">
                            <id root="2.16.156.10011.1.4" extension=""/>
                            <code displayName="Ⅱ助"/>
                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                <name>${generalSurgicalRecord.ii助姓名!'ii助姓名'}</name>
                            </playingEntity>
                        </participantRole>
                    </participant>

                    <!-- 器械护士姓名 -->
                    <participant typeCode="ATND">
                        <participantRole classCode="ASSIGNED">
                            <id root="2.16.156.10011.1.4" extension=""/>
                            <code displayName="器械护士"/>
                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                <name>${generalSurgicalRecord.器械护士姓名!'器械护士姓名'}</name>
                            </playingEntity>
                        </participantRole>
                    </participant>

                    <!-- 巡台护士姓名 -->
                    <participant typeCode="ATND">
                        <participantRole classCode="ASSIGNED">
                            <id root="2.16.156.10011.1.4" extension=""/>
                            <code displayName="巡台护士"/>
                            <playingEntity classCode="PSN" determinerCode="INSTANCE">
                                <name>${generalSurgicalRecord.巡台护士姓名!'巡台护士姓名'}</name>
                            </playingEntity>
                        </participantRole>
                    </participant>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.094.00" displayName="手术(操作)名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.手术名称!'手术名称'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 手术间编号 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.256.00" displayName="患者实施手术所在的手术室编号"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.手术间编号!'手术间编号'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 手术级别 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.255.00" displayName="手术级别"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${generalSurgicalRecord.手术级别代码!'手术级别代码'}" displayName="${generalSurgicalRecord.手术级别!'手术级别'}"
                                   codeSystem="2.16.156.10011.2.3.1.258" codeSystemName="手术级别代码表"/>
                        </observation>
                    </entryRelationship>
                </procedure>
            </entry>
        </section>
    </component>

    <!-- 失血章节 -->
    <component>
        <section>
            <code code="55103-6" displayName="Surgical operation note estimated blood loss"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 出血量(ml) -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.097.00" displayName="出血量(ml)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="ml" value="${generalSurgicalRecord.出血量!'出血量'}"></value>
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
            <!-- 输血量(ml) -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.267.00" displayName="输血量(ml)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="ml" value="${generalSurgicalRecord.输血量!'输血量'}"></value>
                </observation>
            </entry>
            <!-- 输血反应标志 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.264.00" displayName="输血反应标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value="${generalSurgicalRecord.输血反应标志!'输血反应标志'}"></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 麻醉章节 -->
    <component>
        <section>
            <code code="10213-7" displayName="Surgical operation note anesthesia"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <!-- 麻醉方式代码 -->
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.073.00" displayName="麻醉方式代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="${generalSurgicalRecord.麻醉方法代码!'麻醉方法代码'}" displayName="${generalSurgicalRecord.麻醉方法!'麻醉方法'}"
                           codeSystem="2.16.156.10011.2.3.1.159" codeSystemName="麻醉方式代码表"/>
                    <!-- 麻醉医师姓名 -->
                    <performer>
                        <assignedEntity>
                            <id/>
                            <assignedPerson>
                                <name>${generalSurgicalRecord.麻醉医师姓名!'麻醉医师姓名'}</name>
                            </assignedPerson>
                        </assignedEntity>
                    </performer>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 用药章节 -->
    <component>
        <section>
            <code code="10160-0" displayName="History of medication use"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 术前用药 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.136.00" displayName="术前用药"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="术前用药"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="ST">${generalSurgicalRecord.术前用药!'术前用药'}</value>
                </observation>
            </entry>

            <!-- 术中用药 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.136.00" displayName="术中用药"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="术中用药"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="ST">${generalSurgicalRecord.术中用药!'术中用药'}</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 输液章节 -->
    <component>
        <section>
            <code code="10216-0" displayName="Surgical operation note fluids"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 输液量(ml) -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.268.00" displayName="输液量(ml)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" unit="ml" value="${generalSurgicalRecord.输液量!'输液量'}"></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 术后诊断章节 -->
    <component>
        <section>
            <code code="10218-6" displayName="Surgical operation note postoperaive Dx"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 术后诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE05.01.024.00" displayName="术后诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="${generalSurgicalRecord.术后诊断编码!'术后诊断编码'}"
                           codeSystem="2.16.156.10011.2.3.2.38" codeSystemName="诊断代码表(ICD-10)" displayName="${generalSurgicalRecord.术后诊断名称!'术后诊断名称'}" />
                </observation>
            </entry>
        </section>
    </component>

    <!-- 手术过程描述章节 -->
    <component>
        <section>
            <code code="8724-7" displayName="Surgical operation note description"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 手术过程描述 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE05.10.063.00" displayName="手术过程描述"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${generalSurgicalRecord.手术过程描述!'手术过程描述'}</value>
                    <!-- 手术目标部位名称 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.187.00" displayName="手术目标部位名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.手术目标部位名称!'手术目标部位名称'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 介入物名称 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.037.00" displayName="介入物名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.介入物名称!'介入物名称'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 手术体位代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.260.00" displayName="手术体位代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${generalSurgicalRecord.手术体位代码!'手术体位代码'}" displayName="${generalSurgicalRecord.手术体位名称!'手术体位名称'}"
                                   codeSystem="2.16.156.10011.2.3.1.262" codeSystemName="手术体位代码表"/>
                        </observation>
                    </entryRelationship>

                    <!-- 皮肤消毒描述 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.057.00" displayName="皮肤消毒描述"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.皮肤消毒描述!'皮肤消毒描述'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 手术切口描述 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.321.00" displayName="手术切口描述"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.手术史标志!'手术史标志'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 引流标志 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE05.10.165.00" displayName="引流标志"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="BL" value="${generalSurgicalRecord.手术切口描述!'手术切口描述'}"></value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 引流章节 -->
    <component>
        <section>
            <code code="11537-8" displayName="Surgical drains"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 引流标志 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE05.10.165.00" displayName="引流标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value="${generalSurgicalRecord.引流标志!'引流标志'}"/>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.044.00" displayName="引流材料名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.引流材料名称!'引流材料名称'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.045.00" displayName="引流材料数目"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.引流材料数目!'引流材料数目'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.341.00" displayName="放置部位"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${generalSurgicalRecord.放置部位!'放置部位'}</value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>