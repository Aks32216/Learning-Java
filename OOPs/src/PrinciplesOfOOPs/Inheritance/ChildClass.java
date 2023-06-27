package PrinciplesOfOOPs.Inheritance;

public class ChildClass extends BaseClass{
    double weight;

    ChildClass(){
        System.out.println("Default const Child");
        this.weight=-1;
    }

    ChildClass(double l,double b,double h,double weight){
        // super keyword is used to invoke parent class constructor
        super(l,b,h);
        System.out.println("Paremetarized const CHild");
        this.weight=weight;
    }

    public void displayWeight(){
        System.out.println(weight);
    }
}
