package com.arrcen.cdademo.service.impl;

import com.arrcen.cdademo.dao.DataElementRangeDao;
import com.arrcen.cdademo.pojo.DataElementRange;
import com.arrcen.cdademo.service.RangeManagementService;
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
public class RangeManagementServiceImpl implements RangeManagementService {
	@Autowired
	DataElementRangeDao dataElementRangeDao;

	@Override
	public Map<String, Object> getPage(int page, int size, String order, String properties,
									   String systemId, String rangeCode, String valueMeaning,
									   String code,String rangeName) {
		Sort sort = new Sort(Sort.Direction.fromString(order), properties);
		Pageable pageable = PageRequest.of(page - 1, size, sort);

		Specification<DataElementRange> specification = Specifications.<DataElementRange>and()
				.eq(StringUtils.isNotBlank(systemId), "系统序号", systemId)
				.eq(StringUtils.isNotBlank(rangeCode), "值域代码", rangeCode)
				.eq(StringUtils.isNotBlank(code), "值", code)
				.like(StringUtils.isNotBlank(rangeName), "值域名称", "%" + rangeName + "%")
				.like(StringUtils.isNotBlank(valueMeaning), "值含义", "%" + valueMeaning + "%")
				.build();

		Page<DataElementRange> geted = dataElementRangeDao.findAll(specification, pageable);
		List<DataElementRange> list = Lists.newArrayList();
		geted.forEach(single -> {
			list.add(single);
		});

		Map<String, Object> map = createPageMap(pageable, geted, list);
		return map;
	}

	private Map<String, Object> createPageMap(Pageable pageable, Page<DataElementRange> geted, List<DataElementRange> list) {
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
	public void updateRange(DataElementRange dataElementRange) {
		dataElementRangeDao.save(dataElementRange);
	}

	@Override
	public void insertRange(DataElementRange dataElementRange) {
		Integer i = dataElementRangeDao.findMax();
		int max = i == null ? 0 : i;
		dataElementRange.set系统序号(max + 1 + "");
		dataElementRangeDao.save(dataElementRange);
	}

	@Override
	public void deleleRange(List<String> systemIds) {
		for (String systemId : systemIds) {
			dataElementRangeDao.deleteById(systemId);
		}
	}
}
