package day_20220623;

public class Min3 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min3(1, 2, 3) = " + min3(1, 2, 3));
		System.out.println("min3(1, 3, 2) = " + min3(1, 3, 2));
		System.out.println("min3(3, 1, 2) = " + min3(3, 1, 2));
		System.out.println("min3(1, 2, 1) = " + min3(1, 2, 1));
		System.out.println("min3(3, 2, 1) = " + min3(3, 2, 1));

	}

}
