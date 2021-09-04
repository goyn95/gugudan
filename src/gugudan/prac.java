package gugudan;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		System.out.println("숫자 2개를 입력해 주세요. : ");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		inputValue = inputValue.trim();
		
		String[] splitValue = inputValue.split(",");
		int firstValue = Integer.parseInt(splitValue[0]);
		int secondVale = Integer.parseInt(splitValue[1]);
		
		for (int i = 0; i < secondVale; i++) {
			System.out.println(firstValue * (i + 1));
		}
		}

	
//	public static int[] cal(int times) {
//		int[] number = new int[9];
//		for (int i = 0; i < number.length; i++) {
//			number[i] = (i + 1) * times;
//		}
//		return number;
//	}
//	
//	public static void print(int[] is) {
//		for (int i = 0; i < 9; i++) {
//			System.out.println(is[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		for (int j = 2; j < 10; j++) {
//			print(cal(j));
//		}
//
//	}

}
