package InterfacesDemo;

interface Base{
    void meth1();
    void meth2();
}

interface Child extends Base{
    void meth3();
    void meth4();
}

class CellPhone implements Child{
    @Override
    public void meth1() {
        System.out.println("Meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("Meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth 4");
    }
}

public class InheritanceInInterface {
    public static void main(String[] args) {
        CellPhone m1=new CellPhone();

        m1.meth1();
        m1.meth2();
        m1.meth3();
        m1.meth4();
    }
}
