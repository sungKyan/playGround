package week9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("integers.txt"));
		int[] int_file = new int[10];
		
		
		int comp = 0;
		while(sc.hasNext()) {
			int_file[comp++] = sc.nextInt();
		}

		System.out.println("배열을 역순으로 출력:  ");
		for(int k=comp; k>0; k--) {
			System.out.printf("%d ", int_file[k-1]);
		}
	}
}

