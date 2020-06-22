package com.onlineclass.pojo;

public class ClassTime extends OnlineClassObject {
	/**
	 * 选课时间安排
	 */
	private static long serialVersionUID = 1L;
	private int time_id;// 时间id
	private String course_cno;// 课程号
	private int class_weekend;// 周
	private int class_time;// 时间

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getTime_id() {
		return time_id;
	}

	public String getCourse_cno() {
		return course_cno;
	}

	public int getClass_weekend() {
		return class_weekend;
	}

	public int getClass_time() {
		return class_time;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}

	public void setCourse_cno(String course_cno) {
		this.course_cno = course_cno;
	}

	public void setClass_weekend(int class_weekend) {
		this.class_weekend = class_weekend;
	}

	public void setClass_time(int class_time) {
		this.class_time = class_time;
	}

	@Override
	public String toString() {
		return "ClassTime [time_id=" + time_id + ", course_cno=" + course_cno + ", class_weekend=" + class_weekend
				+ ", class_time=" + class_time + "]";
	}

	public ClassTime(int time_id, String course_cno, int class_weekend, int class_time) {
		super();
		this.time_id = time_id;
		this.course_cno = course_cno;
		this.class_weekend = class_weekend;
		this.class_time = class_time;
	}

	public ClassTime() {

	}

}
