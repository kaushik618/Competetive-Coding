import java.util.Scanner;

public class BestTimeToBuySellSecond {
	
	public int besttimetobuysell(int prices[]) {
		
		int max_profit =0; 
		int n = prices.length;
		
		if(n<2) return 0;
		for(int i = 0; i< n-1; i++) {
			if(prices[i+1] > prices[i]) {
				max_profit += (prices[i+1] - prices[i]);
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
		
		BestTimeToBuySellSecond obj = new BestTimeToBuySellSecond();
		obj.besttimetobuysell(arr);
		

	}

}
