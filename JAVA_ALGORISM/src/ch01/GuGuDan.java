package ch01;

public class GuGuDan {
	public static void main (String []args) {
		System.out.println("잘은 모르겠지만 구구단");
		
		for (int i =1; i <=9; i ++) {
			for (int j =1; j <=9; j++)
				System.out.printf("%3d" , i * j);
		System.out.println();
		}
			
	}
}
