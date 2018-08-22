import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicates {
	
	public boolean duplicates(int[] array) {
		
		int n = array.length;
		if(n<2) { System.out.println("Invalid Condition");return false;}
		
		Set<Integer> set = new HashSet<>();
	
		for(int i=0; i< n; i++) {
				if(set.contains(array[i])) {
				System.out.println("Has Duplicates");
				return true;
				
			}
				else {
					set.add(array[i]);
				}
		}
		System.out.println("No dups");
		return false; 
		
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
		
		ContainsDuplicates obj = new ContainsDuplicates();
		obj.duplicates(arr);
		}

	}


