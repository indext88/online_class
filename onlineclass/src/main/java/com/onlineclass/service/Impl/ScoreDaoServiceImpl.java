package com.onlineclass.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineclass.dao.ScoreDao;
import com.onlineclass.pojo.Score;
import com.onlineclass.service.ScoreDaoService;

/**
 * 
 * @author indext
 * @since 2019.11.6
 * @version 1.0
 */

@Service(value = "scoreDaoService")
public class ScoreDaoServiceImpl implements ScoreDaoService {
	@Autowired
	private ScoreDao scoreDao;

	// 课程取消
	public int courseCancel(String student_sno, String course_cno) {
		return scoreDao.courseCancel(student_sno, course_cno);
	}

	// 查询课程是否已选
	public List<Score> scoresSel(String student_sno, String course_cno) {
		return scoreDao.scoresSel(student_sno, course_cno);
	}

	// 课程选择
	public int courseChange(String student_sno, String course_cno, String teacher_tno) {
		return scoreDao.courseChange(student_sno, course_cno, teacher_tno);
	}

	// 课程成绩录入
	public int scoresInput(String student_sno, String course_cno, int score) {
		return scoreDao.scoresInput(student_sno, course_cno, score);
	}

}
