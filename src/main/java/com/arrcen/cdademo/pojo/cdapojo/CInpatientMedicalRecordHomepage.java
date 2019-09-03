package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈中医住院病案首页〉
 */
@Entity
@Table(name = "PUB11_中医住院病案首页")
public class CInpatientMedicalRecordHomepage implements Serializable {

    private static final long serialVersionUID = -7273276755246124416L;
    @Id
    private String 系统序号;
    private String 医疗机构名称;
    private String 医疗机构组织机构代码;
    private String 医疗付费方式代码;
    @Transient
    @JsonIgnore
    private String 医疗付费方式;
    private String 居民健康卡号;
    private Long 住院次数;
    private String 住院号;
    private String 病案号;
    private String 姓名;
    private String 性别代码;
    @Transient
    @JsonIgnore
    private String 性别;
    private String 出生日期;
    private Byte 年龄岁;
    private String 年龄月;
    private String 国籍代码;
    @Transient
    @JsonIgnore
    private String 国籍;
    private Long 新生儿出生体重;
    private Long 新生儿入院体重;
    private String 出生地_省;
    private String 出生地_市;
    private String 出生地_县;
    private String 籍贯_省;
    private String 籍贯_市;
    private String 民族;
    @Transient
    @JsonIgnore
    private String 民族名称;
    private String 身份证件类别代码;
    private String 患者身份证件号码;
    private String 职业类别代码;
    @Transient
    @JsonIgnore
    private String 职业类别;
    private String 婚姻状况代码;
    @Transient
    @JsonIgnore
    private String 婚姻状况;
    private String 现住址_省;
    private String 现住址_市;
    private String 现住址_县;
    private String 现住址_乡;
    private String 现住址_村;
    private String 现住址_门牌号码;
    private String 电话号码;
    private String 现住址_邮政编码;
    private String 户口地址_省;
    private String 户口地址_市;
    private String 户口地址_县;
    private String 户口地址_乡;
    private String 户口地址_村;
    private String 户口地址_门牌号码;
    private String 户口地址_邮政编码;
    private String 工作单位名称;
    private String 工作单位地址_省;
    private String 工作单位地址_市;
    private String 工作单位地址_县;
    private String 工作单位地址_乡;
    private String 工作单位地址_村;
    private String 工作单位地址_门牌号码;
    private String 工作单位电话号码;
    private String 工作单位地址_邮政编码;
    private String 联系人姓名;
    private String 联系人与患者的关系代码;
    @Transient
    @JsonIgnore
    private String 联系人与患者的关系;
    private String 联系人地址_省;
    private String 联系人地址_市;
    private String 联系人地址_县;
    private String 联系人地址_乡;
    private String 联系人地址_村;
    private String 联系人地址_门牌号码;
    private String 联系人电话号码;
    private String 入院途径代码;
    @Transient
    @JsonIgnore
    private String 入院途径;
    private String 治疗类别代码;
    @Transient
    @JsonIgnore
    private String 治疗类别;
    private String 入院日期时间;
    private String 入院科别;
    private String 入院病房;
    private String 转科科别;
    private String 出院日期时间;
    private String 出院科别;
    private String 出院病房;
    private Long 实际住院天数;
    private String 门急诊诊断中医诊断名称;
    private String 门急诊诊断中医诊断病名编码;
    @Transient
    @JsonIgnore
    private String 门急诊诊断中医诊断病名名称;
    private String 门急诊诊断中医证候名称;
    private String 门急诊诊断中医证候证候编码;
    private String 门急诊诊断西医诊断名称;
    private String 门急诊诊断西医诊断疾病编码;
    @Transient
    @JsonIgnore
    private String 门急诊诊断西医诊断疾病名称;
    private String 实施临床路径标志代码;
    @Transient
    @JsonIgnore
    private String 实施临床路径标志;
    private String 使用医疗机构中药制剂标志;
    private String 使用中医诊疗设备标志;
    private String 使用中医诊疗技术标志;
    private String 辨证施护标志;
    private String 出院中医诊断_主病名称;
    private String 出院中医诊断_主病编码;
    private String 出院中医诊断_主病_入院病情代码;
    @Transient
    @JsonIgnore
    private String 出院中医诊断_主病_入院病情;
    private String 出院中医诊断_主证名称;
    private String 出院中医诊断_主证编码;
    private String 出院中医诊断_主证_入院病情代码;
    @Transient
    @JsonIgnore
    private String 出院中医诊断_主证_入院病情;
    private String 出院西医诊断_主要诊断名称;
    private String 出院西医诊断_主要诊断疾病编码;
    @Transient
    @JsonIgnore
    private String 出院西医诊断_主要诊断疾病名称;
    private String 出院西医诊断_主要诊断入院病情;
    private String 出院西医诊断_其他诊断名称;
    private String 出院西医诊断_其他诊断疾病编码;
    @Transient
    @JsonIgnore
    private String 出院西医诊断_其他诊断疾病名称;
    private String 出院西医诊断_其他诊断入院病情;
    private String 损伤中毒的外部原因;
    private String 损伤中毒的外部原因疾病编码;
    @Transient
    @JsonIgnore
    private String 损伤中毒的外部原因疾病;
    private String 病理诊断名称;
    private String 病理诊断疾病编码;
    @Transient
    @JsonIgnore
    private String 病理诊断疾病;
    private String 病理号;
    private String 药物过敏标志;
    private String 过敏药物;
    private String 死亡患者尸检标志;
    private String ABO血型代码;
    @Transient
    @JsonIgnore
    private String ABO血型;
    private String RH血型代码;
    @Transient
    @JsonIgnore
    private String RH血型;
    private String 科主任签名;
    private String 主任医师签名;
    private String 主治医师签名;
    private String 住院医师签名;
    private String 责任护士签名;
    private String 进修医师签名;
    private String 实习医师签名;
    private String 编码员签名;
    private String 病案质量代码;
    @Transient
    @JsonIgnore
    private String 病案质量;
    private String 质控医师签名;
    private String 质控护士签名;
    private String 质控日期;
    private String 手术及操作编码;
    private String 手术及操作日期;
    private String 手术级别代码;
    @Transient
    @JsonIgnore
    private String 手术级别;
    private String 手术及操作名称;
    private String 手术者姓名;
    private String 第一助姓名;//Ⅰ助姓名
    private String 第二助姓名;//Ⅱ助姓名
    private String 手术切口类别代码;
    @Transient
    @JsonIgnore
    private String 手术切口类别;
    private String 手术切口愈合等级代码;
    @Transient
    @JsonIgnore
    private String 手术切口愈合等级;
    private String 麻醉方式代码;
    @Transient
    @JsonIgnore
    private String 麻醉方式;
    private String 麻醉医师姓名;
    private String 离院方式代码;
    @Transient
    @JsonIgnore
    private String 离院方式;
    private String 拟接收医疗机构名称;
    private String 出院31天内再住院标志;
    private String 出院31天内再住院目的;
    private Short 颅脑损伤患者入院前昏迷时间D;
    private Long 颅脑损伤患者入院前昏迷时间H;
    private Long 颅脑损伤患者入院前昏迷时间M;
    private Short 颅脑损伤患者入院后昏迷时间D;
    private Long 颅脑损伤患者入院后昏迷时间H;
    private Long 颅脑损伤患者入院后昏迷时间M;
    private Long 住院总费用;
    private Long 住院总费用_自付金额;
    private Long 综合医疗服务类_一般医疗服务费;
    private Long 综合医疗服务类_中医辩证论治费;
    private Long 综合医疗服务类_中医辩证会诊费;
    private Long 综合医疗服务类_一般治疗操作费;
    private Long 综合医疗服务类_护理费;
    private Long 综合医疗服务类_其他费用;
    private Long 诊断类_病理诊断费;
    private Long 诊断类_实验室诊断费;
    private Long 诊断类_影像学诊断费;
    private Long 诊断类_临床诊断项目费;
    private Long 治疗类_非手术室治疗项目费;
    private Long 治疗类_非手术_临床物理治疗费;
    private Long 治疗类_手术治疗费;
    private Long 治疗类_手术治疗费_麻醉费;
    private Long 治疗类_手术治疗费_手术费;
    private Long 康复类_康复费;
    private Long 中医类_中医诊断费;
    private Long 中医类_中医治疗费;
    private Long 中医类_中医治疗费_中医外治费;
    private Long 中医类_中医治疗费_中医骨伤费;
    private Long 中医类_中医治疗费_针刺与灸法费;
    private Long 中医类_中医治疗费_中医推拿治疗;
    private Long 中医类_中医治疗费_中医肛肠治疗;
    private Long 中医类_中医治疗费_中医特殊治疗;
    private Long 中医类_中医其他费;
    private Long 中医类_中医其他费_调配加工费;
    private Long 中医类_中医其他费_辩证施膳费;
    private Long 西药类_西药费;
    private Long 西药类_西药费_抗菌药物费用;
    private Long 中药类_中成药费;
    private Long 中药类_中成药费_机构中药制剂费;
    private Long 中药类_中草药费;
    private Long 血液和血液制品类_血费;
    private Long 血液和血液制品类_白蛋白类费;
    private Long 血液和血液制品类_球蛋白类费;
    private Long 血液和血液制品类_凝血因子类费;
    private Long 血液和血液制品类_细胞因子类费;
    private Long 耗材类_检查用一次性医用材料费;
    private Long 耗材类_治疗用一次性医用材料费;
    private Long 耗材类_手术用一次性医用材料费;
    private Long 其他类_其他费;


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

    public String get医疗付费方式代码() {
        return 医疗付费方式代码;
    }

    public void set医疗付费方式代码(String 医疗付费方式代码) {
        this.医疗付费方式代码 = 医疗付费方式代码;
    }

    public String get医疗付费方式() {
        return 医疗付费方式;
    }

    public void set医疗付费方式(String 医疗付费方式) {
        this.医疗付费方式 = 医疗付费方式;
    }

    public String get居民健康卡号() {
        return 居民健康卡号;
    }

    public void set居民健康卡号(String 居民健康卡号) {
        this.居民健康卡号 = 居民健康卡号;
    }

    public Long get住院次数() {
        return 住院次数;
    }

    public void set住院次数(Long 住院次数) {
        this.住院次数 = 住院次数;
    }

    public String get住院号() {
        return 住院号;
    }

    public void set住院号(String 住院号) {
        this.住院号 = 住院号;
    }

    public String get病案号() {
        return 病案号;
    }

    public void set病案号(String 病案号) {
        this.病案号 = 病案号;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get性别代码() {
        return 性别代码;
    }

    public void set性别代码(String 性别代码) {
        this.性别代码 = 性别代码;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public String get出生日期() {
        return 出生日期;
    }

    public void set出生日期(String 出生日期) {
        this.出生日期 = 出生日期;
    }

    public Byte get年龄岁() {
        return 年龄岁;
    }

    public void set年龄岁(Byte 年龄岁) {
        this.年龄岁 = 年龄岁;
    }

    public String get年龄月() {
        return 年龄月;
    }

    public void set年龄月(String 年龄月) {
        this.年龄月 = 年龄月;
    }

    public String get国籍代码() {
        return 国籍代码;
    }

    public void set国籍代码(String 国籍代码) {
        this.国籍代码 = 国籍代码;
    }

    public String get国籍() {
        return 国籍;
    }

    public void set国籍(String 国籍) {
        this.国籍 = 国籍;
    }

    public Long get新生儿出生体重() {
        return 新生儿出生体重;
    }

    public void set新生儿出生体重(Long 新生儿出生体重) {
        this.新生儿出生体重 = 新生儿出生体重;
    }

    public Long get新生儿入院体重() {
        return 新生儿入院体重;
    }

    public void set新生儿入院体重(Long 新生儿入院体重) {
        this.新生儿入院体重 = 新生儿入院体重;
    }

    public String get出生地_省() {
        return 出生地_省;
    }

    public void set出生地_省(String 出生地_省) {
        this.出生地_省 = 出生地_省;
    }

    public String get出生地_市() {
        return 出生地_市;
    }

    public void set出生地_市(String 出生地_市) {
        this.出生地_市 = 出生地_市;
    }

    public String get出生地_县() {
        return 出生地_县;
    }

    public void set出生地_县(String 出生地_县) {
        this.出生地_县 = 出生地_县;
    }

    public String get籍贯_省() {
        return 籍贯_省;
    }

    public void set籍贯_省(String 籍贯_省) {
        this.籍贯_省 = 籍贯_省;
    }

    public String get籍贯_市() {
        return 籍贯_市;
    }

    public void set籍贯_市(String 籍贯_市) {
        this.籍贯_市 = 籍贯_市;
    }

    public String get民族() {
        return 民族;
    }

    public void set民族(String 民族) {
        this.民族 = 民族;
    }

    public String get民族名称() {
        return 民族名称;
    }

    public void set民族名称(String 民族名称) {
        this.民族名称 = 民族名称;
    }

    public String get身份证件类别代码() {
        return 身份证件类别代码;
    }

    public void set身份证件类别代码(String 身份证件类别代码) {
        this.身份证件类别代码 = 身份证件类别代码;
    }

    public String get患者身份证件号码() {
        return 患者身份证件号码;
    }

    public void set患者身份证件号码(String 患者身份证件号码) {
        this.患者身份证件号码 = 患者身份证件号码;
    }

    public String get职业类别代码() {
        return 职业类别代码;
    }

    public void set职业类别代码(String 职业类别代码) {
        this.职业类别代码 = 职业类别代码;
    }

    public String get职业类别() {
        return 职业类别;
    }

    public void set职业类别(String 职业类别) {
        this.职业类别 = 职业类别;
    }

    public String get婚姻状况代码() {
        return 婚姻状况代码;
    }

    public void set婚姻状况代码(String 婚姻状况代码) {
        this.婚姻状况代码 = 婚姻状况代码;
    }

    public String get婚姻状况() {
        return 婚姻状况;
    }

    public void set婚姻状况(String 婚姻状况) {
        this.婚姻状况 = 婚姻状况;
    }

    public String get现住址_省() {
        return 现住址_省;
    }

    public void set现住址_省(String 现住址_省) {
        this.现住址_省 = 现住址_省;
    }

    public String get现住址_市() {
        return 现住址_市;
    }

    public void set现住址_市(String 现住址_市) {
        this.现住址_市 = 现住址_市;
    }

    public String get现住址_县() {
        return 现住址_县;
    }

    public void set现住址_县(String 现住址_县) {
        this.现住址_县 = 现住址_县;
    }

    public String get现住址_乡() {
        return 现住址_乡;
    }

    public void set现住址_乡(String 现住址_乡) {
        this.现住址_乡 = 现住址_乡;
    }

    public String get现住址_村() {
        return 现住址_村;
    }

    public void set现住址_村(String 现住址_村) {
        this.现住址_村 = 现住址_村;
    }

    public String get现住址_门牌号码() {
        return 现住址_门牌号码;
    }

    public void set现住址_门牌号码(String 现住址_门牌号码) {
        this.现住址_门牌号码 = 现住址_门牌号码;
    }

    public String get电话号码() {
        return 电话号码;
    }

    public void set电话号码(String 电话号码) {
        this.电话号码 = 电话号码;
    }

    public String get现住址_邮政编码() {
        return 现住址_邮政编码;
    }

    public void set现住址_邮政编码(String 现住址_邮政编码) {
        this.现住址_邮政编码 = 现住址_邮政编码;
    }

    public String get户口地址_省() {
        return 户口地址_省;
    }

    public void set户口地址_省(String 户口地址_省) {
        this.户口地址_省 = 户口地址_省;
    }

    public String get户口地址_市() {
        return 户口地址_市;
    }

    public void set户口地址_市(String 户口地址_市) {
        this.户口地址_市 = 户口地址_市;
    }

    public String get户口地址_县() {
        return 户口地址_县;
    }

    public void set户口地址_县(String 户口地址_县) {
        this.户口地址_县 = 户口地址_县;
    }

    public String get户口地址_乡() {
        return 户口地址_乡;
    }

    public void set户口地址_乡(String 户口地址_乡) {
        this.户口地址_乡 = 户口地址_乡;
    }

    public String get户口地址_村() {
        return 户口地址_村;
    }

    public void set户口地址_村(String 户口地址_村) {
        this.户口地址_村 = 户口地址_村;
    }

    public String get户口地址_门牌号码() {
        return 户口地址_门牌号码;
    }

    public void set户口地址_门牌号码(String 户口地址_门牌号码) {
        this.户口地址_门牌号码 = 户口地址_门牌号码;
    }

    public String get户口地址_邮政编码() {
        return 户口地址_邮政编码;
    }

    public void set户口地址_邮政编码(String 户口地址_邮政编码) {
        this.户口地址_邮政编码 = 户口地址_邮政编码;
    }

    public String get工作单位名称() {
        return 工作单位名称;
    }

    public void set工作单位名称(String 工作单位名称) {
        this.工作单位名称 = 工作单位名称;
    }

    public String get工作单位地址_省() {
        return 工作单位地址_省;
    }

    public void set工作单位地址_省(String 工作单位地址_省) {
        this.工作单位地址_省 = 工作单位地址_省;
    }

    public String get工作单位地址_市() {
        return 工作单位地址_市;
    }

    public void set工作单位地址_市(String 工作单位地址_市) {
        this.工作单位地址_市 = 工作单位地址_市;
    }

    public String get工作单位地址_县() {
        return 工作单位地址_县;
    }

    public void set工作单位地址_县(String 工作单位地址_县) {
        this.工作单位地址_县 = 工作单位地址_县;
    }

    public String get工作单位地址_乡() {
        return 工作单位地址_乡;
    }

    public void set工作单位地址_乡(String 工作单位地址_乡) {
        this.工作单位地址_乡 = 工作单位地址_乡;
    }

    public String get工作单位地址_村() {
        return 工作单位地址_村;
    }

    public void set工作单位地址_村(String 工作单位地址_村) {
        this.工作单位地址_村 = 工作单位地址_村;
    }

    public String get工作单位地址_门牌号码() {
        return 工作单位地址_门牌号码;
    }

    public void set工作单位地址_门牌号码(String 工作单位地址_门牌号码) {
        this.工作单位地址_门牌号码 = 工作单位地址_门牌号码;
    }

    public String get工作单位电话号码() {
        return 工作单位电话号码;
    }

    public void set工作单位电话号码(String 工作单位电话号码) {
        this.工作单位电话号码 = 工作单位电话号码;
    }

    public String get工作单位地址_邮政编码() {
        return 工作单位地址_邮政编码;
    }

    public void set工作单位地址_邮政编码(String 工作单位地址_邮政编码) {
        this.工作单位地址_邮政编码 = 工作单位地址_邮政编码;
    }

    public String get联系人姓名() {
        return 联系人姓名;
    }

    public void set联系人姓名(String 联系人姓名) {
        this.联系人姓名 = 联系人姓名;
    }

    public String get联系人与患者的关系代码() {
        return 联系人与患者的关系代码;
    }

    public void set联系人与患者的关系代码(String 联系人与患者的关系代码) {
        this.联系人与患者的关系代码 = 联系人与患者的关系代码;
    }

    public String get联系人与患者的关系() {
        return 联系人与患者的关系;
    }

    public void set联系人与患者的关系(String 联系人与患者的关系) {
        this.联系人与患者的关系 = 联系人与患者的关系;
    }

    public String get联系人地址_省() {
        return 联系人地址_省;
    }

    public void set联系人地址_省(String 联系人地址_省) {
        this.联系人地址_省 = 联系人地址_省;
    }

    public String get联系人地址_市() {
        return 联系人地址_市;
    }

    public void set联系人地址_市(String 联系人地址_市) {
        this.联系人地址_市 = 联系人地址_市;
    }

    public String get联系人地址_县() {
        return 联系人地址_县;
    }

    public void set联系人地址_县(String 联系人地址_县) {
        this.联系人地址_县 = 联系人地址_县;
    }

    public String get联系人地址_乡() {
        return 联系人地址_乡;
    }

    public void set联系人地址_乡(String 联系人地址_乡) {
        this.联系人地址_乡 = 联系人地址_乡;
    }

    public String get联系人地址_村() {
        return 联系人地址_村;
    }

    public void set联系人地址_村(String 联系人地址_村) {
        this.联系人地址_村 = 联系人地址_村;
    }

    public String get联系人地址_门牌号码() {
        return 联系人地址_门牌号码;
    }

    public void set联系人地址_门牌号码(String 联系人地址_门牌号码) {
        this.联系人地址_门牌号码 = 联系人地址_门牌号码;
    }

    public String get联系人电话号码() {
        return 联系人电话号码;
    }

    public void set联系人电话号码(String 联系人电话号码) {
        this.联系人电话号码 = 联系人电话号码;
    }

    public String get入院途径代码() {
        return 入院途径代码;
    }

    public void set入院途径代码(String 入院途径代码) {
        this.入院途径代码 = 入院途径代码;
    }

    public String get入院途径() {
        return 入院途径;
    }

    public void set入院途径(String 入院途径) {
        this.入院途径 = 入院途径;
    }

    public String get治疗类别代码() {
        return 治疗类别代码;
    }

    public void set治疗类别代码(String 治疗类别代码) {
        this.治疗类别代码 = 治疗类别代码;
    }

    public String get治疗类别() {
        return 治疗类别;
    }

    public void set治疗类别(String 治疗类别) {
        this.治疗类别 = 治疗类别;
    }

    public String get入院日期时间() {
        return 入院日期时间;
    }

    public void set入院日期时间(String 入院日期时间) {
        this.入院日期时间 = 入院日期时间;
    }

    public String get入院科别() {
        return 入院科别;
    }

    public void set入院科别(String 入院科别) {
        this.入院科别 = 入院科别;
    }

    public String get入院病房() {
        return 入院病房;
    }

    public void set入院病房(String 入院病房) {
        this.入院病房 = 入院病房;
    }

    public String get转科科别() {
        return 转科科别;
    }

    public void set转科科别(String 转科科别) {
        this.转科科别 = 转科科别;
    }

    public String get出院日期时间() {
        return 出院日期时间;
    }

    public void set出院日期时间(String 出院日期时间) {
        this.出院日期时间 = 出院日期时间;
    }

    public String get出院科别() {
        return 出院科别;
    }

    public void set出院科别(String 出院科别) {
        this.出院科别 = 出院科别;
    }

    public String get出院病房() {
        return 出院病房;
    }

    public void set出院病房(String 出院病房) {
        this.出院病房 = 出院病房;
    }

    public Long get实际住院天数() {
        return 实际住院天数;
    }

    public void set实际住院天数(Long 实际住院天数) {
        this.实际住院天数 = 实际住院天数;
    }

    public String get门急诊诊断中医诊断名称() {
        return 门急诊诊断中医诊断名称;
    }

    public void set门急诊诊断中医诊断名称(String 门急诊诊断中医诊断名称) {
        this.门急诊诊断中医诊断名称 = 门急诊诊断中医诊断名称;
    }

    public String get门急诊诊断中医诊断病名编码() {
        return 门急诊诊断中医诊断病名编码;
    }

    public void set门急诊诊断中医诊断病名编码(String 门急诊诊断中医诊断病名编码) {
        this.门急诊诊断中医诊断病名编码 = 门急诊诊断中医诊断病名编码;
    }

    public String get门急诊诊断中医诊断病名名称() {
        return 门急诊诊断中医诊断病名名称;
    }

    public void set门急诊诊断中医诊断病名名称(String 门急诊诊断中医诊断病名名称) {
        this.门急诊诊断中医诊断病名名称 = 门急诊诊断中医诊断病名名称;
    }

    public String get门急诊诊断中医证候名称() {
        return 门急诊诊断中医证候名称;
    }

    public void set门急诊诊断中医证候名称(String 门急诊诊断中医证候名称) {
        this.门急诊诊断中医证候名称 = 门急诊诊断中医证候名称;
    }

    public String get门急诊诊断中医证候证候编码() {
        return 门急诊诊断中医证候证候编码;
    }

    public void set门急诊诊断中医证候证候编码(String 门急诊诊断中医证候证候编码) {
        this.门急诊诊断中医证候证候编码 = 门急诊诊断中医证候证候编码;
    }

    public String get门急诊诊断西医诊断名称() {
        return 门急诊诊断西医诊断名称;
    }

    public void set门急诊诊断西医诊断名称(String 门急诊诊断西医诊断名称) {
        this.门急诊诊断西医诊断名称 = 门急诊诊断西医诊断名称;
    }

    public String get门急诊诊断西医诊断疾病编码() {
        return 门急诊诊断西医诊断疾病编码;
    }

    public void set门急诊诊断西医诊断疾病编码(String 门急诊诊断西医诊断疾病编码) {
        this.门急诊诊断西医诊断疾病编码 = 门急诊诊断西医诊断疾病编码;
    }

    public String get门急诊诊断西医诊断疾病名称() {
        return 门急诊诊断西医诊断疾病名称;
    }

    public void set门急诊诊断西医诊断疾病名称(String 门急诊诊断西医诊断疾病名称) {
        this.门急诊诊断西医诊断疾病名称 = 门急诊诊断西医诊断疾病名称;
    }

    public String get实施临床路径标志代码() {
        return 实施临床路径标志代码;
    }

    public void set实施临床路径标志代码(String 实施临床路径标志代码) {
        this.实施临床路径标志代码 = 实施临床路径标志代码;
    }

    public String get实施临床路径标志() {
        return 实施临床路径标志;
    }

    public void set实施临床路径标志(String 实施临床路径标志) {
        this.实施临床路径标志 = 实施临床路径标志;
    }

    public String get使用医疗机构中药制剂标志() {
        return 使用医疗机构中药制剂标志;
    }

    public void set使用医疗机构中药制剂标志(String 使用医疗机构中药制剂标志) {
        this.使用医疗机构中药制剂标志 = 使用医疗机构中药制剂标志;
    }

    public String get使用中医诊疗设备标志() {
        return 使用中医诊疗设备标志;
    }

    public void set使用中医诊疗设备标志(String 使用中医诊疗设备标志) {
        this.使用中医诊疗设备标志 = 使用中医诊疗设备标志;
    }

    public String get使用中医诊疗技术标志() {
        return 使用中医诊疗技术标志;
    }

    public void set使用中医诊疗技术标志(String 使用中医诊疗技术标志) {
        this.使用中医诊疗技术标志 = 使用中医诊疗技术标志;
    }

    public String get辨证施护标志() {
        return 辨证施护标志;
    }

    public void set辨证施护标志(String 辨证施护标志) {
        this.辨证施护标志 = 辨证施护标志;
    }

    public String get出院中医诊断_主病名称() {
        return 出院中医诊断_主病名称;
    }

    public void set出院中医诊断_主病名称(String 出院中医诊断_主病名称) {
        this.出院中医诊断_主病名称 = 出院中医诊断_主病名称;
    }

    public String get出院中医诊断_主病编码() {
        return 出院中医诊断_主病编码;
    }

    public void set出院中医诊断_主病编码(String 出院中医诊断_主病编码) {
        this.出院中医诊断_主病编码 = 出院中医诊断_主病编码;
    }

    public String get出院中医诊断_主病_入院病情代码() {
        return 出院中医诊断_主病_入院病情代码;
    }

    public void set出院中医诊断_主病_入院病情代码(String 出院中医诊断_主病_入院病情代码) {
        this.出院中医诊断_主病_入院病情代码 = 出院中医诊断_主病_入院病情代码;
    }

    public String get出院中医诊断_主病_入院病情() {
        return 出院中医诊断_主病_入院病情;
    }

    public void set出院中医诊断_主病_入院病情(String 出院中医诊断_主病_入院病情) {
        this.出院中医诊断_主病_入院病情 = 出院中医诊断_主病_入院病情;
    }

    public String get出院中医诊断_主证名称() {
        return 出院中医诊断_主证名称;
    }

    public void set出院中医诊断_主证名称(String 出院中医诊断_主证名称) {
        this.出院中医诊断_主证名称 = 出院中医诊断_主证名称;
    }

    public String get出院中医诊断_主证编码() {
        return 出院中医诊断_主证编码;
    }

    public void set出院中医诊断_主证编码(String 出院中医诊断_主证编码) {
        this.出院中医诊断_主证编码 = 出院中医诊断_主证编码;
    }

    public String get出院中医诊断_主证_入院病情代码() {
        return 出院中医诊断_主证_入院病情代码;
    }

    public void set出院中医诊断_主证_入院病情代码(String 出院中医诊断_主证_入院病情代码) {
        this.出院中医诊断_主证_入院病情代码 = 出院中医诊断_主证_入院病情代码;
    }

    public String get出院中医诊断_主证_入院病情() {
        return 出院中医诊断_主证_入院病情;
    }

    public void set出院中医诊断_主证_入院病情(String 出院中医诊断_主证_入院病情) {
        this.出院中医诊断_主证_入院病情 = 出院中医诊断_主证_入院病情;
    }

    public String get出院西医诊断_主要诊断名称() {
        return 出院西医诊断_主要诊断名称;
    }

    public void set出院西医诊断_主要诊断名称(String 出院西医诊断_主要诊断名称) {
        this.出院西医诊断_主要诊断名称 = 出院西医诊断_主要诊断名称;
    }

    public String get出院西医诊断_主要诊断疾病编码() {
        return 出院西医诊断_主要诊断疾病编码;
    }

    public void set出院西医诊断_主要诊断疾病编码(String 出院西医诊断_主要诊断疾病编码) {
        this.出院西医诊断_主要诊断疾病编码 = 出院西医诊断_主要诊断疾病编码;
    }

    public String get出院西医诊断_主要诊断疾病名称() {
        return 出院西医诊断_主要诊断疾病名称;
    }

    public void set出院西医诊断_主要诊断疾病名称(String 出院西医诊断_主要诊断疾病名称) {
        this.出院西医诊断_主要诊断疾病名称 = 出院西医诊断_主要诊断疾病名称;
    }

    public String get出院西医诊断_主要诊断入院病情() {
        return 出院西医诊断_主要诊断入院病情;
    }

    public void set出院西医诊断_主要诊断入院病情(String 出院西医诊断_主要诊断入院病情) {
        this.出院西医诊断_主要诊断入院病情 = 出院西医诊断_主要诊断入院病情;
    }

    public String get出院西医诊断_其他诊断名称() {
        return 出院西医诊断_其他诊断名称;
    }

    public void set出院西医诊断_其他诊断名称(String 出院西医诊断_其他诊断名称) {
        this.出院西医诊断_其他诊断名称 = 出院西医诊断_其他诊断名称;
    }

    public String get出院西医诊断_其他诊断疾病编码() {
        return 出院西医诊断_其他诊断疾病编码;
    }

    public void set出院西医诊断_其他诊断疾病编码(String 出院西医诊断_其他诊断疾病编码) {
        this.出院西医诊断_其他诊断疾病编码 = 出院西医诊断_其他诊断疾病编码;
    }

    public String get出院西医诊断_其他诊断疾病名称() {
        return 出院西医诊断_其他诊断疾病名称;
    }

    public void set出院西医诊断_其他诊断疾病名称(String 出院西医诊断_其他诊断疾病名称) {
        this.出院西医诊断_其他诊断疾病名称 = 出院西医诊断_其他诊断疾病名称;
    }

    public String get出院西医诊断_其他诊断入院病情() {
        return 出院西医诊断_其他诊断入院病情;
    }

    public void set出院西医诊断_其他诊断入院病情(String 出院西医诊断_其他诊断入院病情) {
        this.出院西医诊断_其他诊断入院病情 = 出院西医诊断_其他诊断入院病情;
    }

    public String get损伤中毒的外部原因() {
        return 损伤中毒的外部原因;
    }

    public void set损伤中毒的外部原因(String 损伤中毒的外部原因) {
        this.损伤中毒的外部原因 = 损伤中毒的外部原因;
    }

    public String get损伤中毒的外部原因疾病编码() {
        return 损伤中毒的外部原因疾病编码;
    }

    public void set损伤中毒的外部原因疾病编码(String 损伤中毒的外部原因疾病编码) {
        this.损伤中毒的外部原因疾病编码 = 损伤中毒的外部原因疾病编码;
    }

    public String get损伤中毒的外部原因疾病() {
        return 损伤中毒的外部原因疾病;
    }

    public void set损伤中毒的外部原因疾病(String 损伤中毒的外部原因疾病) {
        this.损伤中毒的外部原因疾病 = 损伤中毒的外部原因疾病;
    }

    public String get病理诊断名称() {
        return 病理诊断名称;
    }

    public void set病理诊断名称(String 病理诊断名称) {
        this.病理诊断名称 = 病理诊断名称;
    }

    public String get病理诊断疾病编码() {
        return 病理诊断疾病编码;
    }

    public void set病理诊断疾病编码(String 病理诊断疾病编码) {
        this.病理诊断疾病编码 = 病理诊断疾病编码;
    }

    public String get病理诊断疾病() {
        return 病理诊断疾病;
    }

    public void set病理诊断疾病(String 病理诊断疾病) {
        this.病理诊断疾病 = 病理诊断疾病;
    }

    public String get病理号() {
        return 病理号;
    }

    public void set病理号(String 病理号) {
        this.病理号 = 病理号;
    }

    public String get药物过敏标志() {
        return 药物过敏标志;
    }

    public void set药物过敏标志(String 药物过敏标志) {
        this.药物过敏标志 = 药物过敏标志;
    }

    public String get过敏药物() {
        return 过敏药物;
    }

    public void set过敏药物(String 过敏药物) {
        this.过敏药物 = 过敏药物;
    }

    public String get死亡患者尸检标志() {
        return 死亡患者尸检标志;
    }

    public void set死亡患者尸检标志(String 死亡患者尸检标志) {
        this.死亡患者尸检标志 = 死亡患者尸检标志;
    }

    public String getABO血型代码() {
        return ABO血型代码;
    }

    public void setABO血型代码(String ABO血型代码) {
        this.ABO血型代码 = ABO血型代码;
    }

    public String getABO血型() {
        return ABO血型;
    }

    public void setABO血型(String ABO血型) {
        this.ABO血型 = ABO血型;
    }

    public String getRH血型代码() {
        return RH血型代码;
    }

    public void setRH血型代码(String RH血型代码) {
        this.RH血型代码 = RH血型代码;
    }

    public String getRH血型() {
        return RH血型;
    }

    public void setRH血型(String RH血型) {
        this.RH血型 = RH血型;
    }

    public String get科主任签名() {
        return 科主任签名;
    }

    public void set科主任签名(String 科主任签名) {
        this.科主任签名 = 科主任签名;
    }

    public String get主任医师签名() {
        return 主任医师签名;
    }

    public void set主任医师签名(String 主任医师签名) {
        this.主任医师签名 = 主任医师签名;
    }

    public String get主治医师签名() {
        return 主治医师签名;
    }

    public void set主治医师签名(String 主治医师签名) {
        this.主治医师签名 = 主治医师签名;
    }

    public String get住院医师签名() {
        return 住院医师签名;
    }

    public void set住院医师签名(String 住院医师签名) {
        this.住院医师签名 = 住院医师签名;
    }

    public String get责任护士签名() {
        return 责任护士签名;
    }

    public void set责任护士签名(String 责任护士签名) {
        this.责任护士签名 = 责任护士签名;
    }

    public String get进修医师签名() {
        return 进修医师签名;
    }

    public void set进修医师签名(String 进修医师签名) {
        this.进修医师签名 = 进修医师签名;
    }

    public String get实习医师签名() {
        return 实习医师签名;
    }

    public void set实习医师签名(String 实习医师签名) {
        this.实习医师签名 = 实习医师签名;
    }

    public String get编码员签名() {
        return 编码员签名;
    }

    public void set编码员签名(String 编码员签名) {
        this.编码员签名 = 编码员签名;
    }

    public String get病案质量代码() {
        return 病案质量代码;
    }

    public void set病案质量代码(String 病案质量代码) {
        this.病案质量代码 = 病案质量代码;
    }

    public String get病案质量() {
        return 病案质量;
    }

    public void set病案质量(String 病案质量) {
        this.病案质量 = 病案质量;
    }

    public String get质控医师签名() {
        return 质控医师签名;
    }

    public void set质控医师签名(String 质控医师签名) {
        this.质控医师签名 = 质控医师签名;
    }

    public String get质控护士签名() {
        return 质控护士签名;
    }

    public void set质控护士签名(String 质控护士签名) {
        this.质控护士签名 = 质控护士签名;
    }

    public String get质控日期() {
        return 质控日期;
    }

    public void set质控日期(String 质控日期) {
        this.质控日期 = 质控日期;
    }

    public String get手术及操作编码() {
        return 手术及操作编码;
    }

    public void set手术及操作编码(String 手术及操作编码) {
        this.手术及操作编码 = 手术及操作编码;
    }

    public String get手术及操作日期() {
        return 手术及操作日期;
    }

    public void set手术及操作日期(String 手术及操作日期) {
        this.手术及操作日期 = 手术及操作日期;
    }

    public String get手术级别代码() {
        return 手术级别代码;
    }

    public void set手术级别代码(String 手术级别代码) {
        this.手术级别代码 = 手术级别代码;
    }

    public String get手术级别() {
        return 手术级别;
    }

    public void set手术级别(String 手术级别) {
        this.手术级别 = 手术级别;
    }

    public String get手术及操作名称() {
        return 手术及操作名称;
    }

    public void set手术及操作名称(String 手术及操作名称) {
        this.手术及操作名称 = 手术及操作名称;
    }

    public String get手术者姓名() {
        return 手术者姓名;
    }

    public void set手术者姓名(String 手术者姓名) {
        this.手术者姓名 = 手术者姓名;
    }

    public String get第一助姓名() {
        return 第一助姓名;
    }

    public void set第一助姓名(String 第一助姓名) {
        this.第一助姓名 = 第一助姓名;
    }

    public String get第二助姓名() {
        return 第二助姓名;
    }

    public void set第二助姓名(String 第二助姓名) {
        this.第二助姓名 = 第二助姓名;
    }

    public String get手术切口类别代码() {
        return 手术切口类别代码;
    }

    public void set手术切口类别代码(String 手术切口类别代码) {
        this.手术切口类别代码 = 手术切口类别代码;
    }

    public String get手术切口类别() {
        return 手术切口类别;
    }

    public void set手术切口类别(String 手术切口类别) {
        this.手术切口类别 = 手术切口类别;
    }

    public String get手术切口愈合等级代码() {
        return 手术切口愈合等级代码;
    }

    public void set手术切口愈合等级代码(String 手术切口愈合等级代码) {
        this.手术切口愈合等级代码 = 手术切口愈合等级代码;
    }

    public String get手术切口愈合等级() {
        return 手术切口愈合等级;
    }

    public void set手术切口愈合等级(String 手术切口愈合等级) {
        this.手术切口愈合等级 = 手术切口愈合等级;
    }

    public String get麻醉方式代码() {
        return 麻醉方式代码;
    }

    public void set麻醉方式代码(String 麻醉方式代码) {
        this.麻醉方式代码 = 麻醉方式代码;
    }

    public String get麻醉方式() {
        return 麻醉方式;
    }

    public void set麻醉方式(String 麻醉方式) {
        this.麻醉方式 = 麻醉方式;
    }

    public String get麻醉医师姓名() {
        return 麻醉医师姓名;
    }

    public void set麻醉医师姓名(String 麻醉医师姓名) {
        this.麻醉医师姓名 = 麻醉医师姓名;
    }

    public String get离院方式代码() {
        return 离院方式代码;
    }

    public void set离院方式代码(String 离院方式代码) {
        this.离院方式代码 = 离院方式代码;
    }

    public String get离院方式() {
        return 离院方式;
    }

    public void set离院方式(String 离院方式) {
        this.离院方式 = 离院方式;
    }

    public String get拟接收医疗机构名称() {
        return 拟接收医疗机构名称;
    }

    public void set拟接收医疗机构名称(String 拟接收医疗机构名称) {
        this.拟接收医疗机构名称 = 拟接收医疗机构名称;
    }

    public String get出院31天内再住院标志() {
        return 出院31天内再住院标志;
    }

    public void set出院31天内再住院标志(String 出院31天内再住院标志) {
        this.出院31天内再住院标志 = 出院31天内再住院标志;
    }

    public String get出院31天内再住院目的() {
        return 出院31天内再住院目的;
    }

    public void set出院31天内再住院目的(String 出院31天内再住院目的) {
        this.出院31天内再住院目的 = 出院31天内再住院目的;
    }

    public Short get颅脑损伤患者入院前昏迷时间D() {
        return 颅脑损伤患者入院前昏迷时间D;
    }

    public void set颅脑损伤患者入院前昏迷时间D(Short 颅脑损伤患者入院前昏迷时间D) {
        this.颅脑损伤患者入院前昏迷时间D = 颅脑损伤患者入院前昏迷时间D;
    }

    public Long get颅脑损伤患者入院前昏迷时间H() {
        return 颅脑损伤患者入院前昏迷时间H;
    }

    public void set颅脑损伤患者入院前昏迷时间H(Long 颅脑损伤患者入院前昏迷时间H) {
        this.颅脑损伤患者入院前昏迷时间H = 颅脑损伤患者入院前昏迷时间H;
    }

    public Long get颅脑损伤患者入院前昏迷时间M() {
        return 颅脑损伤患者入院前昏迷时间M;
    }

    public void set颅脑损伤患者入院前昏迷时间M(Long 颅脑损伤患者入院前昏迷时间M) {
        this.颅脑损伤患者入院前昏迷时间M = 颅脑损伤患者入院前昏迷时间M;
    }

    public Short get颅脑损伤患者入院后昏迷时间D() {
        return 颅脑损伤患者入院后昏迷时间D;
    }

    public void set颅脑损伤患者入院后昏迷时间D(Short 颅脑损伤患者入院后昏迷时间D) {
        this.颅脑损伤患者入院后昏迷时间D = 颅脑损伤患者入院后昏迷时间D;
    }

    public Long get颅脑损伤患者入院后昏迷时间H() {
        return 颅脑损伤患者入院后昏迷时间H;
    }

    public void set颅脑损伤患者入院后昏迷时间H(Long 颅脑损伤患者入院后昏迷时间H) {
        this.颅脑损伤患者入院后昏迷时间H = 颅脑损伤患者入院后昏迷时间H;
    }

    public Long get颅脑损伤患者入院后昏迷时间M() {
        return 颅脑损伤患者入院后昏迷时间M;
    }

    public void set颅脑损伤患者入院后昏迷时间M(Long 颅脑损伤患者入院后昏迷时间M) {
        this.颅脑损伤患者入院后昏迷时间M = 颅脑损伤患者入院后昏迷时间M;
    }

    public Long get住院总费用() {
        return 住院总费用;
    }

    public void set住院总费用(Long 住院总费用) {
        this.住院总费用 = 住院总费用;
    }

    public Long get住院总费用_自付金额() {
        return 住院总费用_自付金额;
    }

    public void set住院总费用_自付金额(Long 住院总费用_自付金额) {
        this.住院总费用_自付金额 = 住院总费用_自付金额;
    }

    public Long get综合医疗服务类_一般医疗服务费() {
        return 综合医疗服务类_一般医疗服务费;
    }

    public void set综合医疗服务类_一般医疗服务费(Long 综合医疗服务类_一般医疗服务费) {
        this.综合医疗服务类_一般医疗服务费 = 综合医疗服务类_一般医疗服务费;
    }

    public Long get综合医疗服务类_中医辩证论治费() {
        return 综合医疗服务类_中医辩证论治费;
    }

    public void set综合医疗服务类_中医辩证论治费(Long 综合医疗服务类_中医辩证论治费) {
        this.综合医疗服务类_中医辩证论治费 = 综合医疗服务类_中医辩证论治费;
    }

    public Long get综合医疗服务类_中医辩证会诊费() {
        return 综合医疗服务类_中医辩证会诊费;
    }

    public void set综合医疗服务类_中医辩证会诊费(Long 综合医疗服务类_中医辩证会诊费) {
        this.综合医疗服务类_中医辩证会诊费 = 综合医疗服务类_中医辩证会诊费;
    }

    public Long get综合医疗服务类_一般治疗操作费() {
        return 综合医疗服务类_一般治疗操作费;
    }

    public void set综合医疗服务类_一般治疗操作费(Long 综合医疗服务类_一般治疗操作费) {
        this.综合医疗服务类_一般治疗操作费 = 综合医疗服务类_一般治疗操作费;
    }

    public Long get综合医疗服务类_护理费() {
        return 综合医疗服务类_护理费;
    }

    public void set综合医疗服务类_护理费(Long 综合医疗服务类_护理费) {
        this.综合医疗服务类_护理费 = 综合医疗服务类_护理费;
    }

    public Long get综合医疗服务类_其他费用() {
        return 综合医疗服务类_其他费用;
    }

    public void set综合医疗服务类_其他费用(Long 综合医疗服务类_其他费用) {
        this.综合医疗服务类_其他费用 = 综合医疗服务类_其他费用;
    }

    public Long get诊断类_病理诊断费() {
        return 诊断类_病理诊断费;
    }

    public void set诊断类_病理诊断费(Long 诊断类_病理诊断费) {
        this.诊断类_病理诊断费 = 诊断类_病理诊断费;
    }

    public Long get诊断类_实验室诊断费() {
        return 诊断类_实验室诊断费;
    }

    public void set诊断类_实验室诊断费(Long 诊断类_实验室诊断费) {
        this.诊断类_实验室诊断费 = 诊断类_实验室诊断费;
    }

    public Long get诊断类_影像学诊断费() {
        return 诊断类_影像学诊断费;
    }

    public void set诊断类_影像学诊断费(Long 诊断类_影像学诊断费) {
        this.诊断类_影像学诊断费 = 诊断类_影像学诊断费;
    }

    public Long get诊断类_临床诊断项目费() {
        return 诊断类_临床诊断项目费;
    }

    public void set诊断类_临床诊断项目费(Long 诊断类_临床诊断项目费) {
        this.诊断类_临床诊断项目费 = 诊断类_临床诊断项目费;
    }

    public Long get治疗类_非手术室治疗项目费() {
        return 治疗类_非手术室治疗项目费;
    }

    public void set治疗类_非手术室治疗项目费(Long 治疗类_非手术室治疗项目费) {
        this.治疗类_非手术室治疗项目费 = 治疗类_非手术室治疗项目费;
    }

    public Long get治疗类_非手术_临床物理治疗费() {
        return 治疗类_非手术_临床物理治疗费;
    }

    public void set治疗类_非手术_临床物理治疗费(Long 治疗类_非手术_临床物理治疗费) {
        this.治疗类_非手术_临床物理治疗费 = 治疗类_非手术_临床物理治疗费;
    }

    public Long get治疗类_手术治疗费() {
        return 治疗类_手术治疗费;
    }

    public void set治疗类_手术治疗费(Long 治疗类_手术治疗费) {
        this.治疗类_手术治疗费 = 治疗类_手术治疗费;
    }

    public Long get治疗类_手术治疗费_麻醉费() {
        return 治疗类_手术治疗费_麻醉费;
    }

    public void set治疗类_手术治疗费_麻醉费(Long 治疗类_手术治疗费_麻醉费) {
        this.治疗类_手术治疗费_麻醉费 = 治疗类_手术治疗费_麻醉费;
    }

    public Long get治疗类_手术治疗费_手术费() {
        return 治疗类_手术治疗费_手术费;
    }

    public void set治疗类_手术治疗费_手术费(Long 治疗类_手术治疗费_手术费) {
        this.治疗类_手术治疗费_手术费 = 治疗类_手术治疗费_手术费;
    }

    public Long get康复类_康复费() {
        return 康复类_康复费;
    }

    public void set康复类_康复费(Long 康复类_康复费) {
        this.康复类_康复费 = 康复类_康复费;
    }

    public Long get中医类_中医诊断费() {
        return 中医类_中医诊断费;
    }

    public void set中医类_中医诊断费(Long 中医类_中医诊断费) {
        this.中医类_中医诊断费 = 中医类_中医诊断费;
    }

    public Long get中医类_中医治疗费() {
        return 中医类_中医治疗费;
    }

    public void set中医类_中医治疗费(Long 中医类_中医治疗费) {
        this.中医类_中医治疗费 = 中医类_中医治疗费;
    }

    public Long get中医类_中医治疗费_中医外治费() {
        return 中医类_中医治疗费_中医外治费;
    }

    public void set中医类_中医治疗费_中医外治费(Long 中医类_中医治疗费_中医外治费) {
        this.中医类_中医治疗费_中医外治费 = 中医类_中医治疗费_中医外治费;
    }

    public Long get中医类_中医治疗费_中医骨伤费() {
        return 中医类_中医治疗费_中医骨伤费;
    }

    public void set中医类_中医治疗费_中医骨伤费(Long 中医类_中医治疗费_中医骨伤费) {
        this.中医类_中医治疗费_中医骨伤费 = 中医类_中医治疗费_中医骨伤费;
    }

    public Long get中医类_中医治疗费_针刺与灸法费() {
        return 中医类_中医治疗费_针刺与灸法费;
    }

    public void set中医类_中医治疗费_针刺与灸法费(Long 中医类_中医治疗费_针刺与灸法费) {
        this.中医类_中医治疗费_针刺与灸法费 = 中医类_中医治疗费_针刺与灸法费;
    }

    public Long get中医类_中医治疗费_中医推拿治疗() {
        return 中医类_中医治疗费_中医推拿治疗;
    }

    public void set中医类_中医治疗费_中医推拿治疗(Long 中医类_中医治疗费_中医推拿治疗) {
        this.中医类_中医治疗费_中医推拿治疗 = 中医类_中医治疗费_中医推拿治疗;
    }

    public Long get中医类_中医治疗费_中医肛肠治疗() {
        return 中医类_中医治疗费_中医肛肠治疗;
    }

    public void set中医类_中医治疗费_中医肛肠治疗(Long 中医类_中医治疗费_中医肛肠治疗) {
        this.中医类_中医治疗费_中医肛肠治疗 = 中医类_中医治疗费_中医肛肠治疗;
    }

    public Long get中医类_中医治疗费_中医特殊治疗() {
        return 中医类_中医治疗费_中医特殊治疗;
    }

    public void set中医类_中医治疗费_中医特殊治疗(Long 中医类_中医治疗费_中医特殊治疗) {
        this.中医类_中医治疗费_中医特殊治疗 = 中医类_中医治疗费_中医特殊治疗;
    }

    public Long get中医类_中医其他费() {
        return 中医类_中医其他费;
    }

    public void set中医类_中医其他费(Long 中医类_中医其他费) {
        this.中医类_中医其他费 = 中医类_中医其他费;
    }

    public Long get中医类_中医其他费_调配加工费() {
        return 中医类_中医其他费_调配加工费;
    }

    public void set中医类_中医其他费_调配加工费(Long 中医类_中医其他费_调配加工费) {
        this.中医类_中医其他费_调配加工费 = 中医类_中医其他费_调配加工费;
    }

    public Long get中医类_中医其他费_辩证施膳费() {
        return 中医类_中医其他费_辩证施膳费;
    }

    public void set中医类_中医其他费_辩证施膳费(Long 中医类_中医其他费_辩证施膳费) {
        this.中医类_中医其他费_辩证施膳费 = 中医类_中医其他费_辩证施膳费;
    }

    public Long get西药类_西药费() {
        return 西药类_西药费;
    }

    public void set西药类_西药费(Long 西药类_西药费) {
        this.西药类_西药费 = 西药类_西药费;
    }

    public Long get西药类_西药费_抗菌药物费用() {
        return 西药类_西药费_抗菌药物费用;
    }

    public void set西药类_西药费_抗菌药物费用(Long 西药类_西药费_抗菌药物费用) {
        this.西药类_西药费_抗菌药物费用 = 西药类_西药费_抗菌药物费用;
    }

    public Long get中药类_中成药费() {
        return 中药类_中成药费;
    }

    public void set中药类_中成药费(Long 中药类_中成药费) {
        this.中药类_中成药费 = 中药类_中成药费;
    }

    public Long get中药类_中成药费_机构中药制剂费() {
        return 中药类_中成药费_机构中药制剂费;
    }

    public void set中药类_中成药费_机构中药制剂费(Long 中药类_中成药费_机构中药制剂费) {
        this.中药类_中成药费_机构中药制剂费 = 中药类_中成药费_机构中药制剂费;
    }

    public Long get中药类_中草药费() {
        return 中药类_中草药费;
    }

    public void set中药类_中草药费(Long 中药类_中草药费) {
        this.中药类_中草药费 = 中药类_中草药费;
    }

    public Long get血液和血液制品类_血费() {
        return 血液和血液制品类_血费;
    }

    public void set血液和血液制品类_血费(Long 血液和血液制品类_血费) {
        this.血液和血液制品类_血费 = 血液和血液制品类_血费;
    }

    public Long get血液和血液制品类_白蛋白类费() {
        return 血液和血液制品类_白蛋白类费;
    }

    public void set血液和血液制品类_白蛋白类费(Long 血液和血液制品类_白蛋白类费) {
        this.血液和血液制品类_白蛋白类费 = 血液和血液制品类_白蛋白类费;
    }

    public Long get血液和血液制品类_球蛋白类费() {
        return 血液和血液制品类_球蛋白类费;
    }

    public void set血液和血液制品类_球蛋白类费(Long 血液和血液制品类_球蛋白类费) {
        this.血液和血液制品类_球蛋白类费 = 血液和血液制品类_球蛋白类费;
    }

    public Long get血液和血液制品类_凝血因子类费() {
        return 血液和血液制品类_凝血因子类费;
    }

    public void set血液和血液制品类_凝血因子类费(Long 血液和血液制品类_凝血因子类费) {
        this.血液和血液制品类_凝血因子类费 = 血液和血液制品类_凝血因子类费;
    }

    public Long get血液和血液制品类_细胞因子类费() {
        return 血液和血液制品类_细胞因子类费;
    }

    public void set血液和血液制品类_细胞因子类费(Long 血液和血液制品类_细胞因子类费) {
        this.血液和血液制品类_细胞因子类费 = 血液和血液制品类_细胞因子类费;
    }

    public Long get耗材类_检查用一次性医用材料费() {
        return 耗材类_检查用一次性医用材料费;
    }

    public void set耗材类_检查用一次性医用材料费(Long 耗材类_检查用一次性医用材料费) {
        this.耗材类_检查用一次性医用材料费 = 耗材类_检查用一次性医用材料费;
    }

    public Long get耗材类_治疗用一次性医用材料费() {
        return 耗材类_治疗用一次性医用材料费;
    }

    public void set耗材类_治疗用一次性医用材料费(Long 耗材类_治疗用一次性医用材料费) {
        this.耗材类_治疗用一次性医用材料费 = 耗材类_治疗用一次性医用材料费;
    }

    public Long get耗材类_手术用一次性医用材料费() {
        return 耗材类_手术用一次性医用材料费;
    }

    public void set耗材类_手术用一次性医用材料费(Long 耗材类_手术用一次性医用材料费) {
        this.耗材类_手术用一次性医用材料费 = 耗材类_手术用一次性医用材料费;
    }

    public Long get其他类_其他费() {
        return 其他类_其他费;
    }

    public void set其他类_其他费(Long 其他类_其他费) {
        this.其他类_其他费 = 其他类_其他费;
    }
}
