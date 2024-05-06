package week4;

import java.util.Scanner;
public class Powers {
	/**
	 * 2의 몇 번째 거듭제곱수까지 구할지 입력하면 자동으로 그 거듭제곱수들을 출력하는 프로그램.
	 * 아래의 코드의 경우 2의 30승까지 출력 가능하다.
	 * 2의 31승은 int의 양수 범위인 (2^31-1)에서 벗어나기 때문.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2의 몇 제곱까지 구할까요? ");
		int pow = sc.nextInt();
		sc.close();
		int overlap;
		System.out.println("2의  0제곱: 1");
		for(int k=1; k<=pow; k++) {
			overlap = 1;
			for(int t=1; t<=k; t++) {
				overlap = overlap * 2;
			}
			System.out.printf("2의  %d제곱: %d\n", k, overlap);
		}
	}

}
