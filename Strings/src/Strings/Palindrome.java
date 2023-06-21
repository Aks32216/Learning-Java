package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String st=scn.next();

        for(int i=0,j=st.length()-1;i<=j;i++,j--){
            if(st.charAt(i)==st.charAt(j))
                continue;
            else
                System.out.println("Not a Palindrome");
        }
        System.out.println("Palindrom");
    }
}
