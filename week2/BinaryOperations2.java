package week2;

import java.util.Scanner;
public class BinaryOperations2 { //못풀겠음
	public static void main (String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("실수를 두 개 입력하시오: ");
		double num1 = sc1.nextDouble();
		double num2 = sc1.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", num1,num2,num1+num2);
		System.out.println();
		System.out.printf("%.2f - %.2f = %.2f\n", num1,num2,num1-num2);
		System.out.println();
		System.out.printf("%.2f * %.2f = %.2f\n", num1,num2,num1*num2);
		System.out.println();
		System.out.printf("%.2f / %.2f = %.2f\n", num1,num2,num1/num2);
		sc1.close();
	}
}
