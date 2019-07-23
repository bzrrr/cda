package com.arrcen.cdademo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PUB_CDA共享文档")
public class CDAdocument implements Serializable {

  @Id
  private String docsId;
  private String root;
  private String docname;
  private String tablename;
  private String declaration;
  private String parentId;
  private String vesion;


  public String getDocsId() {
    return docsId;
  }

  public void setDocsId(String docsId) {
    this.docsId = docsId;
  }


  public String getRoot() {
    return root;
  }

  public void setRoot(String root) {
    this.root = root;
  }


  public String getDocname() {
    return docname;
  }

  public void setDocname(String docname) {
    this.docname = docname;
  }


  public String getTablename() {
    return tablename;
  }

  public void setTablename(String tablename) {
    this.tablename = tablename;
  }


  public String getDeclaration() {
    return declaration;
  }

  public void setDeclaration(String declaration) {
    this.declaration = declaration;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getVesion() {
    return vesion;
  }

  public void setVesion(String vesion) {
    this.vesion = vesion;
  }

}
