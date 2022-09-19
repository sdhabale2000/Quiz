package com.Quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question{
static int score;
	
static String grade;
	public void logic() {
		SaveStudentData s=new SaveStudentData();
		Scanner scan = new Scanner(System.in);
		System.out.println("*******************************************Quiz Started.********************************************\n");
		
		Questions q1 = new Questions("question:" + "1) Which of the following is not a Java features?",
				"option1:" + "A.Dynamic", "option2:" + "B.architecture Neutral", "option3:" + "C.Use of pointers",
				"option4:" + "D.Object-oriented");
		Questions q2 = new Questions("question:" + "2) An interface with no fields or methods is known as a ______.",
				"option1:" + "A.Runnable Interface", "option2:" + "B.Marker Interface",
				"option3:" + "D.Abstract Interface", "option4:" + "D.CharSequence Interface");
		Questions q3 = new Questions("question:" + "3) Which of the following is a mutable class in java?",
				"option1:" + "A.java.lang.String", "option2:" + "B.java.lang.Byte", "option3:" + "C.java.lang.Short",
				"option4:" + "D.java.lang.StringBuilder");
		Questions q4 = new Questions("question:" + "4).Who invented Java Programming?",
				"option1:" + "A. Guido van Rossum", "option2:" + "B. James Gosling", "option3:" + "C Dennis Ritchie",
				"option4:" + "D. Bjarne Stroustrup");
		Questions q5 = new Questions("question:" + "5). Which statement is true about Java?",
				"option1:" + "A. Java is a sequence-dependent programming language",
				"option2:" + "B. Java is a code dependent programming language",
				"option3:" + "C. Java is a platform-dependent programming language",
				"option4:" + "D Java is a platform-independent programming language");
		Questions q6 = new Questions("question:" + "6). Which one of the following is not a Java feature?",
				"option1:" + "A. Object-oriented", "option2:" + "B. Use of pointers", "option3:" + "C. Portable",
				"option4:" + "D. Dynamic and Extensible");
		Questions q7 = new Questions("question:" + "7). What is the extension of java code files?",
				"option1:" + "A. .js", "option2:" + "B.txt", "option3:" + "C.class", "option4:" + "D.java");
		Questions q8 = new Questions("question:" + "8). Which of the following is not an OOPS concept in Java?",
				"option1:" + "A. Polymorphism", "option2:" + "B. Inheritance", "option3:" + "C. Compilation",
				"option4:" + "D. Encapsulation");
		Questions q9 = new Questions("question:" + "9). Which exception is thrown when java is out of memory?",
				"option1:" + "A. MemoryError", "option2:" + "B.OutOfMemoryError",
				"option3:" + "C. MemoryOutOfBoundsException", "option4:" + "D. MemoryFullException");
		Questions q10 = new Questions("question:" + "10).The Comparator interface contains the method?",
				"option1:" + "A.compareTo() ", "option2:" + "B.compare()", "option3:" + "C.None",
				"option4:" + "D.compareWith()");
		HashMap<Questions, Character> hmap = new HashMap<>();
		hmap.put(q1, 'C');
		hmap.put(q2, 'B');
		hmap.put(q3, 'D');
		hmap.put(q4, 'B');
		hmap.put(q5, 'D');
		hmap.put(q6, 'B');
		hmap.put(q7, 'D');
		hmap.put(q8, 'C');
		hmap.put(q9, 'C');
		hmap.put(q10, 'B');
		for (Map.Entry<Questions, Character> map : hmap.entrySet()) {

			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());

			
			System.out.println("Enter Your Answer: ");
			Character ans = scan.next().charAt(0);
			int cans = Character.compare(ans, map.getValue());
			if (cans == 0) {
				System.out.println("Your Ans is Correct");
				this.score++;
				System.out.print("===========================================================\n");

			} else {
				System.out.println("Your Ans is Wrong");
				//wrongAnsCount++;
				System.out.print("=============================================================\n");
			}

			// System.out.println("Percentage:"+percentage);
			if (score >= 1 && score < 4) {
				this.grade = "D";
			}
			if (score > 4 && score < 6) {
				this.grade = "C";
			}
			if (score > 6 && score < 8) {
				this.grade = "B";
			}
			if (score > 8 && score <= 10) {
				this.grade = "A";
			}
		}
		System.out.println();
		System.out.println("==========Result================================================================");

		System.out.println("Your Score:" + score);
		System.out.println("Your Grade :" + grade);
		scan.close();
		

	}
	
	int getScore() {
		
		return score;
	}
	String getGrade() {
		return grade;
	}

}
