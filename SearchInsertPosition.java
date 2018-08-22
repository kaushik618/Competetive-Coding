import java.util.Scanner;

public class SearchInsertPosition {
	public int searchindex(int[] nums, int key) {
		int low =0; 
		int high = nums.length -1;
		
		while(low <= high) {
			
		int mid = (low + high)/2;
		
		if(nums[mid] == key) {
			System.out.println(mid);
			return mid;
		}
		else if(nums[mid] > key) {
			high = mid -1;
		}
		else {
			low =  mid +1;
		}
	
	}
		System.out.println(low);
		return low;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key");
		int target = sc.nextInt();
		
		SearchInsertPosition obj = new SearchInsertPosition();
		obj.searchindex(arr, target);

	}

}
