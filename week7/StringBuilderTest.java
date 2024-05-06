package week7;

import java.util.Scanner;
public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 두 줄: ");
		StringBuilder b_str1 = new StringBuilder();
		StringBuilder b_str2 = new StringBuilder(sc.nextLine()); sc.close();
		System.out.printf("첫 문장 길이: %d\n", b_str1.length());
		System.out.printf("두 번째 문장 길이: %d\n", b_str2.length());
		StringBuilder b_str3 = new StringBuilder(b_str1.append(b_str2));
		System.out.printf("연결된 새 문자열: %s\n", b_str3);
		StringBuilder b_str4 = new StringBuilder(b_str3.substring(b_str3.length()-2));
		System.out.printf("마지막 두 글자: %s\n", b_str4);
		System.out.printf("첫 글자: %s\n", b_str3.charAt(0));
		String str4 = new String(b_str4.toString());
		System.out.printf("\"%s\"의 위치: %d\n", b_str4, b_str3.lastIndexOf(str4)); //lastIndexOf()안에 들어가는 파라미터 값은 무조건 String 참조변수 이어야 한다. StringBuilder을 참조하고 있는 참조변수의 문자열에서 특정 문자(열)이 있는지를 찾으려면 그 문자열은 StringBuilder가 아닌 String을 참조하고 있어야 한다.
		System.out.printf("%s", b_str3.replace(b_str3.length()-2, b_str3.length(), "###"));
	}
}



