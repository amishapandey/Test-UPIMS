import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int arr1[]=new int[n];
	    int i;
	    for(i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	        if(i!=arr[i])
	        continue;
	        else
	        {
	        for(i=0;i<n;i++)
	        {
	            arr1[i]=arr[i];
	        }
	        }
	        
	    }Arrays.sort(arr1);
	    for(i=0;i<n;i++){
		System.out.print(arr1[i]);
		System.out.print(' ');
	    }
		
	}
}
