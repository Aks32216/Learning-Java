package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Child ch=new Child();

        ch.partner("anshuman");
        ch.carrer("Doctor");

        ch.normal();
    // multiple i nheritance is not supported in java
        // interface is used.
    }
}
