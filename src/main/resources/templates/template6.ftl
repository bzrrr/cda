<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.26"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0006" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>检查报告</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value=""/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门(急)诊号 -->
            <id root="2.16.156.10011.1.11" extension=""/>
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension=""/>
            <!-- 检查报告单号标识 -->
            <id root="2.16.156.10011.1.32" extension=""/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension=""/>
            <!-- 标本编号标识 -->
            <id root="2.16.156.10011.1.14" extension=""/>

            <!-- 患者类别代码 -->
            <patientType>
                <patienttypeCode code="" codeSystem="2.16.156.10011.2.3.1.271"
                                 codeSystemName="患者类型代码表" displayName=""></patienttypeCode>
            </patientType>
            <telecom value=""/>

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
    <!-- 检查报告医师(文档创作者) -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 检查报告日期 -->
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
    <!-- 审核医师签名 -->
    <legalAuthenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="审核医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <!-- 检查技师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="检查技师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 处方调配药剂师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方调配药剂师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 检查医师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="检查医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 检查申请机构及科室 -->
    <participant typeCode="PRF">
        <associatedEntity classCode="ASSIGNED">
            <scopingOrganization>
                <id root="2.16.156.10011.1.26"/>
                <!-- 检查申请科室 -->
                <name></name>
                <asOrganizationPartOf>
                    <wholeOrganization>
                        <id root="2.16.156.10011.1.5" extension=""/>
                        <!-- 检查申请机构 -->
                        <name></name>
                    </wholeOrganization>
                </asOrganizationPartOf>
            </scopingOrganization>
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
            <effectiveTime/>
            <location>
                <healthCareFacility>
                    <serviceProviderOrganization>
                        <asOrganizationPartOf classCode="PART">
                            <!-- DE01.00.026.00 病床号 -->
                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                <id root="2.16.156.10011.1.22" extension=""/>
                                <!-- DE01.00.019.00 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension=""/>
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
                                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
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

    <!-- 诊断记录章节 -->
    <component>
        <section>
            <code code="29548-5" displayName="Diagnosis"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 条目:诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="诊断代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <!-- 诊断日期 -->
                    <effectiveTime value=""></effectiveTime>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11.3"
                           codeSystemName="诊断代码表(ICD-10)" displayName=""/>
                    <performer>
                        <assignedEntity>
                            <id/>
                            <representedOrganization>
                                <!-- 诊断机构 -->
                                <name></name>
                            </representedOrganization>
                        </assignedEntity>
                    </performer>
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
                    <value xsi:type="ST">对患者本次疾病相关的主要症状及其持续时间的描述,一般由患者本人或监护人描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 症状章节 -->
    <component>
        <section>
            <code code="11450-4" displayName="CHIEF COMPLAINT"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 症状描述条目 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.01.117.00" displayName="症状描述"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <!-- 症状开始时间与停止时间 -->
                    <effectiveTime>
                        <low value=""/>
                        <high value=""/>
                    </effectiveTime>
                    <value xsi:type="ST">症状描述</value>
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

            <entry>
                <!-- 手术记录 -->
                <procedure classCode="PROC" moodCode="EVN">
                    <code code="" codeSystem="2.16.156.10011.2.3.3.12"
                          codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                    <statusCode/>
                    <!-- 操作日期/时间 -->
                    <effectiveTime value=""/>
                    <!-- 操作部位代码 -->
                    <targetSiteCode code="" codeSystem="2.16.156.10011.2.3.1.266"
                                    codeSystemName="操作部位代码表"/>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.094.00" displayName="手术(操作)名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">名称描述</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.093.00" displayName="手术及操作目标部位名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">手术及操作目标部位名称</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.037.00" displayName="介入物名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">介入物名称</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.251.00" displayName="操作方法描述"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">操作方法描述</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.250.00" displayName="操作次数"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">操作次数</value>
                        </observation>
                    </entryRelationship>

                    <!-- 麻醉信息 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.073.00" displayName="麻醉方式代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.1.159"
                            codeSystemName="麻醉方式代码表"></value>
                            <!-- 麻醉医师签名 -->
                            <performer>
                                <assignedEntity>
                                    <id/>
                                    <representedOrganization>
                                        <name></name>
                                    </representedOrganization>
                                </assignedEntity>
                            </performer>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.028.00" displayName="麻醉观察结果"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">麻醉观察结果</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.307.00" displayName="麻醉中西医标识代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.2.41"
                            codeSystemName="麻醉中西医标识代码表"></value>
                        </observation>
                    </entryRelationship>
                </procedure>
            </entry>
        </section>
    </component>

    <!-- 体格检查章节 -->
    <component>
        <section>
            <code code="29545-1" displayName="PHYSICAL EXAMINATION"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 特殊检查条目 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.01.079.00" displayName="特殊检查标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">标识患者有无特殊检查操作经历的标志</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.027.00" displayName="检查方法名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者接受医学检查项目所采用的检查方法名称</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.018.00" displayName="检查类别"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者检查项目所属的类别详细描述</value>
                </observation>
            </entry>

            <entry>
                <organizer classCode="CLUSTER" moodCode="EVN">
                    <statusCode></statusCode>
                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.019.00" displayName="检查项目代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <!-- 检查日期 -->
                            <effectiveTime value=""/>
                            <value xsi:type="ST">患者检查项目在特定编码体系中的代码</value>

                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.134.00" displayName="标本类别"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <!-- DE04.50.137.00 标本采样日期时间  DE04.50.141.00接受标本日期时间-->
                                    <effectiveTime>
                                        <low value=""/>
                                        <high value=""/>
                                    </effectiveTime>
                                    <value xsi:type="ST">标本类别</value>
                                </observation>
                            </entryRelationship>

                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.135.00" displayName="标本状态"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">标本状态</value>
                                </observation>
                            </entryRelationship>

                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.027.00" displayName="标本固定液名称"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">标本固定液名称</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.017.00" displayName="检查结果代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.2.38"
                            codeSystemName="检查(检验)结果代码表"></value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.015.00" displayName="检查定量结果"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="REAL" value=""></value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.30.016.00" displayName="检查定量结果计量单位"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">检查定量结果计量单位</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </component>
                </organizer>
            </entry>
        </section>
    </component>

    <!-- 其他处置章节 -->
    <component>
        <section>
            <code displayName="其他处置章节"/>
            <text/>
            <!-- 诊疗过程描述 -->
            <entry typeCode="COMP">
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.296.00" displayName="诊疗过程描述"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">对患者诊疗过程的详细描述</value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 检查报告章节 -->
    <component>
        <section>
            <code displayName="检查报告"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.131.00" displayName="检查报告结果-客观所见"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检查报告结果-客观所见</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.131.00" displayName="检查报告结果-主观提示"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检查报告结果-主观提示</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.026.00" displayName="检查报告科室"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检查报告科室</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.013.00" displayName="检查报告机构名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检查报告机构名称</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.179.00" displayName="检查报告备注"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检查报告备注信息</value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>