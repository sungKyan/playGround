package week4;

import java.util.Scanner;
public class ATMMachine {
	/**
	 * ATM기기의 기능을 간략하게 구현한 프로그램.
	 * 변수가 발생했을 경우에도 그에 대응하는 출력값을 사용자에게 보여줌.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double balance = 5000;
		
		System.out.print("잔액 확인: \t1\n현금 인출: \t2\n입금: \t\t3\n종료: \t\t4\n번호 선택: ");
		int num = sc.nextInt();
		int cash;
		
		switch(num) {
		
		case 1: System.out.printf("잔액은 %.1f원입니다.", balance); break;
		
		case 2: 
			System.out.print("얼마를 인출하시겠습니까? "); cash = sc.nextInt();
			if(cash>balance) System.out.printf("돈이 모자랍니다.\n잔액은 %.1f원입니다.", balance);
			else if(cash<0) System.out.printf("잘못된 값을 입력하셨습니다.\n잔액은 %.1f원입니다.", balance);
			else {
				balance = balance - cash;
				System.out.printf("돈을 받으세요. \n잔액은 %.1f원입니다.", balance);
			}
			break;

		case 3:
			System.out.print("금액은? "); cash = sc.nextInt();
			balance = balance + cash;
			System.out.printf("잔액은 %.1f원입니다.", balance);
			break;

		case 4: System.out.print("감사합니다."); break;

		default: System.out.print("올바르지 않은 번호입니다."); break;
		}
		
		sc.close();
	}
}
