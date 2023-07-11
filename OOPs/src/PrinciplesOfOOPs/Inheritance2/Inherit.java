package PrinciplesOfOOPs.Inheritance2;


class Base{
    int x;

    Base(){
        System.out.println("Inside const base");
    }

    Base(int x){
        System.out.println("Inside base const param");
        this.x=x;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    Derived(){
        System.out.println("Inside const Derived");
    }

    Derived(int y,int x){
        super(x);
        System.out.println("Inside param const derived");
        this.y=y;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inherit {
    public static void main(String[] args) {
//        Derived d=new Derived();
//
//        d.setX(87);
//        d.setY(98);
//
//        System.out.println(d.getX()+" "+d.getY());

//        Base b1=new Base();
        Derived d1=new Derived(45,34);
    }
}
