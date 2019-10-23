//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		double height = input.nextDouble(); //문제 조건 잘 지키기
		System.out.print("몸무게를 입력하세요: ");
		double weight = input.nextDouble(); //문제 조건 잘 지키기
		
		double standard = (height - 100) * 0.9;
		
		System.out.println("표준체중은 "+ standard + "입니다.");
		
		if (weight > standard) {
			System.out.println("과체중 입니다.");
		}
		else if (weight == standard) {
			System.out.println("표준체중 입니다.");
		}
		else {
			System.out.println("저체중 입니다.");
		}
		
		input.close();
	}

}
