package AbstractDemo;

public class Child extends Parent{
    @Override
    void carrer(String name) {
        System.out.println("I want to be a "+name);
    }

    @Override
    void partner(String name){
        System.out.println("My life Partner is "+name);
    }
}
