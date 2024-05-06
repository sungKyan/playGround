package week3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 수의 배수들을 출력할까요? ");
		int num = sc.nextInt();
		sc.close();
		int multi = 1;
		int now_num = 0;
		
		while(now_num<=100) {
			now_num = num*multi;
			if(now_num<=100) {
				System.out.print(num*multi+" ");
			}
			multi++;
		}
		
	}

}
