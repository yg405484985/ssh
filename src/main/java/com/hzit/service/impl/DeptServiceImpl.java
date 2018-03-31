package com.hzit.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzit.bean.Dept;
import com.hzit.dao.DeptDao;
import com.hzit.service.DeptService;
@Service
@Transactional
public class DeptServiceImpl implements DeptService{
@Autowired
	private DeptDao deptDao;
	@Override
	public List<Dept> findDeptList() {
		// TODO Auto-generated method stub
		return deptDao.findDeptList();
	}

	@Override
	public void addorupdateDept(Dept dept) {
		deptDao.addorupdateDept(dept);
		
	}

	@Override
	public void deleteDept(Dept dept) {
		deptDao.deleteDept(dept);
		
	}

	@Override
	public Dept findById(Dept dept) {
		Dept d=	deptDao.findById(dept);
		return d;
	}

}
