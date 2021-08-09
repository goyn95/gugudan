package gugudan;
import java.util.Scanner;

public class gugudan1 {

	public static void main(String[] args) {

		//배열을 사용
		System.out.println("숫자를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt(); 
		
		int[] result = new int[9];
		for (int i = 0; i < 9; i++) {
			result[i] = number * (i+1);
			System.out.println(result[i]);
		}
		
		int[][] array = new int[9][9];
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < 9; j++) {
				array[i][j] = (i + 2) * (j + 1);
				System.out.println(array[i][j]);
			}
		}
		
		
//		System.out.println("숫자를 입력하세요. : ");
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		System.out.println(number);
//		
//		if(number < 2) {
//			System.out.println("값을 잘못 입력했습니다.");
//		} else if(number > 9){
//			System.out.println("값을 잘못 입력했습니다.");
//		} else {
//			for(int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
//		}
		
//		
//		if(number < 2 || number >9) {
//			System.out.println("2이상, 9이하의 값 입력할 수 있습니다.");
//		}
//		else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
//		}
//		
//		while(true) {
//			if(number >= 2 && number <= 9) {
//				for (int i = 1; i < 10; i++) {
//					System.out.println(number * i);
//					break;
//				}
//			}
//			else {
//				System.out.println("숫자를 다시 입력하세요 : ");
//				Scanner nscan = new Scanner(System.in);
//				int nnumber = scan.nextInt();
//				for (int j = 1; j < 10; j++) {
//					System.out.println(nnumber * j);
//					continue;
//				}
//			}
//		}
//		//4단 
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		//System.out.println("number: " + number);
//		
//		int i = 1;
//		int result = 0;
//		while(i<10) {
//			result = number * i;
//			System.out.println(result);
//			i++;
//		}
//		
//		int result2 = 0;
//		for(int j = 1; j<10;j++) {
//			result2 = number * j;
//			System.out.println(result2);
//		}
		
		
//		int result = number * 1;
//		System.out.println(result);
//		result = number*2;
//		System.out.println(result);
//		result = number*3;
//		System.out.println(result);
//		result = number*4;
//		System.out.println(result);
//		result = number*5;
//		System.out.println(result);
//		result = number*6;
//		System.out.println(result);
//		result = number*7;
//		System.out.println(result);
//		result = number*8;
//		System.out.println(result);
//		result = number*9;
//		System.out.println(result);
//		
//		//5단
//		result = 5*1;
//		System.out.println(result);
//		result = 5*2;
//		System.out.println(result);
//		result = 5*3;
//		System.out.println(result);
//		result = 5*4;
//		System.out.println(result);
//		result = 5*5;
//		System.out.println(result);
//		result = 5*6;
//		System.out.println(result);
//		result = 5*7;
//		System.out.println(result);
//		result = 5*8;
//		System.out.println(result);
//		result = 5*9;
//		System.out.println(result);
		
		// 2단
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//						
//		
//		// 3단
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
	}

}
