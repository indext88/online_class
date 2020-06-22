package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.UserDao;
import com.onlineclass.pojo.Student;
import com.onlineclass.pojo.Teacher;
import com.onlineclass.pojo.User;
import com.onlineclass.service.UserDaoService;

/**
 * 
 * @author indext
 * @since 2019.10.10
 * @version 1.0
 */

@Service(value = "userDaoService")
public class UserServiceImpl implements UserDaoService {

	@Autowired
	private UserDao userDao;

	// 用户登录
	public List<User> userLogin(User user) {
		return userDao.userLogin(user);
	}

	// 学生注册
	public int StudentRegister(Student student) {
		return userDao.StudentRegister(student);
	}

	// 教师注册
	public int TeacherRegister(Teacher teacher) {

		return userDao.TeacherRegister(teacher);
	}

	// 用户注册
	public int userRegister(User user) {

		return userDao.userRegister(user);
	}

	// 判断用户是否存在
	public List<User> useConflict(String username) {

		return userDao.useConflict(username);
	}

	// 查询忘记密码的用户
	public List<Student> SelStudent(String userSno, String userTelphone) {

		return userDao.SelStudent(userSno, userTelphone);
	}

	// 修改用户密码
	public int UpdataUser(User user) {

		return userDao.UpdataUser(user);
	}

	// 查询用户
	public List<User> SelUser(String user_name) {
		return userDao.SelUser(user_name);
	}

	// 根据用户密码、用户名、类型查询用户
	public List<User> SelAllUser(User user) {
		return userDao.SelAllUser(user);
	}

}
