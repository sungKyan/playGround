package week5;

public class CelciusToFarenheit2 {
	public static void main(String[] args) {
		double farenheit;
		for(int k=-40; k<=100; k+=5) {
			farenheit = convert(k);
			System.out.printf("C = %d --> %.1f\n", k, farenheit);
		}
	}
	/**
	 * @param c <-- 섭씨온도.
	 * @return c*9.0/5.0+32 <-- 화씨온도.
	 * 이 매소드는 섭씨온도를 화씨온도로 변환시킨 뒤 main함수로 반환만 하는 매소드다.
	 */
	public static double convert(int c) {
		return c * 9.0/5.0 + 32.0;
	}
}
