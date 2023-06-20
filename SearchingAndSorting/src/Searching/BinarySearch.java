package Searching;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
//        int index=binSearch(arr,target);
//        if(index!=-1){
//            System.out.println("Element Found at : "+index);
//        }else{
//            System.out.println("Element Not Found");
//        }
         int index=orderAgnosticBinSearch(arr,target);
         if(index!=-1){
             System.out.println("Element Found at : "+index);
         }else{
             System.out.println("Element Not Found");
         }
    }

    static int orderAgnosticBinSearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        int order=(arr[0]<=arr[end])?1:0;
        System.out.println(order);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                if(order==1)
                    end=mid-1;
                else
                    start=mid+1;
            }else{
                if(order==1)
                    start=mid+1;
                else
                    end=mid-1;
            }

        }
        return -1;
    }

    static int binSearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
