package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.OIDassignmentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Book;
import java.util.List;

public interface OIDassignmentTableDao extends JpaRepository<OIDassignmentTable, String>,JpaSpecificationExecutor<OIDassignmentTable> {
	@Query(value = "SELECT max(系统序号) FROM \"AMBASE_HDR\".\"PUB_OID分配表\"", nativeQuery = true)
	int findMax();

	@Query(value = "SELECT * FROM \"AMBASE_HDR\".\"PUB_OID分配表\" WHERE OID名称 LIKE %?1% ORDER BY 系统序号", nativeQuery = true)
	List<String> findByOID名称(String oidName);
}
