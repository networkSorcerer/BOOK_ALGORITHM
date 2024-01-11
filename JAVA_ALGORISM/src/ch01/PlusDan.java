package ch01;

public class PlusDan {
	public static void main(String []args) {
		System.out.println("플러스 단 ");
		
		for(int i =1; i <=9; i++) {
			for(int j=0; j<=9; j++) 
				System.out.printf("%3d", i+j);
			System.out.println();
		}
	}
	
	
}
