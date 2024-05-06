package week6;

import java.util.Scanner;

public class NumberOfDigitsTest {
	/**
	 * 사용자로부터 0이 아닌 정수를 받고 몇 자리 수인지 출력하는 프로그램.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int integer = sc.nextInt(); sc.close();
		System.out.printf("%d자리 수입니다. ", numberOfDigits(integer));

	}
	
	/**
	 * 10의 n승 값을 리턴하는 메서드
	 * @param n -> 10을 몇 제곱 할 것인지 입력
	 * @return n_power -> 10의 n승 값
	 */
	public static int powerOfTen(int n) {
		int n_power = 1;
		
		for(int k=0; k<n; k++) {
			n_power *= 10;
		}
		
		return n_power;
	}
	
	/**
	 * 파라미터 값이 몇 자리 수인지 구하고 리턴하는 메서드
	 * @param integer -> main메서드에서 사용자가 입력한 정수를 자연수로 변환하여 받음
	 * @return k+1 -> 어떤 수를 10의 n승으로 나눴을 때 1보다 크거나 같다는 것은 n+1 자리 수라는 이야기.
	 */
	public static int numberOfDigits(int integer) {
		if(integer < 0) {
			integer = -integer;
		}
		int k;
		for(k=9; integer/powerOfTen(k)==0; k--);
		
		return k+1;
	}
}



