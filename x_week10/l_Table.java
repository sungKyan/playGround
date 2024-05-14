package x_week10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class l_Table {

	public static void main(String[] args) throws IOException { 
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer token = new StringTokenizer(bf_Read.readLine(), " ");
		System.out.print("Seed: "); 
		long seed = Long.parseLong(token.nextToken());
		
		System.out.print("행 갯 수: "); 
		int row_len = Integer.parseInt(token.nextToken());
		
		System.out.print("열 갯 수: "); 
		int col_len = Integer.parseInt(token.nextToken());
		
		System.out.print("난수의 최대값: "); 
		int limit = Integer.parseInt(token.nextToken());
		bf_Write.write("\n");
		Random ran = new Random(seed);

		int[][] arr = new int[row_len+1][col_len+1];
		b_MatrixUtil.fillMatrixRandom(arr, limit, ran);
		b_MatrixUtil.printMatrix(arr, bf_Write);
		
		bf_Write.write("\n");
		
		
		
		total(arr);
		
		b_MatrixUtil.printMatrix(arr, bf_Write);
	}
	
	public static void total(int[][] arr) {
		int row_sum = 0;
		int col_sum = 0;
		int total_sum = 0;
		
		for(int k=0; k<arr.length-1; k++) {
			for(int t=0; t<arr[0].length-1; t++) {
				row_sum += arr[k][t];
			}
			arr[k][arr[0].length-1] = row_sum;
			total_sum += row_sum;
			row_sum = 0;
		}
		
		for(int k=0; k<arr[0].length-1; k++) {
			for(int t=0; t<arr.length-1; t++) {
				col_sum += arr[t][k];
			}
			arr[arr.length-1][k] = col_sum;
			col_sum = 0;
		}
		
		arr[arr.length-1][arr[0].length-1] = total_sum;
	}
}
