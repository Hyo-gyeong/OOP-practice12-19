//컴퓨터학과 20190975 신효경
public class Practice16 {

	public static void main(String[] args) {
		
		//int index = 0;
		
		for (int i = 1, index = 0; i <= 100; i = i + 3) { //변수선언 여러개 가능!
			System.out.print(i+"\t");
			index++;
			
			if (index % 5 == 0) {
				System.out.print("\n");
			}
		}
		
		System.out.println("\n");
		
		int num = 1;
		int index = 0; //초기화를 안해주면 위에서 index가 4의 배수로 끝났기 때문에 index 5의배수부터 출력됨!
		
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