<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.27"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0007" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>检验报告</title>
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
            <!-- 检验报告单号标识 -->
            <id root="2.16.156.10011.1.33" extension=""/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension=""/>
            <!-- 检验标本编号标识 -->
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
    <!-- 检验报告医师(文档创作者) -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 检验报告日期 -->
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

    <!-- 检验技师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="检验技师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 检验医师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="检验医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 检验申请机构及科室 -->
    <participant typeCode="PRF">
        <associatedEntity classCode="ASSIGNED">
            <scopingOrganization>
                <id root="2.16.156.10011.1.26"/>
                <!-- 检验申请科室 -->
                <name></name>
                <asOrganizationPartOf>
                    <wholeOrganization>
                        <id root="2.16.156.10011.1.5" extension=""/>
                        <!-- 检验申请机构 -->
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

    <!-- 实验室检查章节 -->
    <component>
        <section>
            <code code="30954-2" displayName="STUDIES SUMMARY"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.027.00" displayName="检验方法名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者接受医学检查项目所采用的检验方法名称</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.018.00" displayName="检验类别"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">患者检验项目所属的类别详细描述</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.019.00" displayName="检验项目代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <!-- 检验时间 -->
                    <effectiveTime value=""></effectiveTime>
                    <value xsi:type="ST">患者检验项目在特定编码体系中的代码</value>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.50.134.00" displayName="标本类别"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <!-- DE04.50.137.00 标本采样日期时间 DE04.50.141.00 接受标本日期时间 -->
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
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.017.00" displayName="检验结果代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                           codeSystem="2.16.156.10011.2.3.2.38" codeSystemName="检查(检验)结果代码"/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.015.00" displayName="检验定量结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="REAL" value=""></value>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.016.00" displayName="检查定量结果计量单位"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">计量单位</value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 检验报告章节 -->
    <component>
        <section>
            <code displayName="检验报告"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.130.00" displayName="检验报告结果"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检验报告结果</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.026.00" displayName="检验报告科室"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检验报告科室</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.013.00" displayName="检验报告机构名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检验报告机构名称</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.179.00" displayName="检验报告备注"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">检验报告备注信息</value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>