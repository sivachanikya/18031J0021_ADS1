import java.util.*;

public class Solution {

public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int j=Integer.parseInt(scan.nextLine());
int f=0;
if(s.equals("String"))
{
while(scan.hasNext())
{
String sc=scan.nextLine();
String a[]=sc.split(",");
int n=a.length;
boolean h=true;
for (int i = n / 2 - 1; i >= 0; i--) 
{
h=true;
h=heapify(a, n, i); 
if(h==false)
break;
}
System.out.println(h);
}
}
else
{
while(scan.hasNext())
{
f++;
String sc=scan.nextLine();
String a[]=sc.split(",");
Double b[]=new Double[a.length];
if(b.length==0)
System.out.println("false");
else {
for(int i=0;i<a.length;i++)
{
b[i]=Double.parseDouble(a[i]);
}
int n=a.length;
boolean h=true;
for (int i = n / 2 - 1; i >= 0; i--) 
{
h=true;
h=heapify1(b, n, i); 
if(h==false)
break;
}
System.out.println(h);
}
}
if(j!=f)
System.out.println("false");
}
} 
static boolean heapify(String arr[], int n, int i) 
{ 
    int largest = i; // Initialize largest as root 
    int l = 2*i + 1; // left = 2*i + 1 
    int r = 2*i + 2; // right = 2*i + 2 
    if(l<n&&arr[l].compareTo(arr[largest])<0)
        return false;
    if (r < n && arr[r].compareTo(arr[largest])<0) 
        return false; 
    if (largest != i) 
    { 
        String swap = arr[i]; 
        arr[i] = arr[largest]; 
        arr[largest] = swap;  
        heapify(arr, n, largest); 
		    } 
    return true;
}
static boolean heapify1(Double arr[], int n, int i) 
{ 
    int largest = i; // Initialize largest as root 
    int l = 2*i + 1; // left = 2*i + 1 
    int r = 2*i + 2; // right = 2*i + 2  
    if(l<n&&arr[l]<arr[largest])
        return false;
    if (r < n && arr[r]<arr[largest]) 
        return false;
    if (largest != i) 
    { 
        Double swap = arr[i]; 
        arr[i] = arr[largest]; 
        arr[largest] = swap;  
        heapify1(arr, n, largest); 
    } 
    return true;
}
}

