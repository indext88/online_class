package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.AdministorDao;
import com.onlineclass.pojo.Score;
import com.onlineclass.pojo.User;
import com.onlineclass.service.AdministorDaoService;

@Service(value = "administorDaoService")
public class AdministorDaoServiceImpl implements AdministorDaoService {
	@Autowired
	private AdministorDao administorDao;

	// 查询所有用户
	public List<User> AdminUser(String user_name, String user_type) {
		// TODO Auto-generated method stub
		return administorDao.AdminUser(user_name, user_type);
	}

	// 分页查询所有用户
	public List<User> AdminUserPage(String user_name, String user_type, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return administorDao.AdminUserPage(user_name, user_type, pageNo, pageSize);
	}

	// 修改用户
	public int AdminUpdateUser(User user) {
		// TODO Auto-generated method stub
		return administorDao.AdminUpdateUser(user);
	}

	// 删除用户
	public int AdminDelUser(String user_name) {
		// TODO Auto-generated method stub
		return administorDao.AdminDelUser(user_name);
	}

	// 成绩信息修改
	public int AdminUpdateScore(Score score) {
		// TODO Auto-generated method stub
		return administorDao.AdminUpdateScore(score);
	}

}
