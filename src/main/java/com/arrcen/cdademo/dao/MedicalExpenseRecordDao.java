package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.MedicalExpenseRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalExpenseRecordDao extends JpaRepository<MedicalExpenseRecord,String> {
	MedicalExpenseRecord findBy居民健康卡号(String cardId);
}
