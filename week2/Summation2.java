package week2;

import java.util.Scanner;
public class Summation2 {
	public static void main (String[] args) {
		int k = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 얼마까지의 자연수를 더하시겠습니까? ");
		int limit = sc.nextInt();
		sc.close();
		for(k=1;k<=limit;k++) {
			sum += k;
		}
		System.out.println("for 이용: 1부터 " + limit + "까지의 자연수의 합 = "+sum);
		sum=0;
		k=0;
		while(k<=limit) {
			sum +=k;
			k++;
		}
		System.out.println();
		System.out.println("while 이용: 1부터 " + limit + "까지의 자연수의 합 = "+sum);
	}
}
