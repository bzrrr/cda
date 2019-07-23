<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.25"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension=""/>
    <code code="C0005" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>中药处方</title>
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
            <!-- 处方编号 -->
            <id root="2.16.156.10011.1.20" extension=""/>

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
            <!-- 开立科室 -->
            <providerOrganization>
                <id root="2.16.156.10011.1.26"/>
                <!-- 处方开立科室 -->
                <name></name>
                <asOrganizationPartOf>
                    <wholeOrganization>
                        <!-- 机构代码 -->
                        <id root="2.16.156.10011.1.5" extension=""/>
                        <!-- 机构名称 -->
                        <name></name>
                    </wholeOrganization>
                </asOrganizationPartOf>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 文档创建者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 处方开立日期 -->
        <time value=""/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <!-- 处方开立医师 -->
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
    <!-- 签名 -->
    <legalAuthenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方开立医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <!-- 处方审核药剂师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方审核药剂师"/>
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

    <!-- 处方核对药剂师 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方核对药剂师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${patient.archiverName!}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 处方发药药剂师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方发药药剂师"/>
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


    <!-- 诊断章节 -->
    <component>
        <section>
            <code code="29548-5" displayName="Diagnosis"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 条目:诊断 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="西医诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.11"
                           codeSystemName="诊断代码表(ICD-10)" displayName=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.130.00" displayName="中医诊断病名代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="中医诊断病名代码"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                           codeSystemName="中医病症分类与代码表(GB/T 15657)" displayName=""/>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.130.00" displayName="中医证候代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录">
                        <qualifier>
                            <name displayName="中医证候代码"></name>
                        </qualifier>
                    </code>
                    <value xsi:type="CD" code="" codeSystem="2.16.156.10011.2.3.3.14"
                           codeSystemName="中医病症分类与代码表(GB/T 15657)" displayName=""/>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 用药章节 -->
    <component>
        <section>
            <code code="10160-0" displayName="HISTORY OF MEDICATION USE"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 处方条目 -->
            <entry>
                <substanceAdministration classCode="SBADM" moodCode="EVN">
                    <text/>
                    <routeCode code="" codeSystem="2.16.156.10011.2.3.1.158"
                               codeSystemName="用药途径代码表" displayName=""/>
                    <!-- 用药剂量-单次 -->
                    <doseQuantity value="" unit=""/>
                    <!-- 用药频率 -->
                    <rateQuantity value="" unit=""/>
                    <!-- 药物剂型 -->
                    <administrationUnitCode code="" displayName=""
                                            codeSystem="2.16.156.10011.2.3.1.211" codeSystemName="药物剂型代码表"/>
                    <consumable>
                        <manufacturedProduct>
                            <manufacturedLabeledDrug>
                                <!-- 药品代码及名称(通用名) -->
                                <code/>
                                <name></name>
                            </manufacturedLabeledDrug>
                        </manufacturedProduct>
                    </consumable>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.043.00" displayName="药物规格"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">规格描述</value>
                        </observation>
                    </entryRelationship>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.135.00" displayName="药物使用总剂量"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="" unit=""></value>
                        </observation>
                    </entryRelationship>
                </substanceAdministration>
            </entry>

            <!-- 处方有效天数 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.294.00" displayName="处方有效天数"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="" unit=""></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.50.056.00" displayName="处方药品组号"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="INT" value=""></value>
                </observation>
            </entry>

            <!-- 中药饮片处方 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.50.049.00" displayName="中药饮片处方"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">中药饮片处方详细描述</value>

                    <!-- 中药饮片剂数 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.050.00" displayName="中药饮片剂数"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="" unit=""></value>
                        </observation>
                    </entryRelationship>

                    <!-- 中药饮片煎煮法 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.047.00" displayName="中药饮片煎煮法"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">中药饮片煎煮方法描述</value>
                        </observation>
                    </entryRelationship>

                    <!-- 中药用药方法 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" displayName="中药用药法"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">中药用药方法描述</value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>

            <!-- 处方类别代码 DE08.50.032.00 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.50.032.00" displayName="处方类别代码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="" displayName=""
                    codeSystem="2.16.156.10011.2.3.2.40" codeSystemName="处方类别代码表"></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 费用章节 -->
    <component>
        <section>
            <code code="48768-6" displayName="PAYMENT SOURCES"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE07.00.004.00" displayName="处方药品金额"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="MO" value="" currency=""></value>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 治疗计划章节 -->
    <component>
        <section>
            <code code="18776-5" displayName="TREATMENT PLAN"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 处方备注信息 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.179.00" displayName="处方备注信息"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">备注信息描述</value>
                </observation>
            </entry>
            <!-- 治则治法 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.300.00" displayName="治则治法"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">自由文本</value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>