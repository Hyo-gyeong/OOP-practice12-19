//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int input = scan.nextInt();
		
		for (int i = 0, index = 0; i <= input; i = i + 3) {
			System.out.print(i+"\t");
			index++;
			
			if (index % 5 == 0) {
				System.out.println();
			}
		}
		
		scan.close();
	}

}
