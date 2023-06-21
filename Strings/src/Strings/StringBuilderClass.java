package Strings;

import java.io.PrintStream;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder();
        StringBuilder st1=new StringBuilder();

        st.append("amish");
        System.out.println(st);
        st1.append("amish");
        System.out.println(st1);
        // same value but not same reference
//        if(st1==st){
//            System.out.println("Same reference");
//        }else{
//            System.out.println("No same reference");
//        }
//
//        System.out.println(st1.compareTo(st));
//
//        if(st1.compareTo(st)==0){
//            System.out.println("Same reference");
//        }else{
//            System.out.println("No same reference");
//        }
//        st.reverse();
//        System.out.println(st);
//        System.out.println(st.delete(1,3));
//        System.out.println(st);
    }
}
