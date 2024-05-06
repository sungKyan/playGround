package week6;

import java.util.Scanner;

public class MaxSquareTest {
	
	/**
	 * 사용자로부터 음이 아닌 정수를 입력받아 그보다 작거나 같은 최대 정수의 제곱수를 출력하는 프로그램.
	 * 음의 정수가 입력되면 프로그램을 끝낸다.
	 * 정수가 아닌 입력에 대한 처리는 하지 않음.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			System.out.print("입력: ");
			int arbit = sc.nextInt();
			if(arbit < 0) {
				done = true;
				System.out.print("끝");
				System.exit(0);
			}
			System.out.printf("%d보다 작거나 같은 최대 \"정수의 제곱수\"는 %d\n", arbit, maxSquare(arbit));
		}
		sc.close();
	}
	
	/**
	 * 주어진 음이 아닌 정수보다 작거나 같은 "정수의 제곱수"들 중 최대값을 구한다.
	 * 
	 * @param bound 주어진 정수. (음이 아닌 정수이어야 한다.)
	 * @return 최대 "정수의 제곱수"
	 */

	public static int maxSquare(int bound) {
		boolean done = false;
		int k = 1;
		while(!done) {
			if(k*k > bound) {
				done = true;
				return (k-1)*(k-1);
			}
			else {
				k++;
			}
		}

		return 0;
	}

}

