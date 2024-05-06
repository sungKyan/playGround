package week5;

import java.util.Scanner;

public class Summations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마 이하의 자연수를 더하시겠습니까? ");
		int limit = sc.nextInt(); sc.close();
		System.out.println(limit + " 이하 자연수의 합 = " + sum(limit));
	}
	
	public static int sum(int upto) {
		int sum = 0;
		for(int k=0; k<=upto; k++) {
			sum += k;
		}
		return sum;
	}

}
