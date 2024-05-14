package x_week10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class e_ArrayReturn3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf_Read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf_Write = new BufferedWriter(new OutputStreamWriter(System.out));
		bf_Write.write("Seed: ");
		StringTokenizer token = new StringTokenizer(bf_Read.readLine()); //버퍼리드작업 끝. 
		bf_Read.close();
		
		long seed = Long.parseLong(token.nextToken());
		Random ran = new Random(seed);
		
		
		int[] array_1 = new int[10]; 
		for(int k=0; k<10; k++) 
			array_1[k] = ran.nextInt(100);
		
		
		int[] array_2 = new int[10]; 
		for(int k=0; k<10; k++) 
			array_2[k] = ran.nextInt(100);
		
		
		int[] array_3 = addArrays(array_1, array_2);
		
		bf_Write.write(Arrays.toString(array_1)+"\n"+Arrays.toString(array_2)+"\n"+Arrays.toString(array_3));
		
		bf_Write.close();
	}
	
	/**
	 * 길이가 10인 두 배열의 인덱스를 각각 더해 길이가 10인 배열에 차례대로 저장하고 return하는 메서드.
	 * @param arr1 배열1
	 * @param arr2 배열2
	 * @return temp addArrays()메서드는 temp배열의 참조값을 넘겨준 뒤 따로 참조해주지 않으면 가비지콜렉션에 들어가므로 temp라고 이름을 지었음.
	 */
	static int[] addArrays(int[] arr1, int[] arr2) {
		int[] temp = new int[10];
		for(int k=0; k<10; k++) {
			temp[k] = arr1[k] + arr2[k];
		}
		return temp;
	}

}