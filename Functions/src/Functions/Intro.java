package Functions;

import java.util.*;

public class Intro {
	
	static int add(int first,int second) {
		return first+second;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int first=scn.nextInt();
		System.out.println("Enter Second Number");
		int second=scn.nextInt();
		int sum=add(first,second); 
		System.out.println(sum);
	}

}
