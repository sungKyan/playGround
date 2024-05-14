package x_week10;

import java.util.*;

public class c_ArrayReturn {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(makeArray()));
		
	}
	
	static int[] makeArray() {
		int[] factory_arr = new int[10];
		for(int k=0; k<10; k++) {
			factory_arr[k] = k*k;
		}
		return factory_arr;
	}

}

