package com.Quiz;

public class GetStudentDetails implements Quiz{

	StudentDetails sd=new StudentDetails();
	@Override
	public void getStudentDetails() {
		System.out.println("Enter Student Name :");
		sd.getStudentId();
		
		
	}

	

}
