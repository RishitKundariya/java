import java.util.*;
class TransposeMatrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[3][3];
		for (int i=0;i<3 ;i++ ) {
			for(int j=0;j<3;j++){
				System.out.print("Enter rows "+(i+1)+" col " +(j+1)+" Element :- ");
				array[i][j]=sc.nextInt();
				System.out.print("\n");
			}

			
		}
		for (int i=0;i<3 ;i++ ) {
			for(int j=0;j<3;j++){
				
				System.out.print(array[j][i]+" ");
			}
			System.out.print("\n");
		}
	}
}
