package com.onlineclass.pojo;

/**
 * 
 * @author indext
 * @since 2019.10.10
 * @version 1.0
 */
public class Score extends OnlineClassObject {

	/**
	 * 成绩映射表
	 */
	private static long serialVersionUID = 4219537463591868936L;

	private int score_id;// 成绩id
	private int scores;// 课程成绩
	private Student student;// 学生信息
	private Course course;// 课程信息
	private Teacher teacher;// 教师信息

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getScore_id() {
		return score_id;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public int getScore() {
		return scores;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		Score.serialVersionUID = serialVersionUID;
	}

	public void setScore_id(int score_id) {
		this.score_id = score_id;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setScore(int score) {
		this.scores = score;
	}

	@Override
	public String toString() {
		return "Score [score_id=" + score_id + ", student=" + student + ", course=" + course + ", teacher=" + teacher
				+ ", score=" + scores + "]";
	}

	public Score() {

	}

	public Score(int score_id, Student student, Course course, Teacher teacher, int score) {
		super();
		this.score_id = score_id;
		this.student = student;
		this.course = course;
		this.teacher = teacher;
		this.scores = score;
	}

}
