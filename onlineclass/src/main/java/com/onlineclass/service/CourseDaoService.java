package com.onlineclass.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.onlineclass.pojo.Course;
import com.onlineclass.pojo.Score;
import com.onlineclass.pojo.Teacher;

public interface CourseDaoService {
	// 课程查询
	List<Teacher> coursesSel(@Param("course_name") String course_name, @Param("course_cno") String course_cno,
			@Param("teacher_name") String teacher_name);

	// 分页显示课程,pageNo显示的页数，pageSize显示的行数
	List<Teacher> coursesSelPage(@Param("course_name") String course_name, @Param("course_cno") String course_cno,
			@Param("teacher_name") String teacher_name, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

	// 课程修改
	int coursesUpdate(@Param("course_name") String course_name, @Param("course_cno") String course_cno,
			@Param("course_information") String course_information);

	// 课程添加
	int coursesInsert(Course course);

	// 查询所有课程信息
	List<Course> getCourse(@Param("course_cno") String course_cno, @Param("course_name") String course_name);

	// 分页查询课程信息
	List<Course> getCoursePages(@Param("course_cno") String course_cno, @Param("course_name") String course_name,
			@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

	// 删除课程
	int coursesDel(@Param("course_cno") String course_cno);

	// 查看已选课程
	List<Score> scores(@Param("student_sno") String student_sno, @Param("course_cno") String course_cno,
			@Param("teacher_tno") String teacher_tno);

	// 分页显示已选课程信息,pageNo显示的页数，pageSize显示的行数
	List<Score> scoresPage(@Param("student_sno") String student_sno, @Param("course_cno") String course_cno,
			@Param("teacher_tno") String teacher_tno, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

	// 查询学生已选课程
	List<Score> scoresStu(@Param("student_sno") String student_sno, @Param("student_name") String student_name,
			@Param("teacher_name") String teacher_name, @Param("course_name") String course_name);

	// 分页显示学生已选课程信息,pageNo显示的页数，pageSize显示的行数
	List<Score> scoresStuPage(@Param("student_sno") String student_sno, @Param("student_name") String student_name,
			@Param("teacher_name") String teacher_name, @Param("course_name") String course_name,
			@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
}
