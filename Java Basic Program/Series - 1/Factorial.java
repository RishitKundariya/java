import java.util.*;
class Factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		if(n>=0){
			int sum=1;
			for (int i=1;i<=n;i++ ) {
				sum =sum*i;
			}
			System.out.println("Factorial Of "+n+" is "+sum);
		}
		else
			System.out.println("Enter number >= 0");
	}
}