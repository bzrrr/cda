<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.28"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0008" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>治疗记录</title>
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
            <id root="2.16.156.10011.1.11" extension="${treatmentRecord.门急诊号!'门急诊号'}"/>
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension="${treatmentRecord.住院号!'住院号'}"/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension="${treatmentRecord.电子申请单编号!'电子申请单编号'}"/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!'患者姓名'}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}"/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age unit="岁" value="${treatmentRecord.年龄岁!'年龄岁'}"/>
            </patient>
        </patientRole>
    </recordTarget>
    <!-- 文档创作者 -->
    <author typeCode="AUT" contextControlCode="OP">
        <time value="${patient.建档日期时间!'建档日期时间'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension="${patient.建档者序号!'建档者序号'}"/>
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

    <!-- 医嘱执行者签名 -->
    <authenticator>
        <!-- 签名日期时间 -->
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="医嘱执行者"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${treatmentRecord.医嘱执行者签名!'医嘱执行者签名'}</name>
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
                                <id root="2.16.156.10011.1.22" extension="${treatmentRecord.病床号!'病床号'}"/>
                                <name></name>
                                <!-- DE01.00.019.00 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension="${treatmentRecord.病房号!'病房号'}"/>
                                        <name></name>
                                        <!-- DE08.10.026.00 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${treatmentRecord.科室名称!'科室名称'}</name>
                                                <!-- DE08.10.054.00 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${treatmentRecord.病区名称!'病区名称'}</name>
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
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.10.165.00" displayName="有创诊疗操作标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value="${treatmentRecord.有创诊疗操作标志!'有创诊疗操作标志'}"></value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.023.00" displayName="过敏史标志"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="BL" value="${treatmentRecord.过敏史标志!'过敏史标志'}"></value>
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.022.00" displayName="过敏史"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.过敏史!'过敏史'}</value>
                        </observation>
                    </entryRelationship>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 生命体征章节 -->
    <component>
        <section>
            <code code="8716-3" displayName="VITAL SIGNS"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 体格检查-体重(kg) -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.10.188.00" displayName="体重(kg)"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="PQ" value="${treatmentRecord.体重!'体重'}" unit="kg"/>
                </observation>
            </entry>
        </section>
    </component>

    <!-- 入院诊断章节 -->
    <component>
        <section>
            <code code="46241-6" displayName="HOSPITAL ADMISSION DX"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <!-- 疾病诊断编码 -->
            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE05.01.024.00" displayName="疾病诊断编码"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="CD" code="${treatmentRecord.疾病诊断编码!'疾病诊断编码'}" displayName="${treatmentRecord.疾病诊断名称!'疾病诊断名称'}"
                           codeSystem="2.16.156.10011.2.3.3.11.3" codeSystemName="诊断代码表(ICD-10)"/>
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
            <!-- 处理及指导意见 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.018.00" displayName="处理及指导意见"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${treatmentRecord.处理及指导意见!'处理及指导意见'}</value>
                </observation>
            </entry>
            <!-- 医嘱使用备注 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.179.00" displayName="医嘱使用备注"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${treatmentRecord.医嘱使用备注!'医嘱使用备注'}</value>
                </observation>
            </entry>

            <!-- 今后治疗方案 -->
            <entry>
                <observation classCode="OBS" moodCode="INT">
                    <code code="DE06.00.159.00" displayName="今后治疗方案"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${treatmentRecord.今后治疗方案!'今后治疗方案'}</value>
                </observation>
            </entry>

            <!-- 随访条目 -->
            <entry>
                <observation classCode="CASE" moodCode="EVN">
                    <!-- 活动代码(随访) -->
                    <code code="DE06.00.108.00" displayName="随访方式"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <!-- 随访时间(数据元) -->
                    <effectiveTime value="${treatmentRecord.随访日期!'随访日期'}"/>
                    <value xsi:type="CD" code="${treatmentRecord.随访方式代码!'随访方式代码'}" displayName="${treatmentRecord.随访方式!'随访方式'}"
                           codeSystem="2.16.156.10011.2.3.1.183" codeSystemName="随访方式代码表"/>
                    <!-- 随访周期建议代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.112.00" displayName="随访周期建议代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${treatmentRecord.随访周期建议代码!'随访周期建议代码'}" displayName="${treatmentRecord.随访周期建议!'随访周期建议'}"
                                   codeSystem="2.16.156.10011.2.3.1.184" codeSystemName="随访周期建议代码表"/>
                        </observation>
                    </entryRelationship>
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
                    <code code="${treatmentRecord.操作编码!'操作编码'}"
                          codeSystem="2.16.156.10011.2.3.3.12" codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                    <!-- 操作日期/时间 -->
                    <effectiveTime>
                        <!-- 操作结束日期时间 -->
                        <high value="${treatmentRecord.操作日期时间!'操作日期时间'}"/>
                    </effectiveTime>
                    <!-- 操作名称 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.094.00" displayName="操作名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.操作名称!'操作名称'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 操作目标部位名称 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.187.00" displayName="手术目标部位名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.操作目标部位名称!'操作目标部位名称'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 介入物名称 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.037.00" displayName="介入物名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.介入物名称!'介入物名称'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 操作方法描述 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.251.00" displayName="操作方法描述"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.操作方法描述!'操作方法描述'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 操作次数 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.250.00" displayName="操作次数"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="INT" value="${treatmentRecord.操作次数!'操作次数'}"></value>
                        </observation>
                    </entryRelationship>
                </procedure>
            </entry>
        </section>
    </component>

    <!-- 用药管理章节 -->
    <component>
        <section>
            <code code="18610-6" displayName="MEDICATION ADMINISTERED"
                  codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
            <text/>
            <entry>
                <substanceAdministration classCode="SBADM" moodCode="EVN">
                    <!-- 药物使用途径代码 -->
                    <routeCode code="${treatmentRecord.用药途径代码!'用药途径代码'}" displayName="${treatmentRecord.用药途径!'用药途径'}"
                          codeSystem="2.16.156.10011.2.3.1.158" codeSystemName="用药途径代码表"/>
                    <!-- 药物使用次剂量 -->
                    <doseQuantity value="${treatmentRecord.药物使用次剂量!'药物使用次剂量'}" unit=""/>
                    <consumable>
                        <manufacturedProduct>
                            <manufacturedLabeledDrug>
                                <!-- 药品代码及名称(通用名) -->
                                <code/>
                                <name>${treatmentRecord.药物名称!'药物名称'}</name>
                            </manufacturedLabeledDrug>
                        </manufacturedProduct>
                    </consumable>
                    <!-- 药物用法 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.136.00" displayName="药物用法"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.药物用法!'药物用法'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 中药使用类别代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.164.00" displayName="中药使用类别代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${treatmentRecord.中药使用类别代码!'中药使用类别代码'}" displayName="${treatmentRecord.中药使用类别!'中药使用类别'}"
                                   codeSystem="2.16.156.10011.2.3.1.157" codeSystemName="中药使用类别代码表"/>
                        </observation>
                    </entryRelationship>
                    <!-- 药物使用频率 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.133.00" displayName="药物使用频率"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${treatmentRecord.药物使用频次代码!'药物使用频次代码'}" displayName="${treatmentRecord.药物使用频次!'药物使用频次'}"
                                   codeSystem="2.16.156.10011.2.3.1.157" codeSystemName="药物使用频率代码表"/>
                        </observation>
                    </entryRelationship>
                    <!-- 药物剂型代码 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.011.00" displayName="药物剂型代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${treatmentRecord.药物剂型代码!'药物剂型代码'}" displayName="${treatmentRecord.药物剂型!'药物剂型'}"
                                   codeSystem="2.16.156.10011.2.3.1.211" codeSystemName="药物剂型代码表"/>
                        </observation>
                    </entryRelationship>
                    <!-- 药物使用剂量单位 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.024.00" displayName="药物使用剂量单位"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${treatmentRecord.药物使用剂量单位!'药物使用剂量单位'}</value>
                        </observation>
                    </entryRelationship>
                    <!-- 药物使用总剂量 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.135.00" displayName="药物使用总剂量"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="PQ" value="${treatmentRecord.药物使用总剂量!'药物使用总剂量'}" unit=""></value>
                        </observation>
                    </entryRelationship>
                </substanceAdministration>
            </entry>
        </section>
    </component>
</ClinicalDocument>