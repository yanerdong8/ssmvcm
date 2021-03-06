package com.yed.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yed.dao.UserDAO;
import com.yed.service.UserService;
import com.yed.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public List<User> list() {
		return userDAO.list();
	}
	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return userDAO.delete(id);
	}
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userDAO.insert(user);
	}

}
