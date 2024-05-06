package week6;

public class Prime {
	// 2부터 20까지의 정수가 소수인지 아닌지를 판별하는 프로그램.
	public static void main(String[] args) {
		for(int k=2; k<=20; k++) {
			System.out.printf("첫 번째 방법: %d은(는) 소수이다: %b\n", k, isPrime1(k));
			System.out.printf("두 번째 방법: %d은(는) 소수이다: %b\n", k, isPrime2(k));
		}
	}
	
	
	/**
	 * 들어온 파라미터 값(1보다 큰 자연수)이 소수이면 true를 아니면 false를 반환함.
	 * 첫번째 방법. (1보다 크고 n보다 작은 모든 자연수를 계산함.)
	 * @param n <-- 주어진 2 이상인 정수.
	 * @return prime <-- boolean으로 선언됨. 소수이면 true, 아니면 false.
	 */
	public static boolean isPrime1(long n) {
		boolean prime = true;
		
		for(long k=2; k<n; k++) {
			if(n%k == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	/**
	 * 들어온 파라미터 값(1보다 큰 자연수)이 소수이면 true를 아니면 false를 반환함.
	 * 두번째 방법. (1보다 크고 루트n 보다 작거나 같은 모든 자연수를 계산함.) 즉, 계산량 절반으로 감소
	 * @param n <-- 주어진 2 이상인 정수.
	 * @return prime <-- boolean으로 선언됨. 소수이면 true, 아니면 false.
	 */
	public static boolean isPrime2(long n) {
		boolean prime = true;
		
		for(long k=2; k*k <= n; k++) {
			if(n%k == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
