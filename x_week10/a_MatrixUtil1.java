package x_week10;

import java.io.*;
import java.util.*;
public class a_MatrixUtil1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("Seed: ");
		StringTokenizer token = new StringTokenizer(bf_Read.readLine()); //버퍼리드작업 끝. 
		bf_Read.close();
		
		
		long seed = Long.parseLong(token.nextToken());
		Random ran = new Random(seed);
		
		int[][] multi_arr = new int[3][5];
		for(int k=0; k<multi_arr.length; k++) {
			for(int t=0; t<multi_arr[k].length; t++) {
				multi_arr[k][t] = ran.nextInt(100);
			}
		}
		printMatrix(multi_arr, bf_Write);
		System.out.println();
		
		int[][] one_dir_arr = new int[1][10];
		for(int k=0; k<one_dir_arr[0].length; k++) {
			one_dir_arr[0][k] = ran.nextInt(100);
		}
		printMatrix(one_dir_arr, bf_Write);
		
		bf_Write.close();
	}
	
	
	/**
	 * 주어진 이차원 배열을 출력하는 메서드
	 * @param param_arr 배열을 참조하는 객체 주소
	 * @param bf main에서 선언한 버퍼 객체 주소
	 * @throws IOException 버퍼를 사용하므로 예외 throws필수
	 */
	static void printMatrix(int[][] param_arr, BufferedWriter bf) throws IOException {
		int repeat = param_arr.length;
		for(int k=0; k<repeat; k++) {
			bf.write(Arrays.toString(param_arr[k]).replaceAll("[^0-9 ]", "").replace(' ', '\t') + "\t\n");
			bf.flush();
		}
	}

}
