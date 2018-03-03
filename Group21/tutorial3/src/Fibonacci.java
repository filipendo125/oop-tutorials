
public class Fibonacci {

	public static int recursiveFibonacci(int position){
		if (position <= 2) {
			return 1;
		} else {
			return recursiveFibonacci(position-1) + recursiveFibonacci(position-2);
		}
	}
	
	public static int iterativeFibonacci(int position) {
		int x = 1;
		int y= 1;
		int z;
		for (int i = 2; i<position; i++) {
			z = x+y;
			x = y;
			y=z;
		}
		return y;
	}
	
	// 1 1 2 3 5 8 13 21 etc...
	public static void main(String[] args) {
		System.out.println(recursiveFibonacci(1000004));
		System.out.println(iterativeFibonacci(4));
	}

}
