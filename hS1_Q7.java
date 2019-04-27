import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i,j,count=0,temp;
	    for(i=0;i<arr.length;i++)
	    arr[i]=sc.nextInt();
	    for(i=0;i<arr.length;i++){
	        if(arr[i]%2==0)
	        {
	        if(i%2!=0){
	        System.out.print(arr[i]+" ");
	   
	        }
	      }
	      else
	        {
	        if(i%2==0)
	        System.out.print(arr[i]+" ");
	      
	      }
	      
	    }
	    }
	    
	}
