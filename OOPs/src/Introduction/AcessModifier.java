package Introduction;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id=i;
    }
}

// private - accesible only within same class
// public - accesible in sameClass, same PackageSubClass, SamePackageNonSubClass, Different Package subcalss, different package non-subclass
// protected - accesbile in sameClass, same PackageSubClass, SamePackageNonSubClass, Different packageSubclass, but not in different package non subclass
// default - accesible in same class, same package subclass, samepackage nonSubClass, but not accesible in different package

public class AcessModifier {
    public static void main(String[] args) {
        MyEmployee Amish=new MyEmployee();

        System.out.println(Amish.getId());
        System.out.println(Amish.getName());

        Amish.setId(54);
        Amish.setName("Anshuman");

        System.out.println(Amish.getId());
        System.out.println(Amish.getName());
    }
}
