package week2;

import java.util.Scanner;
public class BinaryOperations { //못풀겠음
	public static void main (String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("실수를 두 개 입력하시오: ");
		double num1 = sc1.nextDouble();
		double num2 = sc1.nextDouble();
		sc1.close();
		if(num1 == (long) num1 && num2 == (long) num2) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println();
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			System.out.println();
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			System.out.println();
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println();
		}
		else {
			System.out.println(num1 + " + " + num2 + " = " + change(num1+num2));
			System.out.println();
			System.out.println(num1 + " - " + num2 + " = " + change(num1-num2));
			System.out.println();
			System.out.println(num1 + " * " + num2 + " = " + change(num1*num2));
			System.out.println();
			System.out.println(num1 + " / " + num2 + " = " + change(num1/num2));
			System.out.println();
		}
	}
	public static String change(double k) {
        if(k == (long) k)
            return String.format("%d",(long)k);
        else
            return String.format("%s",k);
    }
}