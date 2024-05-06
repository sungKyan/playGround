package week5;

import java.util.Scanner;

/**
 * 커피, 아이스크림 자판기 프로그램.
 * 연속적인 거래가 가능하다.
 * 메뉴를 보여주는 기능만 구현함.
 * 돈 계산 기능은 아직 없음.
 * main 메소드 하나로 구현함.
 * 
 * @author 김성결
 * 
 */
public class VendingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		System.out.println("아이스크림, 커피, 음료를 파는 자판기입니다.");
		while(!done) {
			System.out.print("\n어떤 종류를 원하십니까?\n아이스크림:        1\n커피:            2\n음료:            3\n종료:            4\n번호 선택: ");
			int num = sc.nextInt();
			switch(num) {
			case 1: System.out.println();
	        System.out.println("무엇을 드시겠습니까?");
	        System.out.println("바닐라 아이스크림(1000원):     1");
	        System.out.println("아몬드 아이스크림(1400원):     2");
	        System.out.println("딸기 아이스크림(1400원):      3");
	        System.out.println("호두 아이스크림(1400원):      4");
	        System.out.print("번호 선택:  ");
	        num = sc.nextInt();
	        System.out.println(num+" 선택, 감사합니다."); break;
			case 2: System.out.println();
	        System.out.println("무엇을 드시겠습니까?");
	        System.out.println("아메리칸(1000원):       1");
	        System.out.println("카페라떼(1400원):       2");
	        System.out.println("에스프레소(1400원):      3");
	        System.out.print("번호 선택:  ");
	        num = sc.nextInt();
	        System.out.println(num +" 선택, 감사합니다."); break;
			case 3: System.out.println();
	        System.out.println("무엇을 드시겠습니까?");
	        System.out.println("생수(1000원):           1");
	        System.out.println("오렌지쥬스(1400원):       2");
	        System.out.println("망고쥬스(1400원):        3");
	        System.out.println("우유(1400원):           4");
	        System.out.print("번호 선택:  ");
	        num = sc.nextInt();
	        System.out.println(num+" 선택, 감사합니다."); break;
			case 4: System.out.println(" 감사합니다. 거래를 종료합니다."); done=true; break;
			default: System.out.print("올바르지 않은 번호입니다.\n"); break;
			}
		}
		
		sc.close();
	}
}
