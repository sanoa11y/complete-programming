
public class DigitsSum {
int findSum(int num) {
	int digit=0;
	int sum=0;
	while(num!=0) {
		digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	return sum;
} 
}
