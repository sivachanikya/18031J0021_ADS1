import java.util.Arrays;
import java.util.Scanner;

public class Equalpair {
	

	public static void main(string args[]) {
	int a[6]={1,2,1,2,5,2};
		int l = a.length;
		Arrays.sort(a);
		int count = 0;
		int temp = a[0];
		for(int i=1;i<l;i++)
		{
			if(a[i]==temp)
			{
				count++;
			}
			temp = a[i];
			
		}
		System.out.println("No.of equal numbers in the given array are: "+count);
	}

}
