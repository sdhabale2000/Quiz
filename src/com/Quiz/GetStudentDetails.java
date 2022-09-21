package com.Quiz;
import java.util.Scanner;

public class GetStudentDetails implements Quiz {

	
	Scanner sc = new Scanner(System.in);
	static int id;
	String student;

	// Method for getting student details
	@Override
	public void setStudentDetails() {
		

			System.out.println("Enter Student ID :");
			this.id = sc.nextInt();
			sc.nextLine();
			// sd.setStudentId(id);
			System.out.println("Enter Student name :");
			student = sc.nextLine();
			// sd.setStudentName(student);

			

		
	}
	int getId() {
	return this.id;	
	}

}
