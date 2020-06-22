package com.onlineclass.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.onlineclass.pojo.ClassTime;

public interface ClassTimeDaoService {
	// 添加课程时间信息
	public int InsertClassTime(ClassTime classTime);

	// 查询课程时间
	public List<ClassTime> classTimes(@Param("course_cno") String course_cno, @Param("class_weekend") int class_weekend,
			@Param("class_time") int class_time);

	// 修改课程时间
	public int UpdateClassTime(ClassTime classTime);

	// 删除课程时间
	public int DelClassTime(@Param("course_cno") String course_cno);

}
