package gugudan;
import java.util.Scanner;

public class gugudanFin {

	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = 0;
		
		for(int i = 0; i < number; i++) {
			result = number * (i + 1);
			System.out.println(result);
		}


	}

}
