package day_20220623;

public class Min4 {
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min4(1, 2, 3, 4) = " + min4(1, 2, 3, 4));
		System.out.println("min4(1, 3, 4, 2) = " + min4(1, 3, 4, 2));
		System.out.println("min4(3, 4, 1, 2) = " + min4(3, 4, 1, 2));
		System.out.println("min4(4, 1, 2, 1) = " + min4(4, 1, 2, 1));
		System.out.println("min4(3, 2, 4, 1) = " + min4(3, 2, 4, 1));
	}

}
