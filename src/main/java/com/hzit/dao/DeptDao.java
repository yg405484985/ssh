package com.hzit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hzit.bean.Dept;

@Repository
public interface DeptDao {
	
	List<Dept> findDeptList();
	void addorupdateDept(Dept dept);
	void deleteDept(Dept dept);
	Dept findById(Dept dept);
}
