import java.util.*;
public class Main
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int i,j,c=0;
		for(i=1;i<=n;i++){
		c=n/i;
		if(c%2!=0 && n%i==0){
		   System.out.print(i);
		   break;
		   }
		}
	}
}
