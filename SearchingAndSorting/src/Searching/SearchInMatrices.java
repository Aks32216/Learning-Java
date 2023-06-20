package Searching;

import java.util.*;

public class SearchInMatrices {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n,m;
        n=scn.nextInt();
        m=scn.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=scn.nextInt();
            }
        }

        int target=scn.nextInt();

        int[] pos=findElem(mat,target);
        System.out.println(pos[0]+" "+pos[1]);
    }

    static int[] findElem(int[][] mat,int target){
        int r=0,c=mat[0].length-1;
        while(r<mat.length && c>=0){
            if(mat[r][c]==target){
                return new int[]{r,c};
            }else if(mat[r][c]>target) {
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
