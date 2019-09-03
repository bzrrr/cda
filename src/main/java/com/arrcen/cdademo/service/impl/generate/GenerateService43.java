package com.arrcen.cdademo.service.impl.generate;

import com.arrcen.cdademo.dao.HealthIncidentInfoDao;
import com.arrcen.cdademo.dao.cdadao.StageSummaryDao;
import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import com.arrcen.cdademo.pojo.Patient;
import com.arrcen.cdademo.pojo.cdapojo.StageSummary;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 〈阶段小结〉
 */
@Service
public class GenerateService43 {

    @Autowired
    private HealthIncidentInfoDao healthIncidentInfoDao;
    @Autowired
    private StageSummaryDao stageSummaryDao;

    public void addData(Map sourceMap, Patient patient) {

        //阶段小结
        HealthIncidentInfo healthIncidentInfo = healthIncidentInfoDao.findBy居民健康卡号(patient.get居民健康卡号());
        StageSummary stageSummary = stageSummaryDao.findBy住院号(healthIncidentInfo.get住院号());
        stageSummary.set性别(stageSummaryDao.find性别By性别代码(stageSummary.get性别代码()));
        stageSummary.set入院诊断_中医病名名称(stageSummaryDao.find入院诊断_中医病名名称By入院诊断_中医病名代码(stageSummary.get入院诊断_中医病名代码()));
        stageSummary.set入院诊断_西医诊断名称(stageSummaryDao.find入院诊断_西医诊断名称By入院诊断_西医诊断编码(stageSummary.get入院诊断_西医诊断编码()));
        stageSummary.set入院诊断_中医证候名称(stageSummaryDao.find入院诊断_中医证候名称By入院诊断_中医证候代码(stageSummary.get入院诊断_中医证候代码()));
        stageSummary.set目前诊断_西医诊断名称(stageSummaryDao.find目前诊断_西医诊断名称By目前诊断_西医诊断编码(stageSummary.get目前诊断_西医诊断编码()));
        stageSummary.set目前诊断_中医证候名称(stageSummaryDao.find目前诊断_中医证候名称By目前诊断_中医证候代码(stageSummary.get目前诊断_中医证候代码()));
        stageSummary.set目前诊断_中医病名名称(stageSummaryDao.find目前诊断_中医病名名称By目前诊断_中医病名代码(stageSummary.get目前诊断_中医病名代码()));
        sourceMap.put("stageSummary",stageSummary);
    }
}
