import java.util.*;
public class PerfectNumberApp {
	public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int res =PerfectNumber.detectPerfect(num);
	if(num==res) {
		System.out.println("Entered num "+num+" is perfect number");
	}
	else {
		System.out.println("Entered num "+num+" is not perfect number ");
	}
}
}
