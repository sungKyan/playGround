package week5;

public class CelciusToFarenheit {
	
	public static void main(String[] args) {
		for(int k=-40; k<=100; k+=5) {
			convertAndPrint(k);
		}
	}
	/**
	 * @param c <-- 섭씨온도 입력
	 * 파라미터에 들어온 섭씨온도를 화씨온도로 변환시켜 출력까지 하는 매소드.
	 * 변환과 출력을 모두 시행한다.
	 */
	public static void convertAndPrint(int c) {
		System.out.printf("C = %d --> %.1f\n", c, c * 9.0/5.0 + 32.0);
	}
}
