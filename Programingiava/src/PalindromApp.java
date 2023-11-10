import java.util.Scanner;
public class PalindromApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter num to check whether it is palindrom or not");
    int num=scan.nextInt();
    palindrom p=new  palindrom();
    int res=p.reverse(num);
    if(num==res) {
    	System.out.println("Enter num "+num+" is palindrom "+res);
    }
    else {
    	System.out.println("Enter num "+num+" is not palindrom "+res);
    }

}
}
