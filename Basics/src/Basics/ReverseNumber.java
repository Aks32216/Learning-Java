package Basics;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		long newNum=0;
		while(num!=0) {
			newNum=newNum*10+num%10;
			num/=10;
		}
		System.out.println(newNum);
	}

}