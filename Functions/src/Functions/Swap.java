package Functions;

public class Swap {
	
	// java only excepts pass by value and not pass by method
	
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void changeName(String name) {
		name="Amish";
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
//		swap(a,b);
//		System.out.println(a+" "+b);
		String name="Amish Kumar Singh";
		changeName(name);
		System.out.println(name);
	}

}
