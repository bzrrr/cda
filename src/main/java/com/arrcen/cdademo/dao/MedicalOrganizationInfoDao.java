package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.MedicalOrganizationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicalOrganizationInfoDao extends JpaRepository<MedicalOrganizationInfo, String> {

	@Query(value = "select 医疗机构名称 from MedicalOrganizationInfo where 医疗机构组织机构代码 = ?1")
	String findOrgNameByCode(String code);

	MedicalOrganizationInfo findBy医疗机构组织机构代码(String code);

}
