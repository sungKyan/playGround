package week2;

import java.util.Scanner;
public class Adder {
	public static void main (String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수를 두 개 입력하시오: ");
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		
		sc1.close();
	}
}
