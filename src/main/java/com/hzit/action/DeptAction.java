package com.hzit.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hzit.bean.Dept;
import com.hzit.service.DeptService;

@Controller
@Scope("prototype")
public class DeptAction {
	@Autowired
	private DeptService deptService;
	List<Dept> deptList;
	Dept dept;
	
	public String findById(){
		Dept findById = deptService.findById(dept);
		dept.setDname(findById.getDname());
		dept.setLoc(findById.getLoc());
		System.out.println(dept);
		return "findById";
	}
		public String update(){
			 deptService.addorupdateDept(dept);
			return "toFindAll";
		}
		public String findAll(){
			 deptList = deptService.findDeptList();
			
			
			return "findAll";
		}
		public String getJson(){
			 deptList = deptService.findDeptList();
			 return "getJson";
		}
		public String deleteDept(){
			return null;
		}
		public String deleteById(){
			deptService.deleteDept(dept);
			return "toFindAll";
		}
		
		public String add(){
			deptService.addorupdateDept(dept);
			return "toFindAll";
		}
		
		
		
		
		public List<Dept> getDeptList() {
			return deptList;
		}
		public void setDeptList(List<Dept> deptList) {
			this.deptList = deptList;
		}
		public Dept getDept() {
			return dept;
		}
		public void setDept(Dept dept) {
			this.dept = dept;
		}
		
		
		
		
		
}
