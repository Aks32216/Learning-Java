package Basics;

import java.util.*;

public class Conditionals {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
//		int m=scn.nextInt();
//		if(m==0) {
//			System.out.println("Hello");
//		}
//		else {
//			System.out.println("How are you");
//		}
		
//		System.out.print("Please Enter Your Marks: ");
//		int marks=scn.nextInt();
//		if(marks>=90) {
//			System.out.println("Grade A");
//		}else if(marks>=80){
//			System.out.println("Grade B");
//		}else if(marks>=70) {
//			System.out.println("Grade C");
//		}else if(marks>=60) {
//			System.out.println("Grade D");
//		}else {
//			System.out.println("Sorry you have failed!");
//		}
		int salary=scn.nextInt();
		int increment=0;
		if(salary>=10000) {
			increment=2000;
		}else {
			increment=1000;
		}
		System.out.println(salary+increment);
	}

}
