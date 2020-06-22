package com.onlineclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.onlineclass.pojo.Score;
import com.onlineclass.pojo.Teacher;
import com.onlineclass.pojo.User;

/**
 * 
 * @author indext
 * @since 2019.10.21
 * @version 1.0
 */
@Mapper
@Repository(value = "teacherDao")
public interface TeacherDao {
	// 查询教师所有信息
	public List<Teacher> SelTeacher(Teacher teacher);

	// 查询教师
	public List<Teacher> SelTeacherss(@Param("teacher_course_id") String teacher_course_id);

	// 分页显示教师信息
	public List<Teacher> SelTeacherPage(@Param("teacher_name") String teacher_name,
			@Param("teacher_tno") String teacher_tno, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

	// 修改教师信息
	public int UpdataTeacher(Teacher teacher);

	// 删除教师信息
	public int DelTeacher(@Param("teacher_tno") String teacher_tno);

	// 添加教师信息
	public int AddTeacher(Teacher teacher);

	// 修改教师密码
	public int UdateTeacherPwd(User user);

	// 根据学号、班级、学生姓名查询教师选课人数
	public List<Score> scoresTeacherChange(@Param("teacher_tno") String teacher_tno,
			@Param("student_name") String student_name, @Param("student_class") String student_class,
			@Param("student_sno") String student_sno);

	// 根据学号、班级、学生姓名分页查询教师选课人数
	public List<Score> scoresTeacherChangePage(@Param("teacher_tno") String teacher_tno,
			@Param("student_name") String student_name, @Param("student_class") String student_class,
			@Param("student_sno") String student_sno, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
}
