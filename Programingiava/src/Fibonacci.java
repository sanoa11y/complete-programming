import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter to print series element");
	int n=scan.nextInt();
	Series s=new Series();
	s.fibo(n);
	}

}
