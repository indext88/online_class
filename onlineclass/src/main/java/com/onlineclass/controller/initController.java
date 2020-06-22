package com.onlineclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author indext
 * @since 2019.10.10
 * @version 1.0
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class initController {
	/***
	 * 默认跳转到主页面或者登陆页面
	 * 
	 * @return
	 */

	// 主界面
	@RequestMapping("/index")
	public String index() {
		return "login";
	}

	// 登录
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	// 退出
	@RequestMapping("/exit")
	public String exit() {
		return "login";
	}

	// 跳转学生界面
	@RequestMapping("student")
	public String student() {
		return "student";
	}

	// 跳转教师界面
	@RequestMapping("teacher")
	public String teacher() {
		return "teacher";
	}

	// 跳转管理员界面
	@RequestMapping("admins")
	public String Admin() {
		return "administor";
	}

//	// 注册
//	@RequestMapping("/register")
//	public String register() {
//		return "register";
//	}
}
