package week7;

import java.util.*;
public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String ran_num = sc.next(); sc.close();
		int num_lenth = ran_num.length();
		System.out.printf("길이: %d\n", num_lenth);
		
		for(int k=0; k<num_lenth; k++) {
			System.out.print(ran_num.charAt(k) + " ");
		}
	}
}
