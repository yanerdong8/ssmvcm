package com.yed.dao;

import java.util.List;

import com.yed.vo.User;

public interface UserDAO {
	public List<User> list();
	 int delete(Long id);
	 int insert(User user);
}
