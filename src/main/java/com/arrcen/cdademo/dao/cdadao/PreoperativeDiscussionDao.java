package com.arrcen.cdademo.dao.cdadao;

import com.arrcen.cdademo.pojo.cdapojo.PreoperativeDiscussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PreoperativeDiscussionDao extends JpaRepository<PreoperativeDiscussion,String> {

    PreoperativeDiscussion findBy住院号(String 住院号);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '生理性别代码表(GB/T 2261.1)' and 值 = ?1",nativeQuery = true)
	String find性别By性别代码(String 性别代码);

    @Query(value = "select 值含义 from pub_卫生数据元值域 where 值域名称 = '专业技术职务类别代码表' and 值 = ?1",nativeQuery = true)
	String find专业技术职务类别名称By专业技术职务类别代码(String 专业技术职务类别代码);
}
