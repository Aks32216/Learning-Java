package Introduction;


class Employee1{
    int salary;
    String name;

    Employee1(){
        this.salary=0;
        this.name="";
    }

    Employee1(int salary,String name){
        this.salary=salary;
        this.name=name;
    }

    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }
}

public class intro3 {
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        e1.setName("Anshuman");
        System.out.println(e1.getSalary()+" "+e1.getName());

        Employee1 e2=new Employee1(28998,"Amish");
        System.out.println(e2.getSalary()+" "+e2.getName());

        e2.setName("Anish");
        System.out.println(e2.getSalary()+" "+e2.getName());
    }
}
