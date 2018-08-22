import java.util.Scanner;

public class Strstr {
	public int str(String haystack, String needle) {
		if(needle.length() == 0 ) return 0;
		if(needle.length() > haystack.length()) return -1;
		
		int x = haystack.length() - needle.length();
		
		for(int i=0; i<=x; ++i) {
			if(haystack.substring(i, i+needle.length()).equals(needle)){
				System.out.println(i);
				return i; //if equal
			}
			
		}
		System.out.println(-1);
		return -1; //if not found
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter haystack");
		String hay = sc.next();
		System.out.println("enter needle");
		String ned = sc.next();
		
		Strstr obj = new Strstr();
		obj.str(hay, ned);
	
	}

}
