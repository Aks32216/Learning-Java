package Arrays;

public class Introduction {
    public static void main(String[] args) {
        // suppose we want to store a series of number
        int math=87;
        int english=98;
        // etc

        // also store a series of name

        String a="amish";
        String b="rashmi";
        // now lets say we need to store 6000 name or number
        // here array helps
        // it is a collection of a particular data type

        // syntax
        // datatype[] varname=new datatype[size];
        // so to store 5 marks
        int[] marks=new int[5];
        int[] marks2={1,2,3,4,5};
        String[] names=new String[4];
//        System.out.println(marks[4]);
//        System.out.println(marks2[4]);
//
//        marks[4]=98;
//        System.out.println(marks[4]);
//        System.out.println(marks2[4]);

        for(int i=0;i<5;++i){
            System.out.println(marks2[i]);
        }

        for(int i=0;i<4;++i){
            System.out.println(names[i]);
        }


    }
}
