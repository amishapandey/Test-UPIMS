import java.util.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,j,c=1,count=0;
		for(i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
     	for(i=0;i<n-1;i++){
		  if(arr[i]==arr[i+1]){
		    	c+=1;
		    	if(c>count)
	        count=c;
		  }
	        else{
	            c=1;
	        }
		  }
		  
		  System.out.println(count);
	}
}
	

