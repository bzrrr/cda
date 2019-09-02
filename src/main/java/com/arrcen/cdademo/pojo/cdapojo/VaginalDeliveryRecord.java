package com.arrcen.cdademo.pojo.cdapojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 〈阴道分娩记录〉
 */
@Entity
@Table(name = "PUB06_阴道分娩记录")
public class VaginalDeliveryRecord implements Serializable {

    @Id
    private String 系统序号;
    private String 住院号;
    private String 产妇姓名;
    private Byte 年龄岁;
    private String 科室名称;
    private String 病区名称;
    private String 病房号;
    private String 病床号;
    private Long 孕次;
    private Long 产次;
    private String 末次月经日期;
    private String 预产期;
    private String 临产日期时间;
    private String 入院诊断;
    private String 胎膜破裂日期时间;
    private String 前羊水性状;
    private Short 前羊水量;
    private Long 第1产程时长;
    private String 宫口开全日期时间;
    private Long 第2产程时长;
    private String 胎儿娩出日期吋间;
    private Long 第3产程吋长;
    private Long 总产程时长;
    private String 胎方位代码;
    @Transient
    @JsonIgnore
    private String 胎方位;
    private String 阴道助产标志;
    private String 阴道助产方式;
    private String 羊水性状;
    private Short 羊水量;
    private String 胎盘娩出日期时间;
    private String 胎盘娩出情况;
    private String 胎膜完整情况标志;
    private Byte 绕颈身;
    private Short 跻带长度;
    private String 脐带异常情况描述;
    private String 产时用药;
    private String 预防措施;
    private String 产妇会阴切开标志;
    private String 会阴切开位置;
    private Long 产妇会阴缝合针数;
    private String 会阴裂伤情况代码;
    @Transient
    @JsonIgnore
    private String 会阴裂伤情况;
    private String 会阴血肿标志;
    private String 麻醉方法代码;
    @Transient
    @JsonIgnore
    private String 麻醉方法名称;
    private String 麻醉药物名称;
    private String 阴道裂伤标忐;
    private String 阴道血肿标志;
    private String 阴道血肿大小;
    private String 阴道血肿处理;
    private String 宫颈裂伤标志;
    private String 宫颈缝合情况;
    private String 肛査;
    private String 产后用药;
    private String 分娩过程特殊情况描述;
    private String 宫缩情况;
    private String 子宫情况;
    private String 恶露状况;
    private String 修补手术过程;
    private String 存脐带血情况标志;
    private String 产后诊断;
    private String 产后观察日期时间;
    private Byte 产后检査吋间;
    private Byte 产后收缩压;
    private Byte 产后舒张压;
    private Byte 产后脉搏;
    private Byte 产后心率;
    private Short 产后出血量;
    private String 产后宫缩;
    private Long 产后宫底高度;
    private String 产后膀胱充盈标志;
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
    private String 接生人员签名;
    private String 手术医生签名;
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

    public Long get孕次() {
        return 孕次;
    }

    public void set孕次(Long 孕次) {
        this.孕次 = 孕次;
    }

    public Long get产次() {
        return 产次;
    }

    public void set产次(Long 产次) {
        this.产次 = 产次;
    }

    public String get末次月经日期() {
        return 末次月经日期;
    }

    public void set末次月经日期(String 末次月经日期) {
        this.末次月经日期 = 末次月经日期;
    }

    public String get预产期() {
        return 预产期;
    }

    public void set预产期(String 预产期) {
        this.预产期 = 预产期;
    }

    public String get临产日期时间() {
        return 临产日期时间;
    }

    public void set临产日期时间(String 临产日期时间) {
        this.临产日期时间 = 临产日期时间;
    }

    public String get入院诊断() {
        return 入院诊断;
    }

    public void set入院诊断(String 入院诊断) {
        this.入院诊断 = 入院诊断;
    }

    public String get胎膜破裂日期时间() {
        return 胎膜破裂日期时间;
    }

    public void set胎膜破裂日期时间(String 胎膜破裂日期时间) {
        this.胎膜破裂日期时间 = 胎膜破裂日期时间;
    }

    public String get前羊水性状() {
        return 前羊水性状;
    }

    public void set前羊水性状(String 前羊水性状) {
        this.前羊水性状 = 前羊水性状;
    }

    public Short get前羊水量() {
        return 前羊水量;
    }

    public void set前羊水量(Short 前羊水量) {
        this.前羊水量 = 前羊水量;
    }

    public Long get第1产程时长() {
        return 第1产程时长;
    }

    public void set第1产程时长(Long 第1产程时长) {
        this.第1产程时长 = 第1产程时长;
    }

    public String get宫口开全日期时间() {
        return 宫口开全日期时间;
    }

    public void set宫口开全日期时间(String 宫口开全日期时间) {
        this.宫口开全日期时间 = 宫口开全日期时间;
    }

    public Long get第2产程时长() {
        return 第2产程时长;
    }

    public void set第2产程时长(Long 第2产程时长) {
        this.第2产程时长 = 第2产程时长;
    }

    public String get胎儿娩出日期吋间() {
        return 胎儿娩出日期吋间;
    }

    public void set胎儿娩出日期吋间(String 胎儿娩出日期吋间) {
        this.胎儿娩出日期吋间 = 胎儿娩出日期吋间;
    }

    public Long get第3产程吋长() {
        return 第3产程吋长;
    }

    public void set第3产程吋长(Long 第3产程吋长) {
        this.第3产程吋长 = 第3产程吋长;
    }

    public Long get总产程时长() {
        return 总产程时长;
    }

    public void set总产程时长(Long 总产程时长) {
        this.总产程时长 = 总产程时长;
    }

    public String get胎方位代码() {
        return 胎方位代码;
    }

    public void set胎方位代码(String 胎方位代码) {
        this.胎方位代码 = 胎方位代码;
    }

    public String get胎方位() {
        return 胎方位;
    }

    public void set胎方位(String 胎方位) {
        this.胎方位 = 胎方位;
    }

    public String get阴道助产标志() {
        return 阴道助产标志;
    }

    public void set阴道助产标志(String 阴道助产标志) {
        this.阴道助产标志 = 阴道助产标志;
    }

    public String get阴道助产方式() {
        return 阴道助产方式;
    }

    public void set阴道助产方式(String 阴道助产方式) {
        this.阴道助产方式 = 阴道助产方式;
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

    public Byte get绕颈身() {
        return 绕颈身;
    }

    public void set绕颈身(Byte 绕颈身) {
        this.绕颈身 = 绕颈身;
    }

    public Short get跻带长度() {
        return 跻带长度;
    }

    public void set跻带长度(Short 跻带长度) {
        this.跻带长度 = 跻带长度;
    }

    public String get脐带异常情况描述() {
        return 脐带异常情况描述;
    }

    public void set脐带异常情况描述(String 脐带异常情况描述) {
        this.脐带异常情况描述 = 脐带异常情况描述;
    }

    public String get产时用药() {
        return 产时用药;
    }

    public void set产时用药(String 产时用药) {
        this.产时用药 = 产时用药;
    }

    public String get预防措施() {
        return 预防措施;
    }

    public void set预防措施(String 预防措施) {
        this.预防措施 = 预防措施;
    }

    public String get产妇会阴切开标志() {
        return 产妇会阴切开标志;
    }

    public void set产妇会阴切开标志(String 产妇会阴切开标志) {
        this.产妇会阴切开标志 = 产妇会阴切开标志;
    }

    public String get会阴切开位置() {
        return 会阴切开位置;
    }

    public void set会阴切开位置(String 会阴切开位置) {
        this.会阴切开位置 = 会阴切开位置;
    }

    public Long get产妇会阴缝合针数() {
        return 产妇会阴缝合针数;
    }

    public void set产妇会阴缝合针数(Long 产妇会阴缝合针数) {
        this.产妇会阴缝合针数 = 产妇会阴缝合针数;
    }

    public String get会阴裂伤情况代码() {
        return 会阴裂伤情况代码;
    }

    public void set会阴裂伤情况代码(String 会阴裂伤情况代码) {
        this.会阴裂伤情况代码 = 会阴裂伤情况代码;
    }

    public String get会阴裂伤情况() {
        return 会阴裂伤情况;
    }

    public void set会阴裂伤情况(String 会阴裂伤情况) {
        this.会阴裂伤情况 = 会阴裂伤情况;
    }

    public String get会阴血肿标志() {
        return 会阴血肿标志;
    }

    public void set会阴血肿标志(String 会阴血肿标志) {
        this.会阴血肿标志 = 会阴血肿标志;
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

    public String get麻醉药物名称() {
        return 麻醉药物名称;
    }

    public void set麻醉药物名称(String 麻醉药物名称) {
        this.麻醉药物名称 = 麻醉药物名称;
    }

    public String get阴道裂伤标忐() {
        return 阴道裂伤标忐;
    }

    public void set阴道裂伤标忐(String 阴道裂伤标忐) {
        this.阴道裂伤标忐 = 阴道裂伤标忐;
    }

    public String get阴道血肿标志() {
        return 阴道血肿标志;
    }

    public void set阴道血肿标志(String 阴道血肿标志) {
        this.阴道血肿标志 = 阴道血肿标志;
    }

    public String get阴道血肿大小() {
        return 阴道血肿大小;
    }

    public void set阴道血肿大小(String 阴道血肿大小) {
        this.阴道血肿大小 = 阴道血肿大小;
    }

    public String get阴道血肿处理() {
        return 阴道血肿处理;
    }

    public void set阴道血肿处理(String 阴道血肿处理) {
        this.阴道血肿处理 = 阴道血肿处理;
    }

    public String get宫颈裂伤标志() {
        return 宫颈裂伤标志;
    }

    public void set宫颈裂伤标志(String 宫颈裂伤标志) {
        this.宫颈裂伤标志 = 宫颈裂伤标志;
    }

    public String get宫颈缝合情况() {
        return 宫颈缝合情况;
    }

    public void set宫颈缝合情况(String 宫颈缝合情况) {
        this.宫颈缝合情况 = 宫颈缝合情况;
    }

    public String get肛査() {
        return 肛査;
    }

    public void set肛査(String 肛査) {
        this.肛査 = 肛査;
    }

    public String get产后用药() {
        return 产后用药;
    }

    public void set产后用药(String 产后用药) {
        this.产后用药 = 产后用药;
    }

    public String get分娩过程特殊情况描述() {
        return 分娩过程特殊情况描述;
    }

    public void set分娩过程特殊情况描述(String 分娩过程特殊情况描述) {
        this.分娩过程特殊情况描述 = 分娩过程特殊情况描述;
    }

    public String get宫缩情况() {
        return 宫缩情况;
    }

    public void set宫缩情况(String 宫缩情况) {
        this.宫缩情况 = 宫缩情况;
    }

    public String get子宫情况() {
        return 子宫情况;
    }

    public void set子宫情况(String 子宫情况) {
        this.子宫情况 = 子宫情况;
    }

    public String get恶露状况() {
        return 恶露状况;
    }

    public void set恶露状况(String 恶露状况) {
        this.恶露状况 = 恶露状况;
    }

    public String get修补手术过程() {
        return 修补手术过程;
    }

    public void set修补手术过程(String 修补手术过程) {
        this.修补手术过程 = 修补手术过程;
    }

    public String get存脐带血情况标志() {
        return 存脐带血情况标志;
    }

    public void set存脐带血情况标志(String 存脐带血情况标志) {
        this.存脐带血情况标志 = 存脐带血情况标志;
    }

    public String get产后诊断() {
        return 产后诊断;
    }

    public void set产后诊断(String 产后诊断) {
        this.产后诊断 = 产后诊断;
    }

    public String get产后观察日期时间() {
        return 产后观察日期时间;
    }

    public void set产后观察日期时间(String 产后观察日期时间) {
        this.产后观察日期时间 = 产后观察日期时间;
    }

    public Byte get产后检査吋间() {
        return 产后检査吋间;
    }

    public void set产后检査吋间(Byte 产后检査吋间) {
        this.产后检査吋间 = 产后检査吋间;
    }

    public Byte get产后收缩压() {
        return 产后收缩压;
    }

    public void set产后收缩压(Byte 产后收缩压) {
        this.产后收缩压 = 产后收缩压;
    }

    public Byte get产后舒张压() {
        return 产后舒张压;
    }

    public void set产后舒张压(Byte 产后舒张压) {
        this.产后舒张压 = 产后舒张压;
    }

    public Byte get产后脉搏() {
        return 产后脉搏;
    }

    public void set产后脉搏(Byte 产后脉搏) {
        this.产后脉搏 = 产后脉搏;
    }

    public Byte get产后心率() {
        return 产后心率;
    }

    public void set产后心率(Byte 产后心率) {
        this.产后心率 = 产后心率;
    }

    public Short get产后出血量() {
        return 产后出血量;
    }

    public void set产后出血量(Short 产后出血量) {
        this.产后出血量 = 产后出血量;
    }

    public String get产后宫缩() {
        return 产后宫缩;
    }

    public void set产后宫缩(String 产后宫缩) {
        this.产后宫缩 = 产后宫缩;
    }

    public Long get产后宫底高度() {
        return 产后宫底高度;
    }

    public void set产后宫底高度(Long 产后宫底高度) {
        this.产后宫底高度 = 产后宫底高度;
    }

    public String get产后膀胱充盈标志() {
        return 产后膀胱充盈标志;
    }

    public void set产后膀胱充盈标志(String 产后膀胱充盈标志) {
        this.产后膀胱充盈标志 = 产后膀胱充盈标志;
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

    public String get接生人员签名() {
        return 接生人员签名;
    }

    public void set接生人员签名(String 接生人员签名) {
        this.接生人员签名 = 接生人员签名;
    }

    public String get手术医生签名() {
        return 手术医生签名;
    }

    public void set手术医生签名(String 手术医生签名) {
        this.手术医生签名 = 手术医生签名;
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
