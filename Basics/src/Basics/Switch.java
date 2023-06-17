package Basics;

import java.util.*;

public class Switch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String fruit = scn.next();
		
		switch(fruit) {
			default: System.out.println("No Fruit");
			case "Mango" : System.out.println("King of fruit");
							break;
			case "Apple" : System.out.println("Red fruit");
							break;
			case "Ice" : System.out.println("Ice Cream");
							break;
		}
	}

}
