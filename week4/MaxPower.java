package week4;

import java.util.Scanner;
public class MaxPower {
	/**
	 * 입력한 양의 정수보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수를 출력하는 프로그램.
	 * 2의 거듭제곱수 보다 큰 수를 입력한다는 가정 하에 작성되었으므로 2보다 작은 정수를 입력할 경우 어떤 값을 넣든 1이 출력됨.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하시오: ");
		int limit = sc.nextInt(); sc.close();
		int pow = 30; 	 //2의 30승 = (int 양의 범위)/2  	//나누기 2를 한 이유는 아래 주석에 설명.
		int overlap = 1;
		
		
		for(int t=1; t<=pow; t++) {
			
			overlap = overlap * 2; //overlap이 담을 수 있는 최댓값 == 2147483647(2^31 - 1) //overlap에 2를 한 번 더 곱했을 때의 값을 넣는 작업이 필수적이므로.. 따라서 limit에 1073741824(2^30) 이상의 수를 입력하면 '2^30 * 2'값이 overlap에 저장되게 되어 오류 발생.
			
			if(overlap > limit) {
				System.out.printf("%d보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수 = %d\n", limit, overlap/2);
				System.exit(0);
			}
		}
		
		
	}
}
