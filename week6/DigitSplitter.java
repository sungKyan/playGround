package week6;

import java.util.Scanner;
public class DigitSplitter {
	//이전에 작성했던 클래스를 활용하여 몇 자리 수인지, 각각의 자리수의 숫자는 무엇인지 출력합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt(); sc.close();
		if(input < 0) {
			input = -input;
		}
		int digits = NumberOfDigitsTest.numberOfDigits(input); //사용자가 입력한 값과 자리수 계산.
		
		System.out.printf("%d자리 수입니다.\n",digits);
		
		for(int k=digits-1; k>=0; k--) { 
			System.out.printf("%d ",input/NumberOfDigitsTest.powerOfTen(k)); //4321 일경우, 1000으로 나눠서 4를 출력.
			input = input - (input/NumberOfDigitsTest.powerOfTen(k))*NumberOfDigitsTest.powerOfTen(k); //4*1000 =4000 빼고 300 저장.
		}
	}

}
