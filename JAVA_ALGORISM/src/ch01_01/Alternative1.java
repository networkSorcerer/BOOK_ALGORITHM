package ch01_01;

import java.util.Scanner;

public class Alternative1 {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner (System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다");
		
		do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);
		
//		for(int i = 0; i < n; i ++ ) 
//			if( i % 2 == 0)
//				System.out.println("+");
//			else
//				System.out.print("-"); n값이 50000번이면 if 문도 50000번 실행됨
		
		for (int i = 0; i < n/2; i++)
			System.out.println("+-");
		if(n % 2 != 0 )
			System.out.println("+");  // n이 홀수 이면 마지막에 +를 한번 출력한다
		//연산 반복 횟수를 줄이는 방법을 연구하는 거 같다 
	}
}
