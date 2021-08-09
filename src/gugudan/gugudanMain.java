package gugudan;

public class gugudanMain {

	public static void main(String[] args) {
		int[] result = gugudan2.calculate(2);
		for (int j = 2; j < 10; j++) {
			gugudan2.print(gugudan2.calculate(j));

		}
	}
}
