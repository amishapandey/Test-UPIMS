import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     int m=sc.nextInt();
	    int []ar1=new int[m];
	    int i;
	    for(i=0;i<ar1.length;i++)
	    ar1[i]=sc.nextInt();
	    Arrays.sort(ar1);
	    for(i=0;i<ar1.length;i++){
	        if(i==0)
	        {
	         if(ar1[i]!=ar1[i+1])
	         {
	         System.out.print(ar1[i]);
             System.out.print(' ');
	         }
	        }
	         else if(i==m-1)
	         {
	            if(ar1[i]!=ar1[i-1]) 
	            {
	               System.out.print(ar1[i]);
                   System.out.print(' ');
                   }
	         }
	        else
	        {
	       if(ar1[i]!=ar1[i+1] && ar1[i]!=ar1[i-1])
	       {
             System.out.print(ar1[i]);
             System.out.print(' ');
	       }
	     }
	     }
	     }
	  }
