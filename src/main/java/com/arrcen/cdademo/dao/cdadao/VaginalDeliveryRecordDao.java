package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.VaginalDeliveryRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VaginalDeliveryRecordDao extends JpaRepository<VaginalDeliveryRecord,String> {
    VaginalDeliveryRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '胎方位代码表' and 值 = ?1",nativeQuery = true)
	String find胎方位By胎方位代码(String 胎方位代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '会阴裂伤情况代码表' and 值 = ?1",nativeQuery = true)
	String find会阴裂伤情况By会阴裂伤情况代码(String 会阴裂伤情况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉方法名称By麻醉方法代码(String 麻醉方法代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find新生儿性别By新生儿性别代码(String 新生儿性别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = 'Apgar评分间隔时间代码表' and 值 = ?1",nativeQuery = true)
	String findAPGAR评分间隔时间ByAPGAR评分间隔时间代码(String APGAR评分间隔时间代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '分娩结局代码表' and 值 = ?1",nativeQuery = true)
	String find分娩结局By分娩结局代码(String 分娩结局代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '新生儿异常情况代码表' and 值 = ?1",nativeQuery = true)
	String find新生儿异常情况By新生儿异常情况代码(String 新生儿异常情况代码);
}
