package Introduction;

class CellPhone{
    void ring(){
        System.out.println("Ringing.....");
    }

    void vib(){
        System.out.println("Vibrating...");
    }
}

public class Intro3 {
    public static void main(String[] args) {
        CellPhone c1=new CellPhone();

        c1.ring();
        c1.vib();
    }
}
