package com.quiz;

import java.util.Scanner;

public class Question {
	public void askQuestion() {
		String []answer= {"a","b","c","d","a","b","c","d","a","b"};
		String []responses= {"","","","","","","","","",""};
		Scanner sc = new Scanner(System.in);
		System.out.println("Read the given question and choose correct one.");
		//Question no.1
		System.out.println("What is the national animal of Nepal?");
		System.out.println("a)Cow\nb)Buffallo\nc)Goat\nd)Dog");
		System.out.println("your answer: ");
		responses[0]=sc.next();
		if(responses[0].equals(answer[0])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[0]);
		}
		//Question no.2
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)\nCrimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[1]=sc.next();
		if(responses[1].equals(answer[1])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[1]);
		}
		//Question no.3
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)\nCrimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[2]=sc.next();
		if(responses[2].equals(answer[2])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[2]);
		}
		//Question no.4
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)\nCrimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[3]=sc.next();
		if(responses[3].equals(answer[3])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[3]);
		}
		//Question no.5
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)Crimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[4]=sc.next();
		if(responses[4].equals(answer[4])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[4]);
		}
		//Question no.6
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)Crimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[5]=sc.next();
		if(responses[5].equals(answer[5])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[5]);
		}
		//Question no.7
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)Crimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[6]=sc.next();
		if(responses[6].equals(answer[6])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[6]);
		}
		//Question no.8
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)Crimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[7]=sc.next();
		if(responses[7].equals(answer[7])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[7]);
		}
		//Question no.9
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)Crimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[8]=sc.next();
		if(responses[8].equals(answer[8])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[8]);
		}
		//Question no.10
		System.out.println("What is the national color of Nepal?");
		System.out.println("a)White\nb)Crimson Redc)Blue\nd)Black");
		System.out.println("your answer: ");
		responses[9]=sc.next();
		if(responses[9].equals(answer[9])){
			System.out.println("Congratulations.");
		}else {
			System.out.println("Wrong Answer.\tCorrect answer is: "+answer[9]);
		}
		int score=0;
		for(int i=0;i<10;i++) {
			if(responses[i].equalsIgnoreCase(answer[i])) {
				score=score+10;
			}
		}
		System.out.println("Your score is: "+score+"/10");
	}

}
