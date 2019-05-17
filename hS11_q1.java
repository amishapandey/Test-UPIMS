import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i,j=n-1;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    Arrays.sort(arr);
	    if(n%2==0){
	    for(i=0;i<n;i++){
	        if(i!=j && i<j){
	  System.out.print(arr[j]+" ");
	  System.out.print(arr[i]+" ");
	  j-=1;}
	    }
	    }
	    else
	    { for(i=0;i<n;i++){
	        if(i!=j && i<j){
	  System.out.print(arr[j]+" ");
	  System.out.print(arr[i]+" ");
	  j-=1;
	  }
	    else
	    {
	        if(i==j)
	  System.out.print(arr[i]+" ");
	 }
 }
	    }
}
}
  	 
