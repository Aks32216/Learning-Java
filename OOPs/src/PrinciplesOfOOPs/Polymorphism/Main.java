package PrinciplesOfOOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes sh=new Shapes();
        Shapes c=new Circle();
        Shapes sq=new Square();

        sh.area();
        c.area(); // overrides the method in Shapes
        sq.area();
        // if final keyword is added to a variable then it can only be initialized once and then cannot be changed
        // if final keyword is added to a function then it cannot be overridden by its subclasses
        // if final keyword is used to a class then it prevents inheritance
        // if added then all the methods of the class automatically adds final to themselves
//        sq.display(); error as sq does not have access to methods and variables of child

        // static methods cannot be overridden but can be inherited
    }
}
