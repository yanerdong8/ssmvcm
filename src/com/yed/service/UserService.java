package com.yed.service;

import java.util.List;

import com.yed.vo.User;

public interface UserService {
	public List<User> list();
	int delete(Long id);
	int insert(User user);
}
