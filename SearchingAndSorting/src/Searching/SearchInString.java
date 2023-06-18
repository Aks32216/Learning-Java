package Searching;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String s=scn.next();
        char target=scn.next().charAt(0);

        boolean found=searchString(s,target);

        if(found){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

    static boolean searchString(String s,char target){
        for(char i:s.toCharArray()){
            if(i==target)
                return true;
        }
        return false;
    }
}
