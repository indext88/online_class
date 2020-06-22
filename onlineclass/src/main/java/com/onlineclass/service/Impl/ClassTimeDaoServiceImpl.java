package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.ClassTimeDao;
import com.onlineclass.pojo.ClassTime;
import com.onlineclass.service.ClassTimeDaoService;

@Service(value = "classTimeDaoService")
public class ClassTimeDaoServiceImpl implements ClassTimeDaoService {
	@Autowired
	private ClassTimeDao classTimeDao;

	// 添加课程时间
	public int InsertClassTime(ClassTime classTime) {
		return classTimeDao.InsertClassTime(classTime);
	}

	// 查询课程时间
	public List<ClassTime> classTimes(String course_cno, int class_weekend, int class_time) {

		return classTimeDao.classTimes(course_cno, class_weekend, class_time);
	}

	// 修改课程时间
	public int UpdateClassTime(ClassTime classTime) {
		return classTimeDao.UpdateClassTime(classTime);
	}

	// 删除课程时间
	public int DelClassTime(String course_cno) {
		return classTimeDao.DelClassTime(course_cno);
	}

}
