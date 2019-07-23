package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.CDAdocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CDAdocumentDao extends JpaRepository<CDAdocument,String> {
	@Query(value = "select docname from CDAdocument where docname like 'EMR%'")
	List<String> getAllDocNames();
}
