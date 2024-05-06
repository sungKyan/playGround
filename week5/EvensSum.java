package week5;

import java.util.Scanner;
public class EvensSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
		boolean done = false;
		while(!done) {
			System.out.print("두 개의 정수를 입력하시오: ");
			int ran_num_1 = sc.nextInt();
			int ran_num_2 = sc.nextInt();
			if(ran_num_1 <= ran_num_2) {
				System.out.printf("%d부터 %d까지의 짝수의 합 = %d\n\n", ran_num_1, ran_num_2, getEvensSum(ran_num_1, ran_num_2));	
			}
			else if(ran_num_2 < ran_num_1) {
				System.out.printf("%d부터 %d까지의 짝수의 합 = %d\n\n", ran_num_2, ran_num_1, getEvensSum(ran_num_2, ran_num_1));
			}
		}
		sc.close();
	}
	public static int getEvensSum(int from, int to) {
		int sum = 0;
		if(from == to) {
			System.out.println("감사합니다. 프로그램을 마칩니다.");
			System.exit(0);
		}
		
		for(int k=from; k<=to; k++) {
			if(k%2 == 0) {
				sum += k;
			}
		}
		
		return sum;
	}

}
