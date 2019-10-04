//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		double height = input.nextInt();
		System.out.print("몸무게를 입력하세요: ");
		int weight = input.nextInt();
		
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
