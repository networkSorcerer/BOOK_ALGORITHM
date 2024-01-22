package ch02;

import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
	static void swap(int []a, int idx1, int idx2) {
		//교환이랑 비슷함
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void reverse(int []a) {
		for(int i=0; i<a.length / 2; i++) //배열의 시작 점 부터 중간까지
			swap(a, i, a.length -i -1); //배열의 반대편 부터 중간 지점까지를 swap 메서드를 통해서 교환
	}
	
	public static void main(String []args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		
		int [] x = new int[num];
		
		for(int i = 0; i < num; i ++) {
			System.out.println("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다");
		System.out.println("x = " + Arrays.toString(x));
	}
}
