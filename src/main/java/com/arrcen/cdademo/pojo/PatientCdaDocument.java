package com.arrcen.cdademo.pojo;

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PATIENT_CDA_DOCUMENT")
@Proxy(lazy = false)
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

	public String getEffectivetime() {
		return effectivetime;
	}

	public void setEffectivetime(String effectivetime) {
		this.effectivetime = effectivetime;
	}

	public String get系统序号() {

		return 系统序号;
	}

	public void set系统序号(String 系统序号) {
		this.系统序号 = 系统序号;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public String getDocid() {
		return docid;
	}

	public void setDocid(String docid) {
		this.docid = docid;
	}

	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getTemplateindex() {
		return templateindex;
	}

	public void setTemplateindex(String templateindex) {
		this.templateindex = templateindex;
	}

	public String getDocurl() {
		return docurl;
	}

	public void setDocurl(String docurl) {
		this.docurl = docurl;
	}
}
