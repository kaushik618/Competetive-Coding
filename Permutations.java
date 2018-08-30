import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutations {
	
	public List<List<Integer>> permute(int[] nums){
		
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(res, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		
		for(List<Integer> n : res) {
			for(int m : n) {
				System.out.print(m + " "); 
			}
			System.out.println();
		}
	
		return res; 
	}
	
	public void backtrack(List<List<Integer>> res, List<Integer> templist, int[] nums, boolean[] used) {
		if(templist.size() == nums.length)
			res.add(new ArrayList<>(templist));
		
		for(int i=0; i<nums.length; i++) {
			
			if(used[i] || (i>0 && nums[i] == nums[i-1] && !used[i-1])) continue; 
			
				used[i] = true; 
				templist.add(nums[i]);
				backtrack(res, templist, nums, used);
				used[i] = false; 
				templist.remove(templist.size()-1);
			}
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
		
		
		Permutations obj = new Permutations();
		obj.permute(arr);
		

	}

}
