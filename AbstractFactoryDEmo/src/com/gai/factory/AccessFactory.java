package com.gai.factory;

import com.gai.sql.AccessDepartment;
import com.gai.sql.AccessUser;
import com.gai.sql.IDepartment;
import com.gai.sql.IUser;

public class AccessFactory extends IFactory {

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}

}
