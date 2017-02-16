package com.gai.factory;

import com.gai.sql.IDepartment;
import com.gai.sql.IUser;

public abstract class IFactory {

	public abstract IUser createUser();
	
	public abstract IDepartment createDepartment();
	
}
