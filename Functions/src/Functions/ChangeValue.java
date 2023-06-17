package Functions;

import java.util.*;

public class ChangeValue {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		changeArr(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void changeArr(int[] num) {
		num[0]=998;
	}
}
