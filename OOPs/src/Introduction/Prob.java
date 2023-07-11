package Introduction;

class Cylinder{
    private int radius;
    private int height;


    Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    void setRadius(int radius){
        this.radius=radius;
    }

    void setHeight(int height){
        this.height=height;
    }

    int getRadius(){
        return radius;
    }

    int getHeight(){
        return height;
    }

    double SA(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    

    double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Prob {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder(54,65);

//        c1.setHeight(43);
//        c1.setRadius(54);

        System.out.println(c1.getHeight()+" "+c1.getRadius());
        System.out.println(c1.SA()+" "+c1.volume());
    }
}
