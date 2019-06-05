import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int arr1[]=new int[n];
	    int arr2[]=new int[n];
	    int i,c=0;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    for(i=0;i<n;i++)
	    arr1[i]=sc.nextInt();
	    for(i=0;i<n;i++)
	        arr2[i]=arr1[n-1-i];
	    for(i=0;i<n;i++){
	    if(arr[i]==arr2[i])
		c+=1;
	    }
	    if(c==n)
	    System.out.println("yes");
	    else
	    System.out.println("no");
	}
}
