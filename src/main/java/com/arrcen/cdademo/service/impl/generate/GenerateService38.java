package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.DailyDiseaseRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DailyDiseaseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈日常病程记录〉
 */
@Service
public class GenerateService38 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private DailyDiseaseRecordDao dailyDiseaseRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //日常病程记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DailyDiseaseRecord dailyDiseaseRecord = dailyDiseaseRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        dailyDiseaseRecord.set专业技术职务类别(dailyDiseaseRecordDao.find专业技术职务类别By专业技术职务类别代码(dailyDiseaseRecord.get专业技术职务类别代码()));
        dailyDiseaseRecord.set性别(dailyDiseaseRecordDao.find性别By性别代码(dailyDiseaseRecord.get性别代码()));
        sourceMap.put("dailyDiseaseRecord",dailyDiseaseRecord);
    }
}
