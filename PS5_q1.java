import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int rem;
	     rem=n/k;
	    while(rem>1){
	        n=rem;
	        rem=n/k;
	        if(rem==1 && n%k==0)
	        System.out.println("yes");
	         }
	        
	    if(n%k>0)
		 System.out.println("no");
	}
}
