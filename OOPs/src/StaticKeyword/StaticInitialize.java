package StaticKeyword;

// demo to show initialization of static variables
public class StaticInitialize {
    static int a=4;
    static int b;

    // static block runs only once i.e when first class is loaded
    static {
        System.out.println("Inside static block");
        b=a*5;
    }

    public static void main(String[] args) {
        System.out.println(StaticInitialize.b);
        StaticInitialize obj=new StaticInitialize();

        System.out.println(StaticInitialize.a+" "+StaticInitialize.b);

        StaticInitialize.b+=3;

        StaticInitialize obj2=new StaticInitialize();
        System.out.println(StaticInitialize.a+" "+StaticInitialize.b);
    }
}
