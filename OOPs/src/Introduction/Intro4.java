package Introduction;

class Shape{
    int l;
    int b;

    Shape(int l,int b){
        this.l=l;
        this.b=b;
    }

    Shape(int l){
        this.l=l;
        this.b=l;
    }

    int area(){
        return l*b;
    }

    int perimeter(){
        return 2*(l+b);
    }
}

public class Intro4 {
    public static void main(String[] args) {
        Shape sq=new Shape(4);
        Shape req=new Shape(5,6);

        System.out.println(sq.area()+" "+sq.perimeter());

        System.out.println(req.area()+" "+req.perimeter());
    }
}
