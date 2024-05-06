package week6;

public class summation3 {
	
	public static int sum(int from, int to) {
		int sumResult = 0;
		int i;
		for (i = from; i <= to; i++) {
			System.out.println("\tfrom=" + from + ", to=" + to + ", i=" + i + ", sumResult=" + sumResult);
			sumResult += i;
		}
		return sumResult;
	}
	
	public static void main(String[] args) {
		int count = 1, from, to;
		while (count <= 2) {
			from = count;
			to = count + 2;
			int sum = sum(from, to);
			System.out.println("Summation from " + from + " to " + to + " = " + sum);
			count++;
		}
	}

}
