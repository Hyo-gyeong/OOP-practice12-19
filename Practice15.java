//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		String letter = input.next();
		
		switch(letter) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
		}
		
		input.close();

	}

}
