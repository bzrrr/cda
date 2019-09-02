package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.PatientHealthDocInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientHealthDocInfoDao extends JpaRepository<PatientHealthDocInfo,String> {
	PatientHealthDocInfo findBy居民健康卡号(String cardId);

}
