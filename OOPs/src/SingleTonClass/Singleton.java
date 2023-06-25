package SingleTonClass;

public class Singleton {
    private Singleton(){

    }

    int a=4;
    int b=4;

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
