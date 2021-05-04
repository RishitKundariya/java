import java.util.*;
class Fibonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of step you want to print :- ");
		int n=sc.nextInt();
		if (n>0) {
			int a=0,b=1,c=0;
			for (int i=0;i<n ;i++ ) {
				System.out.print(c +" , ");
				a=b;
				b=c;
				c=a+b;
			}
		}
		else
			System.out.println("Enter Number of Step > 0");
		
	}
}