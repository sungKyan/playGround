package week6;

import java.util.Scanner;
public class Factors {
	//사용자로부터 2 이상의 자연수를 입력받은 뒤 fac()함수에게 그 수의 소인수를 모두 출력하게 하는 프로그램.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("자연수를 하나 입력하세요: ");
		long n = sc.nextLong(); sc.close();
		System.out.printf("%d을 소인수분해하면 ", n);
		System.out.println(fac(n)); 
	}
	
	/**
	 * 들어온 2 이상의 자연수를 소인수분해하여 문자열로 저장한 뒤, 반환하는 메서드.
	 * k*k<=n;꼴을 사용하여 꼭 필요한 부분만을 구하게 하였고, 만약 같은 수로 계속해서 나눠진다면 그 자리에서 빠르게 계산하기 위해 for문 안에 while문을 넣는 식으로 작성함.
	 * @param n <-- 2 이상의 자연수.
	 * @return factors <-- 소인수분해 결과 문자열.
	 */
	public static String fac(long n) {
		String factors = "";
		for (long k = 2; k * k <= n; k++) {
            while (n % k == 0) {
                factors = factors + k + " ";
                n /= k;
            }
        }
		if (n > 1) {
			factors = factors + n + " "; //루트n까지 반복하며 소인수를 구한 뒤에도 1보다 큰 자연수가 남았다면 그 수 자체가 소인수.(예를들어, 91의 소인수를 구할때 위의 for문에서 7이 나오고, n=13인 상태로 코드가 종료됨. 이 경우 13을 따로 추가해줘야함.)
	    }
		
		return factors;
	}
}
