package com.gai.sql;

import com.gai.bean.User;

public interface IUser {

	void insert(User user);
	
	User getUser(int id);
	
}
