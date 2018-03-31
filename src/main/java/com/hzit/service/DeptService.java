package com.hzit.service;

import java.util.List;

import com.hzit.bean.Dept;

public interface DeptService {
	
	List<Dept> findDeptList();
	void addorupdateDept(Dept dept);
	void deleteDept(Dept dept);
	Dept findById(Dept dept);
}
