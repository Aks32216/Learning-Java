package Searching;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=scn.nextInt();
            }
        }
        int x=findRichest(mat);
        System.out.println(x);
    }

    static int findRichest(int[][] mat){
        int maxWealth=Integer.MIN_VALUE;
        int richest=-1;
        for(int i=0;i<mat.length;++i){
            int curWealth=0;
            for(int j=0;j<mat[i].length;++j){
                curWealth+=mat[i][j];
            }
            if(curWealth>maxWealth){
                maxWealth=curWealth;
                richest=i;
            }
        }
        return richest;
    }
}
