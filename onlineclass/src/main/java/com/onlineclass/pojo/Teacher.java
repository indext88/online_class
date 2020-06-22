package com.onlineclass.pojo;

/**
 * 
 * @author indext
 * @since 2019.10.10
 * @version 1.0
 */
public class Teacher extends OnlineClassObject {

	/**
	 * 教师信息映射表
	 */
	private static long serialVersionUID = -1936174695436289858L;

	private int teacher_id;// 教师id
	private String teacher_name;// 教师姓名
	private String teacher_tno;// 教师工号
	private String teacher_age;// 教师年龄
	private String teacher_data;// 出生日期
	private String teacher_phone;// 联系电话
	private String teacher_address;// 家庭住址
	private String teacher_course_id;// 教课课号
	private Course course;// 所交课程

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getTeacher_course_id() {
		return teacher_course_id;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		Teacher.serialVersionUID = serialVersionUID;
	}

	public void setTeacher_course_id(String teacher_course_id) {
		this.teacher_course_id = teacher_course_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public String getTeacher_tno() {
		return teacher_tno;
	}

	public String getTeacher_age() {
		return teacher_age;
	}

	public String getTeacher_data() {
		return teacher_data;
	}

	public String getTeacher_phone() {
		return teacher_phone;
	}

	public String getTeacher_address() {
		return teacher_address;
	}

	public Course getCourse() {
		return course;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public void setTeacher_tno(String teacher_tno) {
		this.teacher_tno = teacher_tno;
	}

	public void setTeacher_age(String teacher_age) {
		this.teacher_age = teacher_age;
	}

	public void setTeacher_data(String teacher_data) {
		this.teacher_data = teacher_data;
	}

	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}

	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_tno=" + teacher_tno
				+ ", teacher_age=" + teacher_age + ", teacher_data=" + teacher_data + ", teacher_phone=" + teacher_phone
				+ ", teacher_address=" + teacher_address + ", course_id=" + teacher_course_id + ", course=" + course
				+ "]";
	}

	public Teacher(int teacher_id, String teacher_name, String teacher_tno, String teacher_age, String teacher_data,
			String teacher_phone, String teacher_address, String course_id, Course course) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_tno = teacher_tno;
		this.teacher_age = teacher_age;
		this.teacher_data = teacher_data;
		this.teacher_phone = teacher_phone;
		this.teacher_address = teacher_address;
		this.teacher_course_id = course_id;
		this.course = course;
	}

	public Teacher() {

	}

}
