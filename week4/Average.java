package week4;

import java.util.Scanner;
public class Average {
	
	/**
	 * 무작위 실수를 입력받아 평균을 내는 프로그램.
	 * 음수나 0을 넣으면 평균을 출력하고 프로그램을 종료한다.
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		double temp_num = sc.nextDouble();
		double pos_sum = 0;
		
		int count = 0;
		
		if(temp_num<=0) {
			System.out.print("양수가 하나도 입력되지 않았습니다.");
		}
		else {
			count++;
			pos_sum += temp_num;
			while(temp_num > 0) {
				System.out.print("> ");
				temp_num = sc.nextDouble();
				if(temp_num > 0) {
					count++;
					pos_sum += temp_num;
				}
			}
			sc.close();
		}
		System.out.printf("평균 = %.2f", (pos_sum/count));
	}

}
