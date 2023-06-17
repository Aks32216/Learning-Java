package Arrays;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }

        int max=FindMax(arr);

        System.out.println(max);
    }

    public static int FindMax(int[] arr){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;++i){
            max=Math.max(max,arr[i]);
        }
        return max;

    }
}
