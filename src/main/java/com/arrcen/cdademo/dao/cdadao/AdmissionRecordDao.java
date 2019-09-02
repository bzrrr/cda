package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.AdmissionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdmissionRecordDao extends JpaRepository<AdmissionRecord,String> {

    AdmissionRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '民族类别代码表(GB 3304)' and 值 = ?1",nativeQuery = true)
	String find民族名称By民族(String 民族);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '婚姻状况代码表(GB/T 2261.2)' and 值 = ?1",nativeQuery = true)
	String find婚姻状况By婚姻状况代码(String 婚姻状况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '职业类别代码表(GB/T 6565)' and 值 = ?1",nativeQuery = true)
	String find职业类别By职业类别代码(String 职业类别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '家庭关系代码表(GB/T 4761)' and 值 = ?1",nativeQuery = true)
	String find陈述者与患者的关系(String 陈述者与患者的关系代码);

}
