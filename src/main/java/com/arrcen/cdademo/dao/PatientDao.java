package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient, String> {
}
