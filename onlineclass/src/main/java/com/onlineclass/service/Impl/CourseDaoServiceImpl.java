package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.CourseDao;
import com.onlineclass.pojo.Course;
import com.onlineclass.pojo.Score;
import com.onlineclass.pojo.Teacher;
import com.onlineclass.service.CourseDaoService;

/**
 * 
 * @author indext
 * @since 2019.11.6
 * @version 1.1
 */

@Service(value = "courseDaoService")
public class CourseDaoServiceImpl implements CourseDaoService {
	@Autowired
	private CourseDao courseDao;

	// 查询课程信息
	public List<Teacher> coursesSel(String course_name, String course_cno, String teacher_name) {
		// TODO Auto-generated method stub
		return courseDao.coursesSel(course_name, course_cno, teacher_name);
	}

	// 分页查询课程信息
	public List<Teacher> coursesSelPage(String course_name, String course_cno, String teacher_name, int pageNo,
			int pageSize) {

		return courseDao.coursesSelPage(course_name, course_cno, teacher_name, pageNo, pageSize);
	}

	// 查询已选课程
	public List<Score> scores(String student_sno, String course_cno, String teacher_tno) {

		return courseDao.scores(student_sno, course_cno, teacher_tno);
	}

	// 分页显示已选课程
	public List<Score> scoresPage(String student_sno, String course_cno, String teacher_tno, int pageNo, int pageSize) {

		return courseDao.scoresPage(student_sno, course_cno, teacher_tno, pageNo, pageSize);
	}

	// 课程删除
	public int coursesDel(String course_cno) {
		// TODO Auto-generated method stub
		return courseDao.coursesDel(course_cno);
	}

	// 课程添加
	public int coursesInsert(Course course) {
		return courseDao.coursesInsert(course);
	}

	// 查询课程信息
	public List<Course> getCourse(String course_cno, String course_name) {
		// TODO Auto-generated method stub
		return courseDao.getCourse(course_cno, course_name);
	}

	// 分页查询所有课程信息
	public List<Course> getCoursePages(String course_cno, String course_name, int pageNo, int pageSize) {
		System.out.println(course_name + "  " + course_cno + "  " + pageNo + "  " + pageSize);
		return courseDao.getCoursePages(course_cno, course_name, pageNo, pageSize);
	}

	// 课程修改
	public int coursesUpdate(String course_name, String course_cno, String course_information) {
		// TODO Auto-generated method stub
		return courseDao.coursesUpdate(course_name, course_cno, course_information);
	}

	// 查询学生成绩
	public List<Score> scoresStu(String student_sno, String student_name, String teacher_name, String course_name) {
		return courseDao.scoresStu(student_sno, student_name, teacher_name, course_name);
	}

	// 分页查询学生成绩信息
	public List<Score> scoresStuPage(String student_sno, String student_name, String teacher_name, String course_name,
			int pageNo, int pageSize) {
		return courseDao.scoresStuPage(student_sno, student_name, teacher_name, course_name, pageNo, pageSize);
	}

}
