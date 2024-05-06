package week4;

import java.util.Scanner;
public class ReversedTriangle {
	/**
	 * 줄바꿈 1개 마다 크기가 1씩 늘어난다고 가정했을 때, 삼각형의 크기를 입력하면 그에 맞는 역삼각형을 출력하는 프로그램.
	 * 앞의 문제와 반대로 위에서 아래로 갈수록 좁아지는 모양으로 그려진다.
	 * 음수나 0이 입력될 경우 아무것도 출력하지 않는다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 크기(양의 정수): ");
		int height = sc.nextInt();
		sc.close();
		System.out.println();
		for(int k=height; k>=0; k--) {
			for(int t=height; t>0; t--) {
				System.out.print("*");
			}
			System.out.println();
			height--;
		}
	}

}
