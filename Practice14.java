//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Pracitce14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double result;
		
		System.out.print("x ���� �Է��ϼ���: " );
		double x = input.nextDouble();
		
		if (x <= 0) {
			result = (x * x * x) - (9 * x) + 2;
		}
		else {
			result = 7 * x + 2;
		}
		
		System.out.println("f(x) = "+ result);
		
		input.close();
	}

}
