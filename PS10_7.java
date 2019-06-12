import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int i,sum=0;
	    for(i=n;i<=m;i++){
	        if(i%2!=0)
	       sum+=i;
	    }
System.out.print(sum);
	}
}
