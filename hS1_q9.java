import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i,j;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    i=0;
	    for(i=0;i<n;i++){
	   for(j=i+1;j<n;j++){
	  if(arr[i]+arr[j]==0){
	  System.out.print(arr[j]+" ");
	  System.out.print(arr[i]+" ");
	        }
	     }
	   }
	}
}
