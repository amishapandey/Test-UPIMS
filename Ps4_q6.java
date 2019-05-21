import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int s=sc.nextInt();
	   int n=sc.nextInt();
	    int i,count=0,r;
	  
	    while(s>0){
	        r=s%10;
	        if(r==n)
	        count+=1;
	        s=s/10;
	    }
	  
	  System.out.println(count);
	}
}
