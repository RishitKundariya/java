import java.util.*;
class PowerCalculation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value :- ");
		double base=sc.nextDouble();
		System.out.println("Enter value of power :-");
		int power=sc.nextInt();
		if (power > 0) {
			double sum=1;
			for (int i=0;i<power;i++) {
				sum=sum*base;
			}
			System.out.println(base+" rest to "+power+" is equal "+sum);
		}
		else
			System.out.println("Enter value of power > 0 ");
	}
}