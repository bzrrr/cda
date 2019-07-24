package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.HealthIncidentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthIncidentInfoDao extends JpaRepository<HealthIncidentInfo, String> {
	HealthIncidentInfo findBy居民健康卡号(String cardId);
}
