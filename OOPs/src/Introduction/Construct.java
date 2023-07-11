package Introduction;

// constructors are the one which help us to set initial values to the class variables
// constructors are of following type:

// default - if no parameter is provided during class creation then default constructor is used for initialization
// if not provided compiler provides a default one

// parameterized const -- if parameters are passed into constructors, then this is used for initialization

class MyEmployee1{
    private int id;
    private String name;

    // Default Constructor
    MyEmployee1(){
        id=19;
        name="Anshuman";
    }

    // parameterized constructor
    MyEmployee1(int id,String name){
        this.id=id;
        this.name=name;
    }

    MyEmployee1(MyEmployee1 emp){
        this.id=emp.id;
        this.name=emp.name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }
}

public class Construct {
    public static void main(String[] args) {
        MyEmployee1 e1=new MyEmployee1();
        System.out.println(e1.getId()+" "+e1.getName());
        MyEmployee1 e2=new MyEmployee1(15,"Amartya");
        System.out.println(e2.getId()+" "+e2.getName());

        MyEmployee1 e3=new MyEmployee1(e2);
        System.out.println(e2.getId()+" "+e2.getName());
    }
}
