package week2;

import java.util.Scanner;
public class StringAdder {
	public static void main (String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("단어를 두 개 입력하시오: ");
		String str1 = sc1.next();
		String str2 = sc1.next();
		
		System.out.printf("%s%s\n",str1,str2);
		
		sc1.close();
	}
}
