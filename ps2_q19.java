import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int j=0,count=0;
	    ArrayList<Integer> arr=new ArrayList<Integer>();
	    for(int i=2;i<=n;i++){
	        if(n%i==0){
	            arr.add(i);
	            
	        }
	        }
	        Integer arr1[]=new Integer[arr.size()];
	        arr1=arr.toArray(arr1);
	   for(int i=0;i<arr1.length;i++) {
	       for(j=2;j<arr1[i]/2;j++){
	           if(arr1[i]%j==0)
	           count=1;
	           break;
	           
	       }if (count== 0)
	       System.out.print(arr1[i]+" ");
	   }
	       
	    }
	}

