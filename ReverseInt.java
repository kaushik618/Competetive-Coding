import java.util.Scanner;

public class ReverseInt {
	
	public int reverse(int x) {
		int rev =0;
		
		while(x != 0) {
			
			int last_digit = x % 10; 
			int new_rev = rev * 10 + last_digit; 
			if((new_rev - last_digit)/10 != rev) return 0;
			else rev = new_rev; 
			x /=10;
		}
		
		System.out.println(rev);
		return x; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entee the no.");
		int a = sc.nextInt();
		
		ReverseInt obj = new ReverseInt();
		obj.reverse(a);
	}
}
