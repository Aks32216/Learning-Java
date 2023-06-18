package Searching;

import java.util.Scanner;

public class FindEvenDigits {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        int evenDigits=findEvenDigits(arr);
        System.out.println(evenDigits);
    }

    static int findEvenDigits(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;++i){
            int num=arr[i];
            int digit=0;
            while(num>0){
                num/=10;
                digit++;
            }
            if(digit%2==0)
                count++;
        }
        return count;
    }
}
