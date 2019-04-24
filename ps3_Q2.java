import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int t;
	    while(m!=0)
	    {
	        t=m;
	        m=n%m;
	        n=t;
	    }
	    System.out.print(n);
	}
}
