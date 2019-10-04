//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int first = input.nextInt();
		int least = first;
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = input.nextInt();
		
		if (least >= second) {
			least = second;
		}
		
		System.out.print("세 번째 숫자를 입력하세요: ");
		int third = input.nextInt();
		
		if (least >= third) {
			least = third;
		}
		
		System.out.println("가장 작은 숫자는 "+ least + "입니다.");
		
		input.close();

	}

}
