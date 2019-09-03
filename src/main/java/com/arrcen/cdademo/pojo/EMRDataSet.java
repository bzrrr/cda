package com.arrcen.cdademo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 电子病历标准数据集
 */
@Entity
@Table(name = "PUB_电子病历标准数据集")
public class EMRDataSet implements Serializable{

  private static final long serialVersionUID = 6758971128993105321L;
  @Id
  private String 系统序号;
  private String 内部标识符;
  @Column(name = "数据元标识符")
  private String 数据元ID;
  private String 数据元名称;
  private String 定义;
  private String 数据类型;
  @Column(name = "表示格式")
  private String 数据格式;
  private String 数据元允许值;
  private String 数据集名称;
  private String 子集名称;
  private String 版本;
  private String 备注;

  public String get系统序号() {
    return 系统序号;
  }

  public void set系统序号(String 系统序号) {
    this.系统序号 = 系统序号;
  }

  public String get内部标识符() {
    return 内部标识符;
  }

  public void set内部标识符(String 内部标识符) {
    this.内部标识符 = 内部标识符;
  }

  public String get数据元ID() {
    return 数据元ID;
  }

  public void set数据元ID(String 数据元ID) {
    this.数据元ID = 数据元ID;
  }

  public String get数据元名称() {
    return 数据元名称;
  }

  public void set数据元名称(String 数据元名称) {
    this.数据元名称 = 数据元名称;
  }

  public String get定义() {
    return 定义;
  }

  public void set定义(String 定义) {
    this.定义 = 定义;
  }

  public String get数据类型() {
    return 数据类型;
  }

  public void set数据类型(String 数据类型) {
    this.数据类型 = 数据类型;
  }

  public String get数据格式() {
    return 数据格式;
  }

  public void set数据格式(String 数据格式) {
    this.数据格式 = 数据格式;
  }

  public String get数据元允许值() {
    return 数据元允许值;
  }

  public void set数据元允许值(String 数据元允许值) {
    this.数据元允许值 = 数据元允许值;
  }

  public String get数据集名称() {
    return 数据集名称;
  }

  public void set数据集名称(String 数据集名称) {
    this.数据集名称 = 数据集名称;
  }

  public String get子集名称() {
    return 子集名称;
  }

  public void set子集名称(String 子集名称) {
    this.子集名称 = 子集名称;
  }

  public String get版本() {
    return 版本;
  }

  public void set版本(String 版本) {
    this.版本 = 版本;
  }

  public String get备注() {
    return 备注;
  }

  public void set备注(String 备注) {
    this.备注 = 备注;
  }
}
