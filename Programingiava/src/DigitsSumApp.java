import java.util.Scanner;
public class DigitsSumApp {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a num to find the sum of digits");
int num=scan.nextInt();
DigitsSum d=new DigitsSum();
 int res=d.findSum(num);
 System.out.println("Sum of Entered num "+num+"is "+res);
}
}
