package ch01;

public class Max3Method1 {
	
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max =c;
		return max;
	}
	
	public static void main(String [] args) {
		System.out.println("max3(3,2,1) = " + max(3,2,1));
	}

}
