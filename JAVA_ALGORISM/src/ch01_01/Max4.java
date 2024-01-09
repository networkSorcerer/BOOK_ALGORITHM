package ch01_01;

import java.util.Scanner;

public class Max4 {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a, b, c, d, max;
		
		System.out.println("a를 입력");
		a = stdIn.nextInt();
		
		System.out.println("a를 입력");
		b = stdIn.nextInt();
		
		System.out.println("a를 입력");
		c = stdIn.nextInt();
		
		System.out.println("a를 입력");
		d = stdIn.nextInt();
		
		max =a;
		if( b> max)
			max= b;
		if (c > max)
			max = c;
		if (d >max )
			max =d;
		
		System.out.println(max);
		
		
	}
}
