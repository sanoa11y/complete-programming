
public class Prime {
/*boolean isprime(int n) {
	if(n==0||n==1) {
		return false;
	}
	else if(n==2) {
		return true;
	}
	else {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;              // this code for if n =4 is not prime so should return false
			}
		}
		return true;
	}
	
}FIND PRIME IN GIVEN RANGE*/
	boolean checkPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
