package com.arrcen.cdademo.service.impl;

import com.arrcen.cdademo.dao.EMRDataSetDao;
import com.arrcen.cdademo.pojo.EMRDataSet;
import com.arrcen.cdademo.service.DataSetManagementService;
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
public class DataSetManagementServiceImpl implements DataSetManagementService {
	@Autowired
	EMRDataSetDao emrDataSetDao;

	@Override
	public Map<String, Object> getPage(int page, int size, String order, String properties, String systemId, String dataSetName, String dataSetId, String subSetName) {
		Sort sort = new Sort(Sort.Direction.fromString(order), properties);
		Pageable pageable = PageRequest.of(page - 1, size, sort);

		Specification<EMRDataSet> specification = Specifications.<EMRDataSet>and()
				.eq(StringUtils.isNotBlank(systemId), "系统序号", systemId)
				.eq(StringUtils.isNotBlank(dataSetId), "数据元ID", dataSetId)
				.like(StringUtils.isNotBlank(dataSetName), "数据元名称", "%" + dataSetName + "%")
				.like(StringUtils.isNotBlank(subSetName), "子集名称", "%" + subSetName + "%")
				.build();

		Page<EMRDataSet> geted = emrDataSetDao.findAll(specification, pageable);
		List<EMRDataSet> list = Lists.newArrayList();
		geted.forEach(single -> {
			list.add(single);
		});

		Map<String, Object> map = createPageMap(pageable, geted, list);
		return map;
	}

	private Map<String, Object> createPageMap(Pageable pageable, Page<EMRDataSet> geted, List<EMRDataSet> list) {
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
	public void updateDataSet(EMRDataSet emrDataSet) {
		emrDataSetDao.save(emrDataSet);
	}

	@Override
	public void insertDataSet(EMRDataSet emrDataSet) {
		Integer i = emrDataSetDao.findMax();
		int max = i == null ? 0 : i;
		emrDataSet.set系统序号(max + 1 + "");
		emrDataSetDao.save(emrDataSet);
	}

	@Override
	public void deleleDataSet(List<String> systemIds) {
		for (String systemId : systemIds) {
			emrDataSetDao.deleteById(systemId);
		}
	}
}
