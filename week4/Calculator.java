package week4;

import java.util.Scanner;
public class Calculator {
	/**
	 * 무작위 실수 두 개와 4가지 연산자 중 하나를 골라 입력하면 그에 맞는 연산을 해주는 프로그램.
	 * 만약 지원하지 않는 연산자를 입력하거나 오타 발생 시 사용자에게 알리고 프로그램을 종료한다.
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력: ");
		double num_1 = sc.nextDouble();
		double num_2 = sc.nextDouble();
		System.out.print("연산(+ - * /): ");
		String kindOfOper = sc.next();
		sc.close();
		switch(kindOfOper) {
		case ("+"): System.out.printf("%.1f + %.1f = %.2f", num_1, num_2, num_1+num_2); break;
		case ("-"): System.out.printf("%.1f - %.1f = %.2f", num_1, num_2, num_1-num_2); break;
		case ("*"): System.out.printf("%.1f * %.1f = %.2f", num_1, num_2, num_1*num_2); break;
		case ("/"): System.out.printf("%.1f / %.1f = %.2f", num_1, num_2, num_1/num_2); break;
		default: System.out.print("지원하지 않는 연산입니다."); break;
		}
	}

}
