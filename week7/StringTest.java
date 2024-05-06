package week7;

import java.util.*;
public class StringTest {

	public static void main(String[] args) {
		String str3, str4 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 두 줄: ");
		String str1 = new String(sc.nextLine());
		String str2 = new String(sc.nextLine()); sc.close();
		
		System.out.printf("첫 문장 길이: %d\n", str1.length());
		System.out.printf("두 번째 문장 길이: %d\n", str2.length());
		
		str3 = str1.concat(str2);
		System.out.printf("연결된 새 문자열: %s\n", str3);
		
		str4 = str3.substring(str3.length()-2);
		System.out.printf("마지막 두 글자: %s\n", str4);
		System.out.printf("첫 글자: %s\n", str3.charAt(0));
		System.out.printf("\"%s\"의 위치: %d\n", str4, str3.indexOf(str4));
		// System.out.printf("%s\n", str3.replace(str4, "###")); //replace를 사용한 코드는 오류발생 가능성이 높음. ex) str3=="이 사과는 파란 사과" -> "이 ###는 파란 ###"
		System.out.printf("%s\n", str3.substring(0, str3.length()-2) + "###"); //이렇게 작성해야 '마지막 두 글자를 "###"으로 교체'라는 기능을 할 수 있다.
		
		
	}

}
