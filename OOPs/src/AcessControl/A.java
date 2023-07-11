package AcessControl;

public class A {
    private int num;
    protected String name;
    int[] arr;

    public A(int num,String name,int[] arr){
        this.num=num;
        this.name=name;
        this.arr=arr;
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getNum() {
        return num;
    }
}
