package InterfacesDemo;

public class PowEngine implements Engine{
    @Override
    public void start(){
        System.out.println("PW start");
    }
    @Override
    public void stop(){
        System.out.println("PW stop");
    }
    @Override
    public void acc(){
        System.out.println("PW acc");
    }
}
