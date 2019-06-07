import java.util.*;
public class Main
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int i,j,c=0;
		for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(i=0;i<n;i++){
		    for(j=i+1;j<n;j++){
		    if(arr[i]+arr[j]==k){
		    c+=1;
		    break;
		   }
		    }
		}
      if(c>0)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
