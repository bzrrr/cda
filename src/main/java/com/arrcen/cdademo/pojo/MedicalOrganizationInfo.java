package com.arrcen.cdademo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 医疗机构信息
 */
@Entity
@Table(name = "PUB17_医疗机构信息")
public class MedicalOrganizationInfo implements Serializable{

  @Id
  private String 系统序号;
  private String 医疗机构名称;
  private String 医疗机构组织机构代码;
  private String 医疗机构联系电话;
  private String 医疗机构负责人法人姓名;
  private String 医疗机构负责人联系电话;
  private String 地址_省;
  private String 地址_市;
  private String 地址_县;
  private String 地址_乡;
  private String 地址_村;
  private String 地址_门牌号码;
  private String 邮政编码;


  public String get系统序号() {
    return 系统序号;
  }

  public void set系统序号(String 系统序号) {
    this.系统序号 = 系统序号;
  }


  public String get医疗机构名称() {
    return 医疗机构名称;
  }

  public void set医疗机构名称(String 医疗机构名称) {
    this.医疗机构名称 = 医疗机构名称;
  }


  public String get医疗机构组织机构代码() {
    return 医疗机构组织机构代码;
  }

  public void set医疗机构组织机构代码(String 医疗机构组织机构代码) {
    this.医疗机构组织机构代码 = 医疗机构组织机构代码;
  }


  public String get医疗机构联系电话() {
    return 医疗机构联系电话;
  }

  public void set医疗机构联系电话(String 医疗机构联系电话) {
    this.医疗机构联系电话 = 医疗机构联系电话;
  }


  public String get医疗机构负责人法人姓名() {
    return 医疗机构负责人法人姓名;
  }

  public void set医疗机构负责人法人姓名(String 医疗机构负责人法人姓名) {
    this.医疗机构负责人法人姓名 = 医疗机构负责人法人姓名;
  }


  public String get医疗机构负责人联系电话() {
    return 医疗机构负责人联系电话;
  }

  public void set医疗机构负责人联系电话(String 医疗机构负责人联系电话) {
    this.医疗机构负责人联系电话 = 医疗机构负责人联系电话;
  }


  public String get地址_省() {
    return 地址_省;
  }

  public void set地址_省(String 地址_省) {
    this.地址_省 = 地址_省;
  }


  public String get地址_市() {
    return 地址_市;
  }

  public void set地址_市(String 地址_市) {
    this.地址_市 = 地址_市;
  }


  public String get地址_县() {
    return 地址_县;
  }

  public void set地址_县(String 地址_县) {
    this.地址_县 = 地址_县;
  }


  public String get地址_乡() {
    return 地址_乡;
  }

  public void set地址_乡(String 地址_乡) {
    this.地址_乡 = 地址_乡;
  }


  public String get地址_村() {
    return 地址_村;
  }

  public void set地址_村(String 地址_村) {
    this.地址_村 = 地址_村;
  }


  public String get地址_门牌号码() {
    return 地址_门牌号码;
  }

  public void set地址_门牌号码(String 地址_门牌号码) {
    this.地址_门牌号码 = 地址_门牌号码;
  }


  public String get邮政编码() {
    return 邮政编码;
  }

  public void set邮政编码(String 邮政编码) {
    this.邮政编码 = 邮政编码;
  }

}
