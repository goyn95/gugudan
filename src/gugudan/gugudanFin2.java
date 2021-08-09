package gugudan;
import java.util.Scanner;

public class gugudanFin2 {

//	public static int[] cal(String first, String second) {
//		
//		return result;
//	}
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 2개 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		String inputValue = scan.nextLine();
		String[] splitValue = inputValue.split(",");
		int firstVal =Integer.parseInt(splitValue[0]);
		int secondVal = Integer.parseInt(splitValue[1]);
		int[] result = new int[secondVal];
		
		for (int i = 0; i < secondVal; i++) {
			result[i] = firstVal * (i + 1);
			System.out.println(result[i]);
		}

	}

}
