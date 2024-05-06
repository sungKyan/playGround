package week5;

public class Summations2 {
	//10부터 20, 20부터 30, 30부터 40... , 90부터 100까지 자연수들의 합을 출력함.
	//main함수는 출력만하고, sum함수로부터 계산값을 받아옴.
	public static void main(String[] args) {
		for(int k=1; k<10; k++) {
			System.out.printf("%d부터  %d까지의 자연수의 합 = %d\n", k*10, k*10+10, sum(k*10, k*10+10));
		}
	}
	
	/**
	 * 주어진 범위의 자연수들의 합을 구한다.
	 * @param from: 덧셈 시작
	 * @param to: 덧셈 끝.
	 * @return sum <- from부터 to까지 더한 값을 리턴.
	 */
	public static int sum(int from, int to) {
		int sum = 0;
		for(int k=from; k<=to; k++) {
			sum += k;
		}
		return sum;
	}

}
