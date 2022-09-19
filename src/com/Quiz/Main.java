package com.Quiz;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GetStudentDetails details=new GetStudentDetails();
		Question q=new Question();
		System.out.println("********************** Quiz *******************************");

		System.out.println("\nEnter your choise(1,2,3) :");
		System.out.println("1 Start Quiz ");
		System.out.println("2 Display All students Details");
		System.out.println("3 Show result of a student ");
		int key=sc.nextInt();
		switch (key) {
		case 1: {
			details.setStudentDetails();
			q.logic();
			break;
		}
		
		case 2:{
			break;
		}
		case 3:{
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
		
		
		
		
		
	}
}
