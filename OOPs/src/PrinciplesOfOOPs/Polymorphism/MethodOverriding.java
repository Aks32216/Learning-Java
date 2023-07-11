package PrinciplesOfOOPs.Polymorphism;

class A{
    public  int a;

    public int getA(){
        return a;
    }

    public void meth2(){
        System.out.println("I am inside base class");
    }
}

class B extends A{
    public void meth2(){
        System.out.println("I am inside derived class");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        A a=new A();

        a.meth2();

        A a1=new B();
        a1.meth2();
    }
}
