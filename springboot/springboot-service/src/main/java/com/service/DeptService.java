package com.service;

import com.entity.DeptEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptService {
	int getCount();
	List<DeptEntity> listDepts(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
