import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i,c=0;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    Arrays.sort(arr);
	    System.out.println(arr[n-1]-arr[0]);
	}
}P
