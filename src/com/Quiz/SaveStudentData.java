package com.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SaveStudentData {
	GetConnection getc = new GetConnection();
	GetStudentDetails gets = new GetStudentDetails();
	Question que = new Question();
	Connection con = null;
	PreparedStatement ps = null;

	String getGrade = "";
	String c = que.grade;

	public void saveStudentData(int j, String student2, String grade, int score2) {
		
		int id = j;
		String name =student2; 
		getGrade = getGrade + grade.charAt(0);
		int score=score2;
		try {
			con = getc.getConnection();
			ps = con.prepareStatement("insert into studentdetail (StudentId,StudentName,Grade,Score) values (?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, getGrade);
			ps.setInt(4, score);

			int i = ps.executeUpdate();
			System.out.println("record is updated " + i);

			//x = 'x';
		} catch (Exception e) {
			System.out.println("Given id is allready present :");
			//x = 'y';

			System.out.println(e);

			System.out.println("Enter Student details Again :");
		}

	}
}
