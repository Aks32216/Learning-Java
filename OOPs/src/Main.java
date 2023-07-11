import AcessControl.A;

public class Main extends A{

    public Main(int num,String name,int[] arr){
        super(num,name,arr);
    }
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        Main obj=new Main(32,"Anshuman",new int[]{1,2,3});
        System.out.println(obj.name);
    }

}