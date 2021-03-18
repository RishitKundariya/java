import java.util.*;
class BubbleSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of element which you want to enter ");
		int n=sc.nextInt();
		int [] array=new int[n];

		for (int i=0;i<n ;i++ ) {
			System.out.println("Enter "+(i+1)+" element.");
			array[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=1;i<n;i++){
			for (int j=0;j<n-i;j++ ) {
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for (int i=0;i<n ;i++ ) {
			System.out.print(array[i]+" ");
			
		}
	}
}
