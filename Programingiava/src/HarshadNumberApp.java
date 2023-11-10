import java.util.Scanner;

public class HarshadNumberApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		boolean res=HarshadNumber.detectHarshad(num);
		if(res==true) {
			System.out.println("Enter a number "+num+" is harshad number");
		}
		else {
			System.out.println("Enter a number "+num+" is not harshad number");
		}
}
}
