package Functions;

public class Shadowing {
	
	static int x=90;
	
	public static void main(String[] args) {
		System.out.println(x);
		x=35;
		int x;
		x=40;
		System.out.println(x);
		{
			x=30;
		}
		System.out.println(x);
		fun();

	}
	
	static void fun() {
		System.out.println(x);
	}

}
