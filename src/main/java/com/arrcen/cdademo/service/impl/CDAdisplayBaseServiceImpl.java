package com.arrcen.cdademo.service.impl;

import cn.hutool.core.date.DateUtil;
import com.arrcen.cdademo.dao.PatientCdaDocumentDao;
import com.arrcen.cdademo.pojo.PatientCdaDocument;
import com.arrcen.cdademo.service.CDAdisplayService;
import com.arrcen.cdademo.service.impl.display.*;
import com.github.wenhao.jpa.Specifications;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CDAdisplayBaseServiceImpl implements CDAdisplayService {
	@Autowired
	PatientCdaDocumentDao patientCdaDocumentDao;
	private DisplayService01 service01;
	private DisplayService02 service02;
	private DisplayService03 service03;
	private DisplayService04 service04;
	private DisplayService05 service05;
	private DisplayService06 service06;
	private DisplayService07 service07;
	private DisplayService08 service08;
	private DisplayService09 service09;
	private DisplayService10 service10;
	private DisplayService11 service11;
	private DisplayService12 service12;
	private DisplayService13 service13;
	private DisplayService14 service14;
	private DisplayService15 service15;
	private DisplayService16 service16;
	private DisplayService17 service17;
	private DisplayService18 service18;
	private DisplayService19 service19;
	private DisplayService20 service20;
	private DisplayService21 service21;
	private DisplayService22 service22;
	private DisplayService23 service23;
	private DisplayService24 service24;
	private DisplayService25 service25;
	private DisplayService26 service26;
	private DisplayService27 service27;
	private DisplayService28 service28;
	private DisplayService29 service29;
	private DisplayService30 service30;
	private DisplayService31 service31;
	private DisplayService32 service32;
	private DisplayService33 service33;
	private DisplayService34 service34;
	private DisplayService35 service35;
	private DisplayService36 service36;
	private DisplayService37 service37;
	private DisplayService38 service38;
	private DisplayService39 service39;
	private DisplayService40 service40;
	private DisplayService41 service41;
	private DisplayService42 service42;
	private DisplayService43 service43;
	private DisplayService44 service44;
	private DisplayService45 service45;
	private DisplayService46 service46;
	private DisplayService47 service47;
	private DisplayService48 service48;
	private DisplayService49 service49;
	private DisplayService50 service50;
	private DisplayService51 service51;
	private DisplayService52 service52;
	private DisplayService53 service53;

	@Override
	public Map<String, Object> getPage(String templateIndex, int page, int size, String order, String properties, String startTime, String endTime) {
		Sort sort = new Sort(Sort.Direction.fromString(order), properties);
		Pageable pageable = PageRequest.of(page - 1, size, sort);

		String start = DateUtil.format(DateUtil.parse(startTime), "yyyyMMdd") + " 000000";
		String end = DateUtil.format(DateUtil.parse(endTime), "yyyyMMdd") + " 235959";


		Specification specification = Specifications.and()
				.eq(StringUtils.isNotBlank(templateIndex), "templateindex", templateIndex)
				.gt(StringUtils.isNotBlank(startTime), "effectivetime", start)
				.lt(StringUtils.isNotBlank(endTime), "effectivetime", end)
				.build();

		Map<String, Object> map = getMapByTemplateIndex(pageable, specification);
		return map;
	}

	//根据模板序号获取对应的数据
	private Map<String, Object> getMapByTemplateIndex(Pageable pageable, Specification specification) {
		Page geted = patientCdaDocumentDao.findAll(specification, pageable);
		List list = Lists.newArrayList();
		geted.forEach(single -> {
			list.add(single);
		});
		return createPageMap(pageable, geted, list);
	}

	//组装分页返回值
	private Map<String, Object> createPageMap(Pageable pageable, Page geted, List list) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", list);
		map.put("pageNumber", pageable.getPageNumber() + 1);
		map.put("first", !geted.hasPrevious());
		map.put("last", !geted.hasNext());
		map.put("size", geted.getSize());
		map.put("totalPages", geted.getTotalPages());
		map.put("totalElements", geted.getTotalElements());
		return map;
	}

	@Override
	public Map<String, Object> getInfo(PatientCdaDocument patientCdaDocument) {
		String templateindex = patientCdaDocument.getTemplateindex();
		switch (templateindex) {
			case "01":
				return service01.getInfo(patientCdaDocument);
			case "02":
				return service02.getInfo(patientCdaDocument);
			case "03":
				return service03.getInfo(patientCdaDocument);
			case "04":
				return service04.getInfo(patientCdaDocument);
			case "05":
				return service05.getInfo(patientCdaDocument);
			case "06":
				return service06.getInfo(patientCdaDocument);
			case "07":
				return service07.getInfo(patientCdaDocument);
			case "08":
				return service08.getInfo(patientCdaDocument);
			case "09":
				return service09.getInfo(patientCdaDocument);
			case "10":
				return service10.getInfo(patientCdaDocument);
			case "11":
				return service11.getInfo(patientCdaDocument);
			case "12":
				return service12.getInfo(patientCdaDocument);
			case "13":
				return service13.getInfo(patientCdaDocument);
			case "14":
				return service14.getInfo(patientCdaDocument);
			case "15":
				return service15.getInfo(patientCdaDocument);
			case "16":
				return service16.getInfo(patientCdaDocument);
			case "17":
				return service17.getInfo(patientCdaDocument);
			case "18":
				return service18.getInfo(patientCdaDocument);
			case "19":
				return service19.getInfo(patientCdaDocument);
			case "20":
				return service20.getInfo(patientCdaDocument);
			case "21":
				return service21.getInfo(patientCdaDocument);
			case "22":
				return service22.getInfo(patientCdaDocument);
			case "23":
				return service23.getInfo(patientCdaDocument);
			case "24":
				return service24.getInfo(patientCdaDocument);
			case "25":
				return service25.getInfo(patientCdaDocument);
			case "26":
				return service26.getInfo(patientCdaDocument);
			case "27":
				return service27.getInfo(patientCdaDocument);
			case "28":
				return service28.getInfo(patientCdaDocument);
			case "29":
				return service29.getInfo(patientCdaDocument);
			case "30":
				return service30.getInfo(patientCdaDocument);
			case "31":
				return service31.getInfo(patientCdaDocument);
			case "32":
				return service32.getInfo(patientCdaDocument);
			case "33":
				return service33.getInfo(patientCdaDocument);
			case "34":
				return service34.getInfo(patientCdaDocument);
			case "35":
				return service35.getInfo(patientCdaDocument);
			case "36":
				return service36.getInfo(patientCdaDocument);
			case "37":
				return service37.getInfo(patientCdaDocument);
			case "38":
				return service38.getInfo(patientCdaDocument);
			case "39":
				return service39.getInfo(patientCdaDocument);
			case "40":
				return service40.getInfo(patientCdaDocument);
			case "41":
				return service41.getInfo(patientCdaDocument);
			case "42":
				return service42.getInfo(patientCdaDocument);
			case "43":
				return service43.getInfo(patientCdaDocument);
			case "44":
				return service44.getInfo(patientCdaDocument);
			case "45":
				return service45.getInfo(patientCdaDocument);
			case "46":
				return service46.getInfo(patientCdaDocument);
			case "47":
				return service47.getInfo(patientCdaDocument);
			case "48":
				return service48.getInfo(patientCdaDocument);
			case "49":
				return service49.getInfo(patientCdaDocument);
			case "50":
				return service50.getInfo(patientCdaDocument);
			case "51":
				return service51.getInfo(patientCdaDocument);
			case "52":
				return service52.getInfo(patientCdaDocument);
			case "53":
				return service53.getInfo(patientCdaDocument);
			default:
				return null;
		}
	}

	@Autowired
	public void setService01(DisplayService01 service01) {
		this.service01 = service01;
	}

	@Autowired
	public void setService02(DisplayService02 service02) {
		this.service02 = service02;
	}

	@Autowired
	public void setService03(DisplayService03 service03) {
		this.service03 = service03;
	}

	@Autowired
	public void setService04(DisplayService04 service04) {
		this.service04 = service04;
	}

	@Autowired
	public void setService05(DisplayService05 service05) {
		this.service05 = service05;
	}

	@Autowired
	public void setService06(DisplayService06 service06) {
		this.service06 = service06;
	}

	@Autowired
	public void setService07(DisplayService07 service07) {
		this.service07 = service07;
	}

	@Autowired
	public void setService08(DisplayService08 service08) {
		this.service08 = service08;
	}

	@Autowired
	public void setService09(DisplayService09 service09) {
		this.service09 = service09;
	}

	@Autowired
	public void setService10(DisplayService10 service10) {
		this.service10 = service10;
	}

	@Autowired
	public void setService11(DisplayService11 service11) {
		this.service11 = service11;
	}

	@Autowired
	public void setService12(DisplayService12 service12) {
		this.service12 = service12;
	}

	@Autowired
	public void setService13(DisplayService13 service13) {
		this.service13 = service13;
	}

	@Autowired
	public void setService14(DisplayService14 service14) {
		this.service14 = service14;
	}

	@Autowired
	public void setService15(DisplayService15 service15) {
		this.service15 = service15;
	}

	@Autowired
	public void setService16(DisplayService16 service16) {
		this.service16 = service16;
	}

	@Autowired
	public void setService17(DisplayService17 service17) {
		this.service17 = service17;
	}

	@Autowired
	public void setService18(DisplayService18 service18) {
		this.service18 = service18;
	}

	@Autowired
	public void setService19(DisplayService19 service19) {
		this.service19 = service19;
	}

	@Autowired
	public void setService20(DisplayService20 service20) {
		this.service20 = service20;
	}

	@Autowired
	public void setService21(DisplayService21 service21) {
		this.service21 = service21;
	}

	@Autowired
	public void setService22(DisplayService22 service22) {
		this.service22 = service22;
	}

	@Autowired
	public void setService23(DisplayService23 service23) {
		this.service23 = service23;
	}

	@Autowired
	public void setService24(DisplayService24 service24) {
		this.service24 = service24;
	}

	@Autowired
	public void setService25(DisplayService25 service25) {
		this.service25 = service25;
	}

	@Autowired
	public void setService26(DisplayService26 service26) {
		this.service26 = service26;
	}

	@Autowired
	public void setService27(DisplayService27 service27) {
		this.service27 = service27;
	}

	@Autowired
	public void setService28(DisplayService28 service28) {
		this.service28 = service28;
	}

	@Autowired
	public void setService29(DisplayService29 service29) {
		this.service29 = service29;
	}

	@Autowired
	public void setService30(DisplayService30 service30) {
		this.service30 = service30;
	}

	@Autowired
	public void setService31(DisplayService31 service31) {
		this.service31 = service31;
	}

	@Autowired
	public void setService32(DisplayService32 service32) {
		this.service32 = service32;
	}

	@Autowired
	public void setService33(DisplayService33 service33) {
		this.service33 = service33;
	}

	@Autowired
	public void setService34(DisplayService34 service34) {
		this.service34 = service34;
	}

	@Autowired
	public void setService35(DisplayService35 service35) {
		this.service35 = service35;
	}

	@Autowired
	public void setService36(DisplayService36 service36) {
		this.service36 = service36;
	}

	@Autowired
	public void setService37(DisplayService37 service37) {
		this.service37 = service37;
	}

	@Autowired
	public void setService38(DisplayService38 service38) {
		this.service38 = service38;
	}

	@Autowired
	public void setService39(DisplayService39 service39) {
		this.service39 = service39;
	}

	@Autowired
	public void setService40(DisplayService40 service40) {
		this.service40 = service40;
	}

	@Autowired
	public void setService41(DisplayService41 service41) {
		this.service41 = service41;
	}

	@Autowired
	public void setService42(DisplayService42 service42) {
		this.service42 = service42;
	}

	@Autowired
	public void setService43(DisplayService43 service43) {
		this.service43 = service43;
	}

	@Autowired
	public void setService44(DisplayService44 service44) {
		this.service44 = service44;
	}

	@Autowired
	public void setService45(DisplayService45 service45) {
		this.service45 = service45;
	}

	@Autowired
	public void setService46(DisplayService46 service46) {
		this.service46 = service46;
	}

	@Autowired
	public void setService47(DisplayService47 service47) {
		this.service47 = service47;
	}

	@Autowired
	public void setService48(DisplayService48 service48) {
		this.service48 = service48;
	}

	@Autowired
	public void setService49(DisplayService49 service49) {
		this.service49 = service49;
	}

	@Autowired
	public void setService50(DisplayService50 service50) {
		this.service50 = service50;
	}

	@Autowired
	public void setService51(DisplayService51 service51) {
		this.service51 = service51;
	}

	@Autowired
	public void setService52(DisplayService52 service52) {
		this.service52 = service52;
	}

	@Autowired
	public void setService53(DisplayService53 service53) {
		this.service53 = service53;
	}
}
