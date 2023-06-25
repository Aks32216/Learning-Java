package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human h1=new Human(21,"Amish",1110000,false);
        Human h2=new Human(24,"Rahul",11111111,true);
        System.out.println(Human.population);
        h1.display();
        h2.display();
        /*
         if declared without static this will be attached with object
         and hence it will not belong to class
                System.out.println(h1.population);
                System.out.println(h2.population);
         in order to bind a variable to class and not objects static variables are used
        */

        Human.population=540000000;
        System.out.println(Human.population);

        System.out.println(h1.population);
        System.out.println(h2.population);

        h1.population=34;

        System.out.println(Human.population);
        /*
         although accesing and modifying of static variable can be done via object or class
         but convention must be to use class name and not object name
        */

        // greet wont be allowed
//        greet();

        fun();
    }

    static void fun(){
        Main m=new Main();
//        m.main(new String[]{"hello","world"});
        m.greet();
    }


    // things which are not static, belongs to an object and hence we cannot use it inside a static method
    // so in order to access non-static inside static we need to declare a instance of it and then we can use itb
    void greet(){
        System.out.println("Hello world");
    }
}
