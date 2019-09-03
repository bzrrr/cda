package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.CarePlanRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.CarePlanRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈护理计划〉
 */
@Service
public class GenerateService24 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private CarePlanRecordDao carePlanRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //护理计划
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        CarePlanRecord carePlanRecord = carePlanRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        carePlanRecord.set安全护理(carePlanRecordDao.find安全护理By安全护理代码(carePlanRecord.get安全护理代码()));
        carePlanRecord.set护理等级(carePlanRecordDao.find护理等级By护理等级代码(carePlanRecord.get护理等级代码()));
        carePlanRecord.set饮食指导(carePlanRecordDao.find饮食指导By饮食指导代码(carePlanRecord.get饮食指导代码()));
        carePlanRecord.set疾病诊断名称(carePlanRecordDao.find疾病诊断名称By疾病诊断编码(carePlanRecord.get疾病诊断编码()));
        carePlanRecord.set护理类型(carePlanRecordDao.find护理类型By护理类型代码(carePlanRecord.get护理类型代码()));
        carePlanRecord.set气管护理(carePlanRecordDao.find气管护理By气管护理代码(carePlanRecord.get气管护理代码()));
        sourceMap.put("carePlanRecord",carePlanRecord);
    }
}
