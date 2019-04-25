import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	    int []arr=new int[n];
	    int i,j;
	    for(i=0;i<arr.length;i++)
	    arr[i]=sc.nextInt();
	    Arrays.sort(arr);
	    for(i=0;i<arr.length;i++){
	        if(i==0)
	        {
	         if(arr[i]!=arr[i+1])
	         {
	         System.out.print(arr[i]);
             System.out.print(' ');
	         }
	        }
	         else if(i==n-1)
	         {
	            if(arr[i]!=arr[i-1]) 
	            {
	               System.out.print(arr[i]);
                   System.out.print(' ');  
	            }
	         }
	        else
	        {
	       if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1])
	       {
             System.out.print(arr[i]);
             System.out.print(' ');
	       }
	     }
	            
	        }
	       
	    }
	   
	}
