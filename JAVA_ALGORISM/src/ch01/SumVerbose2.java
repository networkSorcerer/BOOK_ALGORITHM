package ch01;

import java.util.Scanner;

public class SumVerbose2 {
	public static void main (String []args) {
		Scanner stdIn = new Scanner (System.in);
		
		int n;
		
		do {
			System.out.print("값 : " );
			n = stdIn.nextInt();
		}while (n <=0);
		
		int sum = 0;
		
		for(int i =1; i < n; i++ ) {
			System.out.println(i + " + " );
			sum += i;
		}
		System.out.println(n + "=");
		sum += n;
		System.out.println(sum);
	}
}
