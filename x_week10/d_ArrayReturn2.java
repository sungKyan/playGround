package x_week10;

import java.util.Arrays;

public class d_ArrayReturn2 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(makeArray()));
		
		
		for(int k=1; k<=10; k++) {
			System.out.println(Arrays.toString(makeArray(k)));
		}
		
	}
	 
	static int[] makeArray() {
		int[] factory_arr = new int[10];
		for(int k=0; k<10; k++) {
			factory_arr[k] = k*k;
		}
		return factory_arr;
	}
	
	static int[] makeArray(int n) {
		int[] factory_arr = new int[n];
		for(int t=0; t<n; t++) {
			factory_arr[t] = t*t;
		}
		return factory_arr;
	}
}
