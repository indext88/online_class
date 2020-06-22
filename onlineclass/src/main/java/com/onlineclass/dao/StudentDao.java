package com.onlineclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.onlineclass.pojo.Student;

/**
 * 
 * @author indext
 * @since 2019.10.21
 * @version 1.0
 */
@Mapper
@Repository(value = "studentDao")
public interface StudentDao {
	// 查询学生所有信息
	public List<Student> SelStudent(Student student);

	// 修改学生信息
	public int UpdataStudent(Student student);

	// 删除学生信息
	public int DelStudent(@Param("student_sno") String student_sno);

	// 添加学生信息
	public int AddStudent(Student student);

	// 分页显示学生信息
	public List<Student> SelStudentPage(@Param("student_sno") String student_sno,
			@Param("student_name") String student_name, @Param("student_class") String student_class,
			@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

}
