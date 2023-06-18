package Searching;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();

        for(int i=0;i<n;++i){
            mat.add(new ArrayList<>());
            for(int j=0;j<m;++j){
                mat.get(i).add(scn.nextInt());
            }
        }
        int target=scn.nextInt();
        boolean found=searchMatrix(mat,target);

        if(found){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat,int target){
        for(int i=0;i<mat.size();++i){
            for(int j=0;j<mat.get(i).size();++j){
                if(mat.get(i).get(j)==target)
                    return true;
            }
        }
        return false;
    }

}
