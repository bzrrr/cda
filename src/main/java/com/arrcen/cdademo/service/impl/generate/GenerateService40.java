package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.DifficultCaseDiscussionDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.DifficultCaseDiscussion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈疑难病例讨论记录〉
 */
@Service
public class GenerateService40 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private DifficultCaseDiscussionDao difficultCaseDiscussionDao;

    public void addData(Map sourceMap, Patient patient) {

        //疑难病例讨论记录
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        DifficultCaseDiscussion difficultCaseDiscussion = difficultCaseDiscussionDao.findBy住院号(healthIncidentInfo.get住院号());
        difficultCaseDiscussion.set性别(difficultCaseDiscussionDao.find性别By性别代码(difficultCaseDiscussion.get性别代码()));
        sourceMap.put("difficultCaseDiscussion",difficultCaseDiscussion);
    }
}
