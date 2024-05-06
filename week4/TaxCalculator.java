package week4;

import java.util.Scanner;
public class TaxCalculator {
	/**
	 * 4600만원, 8800만원 마다 누진세가 적용되는 경우, 소득을 입력하면 자동으로 소득세가 출력되도록 하는 프로그램.
	 * 소득세는 소수점 두 번째 자리에서 반올림되게 한다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE_LOW = 15.0/100.0;
		final double TAX_RATE_MID = 24.0/100.0;
		final double TAX_RATE_HIGH = 35.0/100.0;
		System.out.print("소득(만원단위 정수): ");
		double income = sc.nextDouble();
		sc.close();
		double tax = 0;
		
		if(income<=0) {
			tax = 0;
		}
		else if(income<=4600) {
			tax = income*TAX_RATE_LOW;
		}
		else if(income<=8800) {
			tax = 4600*TAX_RATE_LOW + (income-4600)*TAX_RATE_MID;
		}
		else {
			tax = 4600*TAX_RATE_LOW + (8800-4600)*TAX_RATE_MID + (income-8800)*TAX_RATE_HIGH;
		}
		
		System.out.printf("소득세 = %.1f만원", tax);
	}

}
