//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		int first = input.nextInt();
		int least = first;
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		int second = input.nextInt();
		
		if (least >= second) {
			least = second;
		}
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		int third = input.nextInt();
		
		if (least >= third) {
			least = third;
		}
		
		System.out.println("���� ���� ���ڴ� "+ least + "�Դϴ�.");
		
		input.close();

	}

}
