package week3;

import java.util.Scanner;

public class Increase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 하나 입력하시오: ");
		int limit = sc.nextInt();
		int count = 0;
		System.out.println("첫번째 방법");
		for(int k=0; k<=limit; k++) {
			System.out.print(k+"\t");
			count++;
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
		System.out.println();
		System.out.println("두번째 방법");
		for(int k=0; k<=limit; k++) {
			System.out.print(k+"\t");
			if(k%10==9) {
				System.out.println();
			}
		}
		sc.close();
	}

}
