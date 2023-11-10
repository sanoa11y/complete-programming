import java.util.Scanner;
public class PowerApp {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter base & expontent");
int base=scan.nextInt();
int exp=scan.nextInt();
int res=(int)Math.pow(base,exp);
System.out.println("Result of"+base+"raised to"+exp+"by using inbuild method is"+res);
res=Powers.power(base,exp);
System.out.println("Result of"+base+"raised to"+exp+"by using userdefined is"+res);
}
}
