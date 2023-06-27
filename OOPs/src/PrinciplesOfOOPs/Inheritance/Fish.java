package PrinciplesOfOOPs.Inheritance;

public class Fish extends Species{
    int fins;
    int tail;

    Fish(){
        fins=2;
        tail=1;
    }

    Fish(int fins,int tail,int age){
        super(age);
        this.fins=fins;
        this.tail=tail;
    }

    public void display(){
        System.out.println("Fishes have "+fins+" find and "+tail+" tail.");
        super.display();
    }
}
