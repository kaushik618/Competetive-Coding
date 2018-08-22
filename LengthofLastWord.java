import java.util.Scanner;

public class LengthofLastWord {
	
	public int lastword(String str) {
		str = str.trim();
		
		if(str.length() == 0) 
			return 0;
		
		int count = 0; 
		
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) != ' ') {
				count++;
			}
			else
				return count;
		}
		
		System.out.println(count);
		return count; 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = sc.next();
		
		LengthofLastWord obj = new LengthofLastWord();
		obj.lastword(input);
	}

}
