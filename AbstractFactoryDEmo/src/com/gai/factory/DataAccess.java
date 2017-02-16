package com.gai.factory;

import com.gai.sql.AccessDepartment;
import com.gai.sql.AccessUser;
import com.gai.sql.IDepartment;
import com.gai.sql.IUser;
import com.gai.sql.SqlserverDepartment;
import com.gai.sql.SqlserverUser;
/**
 * 使用简单工厂改进抽象工厂，减少更改的地方
 * 可以使用反射来去除switch
 */
public class DataAccess {

//	private static String db = "Sqlserver";
	private static String db = "Access";
	
	public static IUser createUser() {
		IUser result = null;
		switch (db) {
		case "Sqlserver":
			result = new SqlserverUser();
			break;
		case "Access":
			result = new AccessUser();
			break;
		}
		return result;
	}

	public static IDepartment createDepartment() {
		IDepartment result = null;
		switch (db) {
		case "Sqlserver":
			result = new SqlserverDepartment();
			break;
		case "Access":
			result = new AccessDepartment();
			break;
		}
		return result;
	}
	
}
