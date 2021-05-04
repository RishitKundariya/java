import java.util.*;
class ReverseNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int n=sc.nextInt();
		int revNumber=0,r=0;
		for(;n!=0;){
			r=n%10;
			revNumber=revNumber*10+r;
			n=n/10;
			
		}
		System.out.println("Reverse number is "+revNumber);
	}
}