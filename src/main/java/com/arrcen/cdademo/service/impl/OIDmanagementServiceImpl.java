package com.arrcen.cdademo.service.impl;

import com.arrcen.cdademo.dao.OIDassignmentTableDao;
import com.arrcen.cdademo.pojo.OIDassignmentTable;
import com.arrcen.cdademo.service.OIDmanagementService;
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
public class OIDmanagementServiceImpl implements OIDmanagementService {
	@Autowired
	OIDassignmentTableDao oiDassignmentTableDao;

	@Override
	public Map<String, Object> getPage(int page, int size, String order, String properties, String systemId, String oidName, String mappedCode, String oid) {
		Sort sort = new Sort(Sort.Direction.fromString(order), properties);
		Pageable pageable = PageRequest.of(page - 1, size, sort);

		Specification<OIDassignmentTable> specification = Specifications.<OIDassignmentTable>and()
				.eq(StringUtils.isNotBlank(systemId), "系统序号", systemId)
				.eq(StringUtils.isNotBlank(mappedCode), "映射代码表", mappedCode)
				.eq(StringUtils.isNotBlank(oid), "OID", oid)
				.like(StringUtils.isNotBlank(oidName), "OID名称", "%" + oidName + "%")
				.build();
//		Sort sort = Sorts.builder().asc(properties).build();

		Page<OIDassignmentTable> geted = oiDassignmentTableDao.findAll(specification, pageable);
		List<OIDassignmentTable> list = Lists.newArrayList();
		geted.forEach(single -> {
			list.add(single);
		});

		Map<String, Object> map = createPageMap(pageable, geted, list);
		return map;
	}

	private Map<String, Object> createPageMap(Pageable pageable, Page<OIDassignmentTable> geted, List<OIDassignmentTable> list) {
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
	public void updateOID(OIDassignmentTable oiDassignmentTable) {
		oiDassignmentTableDao.save(oiDassignmentTable);
	}

	@Override
	public void insertOID(OIDassignmentTable oiDassignmentTable) {
		Integer i = oiDassignmentTableDao.findMax();
		int max = i == null ? 0 : i;
		oiDassignmentTable.set系统序号(max + 1 + "");
		oiDassignmentTableDao.save(oiDassignmentTable);
	}

	@Override
	public void deleleOID(List<String> systemIds) {
		for (String systemId : systemIds) {
			oiDassignmentTableDao.deleteById(systemId);
		}
	}

}
