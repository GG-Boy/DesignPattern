package com.gai.sql;

import com.gai.bean.Department;

public interface IDepartment {

	void insert(Department department);
	
	Department getDepartment(int id);
	
}
