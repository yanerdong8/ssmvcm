package com.yed.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yed.dao.UserDAO;
import com.yed.vo.User;

@Repository("userDAO")
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {
	
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("com.yed.vo.UserMapper.list");
	}

}
