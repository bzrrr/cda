package com.arrcen.cdademo.pojo;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PATIENT_CDA_DOCUMENT")
@Proxy(lazy = false)
@Data
public class PatientCdaDocument implements Serializable{

	private static final long serialVersionUID = 6270093351650460921L;
	@Id
	private String 系统序号;
	private String docid;
	private String patientid;
	private String templateindex;
	private String docurl;
	private String docname;
	private String effectivetime;

}
