package week9;

import java.io.*;
import java.util.*;

public class ArrayAdd{
	//메인함수는 seed값을 받고 배열을 출력하는 역할을 함.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("seed: ");
		StringTokenizer token = new StringTokenizer(br.readLine()); br.close();
		int seed = Integer.parseInt(token.nextToken());
		Random ran_N = new Random(seed);
		
		
		int[] ran_arr_1 = new int[10];
		int[] ran_arr_2 = new int[10];
		int[] ran_arr_3 = new int[10];
		
		for(int k=0; k<10; k++) 
			ran_arr_1[k] = ran_N.nextInt(10);
		
		for(int k=0; k<10; k++) 
			ran_arr_2[k] = ran_N.nextInt(10);
		
		for(int k=0; k<10; k++) 
			ran_arr_3[k] = ran_arr_1[k] + ran_arr_2[k];
		
		printArray(ran_arr_1, bw); //bw도 객체이므로 다른 메소드에서 메인 메소드와 동일한 버퍼를 사용할 수 있다!!!
		printArray(ran_arr_2, bw);
		printArray(ran_arr_3, bw);
		
		bw.flush();
		bw.close();
	}

	/**
	 * 이번 강의에서 배운 Chaining개념을 적용시켰다. toString()이 str를 반환하고, replaceAll도 str를 반환한다.
	 * Arrays클래스의 toString메서드로 arr배열을 String형으로 변환 후 String클래스의 replaceAll메서드로 정규표현식을 사용하여 문자열을 가공하였다.
	 * @param arr <-- 형식에 맞게 가공할 배열
	 * @param bw <-- 객체를 넘겨줬으므로 메인에서 선언된 버퍼를 그대로 다른 메소드에서 사용 가능하다.
	 */
	public static void printArray(int[] arr, BufferedWriter bw) throws IOException {
		
		String process_arr = Arrays.toString(arr).replaceAll("[^\\d ]", "");
		bw.write(process_arr);
		bw.newLine();
		
		bw.flush();
	}
}


