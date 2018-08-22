import java.util.Scanner;

public class LongestPalindromeSubstring {
	
	public String longestsubstring(String s) {
		String res = "";
		int count = 0;
		for(int i=0; i< s.length(); i++) {
			if(palindrome(s,i-count-1, i)){
				res = s.substring(i-count-1, i+1);
				count += 2;
			}
			if(palindrome(s,i-count, i)){
				res = s.substring(i-count, i+1);
				count += 1;
			}
			
		}
		
		System.out.println(res);
		return res; 
	}
	
	public boolean palindrome(String s, int begin, int end) {
		if(begin < 0) return false;
		while(begin < end) {
			if(s.charAt(begin++) != s.charAt(end--))
				return false;
		}
		return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		obj.longestsubstring(input);
		

	}

}
