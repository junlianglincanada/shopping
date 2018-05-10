package com.junlianglin.groupon.service;

import com.junlianglin.groupon.domain.User;
import com.junlianglin.groupon.support.AbstractService;

import java.util.List;

public interface UserService extends AbstractService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public List<User> findAll();
}
