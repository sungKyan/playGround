package week9;


import java.util.*;
public class ReverseQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = "";
		int lenth;
		int[] intArray = new int[100];
		int sum = 0;
		
		System.out.print("정수 입력: ");
		//intArray[99] 까지 채울 수 있는 for문. q나 Q를 입력하면 나가진다. 
		for(lenth=0; lenth<100; lenth++) {
			test = sc.next();
			if(test.matches("(0|[-]?[1-9]\\d*)")) { //0단일문자이거나 | 음수일수도있고 아닐수도 있으며 첫숫자는 0이 아니어야하고 두번째부터는 모든 자연수가 가능함. 한자리 수라면 뒤에 숫자가 더이상 없을수 있으므로 +가 아닌 *로 찾음. 
				intArray[lenth] = Integer.parseInt(test);
				sum += Integer.parseInt(test); 
			}
			else if(test.equalsIgnoreCase("Q")) {
				sc.close();
				break;
			}
			else {
				lenth--;
			}
		}
		for(int k=lenth; k>0; k--) {
			System.out.print(intArray[k-1] + " ");
		}
		
		//평균출력.
		System.out.println("\n평균: " + (double)sum/lenth);
		
		sc.close();
	}

}
