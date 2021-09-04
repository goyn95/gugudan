package gugudan;
import java.util.Scanner;

public class R1_Practice {
	
	public static int gugu(int fir, int sec) {
		
		int result = 0;
		for(int i = 0; i < sec; i++) {
			result = fir * (i + 1);
			System.out.println(result);
		}
		return result;
	}

	public static void main(String[] args) {
		
		//1번 요구사항
		//사용자가 입력한 값에따라 크기가 다른 구구단 구
		
		/*System.out.println("숫자를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = 0;
	
		for (int i = 0; i < number; i++) {
			result = number * (i + 1);
			System.out.println(result);
		}
	*/
	
	//2번 요구사항
	//사용자가 2개의 값을 입력하여 첫번째 숫자의 구구단을 두번째 숫자의 구구단 만큼 출력
	
		System.out.println("숫자 두개를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		String[] splitValue = inputValue.split(",");
		int firstValue = Integer.parseInt(splitValue[0]);
		int secondValue = Integer.parseInt(splitValue[1]);
		
		for(int i = 0; i < secondValue; i++) {
			System.out.println(firstValue * (i + 1));
		}

	}

}
