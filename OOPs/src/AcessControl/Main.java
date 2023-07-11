package AcessControl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj=new A(32,"Amish",new int[]{1,2,3,4,5});
//        System.out.println(Arrays.toString(obj.arr));
//        System.out.println(obj.num); // private not accesible outside class
        System.out.println(obj.getNum());
        obj.setNum(14);
        System.out.println(obj.getNum());
        System.out.println(obj.name );
    }
}
