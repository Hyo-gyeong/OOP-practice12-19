//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int least;
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int first = input.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = input.nextInt();
		System.out.print("세 번째 숫자를 입력하세요: ");
		int third = input.nextInt();
		//문제 조건 잘 지키기
		if (first >= second) {
			if (second >= third){
				least = third;
			}
			else
				least = second;	
			
		}
		else {
			if (first >= third){
				least = third;
			}
			else
				least = first;
		}
		
		System.out.println("가장 작은 숫자는 "+ least + "입니다.");
		
		input.close();

	}

}
