package com.hzit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hzit.bean.Dept;
@Repository
public class DeptDaoImpl implements DeptDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Dept> findDeptList() {
		List<Dept> deptList = (List<Dept>) hibernateTemplate.find("from Dept");
		return deptList;
	}

	@Override
	public void addorupdateDept(Dept dept) {
		hibernateTemplate.saveOrUpdate(dept);

	}

	@Override
	public void deleteDept(Dept dept) {
		hibernateTemplate.delete(dept);
	}

	@Override
	public Dept findById(Dept dept) {
		String hql="from Dept where deptno="+dept.getDeptno();
		List<Dept> findDept = (List<Dept>) hibernateTemplate.find(hql);
		return findDept.get(0);
	}


}
