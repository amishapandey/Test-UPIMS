import java.util.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int i,j;
		for(i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		for(i=0;i<arr1.length;i++)
		arr1[i]=sc.nextInt();
     	Arrays.sort(arr);
     	Arrays.sort(arr1);
		for(i=0;i<n;i++){
		    for(j=0;j<n;j++){
		    if(arr[i]==arr1[j]){
		    	System.out.print(arr[i]+" ");
	        }
		  }
	    }
	}
}
	

