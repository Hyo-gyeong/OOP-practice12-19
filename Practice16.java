//��ǻ���а� 20190975 ��ȿ��
public class Practice16 {

	public static void main(String[] args) {
		
		//int index = 0;
		
		for (int i = 1, index = 0; i <= 100; i = i + 3) { //�������� ������ ����!
			System.out.print(i+"\t");
			index++;
			
			if (index % 5 == 0) {
				System.out.print("\n");
			}
		}
		
		System.out.println("\n");
		
		int num = 1;
		int index = 0; //�ʱ�ȭ�� �����ָ� ������ index�� 4�� ����� ������ ������ index 5�ǹ������ ��µ�!
		
		while (num <= 100) {
			System.out.print(num+"\t");
			index++;
			
			if (index % 5 == 0) {
				System.out.print("\n");
			}
			
			num += 3;
		}
	}

}