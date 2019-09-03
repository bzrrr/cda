package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.PreoperativeDiscussionDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.PreoperativeDiscussion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈术前讨论〉
 */
@Service
public class GenerateService47 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private PreoperativeDiscussionDao preoperativeDiscussionDao;

    public void addData(Map sourceMap, Patient patient) {

        //术前讨论
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        PreoperativeDiscussion preoperativeDiscussion = preoperativeDiscussionDao.findBy住院号(healthIncidentInfo.get住院号());
        preoperativeDiscussion.set性别(preoperativeDiscussionDao.find性别By性别代码(preoperativeDiscussion.get性别代码()));
        preoperativeDiscussion.set专业技术职务类别名称(preoperativeDiscussionDao.find专业技术职务类别名称By专业技术职务类别代码(preoperativeDiscussion.get专业技术职务类别代码()));
        sourceMap.put("preoperativeDiscussion",preoperativeDiscussion);
    }
}
