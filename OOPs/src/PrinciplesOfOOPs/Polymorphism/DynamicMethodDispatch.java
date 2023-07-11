package PrinciplesOfOOPs.Polymorphism;

class One{
    public void name(){
        System.out.println("My name is java in one");
    }

    public void greet(){
        System.out.println("GM");
    }
}

class Two extends One{
    public void name(){
        System.out.println("My name is java in two");
    }

    public void swagat(){
        System.out.println("Swagatam");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        One obj=new One();
//        obj.name();
//        obj.greet();

        One obj=new Two();

        obj.greet();
        obj.name();
    }
}
