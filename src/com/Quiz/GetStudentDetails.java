package com.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GetStudentDetails implements Quiz {

	int id;
	String student;

	Scanner sc = new Scanner(System.in);
	// StudentDetails sd = new StudentDetails();

	Connection con = null;
	PreparedStatement ps = null;

	GetConnection getCon = new GetConnection();
	String studentname;

	// Method for getting student details
	@Override
	public void setStudentDetails() {
		char x='y';
		while(x=='y') {
			
			
				System.out.println("Enter Student ID :");
				id = sc.nextInt();
				sc.nextLine();
				// sd.setStudentId(id);
				System.out.println("Enter Student name :");
				studentname = sc.nextLine();
				// sd.setStudentName(student);
				
			try {
				con = getCon.getConnection();
				ps = con.prepareStatement("insert into studentdetail (StudentId,StudentName) values (?,?)");
				ps.setInt(1,id);
				ps.setString(2, studentname);
				int i = ps.executeUpdate();
				System.out.println("record is updated " + i);

				x='x';
			} catch (Exception e) {
				 System.out.println("Given id is allready present :");
				 x='y';
			
				 System.out.println(e);
				 
				 System.out.println("Enter Student details Again :");
			}

			
			
			
			
			
			
			
		}
	}

}
