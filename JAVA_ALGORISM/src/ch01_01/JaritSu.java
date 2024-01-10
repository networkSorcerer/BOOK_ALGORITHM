package ch01_01;

import java.util.Scanner;
//잘 몰라서 이상하게 풀고 챗에게 물어봄
public class JaritSu {
	public static void main(String []args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int count =0;
		
		System.out.println("숫자를 입력하세요");
		a=stdIn.nextInt();
		
		while(a !=0 ) {
			a/=10;
			count++;
		}
		System.out.println(count);
				
	}
}
