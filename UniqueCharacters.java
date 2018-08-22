import java.util.Scanner;

//This algorithm determines whether a string consists of all unique characters

public class UniqueCharacters {
	
	boolean isunique(String s) {
		if(s.length() > 128) {
			return false;
			}
	// ****BRUTEFORCE SOLUTION - O(N)********//
		
//	for(int i=0; i < s.length(); i++) {
//		for(int j=i+1; j< s.length(); j++) {
//			if(s.charAt(j) == s.charAt(i)) {
//				return false;
//			}
//		}
//	}
//	return true;
	
	//**************************************//
	
	//*******OPTIMISED SOLUTION*************//
	boolean[] char_set = new boolean[128];
	for(int i=0; i<s.length(); i++) {
		int val = s.charAt(i);
		if(char_set[val]) {
			return false;
		}
		char_set[val] =true;
	}
	return true; 	
	}
	//*************************************//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacters obj = new UniqueCharacters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		
		
		if (obj.isunique(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicates");
	}

}
