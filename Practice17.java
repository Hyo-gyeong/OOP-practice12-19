//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
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
