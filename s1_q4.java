import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i;
	    for(i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    for(i=1;i<arr.length;i++)
	    {
	        if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
	        {
	        System.out.print(arr[i]);
	        System.out.print(' ');
	        }
	        else
	        continue;
	    }
		
	}
}
