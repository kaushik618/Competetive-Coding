import java.util.*;

public class TwoSum {
	
	public int[] twosum(int nums[], int target) {
		//Bruteforce solution O(n^2)
		
		//******************************************//
		
		/*int output[] = new int[2];
 		for(int i=0; i < nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[j] == target - nums[i]) {
					output = new int[] {j,i};
				}
			}
 		}*/
 		
 		//*****************************************//
 		
 		
 		//Using HashMaps - O(n) solution
 		//*****************************************//
 		
 		int output[] = new int[2];
 		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
 		for(int i=0; i<nums.length;i++) {
 			if(map.containsKey(target - nums[i])) {
 				output = new int[] {map.get(target - nums[i]), i};
 			}
 			else {
 				map.put(nums[i], i);
 			}
 		}
 		
 		//*****************************************//
 		
 		for(int j=0;j<output.length;j++){
			System.out.print(output[j]+" ");
 		}	
		return output;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i= 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		TwoSum obj = new TwoSum();
		obj.twosum(arr, 9);	
	}
}
