package Searching;

import java.util.Scanner;

public class MaxPopulationYear {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int[][] logs=new int[n][2];
        for(int i=0;i<n;++i){
            logs[i][0]=scn.nextInt();
            logs[i][1]=scn.nextInt();
        }
        int year=maximumPopulation(logs);
        System.out.println(year);
    }
    static int maximumPopulation(int[][] logs) {
        int[] hash=new int[101];
        for(int i=0;i<logs.length;++i){
            hash[logs[i][0]-1950]++;
            hash[logs[i][1]-1950]--;
        }
        int maxPopulation=0;
        int year=1950;
        for(int i=1;i<101;++i){
            hash[i]=hash[i]+hash[i-1];
            System.out.print(hash[i]+" ");
            if(hash[i]>maxPopulation){
                maxPopulation=hash[i];
                year=i+1950;
            }
        }
        return year;
    }
}
