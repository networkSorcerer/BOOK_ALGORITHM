package ch01_01;

import java.util.Scanner;

public class Gaus {
	public static void main(String []args) {
		Scanner stdIn = new Scanner(System.in);
		int n, sum;
		
		System.out.println("정수를 입력하세요");
		n = stdIn.nextInt();
		
		sum = (1+n)*(n/2);
		
		System.out.println(sum);
		
	}
 
}
