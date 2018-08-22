import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
	
	public int besttime(int[] nums) {
		
		int n = nums.length; 
		if(n < 2) return 0;
		int max_profit = 0;
		int min = nums[0];
		for(int i=1; i<n; i++){
			if(nums[i] > min) {
				max_profit = Math.max(max_profit, nums[i] - min);
			}
			else {
				min = nums[i];
			}
			
		}
		System.out.println(max_profit);
		return max_profit;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the prices");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			}
		
		BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
		obj.besttime(arr);
	}

}
