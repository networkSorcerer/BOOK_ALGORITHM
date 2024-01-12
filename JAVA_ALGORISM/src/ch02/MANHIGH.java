package ch02;

import java.util.Random;
import java.util.Scanner;

class MANHIGH {
	static int maxOf(int [] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) 
			if(a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String [] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다");
		int num = 1+ rand.nextInt(20);
		
		int [] height = new int [num];
		
		System.out.println("사람 수는 " + num + "명입니다");
		System.out.println("키는 다음과 같습니다");
		for(int i =0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("heigth[" + i +"] : " + height[i]);
		}
		System.out.println("최댓값은" + maxOf(height) + "입니다");
		
		int a = rand.nextInt(100);
		System.out.println(a);
		int b = rand.nextInt(1000);
		System.out.println(b);
		
		Random random = new Random();
		
		int c = random.nextInt();
		
		System.out.println(c);
		
		Random ra = new Random();
		
		int d = ra.nextInt();
		System.out.println(d);
	}
}
