import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	     int m=sc.nextInt();
	     int arr[]=new int[n];
	     int i;
	     for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
		while(m>0){
		int temp=arr[n-1];
		for(i=n-2;i>=0;i--)
		{
		    arr[i+1]=arr[i];
		 }arr[0]=temp;
		 m--;
		}
	for(i=0;i<n;i++){
	System.out.print(arr[i]);
	System.out.print(' ');
	}
	
}
}
