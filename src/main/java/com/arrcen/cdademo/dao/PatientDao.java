package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientDao extends JpaRepository<Patient, String> {
	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '婚姻状况代码表(GB/T 2261.2)' and 值 = ?1", nativeQuery = true)
	String find婚姻状况By婚姻状况代码(String 婚姻状况代码);

	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '民族类别代码表(GB 3304)' and 值 = ?1", nativeQuery = true)
	String find名族名称By名族(String 名族);

	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1", nativeQuery = true)
	String find性别By性别代码(String 性别代码);

	@Query(value = "SELECT 值含义 FROM AMBASE_HDR.PUB_卫生数据元值域 where 值域名称 = '职业类别代码表(GB/T 6565)' and 值 = ?1", nativeQuery = true)
	String find职业类别By职业类别代码(String 职业类别代码);
}
