package x_week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class i_MatrixMultiplication {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("seed: "); 
		long seed = Long.parseLong(bf_Read.readLine());
		Random ran = new Random(seed);
		
		int[][] arr_1 = new int[3][5];
		int[][] arr_2 = new int[5][3];
		int[][] multiplication_arr = new int[3][3];
		
		for(int k=0; k<arr_1.length; k++) {
			for(int t=0; t<arr_1[0].length; t++) {
				arr_1[k][t] = ran.nextInt(10);
			}
		}
		b_MatrixUtil.printMatrix(arr_1, bf_Write);
		
		for(int k=0; k<arr_2.length; k++) {
			for(int t=0; t<arr_2[0].length; t++) {
				arr_2[k][t] = ran.nextInt(10);
			}
		}
		b_MatrixUtil.printMatrix(arr_2, bf_Write);
		
		int temp = 0;
		for(int i=0; i<multiplication_arr.length; i++) {
			for(int j=0; j<multiplication_arr[0].length; j++) {
				
				
				for(int k=0; k<5; k++) {
					temp += arr_1[i][k] * arr_2[k][j];
				}
				
				multiplication_arr[i][j] = temp;
				temp = 0;
			}
				
		}
		
		b_MatrixUtil.printMatrix(multiplication_arr, bf_Write);
		
		bf_Write.close();
	}
}
