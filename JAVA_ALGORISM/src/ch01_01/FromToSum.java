package ch01_01;

import java.util.Scanner;

public class FromToSum {
	public static void main(String []args) {
		Scanner stdIn = new Scanner(System.in);
		int a , b;
		int sum = 0;
		
		System.out.println("첫번째 정수 입력");
		a = stdIn.nextInt();
		
		System.out.println("두번째 정수 입력");
		b = stdIn.nextInt();
		if(a <=b ) {
			for(int i=a; i<=b; i++)
			sum+=i;
		} else {
			for(int i=b ; i <=a; i ++)
				sum+=i;
		}
		System.out.println(sum);
	}
}
