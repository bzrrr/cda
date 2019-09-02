package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.OIDassignmentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface OIDassignmentTableDao extends JpaRepository<OIDassignmentTable, String>, JpaSpecificationExecutor<OIDassignmentTable> {
	@Query(value = "SELECT max(系统序号) FROM \"AMBASE_HDR\".\"PUB_OID分配表\"", nativeQuery = true)
	Integer findMax();
}
