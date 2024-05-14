package x_week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;

public class j_RandomStatistics {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("seed: "); 
		long seed = Long.parseLong(bf_Read.readLine());
		Random ran = new Random(seed);
		final int LIMIT = 100;
		int[] arr = new int[10];
		
		fillArrayRandom(arr, LIMIT, ran);
		bf_Write.write(Arrays.toString(arr) + "\n");
		bf_Write.write("최소: " + min(arr) + "\n");
		bf_Write.write("최대: " + max(arr) + "\n");
		bf_Write.write("평균: " + Math.round(average(arr)*10)/10.0 + "\n");
		
		bf_Write.close();
	}
	
	/**
	 * 주어진 배열에 정수 난수를 채워준다.
	 * @param arr main에서 만든 배열의 참조값.
	 * @param limit 생성할 자연수의 최댓값 제한.
	 * @param ran main에서 생성한 Random객체의 참조값.
	 */
	public static void fillArrayRandom(int[] arr, int limit, Random ran) {
		for(int k=0; k<arr.length; k++) {
			arr[k] = ran.nextInt(limit);
		}
	}
	
	/**
	 * 주어진 배열의 원소 중 최대값을 반환한다.
	 * @param arr 배열을 가리키는 참조변수.
	 * @return 원소들 중 최대값.
	 */
	public static int max(int[] arr) {
		int maximum = arr[0];
		for(int k=0; k<arr.length; k++) {
			if(maximum < arr[k]) {
				maximum = arr[k];
			}
		}
		return maximum;
	}
	
	
	/**
	 * 주어진 배열의 원소 중 최소값을 반환한다.
	 * @param arr 배열을 가리키는 참조변수.
	 * @return 원소들 중 최소값.
	 */
	public static int min(int[] arr) {
		int minimum = arr[0];
		for(int k=0; k<arr.length; k++) {
			if(minimum > arr[k]) {
				minimum = arr[k];
			}
		}
		return minimum;
	}
	
	/**
	 * 주어진 배열 속 원소들의 합을 원소의 크기로 나눠 평균을 반환한다.
	 * @param arr 배열을 가리키는 참조변수.
	 * @return 원소들의 평균값.
	 */
	public static double average(int[] arr) {
		int sum = 0;
		for(int k=0; k<arr.length; k++) {
			sum += arr[k];
		}
		
		return (double)sum/arr.length;
	}
}