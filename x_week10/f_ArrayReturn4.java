package x_week10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class f_ArrayReturn4 {
    
	public static void main(String[] args) throws IOException { 
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer token = new StringTokenizer(bf_Read.readLine(), " ");
		System.out.print("seed: "); 
		long seed = Long.parseLong(token.nextToken());
		
		System.out.print("첫 배열 크기: "); 
		int len1 = Integer.parseInt(token.nextToken());
		
		System.out.print("두 번째 배열 크기: "); 
		int len2 = Integer.parseInt(token.nextToken());
		
		Random ran = new Random(seed);
		
		int[] a1 = new int[len1];
		
		int[] a2 = new int[len2];
		
		
		
		
		for(int k=0; k<len1; k++) {
			a1[k] = ran.nextInt(100);
		}
		for(int k=0; k<len2; k++) {
			a2[k] = ran.nextInt(100);
		}
		
		
		int[] a3 = catArrays(a1, a2);
		
		bf_Write.write(Arrays.toString(a1)+"\n"+Arrays.toString(a2)+"\n"+Arrays.toString(a3));
		
		bf_Write.close();
	}
	
	/**
	 * 두 배열을 그대로 이어붙여 return하는 메서드.
	 * @param a1 배열1
	 * @param a2 배열2
	 * @return 두 배열을 이어붙여 만든 temp배열의 참조값.
	 */
	public static int[] catArrays(int[] a1, int[] a2) {
		int[] temp = new int[a1.length+a2.length];
		int index = 0;
		for(int k : a1) // a1의 값들을 하나씩 temp에 저장.
			temp[index++] = k;
		
		for(int k : a2) // a1의 값들을 채우며 index값이 증가했는데, 그 index에서 이어서 a2도 temp에 저장.
			temp[index++] = k;
		
		
		return temp;
	}
}