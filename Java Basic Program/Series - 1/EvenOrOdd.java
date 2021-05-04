import java.util.*;
class EvenOrOdd{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		if (n%2==0) 
			System.out.println("Number "+n+" is Even.");
		else
			System.out.println("Number "+n+" is Odd.");
	}
}