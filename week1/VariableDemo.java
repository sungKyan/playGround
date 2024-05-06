package week1;

public class VariableDemo {
	 public static void main(String[] args) {
	 int m; // 변수 선언 (int 타입 값을 저장하기 위한 변수 m) 
	 int n; // 변수 선언
	 int sum; // 변수 선언
	 m = 3; // 변수에 값 대입
	 n = 100; // 변수에 값 대입
	 sum = m + n; // 변수 값을 이용하여 계산한 결과를 변수에 대입
	 System.out.println("m = " + m);
	 System.out.println("n = " + n);
	 System.out.println("m + n = " + sum);
	 m = 100; // m에 다른 값을 대입 (엎어쓰기!)
	 sum = m + n; // sum에 새로운 값을 대입 (엎어쓰기)
	 System.out.println();
	 System.out.println("m = " + m);
	 System.out.println("n = " + n);
	 System.out.println("m + n = " + sum);
	 }
	}