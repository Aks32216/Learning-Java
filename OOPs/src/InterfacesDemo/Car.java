package InterfacesDemo;

public class Car implements Brake,Engine,Media{

    @Override
    public void start(){
        System.out.println("I start a like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I stop a like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("I accelarate a like a normal car");
    }

    @Override
    public void brake(){
        System.out.println("I brake a like a normal car");
    }
}
