package com.onlineclass.controller;

import java.text.ParseException;
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
import com.onlineclass.pojo.Score;
import com.onlineclass.pojo.Student;
import com.onlineclass.pojo.Teacher;
import com.onlineclass.service.ScoreDaoService;
import com.onlineclass.service.StudentDaoService;
import com.onlineclass.service.TeacherDaoService;
import com.onlineclass.util.Age;

/**
 * 
 * @author indext
 * @since 2019.11.08
 * @version 1.0
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class TeacherController {
	@Autowired
	private TeacherDaoService teacherDaoService;

	@Autowired
	private StudentDaoService studentDaoService;

	@Autowired
	private ScoreDaoService scoreDaoService;

	// 显示所有已选课程
	@RequestMapping("/teacher/teacherChange")
	@ResponseBody
	public OnlineClassPage courses(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String student_name = request.getParameter("student_name");
		String student_class = request.getParameter("student_class");
		String student_sno = request.getParameter("student_sno");
		String teacher_tno = request.getParameter("teacher_tno");
		// 获取显示的页
		String pageNoss = request.getParameter("pageNopss");
		int pageNos = Integer.parseInt(pageNoss);
		int pageSize = 10;

		List<Score> scores = teacherDaoService.scoresTeacherChange(teacher_tno, student_name, student_class,
				student_sno);
		// 显示分页的总页数
		int pageNo = scores.size() / 10;
		// 每页显示的行数
		// 判断最后一页行数是否能显示一页，不能则加1
		if (scores.size() % 10 != 0) {
			pageNo += 1;
		}
		List<Score> scoresPage = teacherDaoService.scoresTeacherChangePage(teacher_tno, student_name, student_class,
				student_sno, pageNos, pageSize);

		OnlineClassPage onlineClassPage = new OnlineClassPage();
		onlineClassPage.setScore(scoresPage);
		onlineClassPage.setPageNo(pageNo);
		System.out.println(onlineClassPage);
		return onlineClassPage;
	}

	// 分页显示学生信息
	@RequestMapping("/teacher/teaSelStudentsPage")
	@ResponseBody
	public OnlineClassPage TeaSelStudentsPage(HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		String student_name = request.getParameter("student_name");
		String student_class = request.getParameter("student_class");
		String student_sno = request.getParameter("student_sno");
		String teacher_tno = request.getParameter("teacher_tno");

		System.out.println(student_name + " " + student_class + " " + student_sno);

		// 获取页数
		String pageNoss = request.getParameter("pageNopss");
		int pageNos = Integer.parseInt(pageNoss);
		Student student = new Student();
		student.setStudent_name(student_name);
		student.setStudent_class(student_class);
		student.setStudent_sno(student_sno);
		List<Student> students = studentDaoService.SelStudent(student);
//		 显示分页的总页数
		int pageNo = students.size() / 10;
		// 每页显示的行数
		int pageSize = 10;
		// 判断最后一页行数是否能显示一页，不能则加1
		if (students.size() % 10 != 0) {
			pageNo += 1;
		}
		List<Student> stu = studentDaoService.SelStudentPage(student_sno, student_name, student_class, pageNos,
				pageSize);
		OnlineClassPage onlineClassPage = new OnlineClassPage();
		onlineClassPage.setStudent(stu);
		onlineClassPage.setPageNo(pageNo);
		return onlineClassPage;
	}

	// 显示修改教师信息
	@RequestMapping("/teacher/teacherInformation")
	@ResponseBody
	public List<Teacher> teacherInformation(HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		String username = request.getParameter("userName");
		Teacher teacher = new Teacher();
		teacher.setTeacher_tno(username);
		teacher.setTeacher_name("");
		List<Teacher> teachers = teacherDaoService.SelTeacher(teacher);
		return teachers;
	}

	// 修改教师信息
	@RequestMapping("/teacher/teacherUpdateInformation")
	@ResponseBody
	public boolean teacherUpdateInformation(HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws ParseException {
		// 页面获取教师信息
		String teachername = request.getParameter("teacher_name");
		String teachertno = request.getParameter("teacher_tno");
		String teacherdata = request.getParameter("teacher_data");
		// 获取年龄
		Age age = new Age();
		int userAge = age.parse(teacherdata);
		String teacherage = Integer.toString(userAge);

		String teacherphone = request.getParameter("teacher_phone");
		String teacheraddress = request.getParameter("teacher_address");
		String teachercourseid = request.getParameter("teacher_course_id");

		// 插入数据到Teacher对象表中
		Teacher teacher = new Teacher();
		teacher.setTeacher_name(teachername);
		teacher.setTeacher_tno(teachertno);
		teacher.setTeacher_age(teacherage);
		teacher.setTeacher_data(teacherdata);
		teacher.setTeacher_phone(teacherphone);
		teacher.setTeacher_address(teacheraddress);
		teacher.setTeacher_course_id(teachercourseid);

		int teacherUpdate = teacherDaoService.UpdataTeacher(teacher);
		if (teacherUpdate > 0) {
			System.out.println("修改成功");
			return true;
		}
		System.out.println("修改失败");
		return false;
	}

	// 修改成绩信息
	@RequestMapping("/teacher/teacherScore")
	@ResponseBody
	public boolean teacherScore(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// 获取成绩录入信息
		String username = request.getParameter("userName");
		String score = request.getParameter("score");
		int sc = Integer.parseInt(score);
		String course_cno = request.getParameter("course_cno");

		int scores = scoreDaoService.scoresInput(username, course_cno, sc);
		if (scores > 0) {
			System.out.println("修改成功");
			return true;
		}
		System.out.println("修改失败");
		return false;
	}

}
