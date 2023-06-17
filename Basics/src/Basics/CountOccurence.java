package Basics;

import java.util.*;

public class CountOccurence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long num=scn.nextLong();
		int count=0;
		while(num!=0) {
			if(num%10==7)
				count++;
			num/=10;
		}
		System.out.println(count);
	}

}
