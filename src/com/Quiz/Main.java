package com.Quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GetResult result = new GetResult();
		Scanner sc = new Scanner(System.in);
		GetStudentDetails details = new GetStudentDetails();
		SaveStudentData save = new SaveStudentData();
		Question q = new Question();
		System.out.println("********************** Quiz *******************************");

		System.out.println("\nEnter your choise(1,2,3) :");
		System.out.println("1 Start Quiz ");
		System.out.println("2 Display All students Details");
		System.out.println("3 Show result of a student ");

		int key = sc.nextInt();

		switch (key) {
		case 1: {

			details.setStudentDetails();// id=1 --- id =null;
			q.logic();
			try {

				save.saveStudentData(details.getId(), details.student, q.getGrade(), q.score);
			} catch (Exception e) {

				
			}

			break;
		}

		case 2:

		{
			result.getresult();
			break;
		}
		case 3: {
			result.getStudentId();
			break;
		}

		default:
			System.out.println("you entered wrong num");
		}
		sc.close();

	}
}