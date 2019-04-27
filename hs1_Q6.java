import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i,j,count=0,temp;
	    for(i=0;i<arr.length;i++)
	    arr[i]=sc.nextInt();
	    
	    for(i=0;i<arr.length-1;i++){
	        for(j=i+1;j<arr.length;j++){
	        if(arr[i]==arr[j] && count==0){
	            count+=1;
	            temp=i;
	            System.out.println(arr[i]);
	       
	        }
	    }
	    }
	    
	}
}
