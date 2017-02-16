package com.gai.factory;

import com.gai.sql.IDepartment;
import com.gai.sql.IUser;
import com.gai.sql.SqlserverDepartment;
import com.gai.sql.SqlserverUser;

public class SqlServerFactory extends IFactory {

	@Override
	public IUser createUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlserverDepartment();
	}

}
