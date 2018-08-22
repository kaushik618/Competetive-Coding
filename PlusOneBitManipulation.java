import java.util.Scanner;

public class PlusOneBitManipulation {
	
	public int plusone(int[] nums) {
		int value = 0; 
		
		for(int i=0; i< nums.length; i++) {
			value ^= nums[i];
		}
		
		System.out.println(value);
		return value; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter the elements of array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		PlusOneBitManipulation obj = new PlusOneBitManipulation();
		obj.plusone(arr);

	}

}
