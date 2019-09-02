<?xml version="1.0" encoding="UTF-8"?>
<ClinicalDocument xmlns="urn:hl7-org:v3" xmlns:mif="urn:hl7-org:v3/mif"
                  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                  xsi:schemaLocation="urn:hl7-org:v3 ..\sdschemas\SDA.xsd">
    <realmCode code="CN"/>
    <typeId root="2.16.840.1.113883.1.3" extension="POCD_MT000040"/>
    <templateId root="2.16.156.10011.2.1.1.26"/>
    <!-- 文档流水号 -->
    <id root="2.16.156.10011.1.1" extension="${docInfo.docId!'文档流水号标识'}"/>
    <code code="C0006" codeSystem="2.16.156.10011.2.4" codeSystemName="卫生信息共享文档规范编码体系"/>
    <title>检查报告</title>
    <!-- 文档机器生成时间 -->
    <effectiveTime value="${docInfo.effectiveTime!'文档机器生成时间'}"/>
    <confidentialityCode code="N" codeSystem="2.16.840.1.113883.5.25" codeSystemName="Confidentiality"
                         displayName="正常访问保密级别"/>
    <languageCode code="zh-CN"/>
    <setId/>
    <versionNumber/>
    <recordTarget typeCode="RCT" contextControlCode="OP">
        <patientRole classCode="PAT">
            <!-- 门(急)诊号 -->
            <id root="2.16.156.10011.1.11" extension="${inspectionRecord.门急诊号!'门急诊号'}"/>
            <!-- 住院号标识 -->
            <id root="2.16.156.10011.1.12" extension="${inspectionRecord.住院号!'住院号'}"/>
            <!-- 检查报告单号标识 -->
            <id root="2.16.156.10011.1.32" extension="${inspectionRecord.检査报告单编号!'检査报告单编号'}"/>
            <!-- 电子申请单编号 -->
            <id root="2.16.156.10011.1.24" extension="${inspectionRecord.电子申请单编号!'电子申请单编号'}"/>
            <!-- 标本编号标识 -->
            <id root="2.16.156.10011.1.14" extension="${inspectionRecord.检査标本号!'检査标本号'}"/>

            <!-- 患者类别代码 -->
            <patientType>
                <patienttypeCode code="${inspectionRecord.患者类型代码!'患者类型代码'}" codeSystem="2.16.156.10011.2.3.1.271"
                                 codeSystemName="患者类型代码表" displayName="${inspectionRecord.患者类型!'患者类型'}"></patienttypeCode>
            </patientType>
            <telecom value="${inspectionRecord.电话号码!'电话号码'}"/>

            <patient classCode="PSN" determinerCode="INSTANCE">
                <!-- 患者身份证号标识 -->
                <id root="2.16.156.10011.1.3" extension="${patient.患者身份证件号码!'患者身份证件号码'}"/>
                <!-- 患者姓名 -->
                <name>${patient.患者姓名!'患者姓名'}</name>
                <!-- 性别代码 -->
                <administrativeGenderCode code="${patient.性别代码!'性别代码'}" codeSystem="2.16.156.10011.2.3.3.4"
                                          codeSystemName="生理性别代码表(GB/T 2261.1)" displayName="${patient.性别!'性别'}/>
                <birthTime value="${patient.出生日期!'出生日期'}"/>
                <age unit="岁" value="${inspectionRecord.年龄岁!'年龄岁'}"/>
            </patient>
        </patientRole>
    </recordTarget>
    <!-- 检查报告医师(文档创作者) -->
    <author typeCode="AUT" contextControlCode="OP">
        <!-- 检查报告日期 -->
        <time value="${inspectionRecord.检查报告曰期!'检查报告曰期'}"/>
        <assignedAuthor classCode="ASSIGNED">
            <id root="2.16.156.10011.1.7" extension=""/>
            <!-- 医师姓名 -->
            <assignedPerson>
                <name>${inspectionRecord.报告医师签名!'报告医师签名'}</name>
            </assignedPerson>
        </assignedAuthor>
    </author>
    <!-- 保管机构 -->
    <custodian typeCode="CST">
        <assignedCustodian classCode="ASSIGNED">
            <representedCustodianOrganization classCode="ORG" determinerCode="INSTANCE">
                <id root="2.16.156.10011.1.5" extension="${inspectionRecord.医疗机构组织机构代码!'医疗机构组织机构代码'}"/>
                <name>${orgName!'建档医疗机构组织机构名称'}</name>
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
                <name>${inspectionRecord.审核医师签名!'审核医师签名'}</name>
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
                <name>${inspectionRecord.检查技师签名!'检查技师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

   <#-- <!-- 处方调配药剂师签名 &ndash;&gt;
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="处方调配药剂师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${inspectionRecord.审核医师签名!'审核医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>-->

    <!-- 检查医师签名 -->
    <authenticator>
        <time/>
        <signatureCode/>
        <assignedEntity>
            <id root="2.16.156.10011.1.4" extension=""/>
            <code displayName="检查医师"/>
            <assignedPerson classCode="PSN" determinerCode="INSTANCE">
                <name>${inspectionRecord.检查医师签名!'检查医师签名'}</name>
            </assignedPerson>
        </assignedEntity>
    </authenticator>

    <!-- 检查申请机构及科室 -->
    <participant typeCode="PRF">
        <associatedEntity classCode="ASSIGNED">
            <scopingOrganization>
                <id root="2.16.156.10011.1.26"/>
                <!-- 检查申请科室 -->
                <name>${inspectionRecord.检査申请科室!'检査申请科室'}</name>
                <asOrganizationPartOf>
                    <wholeOrganization>
                        <id root="2.16.156.10011.1.5" extension="${inspectionRecord.医疗机构组织机构代码!'医疗机构组织机构代码'}"/>
                        <!-- 检查申请机构 -->
                        <name>${inspectionRecord.检查申请机构名称!'检查申请机构名称'}</name>
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
                                <id root="2.16.156.10011.1.22" extension="${inspectionRecord.病床号!'病床号'}"/>
                                <!-- DE01.00.019.00 病房号 -->
                                <asOrganizationPartOf classCode="PART">
                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                        <id root="2.16.156.10011.1.21" extension="${inspectionRecord.病房号!'病房号'}"/>
                                        <!-- DE08.10.026.00 科室名称 -->
                                        <asOrganizationPartOf classCode="PART">
                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                <id root="2.16.156.10011.1.26" extension=""/>
                                                <name>${inspectionRecord.科室名称!'科室名称'}</name>
                                                <!-- DE08.10.054.00 病区名称 -->
                                                <asOrganizationPartOf classCode="PART">
                                                    <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                        <id root="2.16.156.10011.1.27" extension=""/>
                                                        <name>${inspectionRecord.病区名称!'病区名称'}</name>
                                                        <!-- xx医院 -->
                                                        <asOrganizationPartOf classCode="PART">
                                                            <wholeOrganization classCode="ORG" determinerCode="INSTANCE">
                                                                <id root="2.16.156.10011.1.5" extension="${inspectionRecord.医疗机构组织机构代码!'医疗机构组织机构代码'}"/>
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
                    <effectiveTime value="${inspectionRecord.诊断日期!'诊断日期'}"></effectiveTime>
                    <value xsi:type="CD" code="${inspectionRecord.疾病诊断编码!'疾病诊断编码'}" codeSystem="2.16.156.10011.2.3.3.11.3"
                           codeSystemName="诊断代码表(ICD-10)" displayName="${inspectionRecord.疾病诊断名称!'疾病诊断名称'}"/>
                    <performer>
                        <assignedEntity>
                            <id/>
                            <representedOrganization>
                                <!-- 诊断机构 -->
                                <name>${inspectionRecord.诊断机构名称!'诊断机构名称'}</name>
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
                    <value xsi:type="ST">${inspectionRecord.主诉!'主诉'}</value>
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
                        <low value="${inspectionRecord.症状开始日期时间!'症状开始日期时间'}"/>
                        <high value="${inspectionRecord.症状停止日期时间!'症状停止日期时间'}"/>
                    </effectiveTime>
                    <value xsi:type="ST">${inspectionRecord.症状描述!'症状描述'}</value>
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
                    <code code="${inspectionRecord.操作编码!'操作编码'}" codeSystem="2.16.156.10011.2.3.3.12"
                          codeSystemName="手术(操作)代码表(ICD-9-CM)"/>
                    <statusCode/>
                    <!-- 操作日期/时间 -->
                    <effectiveTime value="${inspectionRecord.操作日期时间!'操作日期时间'}"/>
                    <!-- 操作部位代码 -->
                    <targetSiteCode code="${inspectionRecord.操作部位代码!'操作部位代码'}" codeSystem="2.16.156.10011.2.3.1.266"
                                    codeSystemName="操作部位代码表"/>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.094.00" displayName="手术(操作)名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${inspectionRecord.操作名称!'操作名称'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.093.00" displayName="手术及操作目标部位名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${inspectionRecord.操作名称!'操作名称'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE08.50.037.00" displayName="介入物名称"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${inspectionRecord.介入物名称!'介入物名称'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.251.00" displayName="操作方法描述"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${inspectionRecord.操作方法描述!'操作方法描述'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.250.00" displayName="操作次数"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${inspectionRecord.操作次数!'操作次数'}</value>
                        </observation>
                    </entryRelationship>

                    <!-- 麻醉信息 -->
                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.073.00" displayName="麻醉方式代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${inspectionRecord.麻醉方法代码!'麻醉方法代码'}" codeSystem="2.16.156.10011.2.3.1.159"
                            codeSystemName="麻醉方式代码表"></value>
                            <!-- 麻醉医师签名 -->
                            <performer>
                                <assignedEntity>
                                    <id/>
                                    <representedOrganization>
                                        <name>${inspectionRecord.麻醉医师签名!'麻醉医师签名'}</name>
                                    </representedOrganization>
                                </assignedEntity>
                            </performer>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE02.10.028.00" displayName="麻醉观察结果"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="ST">${inspectionRecord.麻醉观察结果!'麻醉观察结果'}</value>
                        </observation>
                    </entryRelationship>

                    <entryRelationship typeCode="COMP">
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE06.00.307.00" displayName="麻醉中西医标识代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${inspectionRecord.麻醉中西医标识代码!'麻醉中西医标识代码'}" codeSystem="2.16.156.10011.2.3.2.41"
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
                    <value xsi:type="ST">${inspectionRecord.特殊检査标志!'特殊检査标志'}</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE02.10.027.00" displayName="检查方法名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${inspectionRecord.检査方法名称!'检査方法名称'}</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.30.018.00" displayName="检查类别"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${inspectionRecord.检查类别!'检查类别'}</value>
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
                            <effectiveTime value="${inspectionRecord.检査日期!'检査日期'}"/>
                            <value xsi:type="ST">${inspectionRecord.检査项目!'检査项目'}</value>

                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.134.00" displayName="标本类别"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <!-- DE04.50.137.00 标本采样日期时间  DE04.50.141.00接受标本日期时间-->
                                    <effectiveTime>
                                        <low value="${inspectionRecord.标本采样日期时间!'标本采样日期时间'}"/>
                                        <high value="${inspectionRecord.接收标本日期时间!'接收标本日期时间'}"/>
                                    </effectiveTime>
                                    <value xsi:type="ST">${inspectionRecord.标本类别!'标本类别'}</value>
                                </observation>
                            </entryRelationship>

                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.50.135.00" displayName="标本状态"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">${inspectionRecord.标本状态!'标本状态'}</value>
                                </observation>
                            </entryRelationship>

                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE08.50.027.00" displayName="标本固定液名称"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">${inspectionRecord.标本固定液名称!'标本固定液名称'}</value>
                                </observation>
                            </entryRelationship>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.017.00" displayName="检查结果代码"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="CD" code="${inspectionRecord.检查结果代码!'检查结果代码'}" codeSystem="2.16.156.10011.2.3.2.38"
                            codeSystemName="检查(检验)结果代码表">${inspectionRecord.检查结果!'检查结果'}</value>
                        </observation>
                    </component>

                    <component>
                        <observation classCode="OBS" moodCode="EVN">
                            <code code="DE04.30.015.00" displayName="检查定量结果"
                                  codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                            <value xsi:type="REAL" value="${inspectionRecord.检査定量结果!'检査定量结果'}"></value>
                            <entryRelationship typeCode="COMP">
                                <observation classCode="OBS" moodCode="EVN">
                                    <code code="DE04.30.016.00" displayName="检查定量结果计量单位"
                                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                                    <value xsi:type="ST">${inspectionRecord.检査定量结果计量单位!'检査定量结果计量单位'}</value>
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
                    <value xsi:type="ST">${inspectionRecord.诊疗过程描述!'诊疗过程描述'}</value>
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
                    <value xsi:type="ST">${inspectionRecord.检查报告结果_客观提示!'检查报告结果_客观提示'}</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE04.50.131.00" displayName="检查报告结果-主观提示"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${inspectionRecord.检查报告结果_主观提示!'检查报告结果_主观提示'}</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.026.00" displayName="检查报告科室"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${inspectionRecord.检査报告科室!'检査报告科室'}</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE08.10.013.00" displayName="检查报告机构名称"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${inspectionRecord.检査报告机构名称!'检査报告机构名称'}</value>
                </observation>
            </entry>

            <entry>
                <observation classCode="OBS" moodCode="EVN">
                    <code code="DE06.00.179.00" displayName="检查报告备注"
                          codeSystem="2.16.156.10011.2.2.1" codeSystemName="卫生信息数据元目录"/>
                    <value xsi:type="ST">${inspectionRecord.检查报告备注!'检查报告备注'}</value>
                </observation>
            </entry>
        </section>
    </component>
</ClinicalDocument>