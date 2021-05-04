import java.util.*;
class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		if(n>=2){
			int prime=0;
			for (int i=2;i<n;i++ ) {
				if(n%i==0)
					prime++;
			}
			if (prime==0) 
				System.out.println("Number "+n+" is prime.");
			else
				System.out.println("Number "+n+" is  Not prime.");
		}
		else if(n==1)
			System.out.println("Number "+n+" is prime.");
		else
			System.out.println("Enter valid number");
	}
}