package week9;

import java.io.*;
import java.util.*;
public class RandomNumbers2 {
	//메인함수는 seed값을 받고 배열을 출력하는 역할을 함.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("seed: ");
		StringTokenizer token = new StringTokenizer(br.readLine()); br.close();
		long seed = Long.parseLong(token.nextToken());
		
		int[] array = cr_ran_arr(seed); //cr_ran_arr()함수를 통해 배열을 받음.
		
		for(int k=0; k<10; k++) {
			bw.write(array[k] + " ");
		}
		
		int min = array[0], max = array[0], sum = 0;
		for(int k=0; k<10; k++) {
			sum += array[k];
			if(array[k]>max) {
				max = array[k];
			}
			else if(array[k]<min) {
				min = array[k];
			}
		}
		
		bw.write("\n최소: " + min + "\n" + "최대: " + max + "\n" + "평균: " + (double)sum/array.length);
		bw.flush();
		bw.close();
	}

	
	/**
	 * seed가 들어오면 10칸짜리 난수배열을 만들어 보내는 메소드. 난수는 0이상 100미만이다.
	 * @param seed <- 사용자가 main에서 입력한 int값
	 * @return ran_arr[] <- seed를 통해 생성된 100칸짜리 난수 배열
	 */
	public static int[] cr_ran_arr(long seed) {
		Random ran_N = new Random(seed);
		int[] ran_arr = new int[10];
		
		for(int k=0; k<10; k++) {
			ran_arr[k] = ran_N.nextInt(100);
		}
		
		return ran_arr;
	}
}
