
public class SearchElementInSortedRoatedArray {

	static int arr[] = {5,6,7,8,9,10,1,2,3,4};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key = 3;
		int x = bsearch(0,arr.length-1,key);
		
		if(x==-1)
			System.out.println("key not found");
		else
		System.out.println("location = "+x);

	}
	
	public static int bsearch(int start,int end,int key){
		
		if(start > end)
			return -1;
		
		int mid = (start+end)/2;
		
		if(key == arr[mid])
			return mid;
		
		//check if arr[start...mid] is sorted 
		if(arr[start] <= arr[mid]){
			if(key >= arr[start] && key <= arr[mid])
				return bsearch(start, mid-1, key);
			
			return bsearch(mid+1, end, key);	
		}
			
		if(key >= arr[mid] && key <= arr[end])
			return bsearch(mid+1, end, key);
		
		return bsearch(start, mid-1, key);
	}

}
