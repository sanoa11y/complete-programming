import java.util.*;
public class AutoMorpicApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		boolean res=AutoMorphic.detectAutoMorphic(n);
		if(res==true) {
			System.out.println("Enter a number "+n+" is Automorpic");	
		}
		else{
			System.out.println("Enter a number "+n+" is not Automorpic");	

		}
	}
}
