import java.util.Scanner;

/* Insertion: You are given two 32-bit numbers, Nand M, and two bit positions, i and j.
 * Write a method to insert Minto Nsuch that Mstarts at bit j and ends at bit i. 
 * You can assume that the bits j through i have enough space to fit all of M. 
 * That is, if M= 18811, you can assume that there are at least 5 bits between j and i.
 * You would not, for example, have j = 3 and i = 2, because M 
 * could not fully fit between bit 3 and bit 2.
 */
public class InsertMintoN {
	
	public int updateBits(int m, int n, int i, int j) {
		
		int allones = ~0;
		System.out.println(allones); 
		
		int left = allones - ((1 << j+1)-1); 
		//System.out.println(left);
		
		int right = (1<<i) - 1;		
		//System.out.println(right);
		
		int mask = left | right; 
		//System.out.println(mask);

		
		int n_cleared = n & mask;
		//System.out.println(n_cleared);
		
		int m_shift = m << i;
		//System.out.println(m_shift);
		int res = n_cleared | m_shift;
		String a = Integer.toBinaryString(res);
		System.out.println(a);
		
		return n_cleared | m_shift;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int I = sc.nextInt();
		int J = sc.nextInt();
		
		InsertMintoN obj = new InsertMintoN();
		obj.updateBits(M, N, I, J); 

	}

}
