import java.util.Scanner;
public class FactorsApp {
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*System.out.println("Enter a num to check wheather it is factor or not");
		int n=scan.nextInt();
		 boolean res=Factors.factor(n);
		if(res=true) {
			System.out.println("Entered num"+n+"is factor of +10");
		}
		else {
			System.out.println("Entered num"+n+"is not factor of 10");
		}
	} GIVEN RANGE*/
		System.out.println("Enter a num to print factor of it");
		int num=scan.nextInt();
		int res =Factors.factors(num);
		System.out.println(" Factorial of entered  num "+ num+"is"+res);

}
}

