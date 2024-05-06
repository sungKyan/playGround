package week4;

import java.util.Scanner;
import java.util.Arrays;
public class Sorter {
	/**
	 * 정수 세 개를 입력받아 오름차순으로 출력하는 프로그램.
	 * java.util 패키지에서 자주 사용되는 Arrays 클래스 메소드를 활용함.
	 * [^0-9]로 작성할 시, 음수기호와 띄어쓰기 마저 ""로 replace되기 때문에 음수기호와 띄어쓰기도 replace로부터 제외되도록 작성함. <-- [^0-9 -] 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 세 개: ");
		int[] num = new int[3];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		sc.close();
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num).replaceAll("[^0-9 -]", ""));
	}

}
