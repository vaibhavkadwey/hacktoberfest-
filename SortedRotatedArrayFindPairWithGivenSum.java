package gfg.Array;

public class SortedRotatedArrayFindPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 15, 6, 8, 9, 10};
		int x = 16;
		int a=0,z=0;
		for(int i=0;i<arr.length;i++){
			a = arr[i];
			
			z = search(arr,i+1,arr.length-1,x-a);
			if(x==-1)
				continue;
		}
		
		System.out.println("Pair = "+a+" "+z);
	}

	private static int search(int[] arr, int i, int j, int k) {
		// TODO Auto-generated method stub
		
		if(i>j)
			return -1;
		
		int mid = (i+j)/2;
		
		if(k == arr[mid])
			return mid;
		else if(arr[i] <= arr[mid]){
			
			if(k>=arr[i] && k<=arr[j])
				return search(arr, i, mid-1, k);
			
			return search(arr, mid+1, j, k);
		}
		
		else if(k>arr[mid] && k<=arr[j])
			return search(arr, mid+1, j, k);
		
		return search(arr, i, mid-1, k);
		
	}

}
