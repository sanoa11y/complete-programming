import java.util.Scanner;
public class PrimeApp {
	public static void main(String[] args) {
		/* Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a num to check wheather it is prime or not");
		 int a=scan.nextInt();
		 Prime p =new Prime();
		 boolean res=p.isprime(a);
		 if(res==true) {
			 System.out.println("Entered  num "+a+"is prime ");
		 }
		 else {
			 System.out.println("Entered  num  " +a+ " is not prime");
		 }FIND PRIME IN GIVEN RANGE*/
		 
	Scanner scan=new Scanner(System.in);
	 System.out.println("Enter any 2 num it will be range to find prime or not");
	int a = scan.nextInt();
	int b = scan.nextInt();
	Prime p=new Prime();
	for (int i=a;i<=b;i++) {
		boolean res=p.checkPrime(i);
	
	if (res==true) {
		System.out.println(i);
}
}
}
}
