package homeAssignment.week1;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int num =68;
		int count=0;
		for(int i=1; i<=num;i++) {
			if(num%i==0)
				count++;
		}
		
		if(count==2) {
		System.out.println("Prime");
		}
		else {
		System.out.println("Not prime");
}
	}
}
	


