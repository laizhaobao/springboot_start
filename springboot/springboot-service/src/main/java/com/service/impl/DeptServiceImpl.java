package com.service.impl;

import com.dao.DeptDao;
import com.entity.DeptEntity;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptDao;

	@Override
	public int getCount() {
		return deptDao.getCount();
	}

	@Override
	public List<DeptEntity> listDepts(Integer pageNum, Integer pageSize) {
		return deptDao.listDepts(pageNum,pageSize);
	}
}
