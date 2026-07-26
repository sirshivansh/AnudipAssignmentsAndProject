package arrayfrequency;

import java.util.ArrayList;

class Employee {
	private int id;
	private String name;

	// ctrl+shift+f
}

public class ArrayVsCollection{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(arr[2]); //0
		
		Integer[] arr2 = {1,2,3,4};
		System.out.println(arr2[2]); //null
		
		//int mobile = 9876543210;
		long mobile = 9876543210L;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		float x = 3.5F;
		double y = 3.5;
	}
}
