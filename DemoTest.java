package gfg;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int d = 3;
		int n = 12;
		
		int hcf = find_hcf(d,n);
		// System.out.println(hcf);
		
		
		

	}

	private static int find_hcf(int a, int b) {
		// TODO Auto-generated method stub
		if (a==0)
			return b;
		else
		return find_hcf(b%a,a);
	}
}
