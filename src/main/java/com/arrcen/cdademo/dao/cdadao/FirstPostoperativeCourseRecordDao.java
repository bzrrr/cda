package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.FirstPostoperativeCourseRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FirstPostoperativeCourseRecordDao extends JpaRepository<FirstPostoperativeCourseRecord,String> {

    FirstPostoperativeCourseRecord findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 代码名称 from PUB_ICD_9_M where 代码类型 = '手术(操作)代码表(ICD-9-CM)' and 代码值 = ?1",nativeQuery = true)
	String find手术及操作名称By手术及操作编码(String 手术及操作编码);
}
