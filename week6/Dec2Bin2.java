package week6;

import java.util.Scanner;

public class Dec2Bin2 {
	
	/**
	 * 사용자로부터 자연수를 받아와 2진수로 변환하는 프로그램.
	 * 
	 * 저번에 똑같은 기능을 구현했던 Class에서는 메서드를 나누지 않았다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 십진수로 입력하시오: ");
		int dec_num = sc.nextInt(); sc.close();
		System.out.println(toBinary(dec_num));
	}
	
	/**
	 * 주어진 수보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수를 구하는 메서드.
	 * 
	 * @param n <-- 사용자가 입력한 수 (1이상 정수)
	 * @return power <-- n보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수.
	 */
	public static int maxPower(int n) {
		
		int power = 1;
		while(power <= n/2) {
			power *= 2;
		}
		
		return power;
	}
	/**
	 * 십진수를 이진수로 변환하여 문자열로 만든다.
	 * 십진수는 자연수이다.
	 * @param dec <-- 사용자가 입력한 자연수.(10진수형태의)
	 * @return binary <-- 이 메소드가 최종 만들어낸 이진수 문자열.
	 */
	public static String toBinary(int dec) {
		
		String binary = "";
		
		int power = maxPower(dec);
		while(power >= 1) {
			if(dec >= power) {
				binary = binary + "1";
				dec -= power;
			}
			else {
				binary = binary + "0";
			}
			power /= 2;
		}
		return binary;
	}
}

