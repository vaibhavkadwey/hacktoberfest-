package gfg.Array;
// rotate an array by d elements
public class ArrayRotation {

public static void main(String[] args) {
	
	int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
	
	int n = arr.length;
	int d = 4;
	
	int h_c_f = gcd(n,d);
	
	for(int i=0;i<h_c_f;i++){
		
		int temp = arr[i];
		int j = i;
		
		while(true){
			int k = j+d;
			
			if(k>=n)
				k = k-n;
			if(k==i)
				break;
			
			arr[j] = arr[k];
			j=k;
		}
		arr[j] = temp;
	}
	
	for(int z:arr)
		System.out.print(z+" ");
	
}

private static int gcd(int a, int b) {
	// TODO Auto-generated method stub
	if(b==0)
		return a;
	
	return gcd(b,a%b);
}
}
