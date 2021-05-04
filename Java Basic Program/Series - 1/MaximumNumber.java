import java.util.*;
class MaximumNumber{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number :- ");
		int x=sc.nextInt();
		System.out.println("Enter Second Number :- ");
		int y=sc.nextInt();
		System.out.println("Enter Third Number :- ");
		int z=sc.nextInt();
		if(x>y){
			if(x>z)
				System.out.println("Number "+x+" is Maximum.");
			else
				System.out.println("Number "+z+" is Maximum.");
		}
		else{
			if (y>z) 
				System.out.println("Number "+y+" is Maximum");
			else
				System.out.println("Number "+z+" is Maximum");
		}
		
	}
}