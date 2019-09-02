package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.ExpectanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExpectanceRecordDao extends JpaRepository<ExpectanceRecord,String> {

    ExpectanceRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '受孕形式代码表' and 值 = ?1",nativeQuery = true)
	String find受孕形式By受孕形式代码(String 受孕形式代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '胎方位代码表' and 值 = ?1",nativeQuery = true)
	String find胎方位By胎方位代码(String 胎方位代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '胎膜情况代码表' and 值 = ?1",nativeQuery = true)
	String find胎膜情况By胎膜情况代码(String 胎膜情况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '破膜方式代码表' and 值 = ?1",nativeQuery = true)
	String find破膜方式By破膜方式代码(String 破膜方式代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '检查方式代码表' and 值 = ?1",nativeQuery = true)
	String find检查方式By检查方式代码(String 检查方式代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '分娩方式代码表' and 值 = ?1",nativeQuery = true)
	String find计划选取的分娩方式By计划选取的分娩方式代码(String 计划选取的分娩方式代码);


}
