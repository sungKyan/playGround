package week4;

import java.util.Arrays;
import java.util.Scanner;

public class Dec2Bin {
	/**
	 * 10진수를 2진수로 변환하는 프로그램.
	 * main 함수는 변환하고자 하는 값을 입력받고 change함수로 넘겨준 뒤 return받은 값을 출력하는 역할만 한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 십진수로 입력하시오: ");
		int decimal_num = sc.nextInt(); sc.close();
		String binary_num = change(decimal_num);
		System.out.println(binary_num);
	}
	/**
	 * 10진수 값을 2진수 형태로 변환한다.
	 * @param dec -> 입력된 10진수 값
	 * @return bin_str -> 변환된 2진수 값(String형으로 보내줌)
	 * @author 김성결 
	 */
	public static String change(int dec) {
		
		int fill_arr = 0; 
		int overlap_num = 1; 
		int t; 
		
		for(t=1; t<=30; t++) {

			overlap_num = overlap_num * 2;

			if(overlap_num > dec) {
				dec = dec - overlap_num/2; 
				break;
			}
		}
		int[] bin = new int[t];
		bin[fill_arr] = 1;
		fill_arr++;
		
		
		int digit = t; 
		for(int k=1; k<t; k++) { 
			
			overlap_num = 1;
			
			for(int i=1; i<(digit-1); i++) {
				overlap_num = overlap_num*2;
			}
			
			if(overlap_num > dec) {
				bin[fill_arr] = 0;
				fill_arr++;
				digit--;
			}
			else if(overlap_num <= dec) {
				bin[fill_arr] = 1;
				fill_arr++;
				digit--;
				dec = dec - overlap_num;
			}
		}
		String bin_str;
		bin_str = Arrays.toString(bin).replaceAll("[^0-9]", "");
		
		return bin_str;
	}

}
