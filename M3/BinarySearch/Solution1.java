import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements in the array");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements to the array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		Binarysearch bs = new Binarysearch();
		bs.Array(a);
		
		
	}

}
