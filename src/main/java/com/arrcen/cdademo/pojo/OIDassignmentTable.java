package com.arrcen.cdademo.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * OID分配表
 */
@Entity
@Table(name = "PUB_OID分配表")
public class OIDassignmentTable implements Serializable {

  private static final long serialVersionUID = -6456430096138031859L;
  @Id
  private String 系统序号;
  private String OID;
  private String OID名称;
  private String 映射代码表;
  private String 描述;
  private String 分配表;
  private String 备注;
  private String 版本;


  public String get系统序号() {
    return 系统序号;
  }

  public void set系统序号(String 系统序号) {
    this.系统序号 = 系统序号;
  }

  public String getOID() {
    return OID;
  }

  public void setOID(String OID) {
    this.OID = OID;
  }

  public String getOID名称() {
    return OID名称;
  }

  public void setOID名称(String OID名称) {
    this.OID名称 = OID名称;
  }

  public String get映射代码表() {
    return 映射代码表;
  }

  public void set映射代码表(String 映射代码表) {
    this.映射代码表 = 映射代码表;
  }

  public String get描述() {
    return 描述;
  }

  public void set描述(String 描述) {
    this.描述 = 描述;
  }

  public String get分配表() {
    return 分配表;
  }

  public void set分配表(String 分配表) {
    this.分配表 = 分配表;
  }

  public String get备注() {
    return 备注;
  }

  public void set备注(String 备注) {
    this.备注 = 备注;
  }

  public String get版本() {
    return 版本;
  }

  public void set版本(String 版本) {
    this.版本 = 版本;
  }
}
