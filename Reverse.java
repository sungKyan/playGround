package week9;

import java.util.*;
public class Reverse {
	//배열에 넣은 int형 정수 10개를 역순으로 출력함.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n_array = new int[10];
		for(int k=0; k<10; k++) {
			n_array[k] = sc.nextInt();
		}
		sc.close();
		
		System.out.print("정수 10개: ");
		for(int k=n_array.length; k>0; k--) {
			System.out.printf("%d ", n_array[k-1]);
		}
	}
}
