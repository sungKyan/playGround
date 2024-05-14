package x_week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class h_MatrixTranspose {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		bf_Write.write("seed: "); 
		bf_Write.flush();
		long seed = Long.parseLong(bf_Read.readLine());
		Random ran = new Random(seed);
		
		int[][] multi_arr = new int[3][5];
		
		for(int k=0; k<multi_arr.length; k++) {
			for(int t=0; t<multi_arr[k].length; t++) {
				multi_arr[k][t] = ran.nextInt(50);
			}
		}
		b_MatrixUtil.printMatrix(multi_arr, bf_Write);
		
		
		bf_Write.write("\n");
		
		
		int[][] after_multi_arr = transpose(multi_arr);
		b_MatrixUtil.printMatrix(after_multi_arr, bf_Write);
		
		bf_Write.close();
	}
	
	/**
	 * 주어진 행렬의 전치행렬을 return한다.
	 * @param ori_mat 기존 행렬.
	 * @return trans_mat 생성된 전치행렬.
	 */
	public static int[][] transpose(int[][] ori_mat) {
		int[][] trans_mat = new int[ori_mat[0].length][ori_mat.length];
		
		for(int k=0; k<ori_mat[0].length; k++) {
			for(int t=0; t<ori_mat.length; t++) {
				trans_mat[k][t] = ori_mat[t][k];
			}
		}
		
		return trans_mat;
	}

}