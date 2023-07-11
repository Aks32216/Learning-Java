package InterfacesDemo;

public class ElecEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Elec start");
    }
    @Override
    public void stop(){
        System.out.println("Elec stop");
    }
    @Override
    public void acc(){
        System.out.println("Elec acc");
    }
}
