import java.util.Scanner;

public class MedianOfTwosortedArrays {
	
	public double medianofarrays(int[] nums1, int[] nums2) {
		
		double median = 0; 
		int n = nums1.length; 
		int m = nums2.length;
		
		int i=0, j=0, k=0; 
		int[] nums3 = new int[m+n]; 
		
		while(i<n && j<m) {
			if(nums1[i] < nums2[j] )
				nums3[k++] = nums1[i++];
			else
				nums3[k++] = nums2[j++];
		}
		
		if(i == n) while(j<m) nums3[k++] = nums2[j++];
		else while(i<n) nums3[k++] = nums1[i++];
		
		if(nums3.length % 2 == 0) {
			median = (nums3[nums3.length/2] + nums3[nums3.length/2 - 1])/2.0;
			System.out.println(median);
		}
		else {
			median = nums3[nums3.length/2];
			System.out.println(median);
		}
 		
		
		return median; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n = sc.nextInt();
		System.out.println("Enter the size of the second array");
		int m = sc.nextInt();
		
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		
		System.out.println("Enter the elements of array 1");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements of array 2");
		for(int j=0; j<m; j++) {
			arr2[j] = sc.nextInt();
		}
		
		MedianOfTwosortedArrays obj =new MedianOfTwosortedArrays();
		obj.medianofarrays(arr1, arr2);

	}

}
