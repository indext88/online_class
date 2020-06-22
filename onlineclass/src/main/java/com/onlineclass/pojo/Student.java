package com.onlineclass.pojo;

/**
 * 
 * @author indext
 * @since 2019.10.10
 * @version 1.0
 */
public class Student extends OnlineClassObject {

	/**
	 * 学生信息映射表
	 */
	private static final long serialVersionUID = 3581339670663529720L;

	private int student_id;// 学生id
	private String student_name;// 学生姓名
	private String student_sno;// 学号
	private String student_age;// 学生年龄
	private String student_data;// 出生日期
	private String student_phone;// 联系电话
	private String student_address;// 家庭住址
	private String student_class;// 所在班级

	public int getStudent_id() {
		return student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_sno() {
		return student_sno;
	}

	public String getStudent_age() {
		return student_age;
	}

	public String getStudent_data() {
		return student_data;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public String getStudent_address() {
		return student_address;
	}

	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void setStudent_sno(String student_sno) {
		this.student_sno = student_sno;
	}

	public void setStudent_age(String student_age) {
		this.student_age = student_age;
	}

	public void setStudent_data(String student_data) {
		this.student_data = student_data;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_sno=" + student_sno
				+ ", student_age=" + student_age + ", student_data=" + student_data + ", student_phone=" + student_phone
				+ ", student_address=" + student_address + ", student_class=" + student_class + "]";
	}

	public Student(int student_id, String student_name, String student_sno, String student_age, String student_data,
			String student_phone, String student_address, String student_class) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_sno = student_sno;
		this.student_age = student_age;
		this.student_data = student_data;
		this.student_phone = student_phone;
		this.student_address = student_address;
		this.student_class = student_class;
	}

	public Student() {

	}

}
