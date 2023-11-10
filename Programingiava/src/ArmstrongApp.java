import java.util.Scanner;
public class ArmstrongApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*System.out.println("Enter a number");
		int num=scan.nextInt();
		int power=Armstrong.getCount(num);
		int res=Armstrong. getSum(num,power);
		if(num==res) {
			System.out.println("Entered number "+num+" is armstrong");
		}
		else{
			System.out.println("Entered number "+num+" is not armstrong");
		} FIND IN GIVEN RANGE*/
		System.out.println("Enter range to display all armstrong number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int count =0;
		for(int i=num1;i<=num2;i++) {
			int  power= Armstrong.getCount(i);
		int res=Armstrong.getSum(i,power);
			 if(i==res) {
			System.out.println(i+" is armstrong number");
			count++;
			 }
		}
		System.out.println("there are "+count+" armstrong number in range" +num1+" and" +num2);
	}
}
	

