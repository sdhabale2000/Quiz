package com.Quiz;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Scanner;

public class Question{
static int score;
	
static String grade="D";
	public void logic() {
		
		Scanner scan = new Scanner(System.in);
		GetQuestions que=new GetQuestions();
		HashMap<String, String> hmap = new HashMap<>(que.getdata());
				Iterator<Entry<String, String>> iterator = hmap.entrySet().iterator();
				while(iterator.hasNext()) {
					
						Entry<String,String> entry=iterator.next();
						System.out.println(entry.getKey()+"\n"); 
						System.out.println("Enter Your Answer: ");
						String ans1 = scan.next();
						String ans=ans1.toUpperCase();
						int cans = Character.compare(ans.charAt(0), entry.getValue().charAt(0));
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
						
						if(score<1) {
							 this.grade="fail";
						}
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
