package week2;

import java.util.Scanner;

public class Summation3 {
	public static void main (String[] args) {
		System.out.print("1부터 얼마까지의 짝수를 더하시겠습니까? ");
		Scanner sc = new Scanner(System.in);
		int ran_num = sc.nextInt();
		sc.close();
		int sum = 0;
		System.out.printf("첫 방법: 1부터 %d까지의 짝수의 합 = ", ran_num);
		for(int k = 2; k<=ran_num; k += 2) {
			sum += k;
		}
		System.out.println(sum);
		
		sum = 0;
		
		System.out.println();
		System.out.printf("두 번째 방법: 1부터 %d까지의 짝수의 합 = ", ran_num);
		for(int k = 1; k<=ran_num; k++) {
			if(k%2 == 0) {
				sum += k;
			}
		}
		System.out.println(sum);
	}
}
