package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();

        boolean found=linearSearch(arr,x);

        if(found==true){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }

    static boolean linearSearch(int[] arr,int x){
        for(int i=0;i<arr.length;++i){
            if(arr[i]==x)
                return true;
        }
        return false;
    }
}
