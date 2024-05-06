package week3;

import java.util.Scanner;

public class SumAverage2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean end = false;
		int sum = 0;
		int count = 0;
		int num;
		System.out.println("평균을 구하는 프로그램");
		System.out.println("0 이상 정수를 여러 개 입력하시오.");
		System.out.println("입력을 마치려면 음의 정수를 입력하시오.");

		while(!end) {
			num = sc.nextInt();
			if(num >= 0) {
				sum = sum + num;
				count++;
			}
			else {
				end = true;
			}
		}
		double f_sum = sum;
		System.out.printf("입력된 0 이상 정수 갯수 = %d\n", count);
		if(count > 0) {
			System.out.printf("정수의 합 = %d\n", sum);
			System.out.printf("평균 = %.2f", f_sum/count);
		}
		
		sc.close();
	}
}
