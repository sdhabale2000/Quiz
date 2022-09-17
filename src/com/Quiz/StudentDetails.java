package com.Quiz;

public class StudentDetails {

	private int studentId;

	public int getStudentId() {
		return studentId;
	}
	
	public StudentDetails() {
		
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private String studentName;

	public StudentDetails(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
