package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.EmergencyMedicalRecordDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyMedicalRecordDetailDao extends JpaRepository<EmergencyMedicalRecordDetail,String> {
    EmergencyMedicalRecordDetail findBy电子申请单编号(String id);
}
