import java.util.*;
public class StrongNumberApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		StrongNumber sn=new StrongNumber();
		boolean res =sn.detectStrong(n);
		if(res=true) {
			System.out.println("Entered num "+n+" Strong number");
		}
		else {
			System.out.println("Entered num "+n+" is not Strong number ");
		}
	}

}
