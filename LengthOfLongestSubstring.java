import java.util.HashSet;
import java.util.Scanner;

public class LengthOfLongestSubstring {
	
	public int longestsubstring(String s) {
		if(s.length() < 1) return 0;
		int max_len =0;
		int fast_ptr =0, slow_ptr =0;
		HashSet<Character> set = new HashSet<>();
		while(fast_ptr < s.length()) {
			if(!set.contains(s.charAt(fast_ptr))){
				set.add(s.charAt(fast_ptr));
				fast_ptr++;
				max_len = Math.max(max_len, set.size());
			}
			else {
				set.remove(s.charAt(slow_ptr));
				slow_ptr++;
			}
		}
		System.out.println("Length of longest substring : " + max_len);
		return max_len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		
		LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
		obj.longestsubstring(input);
	}
}
