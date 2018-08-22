import java.util.Scanner;

public class PalindromeNumber {
	
	public boolean palindrome(int x) {
		if(x<0) return false; 
		if(x<10) return true; 
		
		int num = x;
		int rev = 0;
		
		while(x!=0) {
			rev = rev * 10 + x%10;
			x = x/10;
		}
		
		if(num != rev) return false;
		
		return true; 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int input = sc.nextInt();
		
		PalindromeNumber obj = new PalindromeNumber();
		if(obj.palindrome(input)) {
			System.out.println("the no. is palindrome");
			
		}
		else 
			System.out.println("No. is not palindrome");
		
	}
}