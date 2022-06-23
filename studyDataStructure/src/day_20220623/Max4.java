package day_20220623;

public class Max4 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max4(1, 2, 3, 4) = " + max4(1, 2, 3, 4));

	}

}
