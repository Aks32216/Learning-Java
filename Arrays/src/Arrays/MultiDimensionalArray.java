package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // multidimensional arrays are arrays stored in array
        // syntax
        // datatype[][] varname=new datatype[rows(compulsory)][cols(optional)]

        Scanner scn=new Scanner(System.in);

        int[][] mat=new int[3][3];

        for(int i=0;i<mat.length;++i){
            for(int j=0;j<mat[i].length;++j){
                mat[i][j]=scn.nextInt();
            }
        }

        for(int[] i:mat){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(mat[1]));
        System.out.println(Arrays.toString(mat[2]));
    }
}
