package week9;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class ListSum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abkim\\eclipse-workspace\\김성결\\integers2.txt"));
		StringTokenizer token = new StringTokenizer(br.readLine()); br.close();
		
		
		
		int[] int_file = new int[token.countTokens()];
		
		int comp = 0;
		while(token.hasMoreTokens()) {
			int_file[comp++] = Integer.parseInt(token.nextToken());
		}
		
		
		PrintWriter pw = new PrintWriter(System.out);
		int partial_Sum = 0;
		for(int k=0; k<comp; k++) {
			partial_Sum += int_file[k];
			pw.printf("배열의 첫 %d개 원소의 합: %d\n", k+1, partial_Sum);
		}
		pw.flush(); pw.close();
	}
}