package Introduction;

import java.util.Scanner;

class Game{
    int num;
    int score;

    Game(){
        score=0;
        num=(int)(Math.random()*(99))+1;
    }

    int getInput(int n){
        int val=isCorrect(n);
        score++;
        return val;
    }

    int isCorrect(int n){
        if(n==num)
            return 1;
        else if(n<num)
            return 0;
        else
            return 2;
    }

    int getScore(){
        return score;
    }

    int getNum(){
        return num;
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Game g1=new Game();

        System.out.println(g1.getNum());

        while(true){
            System.out.println("Enter a Number: ");
            int num=scn.nextInt();
            int val=g1.getInput(num);
            if(val==1)
                break;
            else if(val<1)
                System.out.println("No is smaller.");
            else
                System.out.println("No is larger.");
        }

        System.out.println(g1.getScore());
    }
}
