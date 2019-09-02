package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.CarePlanRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarePlanRecordDao extends JpaRepository<CarePlanRecord,String> {

    CarePlanRecord findBy住院号(String 住院号);

    @Query(value = "select 代码名称 from PUB_ICD10 where 代码类型 = '诊断代码表(ICD_10)' AND 代码值=?1",nativeQuery = true)
	String find疾病诊断名称By疾病诊断编码(String 疾病诊断编码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '护理等级代码表' and 值 = ?1",nativeQuery = true)
	String find护理等级By护理等级代码(String 护理等级代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '护理类型代码表' and 值 = ?1",nativeQuery = true)
	String find护理类型By护理类型代码(String 护理类型代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '气管护理代码表' and 值 = ?1",nativeQuery = true)
	String find气管护理By气管护理代码(String 气管护理代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '安全护理代码表' and 值 = ?1",nativeQuery = true)
	String find安全护理By安全护理代码(String 安全护理代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '饮食指导代码表' and 值 = ?1",nativeQuery = true)
	String find饮食指导By饮食指导代码(String 饮食指导代码);

}
