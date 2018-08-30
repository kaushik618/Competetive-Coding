import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
	
	public List<List<Integer>> threesum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		
		
		for(int i=0; i<nums.length-2; i++) {
			if(i ==0 ||  nums[i] != nums[i-1]) {
				int low = i+1;
				int high = nums.length -1; 
				int sum = 0 - nums[i]; 
				
				while(low < high) {
					if(nums[low] + nums[high] == sum) {
						res.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while(low<high && nums[low] == nums[low+1]) low++;
						while(low<high && nums[high] == nums[high -1]) high--;
						low++;
						high--;
					}
					
					else if(nums[low] + nums[high] < sum)
						low++;
					else
						high--;
				}
			}
		}
		
		for(List<Integer> n : res) {
			for(int m : n) {
				System.out.print(m + " "); 
			}
			System.out.println();
		}
		
		return res; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array");
		int s = sc.nextInt();
		int[] arr = new int[s];
		System.out.print("Enter the array elements");
		for(int i=0; i< s; i++) {
			arr[i] = sc.nextInt();
		}
		
		ThreeSum obj = new ThreeSum();
		obj.threesum(arr);

	}

}
