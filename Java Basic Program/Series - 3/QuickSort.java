import java.util.*;

class QuickSort{
	public static void main(String[] args) {
		int arr[]={47,75,8,6,89,45,12,1,0,-99,85,74,1,0,25,99,114,0,15,45,75};
		int l=arr.length;
		System.out.println(l);
		quickSort(arr,0,l-1);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	public static void quickSort(int arr[],int l, int h){
      		
      		if(l<h){
      			int pi=pivot(arr,l,h);
                quickSort(arr,l,pi-1);
      			quickSort(arr,pi+1,h);
      		}
      			
      		
	}
	public static int pivot(int arr[],int l, int h){
		  int pivot=l;
		  int low =l;
		  int high=h;
		  while(l<h){
		  	while( l < high && arr[l]<arr[pivot] ){
		  		l++;
		  	}
		  	while(h > low && arr[pivot]<=arr[h] ){
		  		h--;
		  	}
		  	if(l<h){
		  		int temp=arr[l];
		  		arr[l]=arr[h];
		  		arr[h]=temp;
		  	}
		  }
 		  int temp=arr[pivot];
		  arr[pivot]=arr[h];
		  arr[h]=temp;
		  return h;
	}
}
