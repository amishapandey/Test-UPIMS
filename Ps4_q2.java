import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int [] arr=new int[n];
	    int i,count=0;
	    for(i=0;i<n;i++)
	    arr[i]=sc.nextInt();
	    for(i=0;i<n;i++){
	        if(arr[i]==k)
	        count+=1;
	        }
	    if(count==0)
	  	System.out.println("no");
	  	else
	  		System.out.println("yes");
	}
}
