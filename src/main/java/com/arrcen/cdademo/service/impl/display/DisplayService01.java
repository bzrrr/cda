package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.*;
import com.arrcen.cdademo.pojo.*;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DisplayService01 extends CDAdisplayBaseServiceImpl {

	@Autowired
	PatientDao patientDao;
	@Autowired
	private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
	@Autowired
	private PatientHealthDocInfoDao patientHealthDocInfoDao;
	@Autowired
	private HealthIncidentInfoDao healthIncidentInfoDao;
	@Autowired
	private MedicalExpenseRecordDao medicalExpenseRecordDao;



	@Override
	public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {
		Map sourceMap = Maps.newHashMap();
		Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());

		DocInfo docInfo = new DocInfo();
		docInfo.setDocId(patientCdaDocument.getDocid());
		docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
		sourceMap.put("文档信息", docInfo);

		patient.set婚姻状况(patientDao.find婚姻状况By婚姻状况代码(patient.get婚姻状况代码()));
		patient.set民族名称(patientDao.find名族名称By名族(patient.get民族()));
		patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
		patient.set职业类别(patientDao.find职业类别By职业类别代码(patient.get职业类别代码()));
		sourceMap.put("患者基本信息", patient);

		String orgId = patient.get建档医疗机构组织机构();
		String orgName = medicalOrganizationInfoDao.findOrgNameByCode(orgId);
		sourceMap.put("建档医疗机构组织机构名称", orgName);

		String patientHealthCardId = patient.get居民健康卡号();
		PatientHealthDocInfo patientHealthDocInfo = patientHealthDocInfoDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("患者健康档案信息", patientHealthDocInfo);

		HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("卫生事件摘要信息", healthIncidentInfo);

		MedicalExpenseRecord medicalExpenseRecord = medicalExpenseRecordDao.findBy居民健康卡号(patientHealthCardId);
		sourceMap.put("医疗费用记录", medicalExpenseRecord);

		return sourceMap;
	}
}
