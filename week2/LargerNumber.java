package week2;

import java.util.Scanner;
public class LargerNumber {
	public static void main (String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수를 두 개 입력하시오: ");
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		sc1.close();
		
		if(num2<num1) {
			System.out.printf("더 큰 수는 %d입니다.\n", num1);	
		}
		else if(num1<num2) {
			System.out.printf("더 큰 수는 %d입니다.\n", num2);
		}
		else {
			System.out.printf("두 수는 같습니다.");
		}
	}
}
