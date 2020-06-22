package com.onlineclass.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.onlineclass.pojo.Score;
import com.onlineclass.service.ScoreDaoService;

/**
 * 
 * @author indext
 * @since 2019.11.06
 * @version 1.0
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class ScoreController {
	@Autowired
	private ScoreDaoService scoreDaoService;

	// 学生课程选择
	@RequestMapping(value = "/student/courseChange")
	@ResponseBody
	public boolean courseChange(HttpServletRequest request, HttpServletResponse response, @RequestBody JSONArray arr)
			throws ParseException {
		// 遍历选择课程的课程号
		for (int i = 0; i < arr.size(); i++) {
			JSONObject jsonObject = arr.getJSONObject(i);
			String teacher_tno = jsonObject.getString("teacher_tno");
			String course_cno = jsonObject.getString("course_cno");
			String sno = jsonObject.getString("userName");
			List<Score> scores = scoreDaoService.scoresSel(sno, course_cno);
			if (scores.size() > 0) {
				System.out.println("课程已存在！！");
				continue;
			} else {
				int change = scoreDaoService.courseChange(sno, course_cno, teacher_tno);
				if (change > 0) {
					System.out.println("选择成功");
				} else {
					System.out.println("选课失败");
					continue;
				}
			}
		}
		return true;
	}

}
