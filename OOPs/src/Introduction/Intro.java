package Introduction;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        Student st=new Student();
        System.out.println(st.roll+" "+st.name+" "+st.marks);
        st.roll=1;
        st.name="Amish";
        st.marks=14.43f;
        System.out.println(st.roll+" "+st.name+" "+st.marks);
        Student st1=new Student(2,"Anjum",54.5f);
        System.out.println(st1.roll+" "+st1.name+" "+st1.marks);
        st1.greet();
        st.greet();
        Student st2=new Student(st1);
        System.out.println(st2.roll+" "+st2.name+" "+st2 .marks);

        Student st3=st;
        System.out.println(st3.roll+" "+st3.name+" "+st3 .marks);



    }
}

class Student{
    int roll;
    String name;
    float marks;

    Student(){
        roll=5;
        name="Amish Kumar";
        marks=98.9f;
    }

    Student(int roll,String name,float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    Student(Student st){
        this.name=st.name;
        this.roll=st.roll;
        this.marks=st.marks;
    }

    void greet(){
        System.out.println("Hello my name is "+name);
    }

    // destructor explicitly cannot be defined
    // but what can be done while destructing can be said to java
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
