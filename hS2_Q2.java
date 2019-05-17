import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int arr[]=new int[n];
	    int i,j,k;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    Arrays.sort(arr);
	    if(m==1)
	    System.out.print(arr[n-m]);
	    else
	    for(i=0;i<n;i++){
	        if(i==m)
	    System.out.print(arr[arr.length-i]);
	}
}
}	 
