package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.DischargeSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DischargeSummaryDao extends JpaRepository<DischargeSummary,String> {

    DischargeSummary findBy居民健康卡号(String 居民健康卡号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '婚姻状况代码表(GB/T 2261.2)' and 值 = ?1",nativeQuery = true)
	String find婚姻状况By婚姻状况代码(String 婚姻状况代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '职业类别代码表(GB/T 6565)' and 值 = ?1",nativeQuery = true)
	String find职业类别名称By职业类别代码(String 职业类别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '手术切口愈合等级代码表' and 值 = ?1",nativeQuery = true)
	String find手术切口愈合等级By手术切口愈合等级代码(String 手术切口愈合等级代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '麻醉方法代码表' and 值 = ?1",nativeQuery = true)
	String find麻醉方法名称By麻醉方法代码(String 麻醉方法代码);
}
