public class Factors {
	/*static boolean factors(int n) {
		if(10%n==0) {
			return true;
		}
		else {
			return false;
		}
	}*/
	static int factors(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
		fact=fact*i;
	} return fact;
	}
}