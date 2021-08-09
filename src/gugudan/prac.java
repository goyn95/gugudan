package gugudan;

public class prac {

	public static int[] cal(int times) {
		int[] number = new int[9];
		for (int i = 0; i < number.length; i++) {
			number[i] = (i + 1) * times;
		}
		return number;
	}
	
	public static void print(int[] is) {
		for (int i = 0; i < 9; i++) {
			System.out.println(is[i]);
		}
	}
	
	public static void main(String[] args) {
		for (int j = 2; j < 10; j++) {
			print(cal(j));
		}

	}

}
