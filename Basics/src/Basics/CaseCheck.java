package Basics;

import java.util.*;

public class CaseCheck {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		String st=scn.next().trim();
		char ch=st.charAt(0);
		if(Character.isUpperCase(ch))
			System.out.println("Upper case");
		else
			System.out.println("Lower Case");
		
		if(ch>='a' && ch<='z')
			System.out.println("Upper Case)");
		else
			System.out.println("Lower case");
		
	}

}
