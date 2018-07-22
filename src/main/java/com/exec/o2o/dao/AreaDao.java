package com.exec.o2o.dao;

import java.util.List;

import com.exec.o2o.entity.Area;

public interface AreaDao {

	/**
	 * 作用：列出区域列表，返回Arealist
	 */
	List <Area> queryArea();
}
