import java.util.*;
class PermutationAndCombination{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First number :- ");
		int n=sc.nextInt();
		System.out.println("Enter the Second Number :- ");
		int r=sc.nextInt();
		if(n>=r && n >0 ){
			int ans1=Factorial(n)/Factorial(n-r);
			System.out.println(n+"P"+r+" = "+ans1);
			int ans2=(Factorial(n)/(Factorial(r)*Factorial(n-r)));
			System.out.println(n+"C"+r+" = "+ans2);
		}

	}
	public static int  Factorial(int n){
		int sum=1;
		for (int i=1;i<=n ;i++ ){
			sum =sum*i;
		}
		return sum;
	}
}
