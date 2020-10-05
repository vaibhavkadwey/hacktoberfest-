package gfg;

public class one_bit_and_two_bit_characters_gfg {

	public static void main(String[] args) {
		
		String str = "11100";
		
		int i =0;
		int count = 0;
		while(i < str.length()){
			if (str.charAt(i)=='0')
				i++;
			else
				i+=2;
			
			count++;
		
				
			
		}
		System.out.print(count);

	}

}
