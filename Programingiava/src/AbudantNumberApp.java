import java.util.Scanner;

public class AbudantNumberApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		boolean res=AbudantNumber.detectAbudant(num);
		if(res==true) {
			System.out.println("Enter a number "+num+" is abudant number");

		}
		else {
			System.out.println("Enter a number "+num+" is not abudant number");
		}
		}
}
