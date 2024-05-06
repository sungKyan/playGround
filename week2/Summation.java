package week2;

public class Summation {
	public static void main (String[] args) {
		//for문으로 1부터 100까지 더하기
		int sum =0;
		int k = 1;
		for(k=1;k<=100;k++) {
			sum += k;
		}
		System.out.println("for 이용: 1부터 100까지의 자연수의 합 = "+sum);
		sum=0;
		k=0;
		while(k<=100) {
			sum +=k;
			k++;
		}
		System.out.println("while 이용: 1부터 100까지의 자연수의 합 = "+sum);
	}
}
