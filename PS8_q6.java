import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,j,c=0,c1=0;
		for(i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		if(arr[0]%2==0)
		c+=1;
		else
		c1+=1;
		if(c==1){
		for(i=0;i<n;i++){
		    if(arr[i]%2!=0)
		    break;
		}
		}
		else{
		   for(i=0;i<n;i++){
		    if(arr[i]%2==0)
		    break;
		} 
		}
		System.out.print(arr[i]);
	
	}
}
