package x_week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class g_RandomNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("seed: "); 
		long seed = Long.parseLong(bf_Read.readLine());
		Random ran = new Random(seed);

		final int Array_LENGTH = 20;
		final int Index_MAX = 10;

		int[] arr = makeRandomArray(Array_LENGTH, Index_MAX, ran);
		bf_Write.write(Arrays.toString(arr));
		
		bf_Write.close();
	}
	
	/**
	 * 무작위 난수를 가지는 배열을 배열의 크기와 난수조건을 main으로부터 받아 return한다.
	 * @param lenth 배열의 길이.
	 * @param max 생성될 수 있는 난수의 최댓값.
	 * @param ran main에서 선언한 Random 객체.
	 * @return ran_arr 조건에 따라 만들어진 1차원 배열.
	 */
	public static int[] makeRandomArray(int lenth, int max, Random ran) {
		int[] ran_arr = new int[lenth];
		for(int k=0; k<lenth; k++) {
			ran_arr[k] = ran.nextInt(max);
		}
		return ran_arr;
	}
}
