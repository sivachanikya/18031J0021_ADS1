import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
   public void Array(int[] a)
   {
	   Arrays.sort(a);
	   Scanner sc = new Scanner(System.in);
	   int N = a.length;
	   int first = 0;
	   int last = N-1;
	   int middle = (first+last)/2;
	   System.out.println("Enter the element to search");
		int s = sc.nextInt();
	   while(first<=last)
	   {
		   if(a[middle]<s)
		   {
			   first = middle+1;
		   }
		   else if(a[middle]==s && (middle>0 && (!(s==a[middle-1])) || middle==0))
		   {
			  
			   //for(int i=0;i<=middle;i++)
			   //{
				  // if(a[i]==a[middle])
				   //{
					  // System.out.println("Searching element is found at index "+i);
					  // break;
				   //}
				  // elses
				 //  {
					  // System.out.println("Searching element is found at index "+middle);
					   //break;
				  // }
			   //}
			   System.out.println("Searching element is found at index "+middle);
			   break;
		   }
		   else if(a[middle]==s)
		   {
			   System.out.println("Searching element is found at index "+middle);
			   break;
		   }
		   else
		   {
			   last = middle-1;
		   }
		   middle = (first+last)/2;
		   
		   
		   
	   }
	   if(first>last)
	   {
		   System.out.println("Searching element is not found in the array list");
	   }
   }
}
