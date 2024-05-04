package week9;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileInFileOut {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abkim\\eclipse-workspace\\김성결\\integers.txt"));
		StringTokenizer token = new StringTokenizer(br.readLine()); br.close();
		
		
		
		int[] int_file = new int[10];
		
		int comp = 0;
		while(token.hasMoreTokens()) {
			int_file[comp++] = Integer.parseInt(token.nextToken());
		}
		
		
		PrintWriter pw = new PrintWriter("out.txt");
		pw.write("배열을 역순으로 출력:  ");
		for(int k=comp; k>0; k--) {
			pw.write(int_file[k-1] + " "); 
		}
		pw.flush(); pw.close();
	}
}
