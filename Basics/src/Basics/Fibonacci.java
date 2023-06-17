package Basics;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int first=0;
		int second=1;
		int third;
		System.out.print("Enter the value of n: ");
		int n=scn.nextInt();
		for(int i=1;i<=n;++i) {
			System.out.print(first+" ");
			third=second+first;
			first=second;
			second=third;
		}
	}

}
