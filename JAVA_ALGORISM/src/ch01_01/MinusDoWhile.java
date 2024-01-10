package ch01_01;

import java.util.Scanner;

public class MinusDoWhile {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		int minus=0;
		
		do {
			System.out.println(" 첫번째 정수 입력 ");
			a = stdIn.nextInt();
			System.out.println(" 두번째 정수 입력");
			b = stdIn.nextInt();
			System.out.println("첫번째 정수를 다시 입력하세요");
		}while(b< a); // true인 동안 반복 나오려면 반대로 설정
			
			minus = b - a;
			System.out.println(minus);		
	}
}
