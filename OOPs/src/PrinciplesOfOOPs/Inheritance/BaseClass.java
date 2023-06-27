package PrinciplesOfOOPs.Inheritance;

public class BaseClass {
    double l;
    double b;
    double h;

    BaseClass(){
        System.out.println("Default Const Base");
        l=0;
        b=0;
        h=0;
    }

    static void greeting(){
        System.out.println("Hi from the base class");
    }

    // cubiod
    BaseClass(double l,double b,double h){
        System.out.println("Parameterized cons Base");
        this.l=l;
        this.b=b;
        this.h=h;
    }

    // cube
    BaseClass(double side){
        System.out.println("Parameterized cons Base");
        this.l=side;
        this.b=side;
        this.h=side;
    }

    BaseClass(BaseClass b){
        this.h=b.h;
        this.l=b.l;
        this.b=b.b;
    }

    public void displayInfo(){
        System.out.println(l+" "+b+" "+h);
    }

}
