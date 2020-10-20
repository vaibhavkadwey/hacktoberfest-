
//rotate an array of size n by d elements
// complexity O(n).
public class ReversalAlgoForArrayRotate {

	static int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		int n = arr.length;
		int l = 4;
		
		l = l%n;
		
		if(l==0){
			for(int i:arr)
			System.out.println(i);
		}
		reverse(0,l-1);
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		reverse(l,n-1);
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		reverse(0,n-1);
		for(int i:arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		
		for(int i:arr)
			System.out.print(i+" ");
		
		
	}
	
	public static void reverse(int a,int b){
		int temp;
		while(a < b){
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			a++;
			b--;
		}
		
	}

}
