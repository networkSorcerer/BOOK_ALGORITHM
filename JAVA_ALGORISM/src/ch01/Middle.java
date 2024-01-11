package ch01;

import java.util.Scanner;

public class Middle {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		
		int a , b,  c, m;
		
		System.out.println("a 입력");
		a = in.nextInt();
		System.out.println("b 입력");
		b = in.nextInt();
		System.out.println("c 입력");
		c = in.nextInt();
		
		if(a >=b )
			if( b>c)
				m = b;
			else if (c >a )
				m = a;
			else
				m = c;
		else if (a > c)
			m = a;
		else if (b < c)
			m = b;
		else 
			m = c;
		System.out.println("중간갑은 : " + m);
	}
}
