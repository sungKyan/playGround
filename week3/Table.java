package week3;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("표를 인쇄합니다.");
		System.out.print("행을 몇 개 만들까요? ");
		int row = sc.nextInt();
		System.out.print("열을 몇 개 만들까요? ");
		int column = sc.nextInt();
		sc.close();
		
		System.out.println();
		for(int k=0; k<row; k++) {
			for(int t=0; t<column; t++) {
				System.out.printf("(%d, %d)\t", k, t);
			}
			System.out.println();
		}
	}
}
