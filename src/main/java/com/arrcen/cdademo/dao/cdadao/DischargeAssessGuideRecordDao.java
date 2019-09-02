package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.DischargeAssessGuideRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DischargeAssessGuideRecordDao extends JpaRepository<DischargeAssessGuideRecord,String> {

    DischargeAssessGuideRecord findBy住院号(String 住院号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find出院诊断名称By出院诊断编码(String 出院诊断编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '饮食情况代码表' and 值 = ?1",nativeQuery = true)
	String find饮食情况By饮食情况代码(String 饮食情况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '自理能力代码表' and 值 = ?1",nativeQuery = true)
	String find自理能力By自理能力代码(String 自理能力代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '离院方式代码表' and 值 = ?1",nativeQuery = true)
	String find离院方式By离院方式代码(String 离院方式代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '饮食指导代码表' and 值 = ?1",nativeQuery = true)
	String find饮食指导By饮食指导代码(String 饮食指导代码);


}
