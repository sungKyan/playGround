package week5;

import java.util.Scanner;
/**
 * 아이스크림, 커피, 음료를 파는 자판기 프로그램.
 * 연속적인 거래가 가능하다.
 * 여러 개의 메소드로 구현함.
 */
public class VendingMachine2 {
	/**
	 * 종류 메뉴를 출력한다.
	 */
	static void printMenu() {
		System.out.println();
		System.out.println("어떤 종류를 원하십니까?");
        System.out.println("아이스크림:        1");
        System.out.println("커피:            2");
        System.out.println("음료:            3");
        System.out.println("종료:            4");
        System.out.print("번호 선택: ");
	}
	
	/**
	 * 아이스크림 메뉴를 출력한다.
	 */
	static void printIcecreamMenu() {
		System.out.println();
		System.out.println("무엇을 드시겠습니까?");
        System.out.println("바닐라 아이스크림(1000원):    1");
        System.out.println("아몬드 아이스크림(1400원):    2");
        System.out.println("딸기 아이스크림(1400원):     3");
        System.out.println("호두 아이스크림(1400원):     4");
        System.out.print("번호 선택: ");
	}
	
	/**
	 * 커피 메뉴를 출력한다.
	 */
	static void printCoffeeMenu() {
		System.out.println();
		System.out.println("무엇을 드시겠습니까?");
        System.out.println("아메리칸(1000원):       1");
        System.out.println("카페라떼(1400원):       2");
        System.out.println("에스프레소(1400원):       3");
        System.out.print("번호 선택: ");
	}
	
	/**
	 * 음료 메뉴를 출력한다.
	 */
	static void printDrinkMenu() {
		System.out.println();
		System.out.println("무엇을 드시겠습니까?");
        System.out.println("생수(1000원):           1");
        System.out.println("오렌지쥬스(1400원):       2");
        System.out.println("망고쥬스(1400원):        3");
        System.out.println("우유(1400원):           4");
        System.out.print("번호 선택: ");
	}
	
	/**
	 * 메인함수.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림, 커피, 음료를 파는 자판기입니다.");
		
		
		
		boolean done = false;
		while(!done) {
			printMenu();
			int num = sc.nextInt();
			switch(num) {
			case 1: printIcecreamMenu(); num = sc.nextInt(); System.out.printf(" %d 선택, 감사합니다.\n", num); break;
			case 2: printCoffeeMenu(); num = sc.nextInt(); System.out.printf(" %d 선택, 감사합니다.\n", num); break;
			case 3: printDrinkMenu(); num = sc.nextInt(); System.out.printf(" %d 선택, 감사합니다.\n", num); break;
			case 4: System.out.print(" 감사합니다. 거래를 종료합니다."); System.exit(0); 
			default: System.out.print(" 올바르지 않은 번호입니다.\n"); break;
			}
		}
		sc.close();
		
		
	}
}
