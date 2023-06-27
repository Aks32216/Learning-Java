package PrinciplesOfOOPs.Inheritance;

public class Human extends Species{
    int legs;
    int hands;
    int eyes;

    Human(){
        legs=2;
        hands=2;
        eyes=2;
    }

    Human(int legs,int hands,int eyes,int age){
        super(age);
        this.legs=legs;
        this.eyes=eyes;
        this.hands=hands;
        this.age=age;
    }

    public void display(){
        System.out.println("Human Have "+legs+" legs,"+eyes+" eyes and "+hands+" hands.");
        super.display();
    }
}
