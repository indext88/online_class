package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.TeacherDao;
import com.onlineclass.pojo.Score;
import com.onlineclass.pojo.Teacher;
import com.onlineclass.pojo.User;
import com.onlineclass.service.TeacherDaoService;

/**
 * 
 * @author indext
 * @since 2019.10.21
 * @version 1.1
 */
@Service(value = "teacherDaoService")
public class TeacherDaoServiceImpl implements TeacherDaoService {
	@Autowired
	private TeacherDao teacherDao;

	// 查询所有教师信息
	public List<Teacher> SelTeacher(Teacher teacher) {
		return teacherDao.SelTeacher(teacher);
	}

	// 分页查询显示教师信息
	public List<Teacher> SelTeacherPage(String teacher_name, String teacher_tno, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return teacherDao.SelTeacherPage(teacher_name, teacher_tno, pageNo, pageSize);
	}

	// 修改教师信息
	public int UpdataTeacher(Teacher teacher) {

		return teacherDao.UpdataTeacher(teacher);
	}

	// 删除教师
	public int DelTeacher(String teacher_tno) {

		return teacherDao.DelTeacher(teacher_tno);
	}

	// 添加教师
	public int AddTeacher(Teacher teacher) {

		return teacherDao.AddTeacher(teacher);
	}

	// 教师密码修改
	public int UdateTeacherPwd(User user) {
		// TODO Auto-generated method stub
		return teacherDao.UdateTeacherPwd(user);
	}

	// 根据学号、班级、学生信名查询该教师的选课人
	public List<Score> scoresTeacherChange(String teacher_tno, String student_name, String student_class,
			String student_sno) {
		return teacherDao.scoresTeacherChange(teacher_tno, student_name, student_class, student_sno);
	}

	// 分页显示选课人
	public List<Score> scoresTeacherChangePage(String teacher_tno, String student_name, String student_class,
			String student_sno, int pageNo, int pageSize) {
		return teacherDao.scoresTeacherChangePage(teacher_tno, student_name, student_class, student_sno, pageNo,
				pageSize);
	}

	// 查询测试
	public List<Teacher> SelTeacherss(String teacher_course_id) {
		// TODO Auto-generated method stub
		return teacherDao.SelTeacherss(teacher_course_id);
	}

}
