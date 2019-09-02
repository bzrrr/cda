package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈剖宫产手术记录〉
 */
@Entity
@Table(name = "PUB06_剖宫产手术记录")
public class CesareanSection implements Serializable {

    @Id
    private String 系统序号;
    private String 住院号;
    private String 产妇姓名;
    private Byte 年龄岁;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private String 待产日期时间;
    private String 术前诊断;
    private String 手术指征;
    private String 手术及操作编码;
    @Transient
    @JsonIgnore
    private String 手术及操作名称;
    private String 手术开始日期吋间;
    private String 麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 麻醉方法名称;
    private String 麻醉体位;
    private String 麻醉效果;
    private String 剖宫产手术过程;
    private String 子宫情况;
    private String 胎儿娩出方式;
    private String 羊水性状;
    private Short 羊水量;
    private String 胎盘娩出日期时间;
    private String 胎盘娩出情况;
    private String 胎膜完整情况标志;
    private Short 脐带长度;
    private Byte 绕颈身;
    private String 胳带异常情况描述;
    private String 存脐带血情况标志;
    private String 子宫壁缝合情况;
    private String 宫缩剂名称;
    private String 宫缩剂使用方法;
    private String 手术用药;
    private String 手术用药量;
    private String 腹腔探查子宫;
    private String 腹腔探查附件;
    private String 宫腔探査异常情况描述;
    private String 宫腔探查处理情况;
    private String 手术时产妇情况;
    private Short 出血量;
    private String 输血成分;
    private Long 输血量;
    private Short 输液量;
    private Long 供氧时间;
    private String 其他用药;
    private String 其他用药情况;
    private String 手术结束日期时间;
    private Long 手术全程时间;
    private String 术后诊断;
    private String 术后观察日期时间;
    private Byte 术后检査时间;
    private Byte 术后收缩压;
    private Byte 术后舒张压;
    private Byte 术后脉搏;
    private Byte 术后心率;
    private Short 术后出血量;
    private String 术后宫缩;
    private Long 术后宫底高度;
    private String 新生儿性别代码;
    @Transient
    @JsonIgnore
    private String 新生儿性别;
    private Long 新生儿出生体重;
    private Long 新生儿出生身长;
    private String 产瘤大小;
    private String 产瘤部位;
    private String APGAR评分间隔时间代码;
    @Transient
    @JsonIgnore
    private String APGAR评分间隔时间;
    private Long APGAR评分值;
    private String 分娩结局代码;
    @Transient
    @JsonIgnore
    private String 分娩结局;
    private String 新生儿异常情况代码;
    @Transient
    @JsonIgnore
    private String 新生儿异常情况;
    private String 手术医生签名;
    private String 麻醉医生签名;
    private String 器械护士签名;
    private String 手术助手签名;
    private String 儿科医生签名;
    private String 记录人员签名;

    public String get系统序号() {
        return 系统序号;
    }

    public void set系统序号(String 系统序号) {
        this.系统序号 = 系统序号;
    }

    public String get住院号() {
        return 住院号;
    }

    public void set住院号(String 住院号) {
        this.住院号 = 住院号;
    }

    public String get产妇姓名() {
        return 产妇姓名;
    }

    public void set产妇姓名(String 产妇姓名) {
        this.产妇姓名 = 产妇姓名;
    }

    public Byte get年龄岁() {
        return 年龄岁;
    }

    public void set年龄岁(Byte 年龄岁) {
        this.年龄岁 = 年龄岁;
    }

    public String get科室名称() {
        return 科室名称;
    }

    public void set科室名称(String 科室名称) {
        this.科室名称 = 科室名称;
    }

    public String get病区名称() {
        return 病区名称;
    }

    public void set病区名称(String 病区名称) {
        this.病区名称 = 病区名称;
    }

    public String get病房号() {
        return 病房号;
    }

    public void set病房号(String 病房号) {
        this.病房号 = 病房号;
    }

    public String get病床号() {
        return 病床号;
    }

    public void set病床号(String 病床号) {
        this.病床号 = 病床号;
    }

    public String get待产日期时间() {
        return 待产日期时间;
    }

    public void set待产日期时间(String 待产日期时间) {
        this.待产日期时间 = 待产日期时间;
    }

    public String get术前诊断() {
        return 术前诊断;
    }

    public void set术前诊断(String 术前诊断) {
        this.术前诊断 = 术前诊断;
    }

    public String get手术指征() {
        return 手术指征;
    }

    public void set手术指征(String 手术指征) {
        this.手术指征 = 手术指征;
    }

    public String get手术及操作编码() {
        return 手术及操作编码;
    }

    public void set手术及操作编码(String 手术及操作编码) {
        this.手术及操作编码 = 手术及操作编码;
    }

    public String get手术及操作名称() {
        return 手术及操作名称;
    }

    public void set手术及操作名称(String 手术及操作名称) {
        this.手术及操作名称 = 手术及操作名称;
    }

    public String get手术开始日期吋间() {
        return 手术开始日期吋间;
    }

    public void set手术开始日期吋间(String 手术开始日期吋间) {
        this.手术开始日期吋间 = 手术开始日期吋间;
    }

    public String get麻醉方法代码() {
        return 麻醉方法代码;
    }

    public void set麻醉方法代码(String 麻醉方法代码) {
        this.麻醉方法代码 = 麻醉方法代码;
    }

    public String get麻醉方法名称() {
        return 麻醉方法名称;
    }

    public void set麻醉方法名称(String 麻醉方法名称) {
        this.麻醉方法名称 = 麻醉方法名称;
    }

    public String get麻醉体位() {
        return 麻醉体位;
    }

    public void set麻醉体位(String 麻醉体位) {
        this.麻醉体位 = 麻醉体位;
    }

    public String get麻醉效果() {
        return 麻醉效果;
    }

    public void set麻醉效果(String 麻醉效果) {
        this.麻醉效果 = 麻醉效果;
    }

    public String get剖宫产手术过程() {
        return 剖宫产手术过程;
    }

    public void set剖宫产手术过程(String 剖宫产手术过程) {
        this.剖宫产手术过程 = 剖宫产手术过程;
    }

    public String get子宫情况() {
        return 子宫情况;
    }

    public void set子宫情况(String 子宫情况) {
        this.子宫情况 = 子宫情况;
    }

    public String get胎儿娩出方式() {
        return 胎儿娩出方式;
    }

    public void set胎儿娩出方式(String 胎儿娩出方式) {
        this.胎儿娩出方式 = 胎儿娩出方式;
    }

    public String get羊水性状() {
        return 羊水性状;
    }

    public void set羊水性状(String 羊水性状) {
        this.羊水性状 = 羊水性状;
    }

    public Short get羊水量() {
        return 羊水量;
    }

    public void set羊水量(Short 羊水量) {
        this.羊水量 = 羊水量;
    }

    public String get胎盘娩出日期时间() {
        return 胎盘娩出日期时间;
    }

    public void set胎盘娩出日期时间(String 胎盘娩出日期时间) {
        this.胎盘娩出日期时间 = 胎盘娩出日期时间;
    }

    public String get胎盘娩出情况() {
        return 胎盘娩出情况;
    }

    public void set胎盘娩出情况(String 胎盘娩出情况) {
        this.胎盘娩出情况 = 胎盘娩出情况;
    }

    public String get胎膜完整情况标志() {
        return 胎膜完整情况标志;
    }

    public void set胎膜完整情况标志(String 胎膜完整情况标志) {
        this.胎膜完整情况标志 = 胎膜完整情况标志;
    }

    public Short get脐带长度() {
        return 脐带长度;
    }

    public void set脐带长度(Short 脐带长度) {
        this.脐带长度 = 脐带长度;
    }

    public Byte get绕颈身() {
        return 绕颈身;
    }

    public void set绕颈身(Byte 绕颈身) {
        this.绕颈身 = 绕颈身;
    }

    public String get胳带异常情况描述() {
        return 胳带异常情况描述;
    }

    public void set胳带异常情况描述(String 胳带异常情况描述) {
        this.胳带异常情况描述 = 胳带异常情况描述;
    }

    public String get存脐带血情况标志() {
        return 存脐带血情况标志;
    }

    public void set存脐带血情况标志(String 存脐带血情况标志) {
        this.存脐带血情况标志 = 存脐带血情况标志;
    }

    public String get子宫壁缝合情况() {
        return 子宫壁缝合情况;
    }

    public void set子宫壁缝合情况(String 子宫壁缝合情况) {
        this.子宫壁缝合情况 = 子宫壁缝合情况;
    }

    public String get宫缩剂名称() {
        return 宫缩剂名称;
    }

    public void set宫缩剂名称(String 宫缩剂名称) {
        this.宫缩剂名称 = 宫缩剂名称;
    }

    public String get宫缩剂使用方法() {
        return 宫缩剂使用方法;
    }

    public void set宫缩剂使用方法(String 宫缩剂使用方法) {
        this.宫缩剂使用方法 = 宫缩剂使用方法;
    }

    public String get手术用药() {
        return 手术用药;
    }

    public void set手术用药(String 手术用药) {
        this.手术用药 = 手术用药;
    }

    public String get手术用药量() {
        return 手术用药量;
    }

    public void set手术用药量(String 手术用药量) {
        this.手术用药量 = 手术用药量;
    }

    public String get腹腔探查子宫() {
        return 腹腔探查子宫;
    }

    public void set腹腔探查子宫(String 腹腔探查子宫) {
        this.腹腔探查子宫 = 腹腔探查子宫;
    }

    public String get腹腔探查附件() {
        return 腹腔探查附件;
    }

    public void set腹腔探查附件(String 腹腔探查附件) {
        this.腹腔探查附件 = 腹腔探查附件;
    }

    public String get宫腔探査异常情况描述() {
        return 宫腔探査异常情况描述;
    }

    public void set宫腔探査异常情况描述(String 宫腔探査异常情况描述) {
        this.宫腔探査异常情况描述 = 宫腔探査异常情况描述;
    }

    public String get宫腔探查处理情况() {
        return 宫腔探查处理情况;
    }

    public void set宫腔探查处理情况(String 宫腔探查处理情况) {
        this.宫腔探查处理情况 = 宫腔探查处理情况;
    }

    public String get手术时产妇情况() {
        return 手术时产妇情况;
    }

    public void set手术时产妇情况(String 手术时产妇情况) {
        this.手术时产妇情况 = 手术时产妇情况;
    }

    public Short get出血量() {
        return 出血量;
    }

    public void set出血量(Short 出血量) {
        this.出血量 = 出血量;
    }

    public String get输血成分() {
        return 输血成分;
    }

    public void set输血成分(String 输血成分) {
        this.输血成分 = 输血成分;
    }

    public Long get输血量() {
        return 输血量;
    }

    public void set输血量(Long 输血量) {
        this.输血量 = 输血量;
    }

    public Short get输液量() {
        return 输液量;
    }

    public void set输液量(Short 输液量) {
        this.输液量 = 输液量;
    }

    public Long get供氧时间() {
        return 供氧时间;
    }

    public void set供氧时间(Long 供氧时间) {
        this.供氧时间 = 供氧时间;
    }

    public String get其他用药() {
        return 其他用药;
    }

    public void set其他用药(String 其他用药) {
        this.其他用药 = 其他用药;
    }

    public String get其他用药情况() {
        return 其他用药情况;
    }

    public void set其他用药情况(String 其他用药情况) {
        this.其他用药情况 = 其他用药情况;
    }

    public String get手术结束日期时间() {
        return 手术结束日期时间;
    }

    public void set手术结束日期时间(String 手术结束日期时间) {
        this.手术结束日期时间 = 手术结束日期时间;
    }

    public Long get手术全程时间() {
        return 手术全程时间;
    }

    public void set手术全程时间(Long 手术全程时间) {
        this.手术全程时间 = 手术全程时间;
    }

    public String get术后诊断() {
        return 术后诊断;
    }

    public void set术后诊断(String 术后诊断) {
        this.术后诊断 = 术后诊断;
    }

    public String get术后观察日期时间() {
        return 术后观察日期时间;
    }

    public void set术后观察日期时间(String 术后观察日期时间) {
        this.术后观察日期时间 = 术后观察日期时间;
    }

    public Byte get术后检査时间() {
        return 术后检査时间;
    }

    public void set术后检査时间(Byte 术后检査时间) {
        this.术后检査时间 = 术后检査时间;
    }

    public Byte get术后收缩压() {
        return 术后收缩压;
    }

    public void set术后收缩压(Byte 术后收缩压) {
        this.术后收缩压 = 术后收缩压;
    }

    public Byte get术后舒张压() {
        return 术后舒张压;
    }

    public void set术后舒张压(Byte 术后舒张压) {
        this.术后舒张压 = 术后舒张压;
    }

    public Byte get术后脉搏() {
        return 术后脉搏;
    }

    public void set术后脉搏(Byte 术后脉搏) {
        this.术后脉搏 = 术后脉搏;
    }

    public Byte get术后心率() {
        return 术后心率;
    }

    public void set术后心率(Byte 术后心率) {
        this.术后心率 = 术后心率;
    }

    public Short get术后出血量() {
        return 术后出血量;
    }

    public void set术后出血量(Short 术后出血量) {
        this.术后出血量 = 术后出血量;
    }

    public String get术后宫缩() {
        return 术后宫缩;
    }

    public void set术后宫缩(String 术后宫缩) {
        this.术后宫缩 = 术后宫缩;
    }

    public Long get术后宫底高度() {
        return 术后宫底高度;
    }

    public void set术后宫底高度(Long 术后宫底高度) {
        this.术后宫底高度 = 术后宫底高度;
    }

    public String get新生儿性别代码() {
        return 新生儿性别代码;
    }

    public void set新生儿性别代码(String 新生儿性别代码) {
        this.新生儿性别代码 = 新生儿性别代码;
    }

    public String get新生儿性别() {
        return 新生儿性别;
    }

    public void set新生儿性别(String 新生儿性别) {
        this.新生儿性别 = 新生儿性别;
    }

    public Long get新生儿出生体重() {
        return 新生儿出生体重;
    }

    public void set新生儿出生体重(Long 新生儿出生体重) {
        this.新生儿出生体重 = 新生儿出生体重;
    }

    public Long get新生儿出生身长() {
        return 新生儿出生身长;
    }

    public void set新生儿出生身长(Long 新生儿出生身长) {
        this.新生儿出生身长 = 新生儿出生身长;
    }

    public String get产瘤大小() {
        return 产瘤大小;
    }

    public void set产瘤大小(String 产瘤大小) {
        this.产瘤大小 = 产瘤大小;
    }

    public String get产瘤部位() {
        return 产瘤部位;
    }

    public void set产瘤部位(String 产瘤部位) {
        this.产瘤部位 = 产瘤部位;
    }

    public String getAPGAR评分间隔时间代码() {
        return APGAR评分间隔时间代码;
    }

    public void setAPGAR评分间隔时间代码(String APGAR评分间隔时间代码) {
        this.APGAR评分间隔时间代码 = APGAR评分间隔时间代码;
    }

    public String getAPGAR评分间隔时间() {
        return APGAR评分间隔时间;
    }

    public void setAPGAR评分间隔时间(String APGAR评分间隔时间) {
        this.APGAR评分间隔时间 = APGAR评分间隔时间;
    }

    public Long getAPGAR评分值() {
        return APGAR评分值;
    }

    public void setAPGAR评分值(Long APGAR评分值) {
        this.APGAR评分值 = APGAR评分值;
    }

    public String get分娩结局代码() {
        return 分娩结局代码;
    }

    public void set分娩结局代码(String 分娩结局代码) {
        this.分娩结局代码 = 分娩结局代码;
    }

    public String get分娩结局() {
        return 分娩结局;
    }

    public void set分娩结局(String 分娩结局) {
        this.分娩结局 = 分娩结局;
    }

    public String get新生儿异常情况代码() {
        return 新生儿异常情况代码;
    }

    public void set新生儿异常情况代码(String 新生儿异常情况代码) {
        this.新生儿异常情况代码 = 新生儿异常情况代码;
    }

    public String get新生儿异常情况() {
        return 新生儿异常情况;
    }

    public void set新生儿异常情况(String 新生儿异常情况) {
        this.新生儿异常情况 = 新生儿异常情况;
    }

    public String get手术医生签名() {
        return 手术医生签名;
    }

    public void set手术医生签名(String 手术医生签名) {
        this.手术医生签名 = 手术医生签名;
    }

    public String get麻醉医生签名() {
        return 麻醉医生签名;
    }

    public void set麻醉医生签名(String 麻醉医生签名) {
        this.麻醉医生签名 = 麻醉医生签名;
    }

    public String get器械护士签名() {
        return 器械护士签名;
    }

    public void set器械护士签名(String 器械护士签名) {
        this.器械护士签名 = 器械护士签名;
    }

    public String get手术助手签名() {
        return 手术助手签名;
    }

    public void set手术助手签名(String 手术助手签名) {
        this.手术助手签名 = 手术助手签名;
    }

    public String get儿科医生签名() {
        return 儿科医生签名;
    }

    public void set儿科医生签名(String 儿科医生签名) {
        this.儿科医生签名 = 儿科医生签名;
    }

    public String get记录人员签名() {
        return 记录人员签名;
    }

    public void set记录人员签名(String 记录人员签名) {
        this.记录人员签名 = 记录人员签名;
    }
}
