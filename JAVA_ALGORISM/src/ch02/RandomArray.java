package ch02;

import java.util.Scanner;

public class RandomArray {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner (System.in);
		
		int a, b;
		
		
		System.out.println("숫자를 입력해주세요");
		
		a = stdIn.nextInt();
		
		int [] random = new int [a];
		
		for (int i = 0; i <= a; i ++ ) {
			random[i] = stdIn.nextInt() ;
		System.out.println(random[i]);
		}
			
		
	}
}
