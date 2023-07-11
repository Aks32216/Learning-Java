package Introduction;


class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}

public class Intro2 {
    public static void main(String[] args) {
        Employee Amish=new Employee();
        Amish.id=13;
        Amish.name="Amish";
        Amish.salary=120000;

        Amish.printDetails();

        Employee john=new Employee();

        john.id=13;
        john.name="Anshuman";
        john.salary=19000;
        john.printDetails();

    }
}
