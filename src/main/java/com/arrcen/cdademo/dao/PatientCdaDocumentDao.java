package com.arrcen.cdademo.dao;

import com.arrcen.cdademo.pojo.PatientCdaDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface PatientCdaDocumentDao extends JpaRepository<PatientCdaDocument, String>, JpaSpecificationExecutor<PatientCdaDocument> {
	@Query(value = "SELECT max(系统序号) FROM \"AMBASE_HDR\".\"PATIENT_CDA_DOCUMENT\"", nativeQuery = true)
	Integer findMax();
}
