package x_week10;

import java.io.*;
import java.util.*;
public class b_MatrixUtil {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("Seed: ");
		StringTokenizer token = new StringTokenizer(bf_Read.readLine()); //버퍼리드작업 끝. 
		bf_Read.close();
		
		final int MAX = 10;
		
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
		
		System.out.println();
		
		int[][] two_Three_arr = new int[2][3];
		fillMatrixRandom(two_Three_arr, MAX, ran);
		printMatrix(two_Three_arr, bf_Write);
		
		
		bf_Write.close();
	}
	
	/**
	 * 주어진 이차원 배열을 가공하여 buffer에 출력한다.
	 * @param param_arr 주어진 이차원 배열을 가리키는 참조 주소.
	 * @param bf main에서 선언된 BufferedWriter 객체의 참조 주소.
	 * @throws IOException 예외필수.
	 */
	static void printMatrix(int[][] param_arr, BufferedWriter bf) throws IOException {
		int repeat = param_arr.length;
		for(int k=0; k<repeat; k++) {
			bf.write(Arrays.toString(param_arr[k]).replaceAll("[^0-9 ]", "").replace(' ', '\t') + "\t\n");
			bf.flush();
		}
	}
	
	/**
	 * 이차원 배열을 임의의 난수로 채워주는 메서드.
	 * @param main_arr 이차원 배열 객체 참조 주소.
	 * @param max_num 생성가능한 난수의 최대값.
	 * @param ran main에서 선언된 Random객체 참조 주소.
	 */
	static void fillMatrixRandom(int[][] main_arr, int max_num, Random ran) {
		for(int k=0; k<main_arr.length; k++) {
			for(int t=0; t<main_arr[k].length; t++) {
				main_arr[k][t] = ran.nextInt(max_num);
			}
		}
	}

}

