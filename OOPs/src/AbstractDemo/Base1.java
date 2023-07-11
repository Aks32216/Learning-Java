package AbstractDemo;

abstract class Base2 {
    public Base2(){
        System.out.println("Base1 constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Derived1 extends Base2{
    @Override
    public void greet(){
        System.out.println("Ni hao");
    }
}

public class Base1{
    public static void main(String[] args) {
//        Base2 b=new Base2(); cannot be instantiated as it is a abstract class
        Base2 c=new Derived1();

        c.greet();
    }
}

