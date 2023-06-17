package Functions;

public class Greeting {

	static String greet() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<=10;++i) {
			String g=greet();
			System.out.println(g);
		}

	}

}
