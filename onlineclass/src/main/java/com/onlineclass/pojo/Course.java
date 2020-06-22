package com.onlineclass.pojo;

/**
 * 
 * @author indext
 * @since 2019.10.10
 * @version 1.0
 */
public class Course extends OnlineClassObject {

	/**
	 * 课程映射表
	 */
	private static final long serialVersionUID = 5632950604495414570L;

	private int course_id;// 课程id
	private String course_name;// 课程名
	private String course_cno;// 课程号
	private String course_information;// 课程信息
	private int course_number;// 选课人数
	private ClassTime classTime;// 选课时间安排

	public ClassTime getClassTime() {
		return classTime;
	}

	public void setClassTime(ClassTime classTime) {
		this.classTime = classTime;
	}

	public String getCourse_cno() {
		return course_cno;
	}

	public void setCourse_cno(String course_cno) {
		this.course_cno = course_cno;
	}

	public int getCourse_id() {
		return course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public String getCourse_information() {
		return course_information;
	}

	public int getCourse_number() {
		return course_number;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public void setCourse_information(String course_information) {
		this.course_information = course_information;
	}

	public void setCourse_number(int course_number) {
		this.course_number = course_number;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_cno=" + course_cno
				+ ", course_information=" + course_information + ", course_number=" + course_number + ", classTime="
				+ classTime + "]";
	}

	public Course(int course_id, String course_name, String course_cno, String course_information, int course_number,
			ClassTime classTime) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_cno = course_cno;
		this.course_information = course_information;
		this.course_number = course_number;
		this.classTime = classTime;
	}

	public Course() {

	}

}
