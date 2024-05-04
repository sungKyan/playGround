package week9;

public class StringBuilderTest {

	public static void main(String[] args) {
		long startTime, endTime;
		
		String test_str = new String("");
		startTime= System.currentTimeMillis();
		for(int k=0; k<10000; k++) {
			test_str += "여름";
		}
		endTime= System.currentTimeMillis();
		System.out.printf("String 더하기 시간 = %d", endTime-startTime);
		
		System.out.println("\n"+test_str.charAt(0));
		System.out.println("\n\n\n");
		
		StringBuilder test_SB = new StringBuilder("");
		startTime= System.currentTimeMillis();
		for(int k=0; k<10000; k++) {
			test_SB.append("여름");
		}
		endTime= System.currentTimeMillis();
		System.out.printf("StringBuilder 시간 = %d", endTime-startTime);
	}

}
