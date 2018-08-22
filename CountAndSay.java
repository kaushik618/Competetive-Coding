import java.util.Scanner;

public class CountAndSay {
	public String countandsay(int n) {
		if(n==1) return "1";
		if(n==2) return "11";
		
		String str = "11";
		for(int i=3; i<=n; i++) {
			str+='$';
			int count = 1; 
			String res = "";
			
			for(int j=1; j<str.length();j++) {
				if(str.charAt(j) != str.charAt(j-1)) {
					res += count;
					res += str.charAt(j-1);
					count = 1;
				}
				else
					count++;
			}
			
			str = res;
		}
		System.out.println(str);
		
		return str; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int input = sc.nextInt();
		CountAndSay obj = new CountAndSay();
		obj.countandsay(input);
		
		
		

	}

}
