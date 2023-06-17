package Arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

//        int[] arr=new int[n];
//
//        for(int i=0;i<n;++i){
//            arr[i]=scn.nextInt();
//        }
//
////        for(int i=0;i<n;++i){
////            System.out.println(arr[i]);
////        }
//        for(int i: arr){
//            System.out.println(i);
//        }

        String[] names=new String[n];

        for(int i=0;i<n;++i){
            names[i]= scn.next();
        }

        for(String j:names)
            System.out.println(j);
    }

}
