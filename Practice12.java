//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		double height = input.nextInt();
		System.out.print("�����Ը� �Է��ϼ���: ");
		int weight = input.nextInt();
		
		double standard = (height - 100) * 0.9;
		
		System.out.println("ǥ��ü���� "+ standard + "�Դϴ�.");
		
		if (weight > standard) {
			System.out.println("��ü�� �Դϴ�.");
		}
		else if (weight == standard) {
			System.out.println("ǥ��ü�� �Դϴ�.");
		}
		else {
			System.out.println("��ü�� �Դϴ�.");
		}
		
		input.close();
	}

}
