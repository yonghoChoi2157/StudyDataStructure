package day_20220623;

public class Median2 {
	
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) 
				return b;
			else if(a <= c)
				return a;
			else
				return c;	
		} else if(a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
