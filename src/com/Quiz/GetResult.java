package com.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetResult {
	Connection con = null;
	PreparedStatement ps = null;

	GetConnection con1 = new GetConnection();

	void getresult() {
		try {
			con = con1.getConnection();

			ps=con.prepareStatement("select * from studentdetail");
			ResultSet rs = ps.executeQuery();

			System.out.println("\n**************************** Student Result *******************************\n");
			while (rs.next()) {
				System.out.println("Student Id :" + rs.getInt(1));
				System.out.println("Student name :" + rs.getString(2));
				System.out.println("Grade :" + rs.getString(3));
				System.out.println("Score :" + rs.getInt(4));

				System.out.println("\n**********************************\n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	void getStudentId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id of student: ");
		int id=sc.nextInt();
		con = con1.getConnection();

		
		try {
			ps=con.prepareStatement("select * from studentdetail where StudentId="+id+";" );
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Student Id :" + rs.getInt(1));
				System.out.println("Student name :" + rs.getString(2));
				System.out.println("Grade :" + rs.getString(3));
				System.out.println("Score :" + rs.getInt(4));

				System.out.println("\n**********************************\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
