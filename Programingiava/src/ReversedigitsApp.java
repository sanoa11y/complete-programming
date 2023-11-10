import java.util.Scanner;
public class ReversedigitsApp {
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a num to find the sum of digits");
	int num=scan.nextInt();
	ReverseDigits sd=new ReverseDigits();
	 int res=sd.reverse(num);
	 System.out.println("Reversed num "+num+"is "+res);
	}
	}

