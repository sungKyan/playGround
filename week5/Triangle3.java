package week5;

import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형을 그리는 프로그램입니다.\n삼각형의 크기를 얼마로 할까요? ");
		int size = sc.nextInt(); sc.close();
		drawTriangle(size);
	}
	public static void drawTriangle(int size) {
		for(int k=size; k>0; k--) {
			for(int t=size; t>k; t--) {
				System.out.print(" ");
			}
			for(int t=k; t>0; t--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
