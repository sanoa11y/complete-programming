import java.util.Scanner;

public class FriendlyPairedApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 2 numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
	 
	int sum1=FriendlyPairs.detectsum(num1);
	int sum2=FriendlyPairs.detectsum(num2);
	int res1=sum1/num1;
	int res2=sum2/num2;
	if(res1==res2) {
		System.out.println("Entered  numbers "+ num1+" and"+ num2+" are friendly pairs");
	}
	else {
		System.out.println("Entered  numbers "+ num1+" and"+ num2+" are not friendly pairs");

	}
	}
}
	
