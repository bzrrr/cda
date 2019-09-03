package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.PostanesthesiaVisitRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.PostanesthesiaVisitRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈麻醉术后访视记录〉
 */
@Service
public class GenerateService12 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private PostanesthesiaVisitRecordDao postanesthesiaVisitRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //麻醉术后访视记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        PostanesthesiaVisitRecord postanesthesiaVisitRecord = postanesthesiaVisitRecordDao.findBy门急诊号(healthIncidentInfo.get门急诊号());
        postanesthesiaVisitRecord.setABO血型(postanesthesiaVisitRecordDao.findABO血型名称ByABO血型代码(postanesthesiaVisitRecord.getABO血型代码()));
        postanesthesiaVisitRecord.setRH血型(postanesthesiaVisitRecordDao.findRH血型名称ByRH血型代码(postanesthesiaVisitRecord.getRH血型代码()));
        postanesthesiaVisitRecord.set麻醉方法名称(postanesthesiaVisitRecordDao.find麻醉方法By麻醉方法代码(postanesthesiaVisitRecord.get麻醉方法代码()));
        postanesthesiaVisitRecord.set术后诊断名称(postanesthesiaVisitRecordDao.find术后诊断名称By术后诊断编码(postanesthesiaVisitRecord.get术后诊断编码()));
        postanesthesiaVisitRecord.set术前诊断名称(postanesthesiaVisitRecordDao.find术前诊断名称By术前诊断编码(postanesthesiaVisitRecord.get术前诊断编码()));
        postanesthesiaVisitRecord.set手术及操作名称(postanesthesiaVisitRecordDao.find手术及操作名称By手术及操作编码(postanesthesiaVisitRecord.get手术及操作编码()));
        sourceMap.put("postanesthesiaVisitRecord",postanesthesiaVisitRecord);
    }
}
