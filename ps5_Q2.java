import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i,minc=0,maxc=0;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    int min=arr[0],max=arr[n-1];
	    for(i=1;i<n;i++)
	    {
	        if(min<arr[i])
	        minc+=1;
	    }
	    for(i=0;i<=n-1;i++)
	    {
	        if(max>arr[i])
	        maxc+=1;
	    }if(minc==maxc)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
