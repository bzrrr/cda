package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface PatientDao extends JpaRepository<Patient, String>, JpaSpecificationExecutor<Patient> {
	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '婚姻状况代码表(GB/T 2261.2)' and 值 = ?1", nativeQuery = true)
	String find婚姻状况By婚姻状况代码(String 婚姻状况代码);

	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '民族类别代码表(GB 3304)' and 值 = ?1", nativeQuery = true)
	String find名族名称By名族(String 名族);

	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1", nativeQuery = true)
	String find性别By性别代码(String 性别代码);

	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '职业类别代码表(GB/T 6565)' and 值 = ?1", nativeQuery = true)
	String find职业类别By职业类别代码(String 职业类别代码);

	@Query(value = "SELECT max(系统序号) FROM \"AMBASE_HDR\".\"PUB01_患者基本信息\"", nativeQuery = true)
	Integer findMax();

	Patient findPatientBy患者身份证件号码(String patientId);

	@Query(value = "SELECT 医疗机构名称 FROM PUB17_医疗机构信息 WHERE 医疗机构组织机构代码=?1",nativeQuery = true)
	String find医疗机构名称By医疗机构组织机构代码(String 医疗机构组织机构代码);
}
