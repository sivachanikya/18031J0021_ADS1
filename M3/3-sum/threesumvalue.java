import java.util.Arrays;
import java.util.Scanner;
class threesumvalue {
	 public void sum()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size");
		 int n=sc.nextInt();
		 int[] a=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		 System.out.println("enter the three sum value");
		 int sum=sc.nextInt();
		 for(int j=0;j<n-2;j++)
		 {
			 int st=j+1;
			 int lt=a.length-1;
			 while(st<lt)
			 {
				 if(a[j]+a[st]+a[lt]==sum)
				 {
					 System.out.println("The values are:"+a[j]+" "+a[st]+" "+a[lt]);
					 break;
				 }
				 else if(a[j]+a[st]+a[lt]<sum)
				 {
					 st=st+1;
				 }
				 else if(a[j]+a[st]+a[lt]>sum)
				 {
					 lt=lt-1;
				 }
				 else
				 {
					 System.out.println("3 sum values not found!!");   
				 }
			 }
			 
		 }
		
			
	 }
}
