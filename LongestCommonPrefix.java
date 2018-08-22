import java.util.Scanner;

public class LongestCommonPrefix {
	public String commonprefix(String[] str) {
		String LCP = str[0]; 
		for(int i=0; i< str.length; i++) {
			int j=0;
			String currString = str[i];
			
			while(j < currString.length() && j < LCP.length() && LCP.charAt(j) == currString.charAt(j)) {
				j++;
			}
			if(j == 0) {
				return " ";
			}
			
			LCP = LCP.substring(0, j);
				
		}
		System.out.println(LCP);
		return LCP;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arrat");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		System.out.println("Enter the elements of the array");
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.next();
		}
		
		LongestCommonPrefix obj = new LongestCommonPrefix();
		obj.commonprefix(arr);

	}

}
