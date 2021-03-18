import java.util.*;
class BinarySearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of element which you want to enter ");
		int n=sc.nextInt();
		int [] array=new int[n];

		for (int i=0;i<n ;i++ ) {
			System.out.println("Enter "+(i+1)+" element.");
			array[i]=sc.nextInt();
		}
		System.out.println("Enter  element which you want to find ");
		int x=sc.nextInt();
		int right=array.length;
		int left=0,middle;
		boolean found=false;
		while(left<right){
			middle=(left+right)/2;
			if(array[middle]==x){
				found=true;
				System.out.println("Your element is at "+(middle+1)+" index");
				break;
			}
			else if (array[middle]>x) {
				right=middle;
			}
			else{
				left=middle+1;
			}
		}
		if(found==false){
			System.out.println("Your element is Not Found ");
		}
	}
	
}
