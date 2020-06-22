package com.onlineclass.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.onlineclass.pojo.Score;

/**
 * 
 * @author indext
 * @since 2019.11.06
 * @version 1.0
 */
public interface ScoreDaoService {
	// 课程选择
	int courseChange(@Param("student_sno") String student_sno, @Param("course_cno") String course_cno,
			@Param("teacher_tno") String teacher_tno);

	// 课程取消
	int courseCancel(@Param("student_sno") String student_sno, @Param("course_cno") String course_cno);

	// 选课查询(判断是否已经选择)
	List<Score> scoresSel(@Param("student_sno") String student_sno, @Param("course_cno") String course_cno);

	// 学生成绩录入
	int scoresInput(@Param("student_sno") String student_sno, @Param("course_cno") String course_cno,
			@Param("score") int score);

}
