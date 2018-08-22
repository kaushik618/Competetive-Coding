import java.util.Scanner;

public class StringAtoI {
	
	public int AtoI(String str) {
		
		int sign = 1, num =0, i = 0;
		int Int_Max = Integer.MAX_VALUE;
		int Int_Min = Integer.MIN_VALUE;
		
		str = str.trim();
		
		if(str.length() == 0) return 0;
		
		if(str.charAt(i) == '+') {
			sign = 1; i++;
		}
		
		if(str.charAt(i) == '-') {
			sign = -1; i++;
		}
		
		while(i<str.length()) {
			int digit = str.charAt(i) - '0'; //stack overflow convert char digit to int
			if(digit < 0 || digit > 9) break; 
			
			//check for overflow
			if(Int_Max/10 < digit || Int_Max/10 == digit && Int_Max % 10 == num)
				return sign == 1 ? Int_Max : Int_Min; 
			
			num = num*10 + digit;
			i++;
		}
			System.out.println(num);
			return num; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.next();
		
		StringAtoI obj = new StringAtoI();
		obj.AtoI(input);
	}

}
