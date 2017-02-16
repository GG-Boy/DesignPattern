package com.gai.sql;

import com.gai.bean.Department;

/**
 * 操作User表
 */
public class SqlserverDepartment implements IDepartment{

	public void insert(Department department) {
		System.out.println("在SQL Server中给Department表增加一条记录");
	}
	
	public Department getDepartment(int id) {
		System.out.println("在SQL Server中根据ID得到Department表一条记录");
		return null;
	}
	
}
