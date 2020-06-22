package com.onlineclass.pojo;

import java.util.List;

public class OnlineClassPage {
	private int PageNo;// 总页数
	private List<Teacher> teacher;// 教师表
	private List<Course> course;// 课程表
	private List<Score> score;// 成绩表
	private List<Student> student;// 学生表
	private List<User> user;// 用户表
	private String messgae;// 反馈信息

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OnlineClassPage [PageNo=" + PageNo + ", teacher=" + teacher + ", course=" + course + ", score=" + score
				+ ", student=" + student + ", user=" + user + ", messgae=" + messgae + "]";
	}

	public OnlineClassPage(int pageNo, List<Teacher> teacher, List<Course> course, List<Score> score,
			List<Student> student, List<User> user, String messgae) {
		super();
		PageNo = pageNo;
		this.teacher = teacher;
		this.course = course;
		this.score = score;
		this.student = student;
		this.user = user;
		this.messgae = messgae;
	}

	public OnlineClassPage() {

	}

	public int getPageNo() {
		return PageNo;
	}

	public void setPageNo(int pageNo) {
		PageNo = pageNo;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Score> getScore() {
		return score;
	}

	public void setScore(List<Score> score) {
		this.score = score;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
