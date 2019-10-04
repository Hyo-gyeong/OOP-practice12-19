//컴퓨터학과 20190975 신효경
public class Practice19 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int k = 2; k <= 5; k++) {
				System.out.print(k + " * " + i + " = " + k*i+"\t");
			}	
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (int i = 1; i <= 9; i++) {
			for (int k = 6; k <= 9; k++) {
				System.out.print(k + " * " + i + " = " + k*i+"\t");
			}
			System.out.println();
		}
	}

}
