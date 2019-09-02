package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.MJZRecordDetailDao;
import com.arrcen.cdademo.dao.cdadao.MJZRecordDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.MJZRecord;
import com.arrcen.cdademo.pojo.cdapojo.MJZRecordDetail;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 *
 */
@Service
public class DisplayService02 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MJZRecordDao mjzRecordDao;
    @Autowired
    private MJZRecordDetailDao mjzRecordDetailDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {

        Map resultMap = Maps.newHashMap();
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        docInfo.setDocId(patientCdaDocument.getDocid());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);

        //医疗组织机构名称
        String organizationId = patient.get建档医疗机构组织机构();
        String orgName= medicalOrganizationInfoDao.findOrgNameByCode(organizationId);
        resultMap.put("建档医疗机构组织机构名称",orgName);

        String patientHealthCardId = patient.get居民健康卡号();
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patientHealthCardId);
        String emergencyNumber = healthIncidentInfo.get门急诊号();

        //医疗卫生事件
        resultMap.put("卫生事件摘要信息", healthIncidentInfo);

        //门急诊信息
        MJZRecord mjzRecord = mjzRecordDao.findBy门急诊号(emergencyNumber);
        resultMap.put("门急诊病历",mjzRecord);

        //门急诊病历医嘱详情
        MJZRecordDetail mjzRecordDetail = mjzRecordDetailDao.findBy电子申请单编号(emergencyNumber);
        resultMap.put("门急诊病历医嘱明细",mjzRecordDetail);

        return resultMap;
    }
}
