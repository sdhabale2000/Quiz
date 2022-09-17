package com.Quiz;

public class GetStudentDetails implements Quiz{
	StudentDetails sd=new StudentDetails();
	@Override
	
	//Method for getting student details 
	
	public void getStudentDetails() {
		
		System.out.println("Enter Student Name :");
		sd.getStudentId();
		
		
	}

	

}
