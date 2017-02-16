package com.gai.main;

import com.gai.bean.Department;
import com.gai.bean.User;
import com.gai.factory.DataAccess;
import com.gai.sql.IDepartment;
import com.gai.sql.IUser;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		Department dept = new Department();
		
//		SqlserverUser iu = new SqlserverUser();
//		IFactory factory = new AccessFactory();//若要更改成Access数据库，更改本语句就可以了
//		
//		IUser iu = factory.createUser();
//		
		IUser iu = DataAccess.createUser();
		iu.insert(user);
		iu.getUser(1);
		
//		IDepartment id = factory.createDepartment();
		IDepartment id = DataAccess.createDepartment();
		id.insert(dept);
		id.getDepartment(1);
		
		
	}

}
