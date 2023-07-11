package InterfacesDemo;

import java.util.*;

interface Camera{
    void takeSnap();
    void recordVideo();

    default void record4kVideo(){
        System.out.println("Recording in 4k video");
    }
}

interface  Wifi{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phNo){
        System.out.println("Calling "+phNo);
    }

    void pickCall(int phNo){
        System.out.println("Picking"+phNo);
    }
}

class MySmartPhone extends MyCellPhone implements Camera,Wifi{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }

    public void recordVideo(){
        System.out.println("Recording Video");
    }

    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] netList={"Amish","Anish","Anshuman"};
        return netList;
    }

    public void connectNetwork(String network){
        System.out.println("Connecting to "+network);
    }

//    public void record4kVideo(){
//        System.out.println("record 4k video in smartphone");
//    }
}
public class Interface2 {
    public static void main(String[] args) {
        MySmartPhone m1=new MySmartPhone();
        System.out.println(Arrays.toString(m1.getNetworks()));
        m1.record4kVideo();
    }
}
