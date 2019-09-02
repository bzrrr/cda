<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.24"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0004" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>西药处方</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门(急)诊号标识 -->
            <id root="2.16.156.10011.1.11" extension="${xyPrescription.门急诊号!'门急诊号'}"/>
            <!-- 处方编号 -->
            <id root="2.16.156.10011.1.20" extension="${xyPrescription.处方编号!'处方编号'}"/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!'患者姓名'}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age unit="岁" value="${xyPrescription.年龄岁!'年龄岁'}"/>
            </patient>
            <!-- 开立科室 -->
            <providerOrganization>
                <id root="2.16.156.10011.1.26"/>
                <!-- 科室名称 -->
                <name>${xyPrescription.处方开立科室名称!'处方开立科室名称'}</name>
                <asOrganizationPartOf>
                    <wholeOrganization>
                        <!-- 机构代码 -->
                        <id root="2.16.156.10011.1.5" extension="${xyPrescription.医疗机构组织机构代码!'医疗机构组织机构代码'}"/>
                        <!-- 机构名称 -->
                        <name>${orgName!'机构名称'}</name>
                    </wholeOrganization>
                </asOrganizationPartOf>
            </providerOrganization>
        </patientRole>
    </recordTarget>
    <!-- 创建者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 处方开立日期 -->
        <time value="${xyPrescription.处方开立日期!'处方开立日期'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <!-- 处方开立医师 -->
            <assignedPerson>
                <name>${xyPrescription.处方开立医师签名!'处方开立医师签名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 保管机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${xyPrescription.医疗机构组织机构代码!'医疗机构组织机构代码'}"/>
                <name>${orgName!'机构名称'}</name>
            </representedCustodianOrganization>
        </assignedCustodian>
    </custodian>
    <!-- 处方审核药剂师签名 -->
    <legalAuthenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方审核药剂师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${xyPrescription.处方审核药剂师签名!'处方审核药剂师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </legalAuthenticator>

    <!-- 处方调配药剂师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方调配药剂师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${xyPrescription.处方调配药剂师签名!'处方调配药剂师签名'}</name>
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
                <name>${xyPrescription.处方核对药剂师签名!'处方核对药剂师签名'}</name>
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
                <name>${xyPrescription.处方发药药剂师签名!'处方发药药剂师签名'}</name>
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
                    <value xsi:type="CD" code="${xyPrescription.疾病诊断编码!'疾病诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11.1"
                           codeSystemName="诊断代码表(ICD-10)">${xyPrescription.疾病诊断名称!'疾病诊断名称'}</value>
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
            <entry>
                <substanceAdministration classCode="SBADM" moodCode="EVN">
                    <text/>
                    <routeCode code="${xyPrescriptionDetail.用药途径代码!'用药途径代码'}" codeSystem="2.16.156.10011.2.3.1.158"
                               codeSystemName="用药途径代码表" displayName="${xyPrescriptionDetail.用药途径!'用药途径'}"/>
                    <!-- 用药剂量-单次 -->
                    <doseQuantity value="${xyPrescriptionDetail.药物使用次剂量!'药物使用次剂量'}" unit="${xyPrescriptionDetail.药物使用剂量单位!'药物使用剂量单位'}"/>
                    <!-- 用药频率 -->
                    <rateQuantity value="${xyPrescriptionDetail.药物使用频次!'药物使用频次'}" unit=""/>
                    <!-- 药物剂型 -->
                    <administrationUnitCode code="${xyPrescriptionDetail.药物剂型代码!'药物剂型代码'}" codeSystemName="药物剂型代码表"
                                            codeSystem="2.16.156.10011.2.3.1.211" displayName="${xyPrescriptionDetail.药物剂型值!'药物剂型值'}"/>
                    <consumable>
                        <manufacturedProduct>
                            <manufacturedLabeledDrug>
                                <!-- 药品代码及名称(通用名) -->
                                <code/>
                                <name>${xyPrescriptionDetail.药物名称!'药物名称'}</name>
                            </manufacturedLabeledDrug>
                        </manufacturedProduct>
                    </consumable>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.043.00" displayName="药物规格"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${xyPrescriptionDetail.药物规格!'药物规格'}</value>
                        </observation>
                    </entryRelationship>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.135.00" displayName="药物使用总剂量"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="${xyPrescriptionDetail.药物使用总剂量!'药物使用总剂量'}"></value>
                        </observation>
                    </entryRelationship>
                </substanceAdministration>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.294.00" displayName="处方有效天数"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="${xyPrescription.处方有效天数!'处方有效天数'}" unit="天"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.50.056.00" displayName="处方药品组号"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="INT" value="${xyPrescriptionDetail.处方药品组号!'处方药品组号'}"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.179.00" displayName="处方备注信息"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${xyPrescription.处方备注信息!'处方备注信息'}</value>
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
                    <value xsi:type="MO" value="${xyPrescription.处方药品金额!'处方药品金额'}" currency="元"></value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>