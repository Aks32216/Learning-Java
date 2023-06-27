package PrinciplesOfOOPs.Inheritance;

public class Species {
    int age;

    Species(){
        age=-1;
    }

    Species(int age){
        this.age=age;
    }

    public void display(){
        System.out.println("Age of the Specie is "+age);
    }
}
