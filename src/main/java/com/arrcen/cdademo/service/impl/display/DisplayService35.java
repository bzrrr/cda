package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.InternalDischargeRecord24HDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.InternalDischargeRecord24H;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈24H内入出院记录〉
 */
@Service
public class DisplayService35 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private InternalDischargeRecord24HDao internalDischargeRecord24HDao;

    @Override
    public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {

        Map resultMap = Maps.newHashMap();

        //文档信息
        DocInfo docInfo = new DocInfo();
        docInfo.setEffectiveTime(patientCdaDocument.getEffectivetime());
        docInfo.setDocId(patientCdaDocument.getDocid());
        resultMap.put("文档信息",docInfo);

        //患者基本信息
        Patient patient = patientDao.findPatientBy患者身份证件号码(patientCdaDocument.getPatientid());
        patient.set性别(patientDao.find性别By性别代码(patient.get性别代码()));
        resultMap.put("患者基本信息",patient);

        //医疗机构
        String orgName= medicalOrganizationInfoDao.findOrgNameByCode(patient.get建档医疗机构组织机构());
        resultMap.put("建档医疗机构组织机构名称",orgName);

        //24H内入出院记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        InternalDischargeRecord24H internalDischargeRecord24H = internalDischargeRecord24HDao.findBy住院号(healthIncidentInfo.get住院号());
        internalDischargeRecord24H.set性别(internalDischargeRecord24HDao.find性别By性别代码(internalDischargeRecord24H.get性别代码()));
        internalDischargeRecord24H.set婚姻状况(internalDischargeRecord24HDao.find婚姻状况By婚姻状况代码(internalDischargeRecord24H.get婚姻状况代码()));
        internalDischargeRecord24H.set民族(internalDischargeRecord24HDao.find民族名称By民族(internalDischargeRecord24H.get民族()));
        internalDischargeRecord24H.set陈述者与患者的关系(internalDischargeRecord24HDao.find陈述者与患者的关系(internalDischargeRecord24H.get陈述者与患者的关系代码()));
        internalDischargeRecord24H.set职业类别(internalDischargeRecord24HDao.find职业类别By职业类别代码(internalDischargeRecord24H.get职业类别代码()));
        resultMap.put("24H内入出院记录",internalDischargeRecord24H);

        return resultMap;
    }
}
