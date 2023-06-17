package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        ArrayList<Integer> arr=new ArrayList<>(12);
//        System.out.println(arr);
//        arr.add(45);
//        arr.add(54);
//        arr.add(65);
//        arr.add(987);
//        arr.add(1344);
//        arr.add(287585);

        // adding element to specific index
//        System.out.println(arr);
//        arr.add(2,43);
//        System.out.println(arr);

        // getting element from specific index
//        int elem=arr.get(5);
//        System.out.println(elem);

        // if elem is present in it or not
//        System.out.println(arr.contains(54));

//        for(int i=0;i<arr.size();++i){
//            System.out.println(arr.get(i));
//        }

//        for(int i=0;i<6;++i){
//            arr.add(scn.nextInt());
//        }
//
//        for(Integer i:arr){
//            System.out.println(i);
//        }

        ArrayList<ArrayList<Integer>> mat=new ArrayList<>(4);

        for(int i=0;i<4;++i){
            mat.add(new ArrayList<>());
        }

        for(int i=0;i<mat.size();++i)
        {
            for(int j=0;j<4;++j){
                System.out.println("hello");
                mat.get(i).add(scn.nextInt());
            }
        }

        for(ArrayList<Integer> i:mat){
            for(Integer j:i){
                System.out.println(j);
            }
        }
    }

}
