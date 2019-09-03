package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.DeathCaseDiscussionRecordDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DeathCaseDiscussionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈死亡病例讨论记录〉
 */
@Service
public class GenerateService51 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private DeathCaseDiscussionRecordDao deathCaseDiscussionRecordDao;

    public void addData(Map sourceMap, Patient patient) {

        //死亡病例讨论记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DeathCaseDiscussionRecord deathCaseDiscussionRecord = deathCaseDiscussionRecordDao.findBy住院号(healthIncidentInfo.get住院号());
        deathCaseDiscussionRecord.set性别(deathCaseDiscussionRecordDao.find性别By性别代码(deathCaseDiscussionRecord.get性别代码()));
        deathCaseDiscussionRecord.set专业技术职务类别名称(deathCaseDiscussionRecordDao.find专业技术职务类别名称By专业技术职务类别代码(deathCaseDiscussionRecord.get专业技术职务类别代码()));
        sourceMap.put("deathCaseDiscussionRecord",deathCaseDiscussionRecord);
    }
}
