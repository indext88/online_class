package com.onlineclass.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlineclass.pojo.OnlineClassPage;
import com.onlineclass.pojo.Teacher;
import com.onlineclass.pojo.User;
import com.onlineclass.service.AdministorDaoService;
import com.onlineclass.service.StudentDaoService;
import com.onlineclass.service.TeacherDaoService;
import com.onlineclass.service.UserDaoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class AdministorController {
	@Autowired
	private AdministorDaoService administorDaoService;

	@Autowired
	private UserDaoService userDaoService;// 用户依赖注入

	@Autowired
	private StudentDaoService studentDaoService;// 学生依赖注入

	@Autowired
	private TeacherDaoService teacherDaoService;

	// 分页查询所有用户
	@RequestMapping("/admin/AdministorSelUser")
	@ResponseBody
	public OnlineClassPage AdministorSelUser(HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws Exception {
		String user_name = request.getParameter("user_name");
		String type = request.getParameter("user_type");
		// 获取显示的页
		String pageNoss = request.getParameter("pageNopss");
		int pageNos = Integer.parseInt(pageNoss);
		int pageSize = 10;

		// 条件查询用户信息
		List<User> users = administorDaoService.AdminUser(user_name, type);
		System.out.println(users.toString());
		// 显示分页的总页数
		int pageNo = users.size() / 10;
		// 每页显示的行数
		// 判断最后一页行数是否能显示一页，不能则加1
		if (users.size() % 10 != 0) {
			pageNo += 1;
		}
		// 分页查询用户信息
		List<User> user = administorDaoService.AdminUserPage(user_name, type, pageNos, pageSize);
		OnlineClassPage onlineClassPage = new OnlineClassPage();
		onlineClassPage.setUser(user);
		onlineClassPage.setPageNo(pageNo);
		return onlineClassPage;
	}

	// 修改用户类型
	@RequestMapping("/admin/AdminUpdateUser")
	@ResponseBody
	public List<User> AdminUpdateUser(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {
		String user_name = request.getParameter("user_name");
		String user_type = request.getParameter("user_type");
		User user = new User();
		user.setUser_name(user_name);
		user.setUser_type(user_type);
		// 条件查询用户信息
		List<User> us = administorDaoService.AdminUser(null, null);
		// 修改用户类型
		int upUser = administorDaoService.AdminUpdateUser(user);
		if (upUser > 0) {
			// 分页查询用户信息
			List<User> users = administorDaoService.AdminUserPage(null, null, 1, 12);
			System.out.println("修改成功");
			return users;
		}
		List<User> users = administorDaoService.AdminUserPage(null, null, 1, 12);
		return users;
	}

	// 删除用户类型
	@RequestMapping("/admin/AdminDelUser")
	@ResponseBody
	public List<User> AdminDelUser(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {
		String user_name = request.getParameter("user_name");
		String user_type = request.getParameter("user_type");
		// 查询其用户类型
		if (user_type.equals("学生")) {
			// 删除用户
			int delUser = administorDaoService.AdminDelUser(user_name);
			// 删除学生信息
			int delStudent = studentDaoService.DelStudent(user_name);
			if (delUser > 0 && delStudent > 0) {
				System.out.println("删除成功");
				// 条件查询用户信息
				List<User> users = administorDaoService.AdminUserPage(null, null, 1, 12);
				return users;
			}
		}
		if (user_type.equals("教师")) {
			// 删除用户
			int delUser = administorDaoService.AdminDelUser(user_name);
			// 删除教师信息
			int delTeacher = teacherDaoService.DelTeacher(user_name);
			if (delUser > 0 && delTeacher > 0) {
				System.out.println("删除成功");
				// 条件查询用户信息
				List<User> users = administorDaoService.AdminUserPage(null, null, 1, 12);
				return users;
			}
			System.out.println("删除失败");
			List<User> users = administorDaoService.AdminUserPage(null, null, 1, 12);
			return users;
		}
		List<User> users = administorDaoService.AdminUserPage(null, null, 1, 12);
		return users;
	}

	// 分页显示教师信息
	@RequestMapping("/admin/adminSelTeacherPage")
	@ResponseBody
	public OnlineClassPage AdminSelTeacherPage(HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws Exception {
		String teacher_tno = request.getParameter("teacher_tno");
		String teacher_name = request.getParameter("teacher_name");
		String pageNoss = request.getParameter("pageNopss");
		int pageNos = Integer.parseInt(pageNoss);

		Teacher teacher = new Teacher();
		teacher.setTeacher_name(teacher_name);
		teacher.setTeacher_tno(teacher_tno);
		List<Teacher> teachers = teacherDaoService.SelTeacher(teacher);
//		 显示分页的总页数
		int pageNo = teachers.size() / 10;
		// 每页显示的行数
		int pageSize = 10;
		// 判断最后一页行数是否能显示一页，不能则加1
		if (teachers.size() % 10 != 0) {
			pageNo += 1;
		}
		List<Teacher> tea = teacherDaoService.SelTeacherPage(teacher_name, teacher_tno, pageNos, pageSize);
		OnlineClassPage onlineClassPage = new OnlineClassPage();
		onlineClassPage.setTeacher(tea);
		onlineClassPage.setPageNo(pageNo);
		System.out.println(onlineClassPage);
		return onlineClassPage;
	}
}
