package week6;

public class PrimeAlgorithmComparison {
	
	//큰 수가 소수인지 아닌지 구할 때, 첫 번째 방법과 두 번째 방법 간에 시간 차이가 얼마나 나는지 확인해보는 프로그램.
	public static void main(String[] args) {
		long startTime, endTime = 0;
		startTime = System.currentTimeMillis();
		boolean first_answer = isPrime1(3033333343L);
		endTime = System.currentTimeMillis();
		System.out.printf("첫 번째 방법, 계산 시간: %d\n3033333343은 소수이다: %b\n", endTime-startTime, first_answer);
		
		startTime = System.currentTimeMillis();
		boolean sec_answer = isPrime2(3033333343L);
		endTime = System.currentTimeMillis();
		System.out.printf("두 번째 방법, 계산 시간: %d\n3033333343은 소수이다: %b\n", endTime-startTime, sec_answer);
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
	 * 두번째 방법. (1보다 크고 n/2보다 작거나 같은 모든 자연수를 계산함.) 즉, 계산량 절반으로 감소
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
