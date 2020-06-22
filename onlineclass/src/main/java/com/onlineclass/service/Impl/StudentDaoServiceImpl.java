package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.StudentDao;
import com.onlineclass.pojo.Student;
import com.onlineclass.service.StudentDaoService;

/**
 * 
 * @author indext
 * @since 2019.10.21
 * @version 1.0
 */
@Service(value = "studentDaoService")
public class StudentDaoServiceImpl implements StudentDaoService {
	@Autowired
	private StudentDao studentDao;

	// 查询所有学生
	public List<Student> SelStudent(Student student) {

		return studentDao.SelStudent(student);
	}

	// 修改学生信息
	public int UpdataStudent(Student student) {

		return studentDao.UpdataStudent(student);
	}

	// 删除学生
	public int DelStudent(String student_sno) {

		return studentDao.DelStudent(student_sno);
	}

	// 添加学生信息
	public int AddStudent(Student student) {

		return studentDao.AddStudent(student);
	}

	public List<Student> SelStudentPage(String student_sno, String student_name, String student_class, int pageNo,
			int pageSize) {
		// TODO Auto-generated method stub
		return studentDao.SelStudentPage(student_sno, student_name, student_class, pageNo, pageSize);
	}

}
