package Basics;

import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// certain types are compatible to each other
		// and are interconvertible like int -> float
		// such type conversions are done automatically
		// and is called implicit conversion
//		float num=scn.nextFloat();
//		System.out.println(num);
//		
//		int nums=(int)56.98f;
//		System.out.println(nums);
		
//		int number='A';
//		System.out.println(number);
		
		// type promotion rules
//		1. all the byte, short, character is promoted to int
//		2. if expression contain a higher type then entire expression is converted to higher type
		
		
		byte b=42;
		char c='a';
		short s=1024;
		int i=50000;
		float f=5.67f;
		double d=0.12345;
		double result=(f*b)+(f/c)-(d-s);
		System.out.println(result);
		
	}

}
