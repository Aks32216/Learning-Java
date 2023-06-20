package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        // when no are in range [1,N] apply it
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        for(int i=0;i<arr.length;++i){
            if(i+1==arr[i])
                i++;
            else{
                int index=arr[i]-1;
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
