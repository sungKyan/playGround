package week2;

import java.util.Scanner;

public class MultipleAdder {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수를 몇 개 더하시겠습니까? ");
		int count = sc.nextInt();
		
		System.out.printf("%d개의 정수를 차례로 입력하시오: ", count);
		for(int k=0; k<count; k++) {
			sum += sc.nextInt();
		}
		System.out.printf("정수의 합 = %d", sum);
		sc.close();
	}
}
