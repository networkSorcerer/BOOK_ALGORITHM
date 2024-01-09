package ch01_01;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdInt = new Scanner (System.in);
		
		int a, b, c, min;
		
		System.out.println("a 입력");
		a = stdInt.nextInt();
		
		System.out.println("b 입력");
		b = stdInt.nextInt();
		
		System.out.println("c 입력");
		c = stdInt.nextInt();
		
		min = a;
		if (b < min) 
			min =b;
		if (c < min) 
			min = c;
		System.out.println(min);
	}

}
