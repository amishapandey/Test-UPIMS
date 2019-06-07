import java.util.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
	Arrays.sort(arr);
		for(i=0;i<n;i++){
		    if(arr[i]<n){
		    	System.out.print(arr[i]+" ");
	        }
	    }
	}
		}
	

