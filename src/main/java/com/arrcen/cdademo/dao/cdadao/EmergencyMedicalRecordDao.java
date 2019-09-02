package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.EmergencyMedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyMedicalRecordDao extends JpaRepository<EmergencyMedicalRecord,String> {
    EmergencyMedicalRecord findBy门急诊号(String id);
}
