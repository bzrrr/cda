package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.ResidentDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResidentDoctorDao extends JpaRepository<ResidentDoctor,String> {

    @Query(value = "select * from PUB14_住院医嘱 where 住院号 = ?1",nativeQuery = true)
    ResidentDoctor findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '医嘱类别代码表' and 值 = ?1",nativeQuery = true)
	String find医嘱类别名称By医嘱类别代码(String 医嘱类别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '医嘱项目类型代码表' and 值 = ?1",nativeQuery = true)
	String find医嘱项目类型名称By医嘱项目类型代码(String 医嘱项目类型代码);
}
