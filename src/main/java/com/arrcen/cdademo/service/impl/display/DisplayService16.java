package com.arrcen.cdademo.service.impl.display;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.MedicalOrganizationInfoDao;
import com.arrcen.cdademo.dao.PatientDao;
import com.arrcen.cdademo.dao.cdadao.CesareanSectionDao;
import com.arrcen.cdademo.pojo.DocInfo;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.pojo.cdapojo.CesareanSection;
import com.arrcen.cdademo.service.impl.CDAdisplayBaseServiceImpl;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈〉
 */
@Service
public class DisplayService16 extends CDAdisplayBaseServiceImpl {

    @Autowired
    private PatientDao patientDao;
    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private MedicalOrganizationInfoDao medicalOrganizationInfoDao;
    @Autowired
    private CesareanSectionDao cesareanSectionDao;

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

        //剖宫产手术记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        CesareanSection cesareanSection = cesareanSectionDao.findBy住院号(healthIncidentInfo.get住院号());
        cesareanSection.setAPGAR评分间隔时间(cesareanSectionDao.findAPGAR评分间隔时间ByAPGAR评分间隔时间代码(cesareanSection.getAPGAR评分间隔时间代码()));
        cesareanSection.set分娩结局(cesareanSectionDao.find分娩结局By分娩结局代码(cesareanSection.get分娩结局代码()));
        cesareanSection.set手术及操作名称(cesareanSectionDao.find手术及操作名称By手术及操作编码(cesareanSection.get手术及操作编码()));
        cesareanSection.set新生儿异常情况(cesareanSectionDao.find新生儿异常情况By新生儿异常情况代码(cesareanSection.get新生儿异常情况代码()));
        cesareanSection.set麻醉方法名称(cesareanSectionDao.find麻醉方法名称By麻醉方法代码(cesareanSection.get麻醉方法代码()));
        cesareanSection.set新生儿性别(cesareanSectionDao.find新生儿性别By新生儿性别代码(cesareanSection.get新生儿性别代码()));
        resultMap.put("剖宫产手术记录",cesareanSection);

        return resultMap;
    }
}
