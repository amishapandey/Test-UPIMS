import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char ch[]=n.toCharArray();
		int i,sum=0;
		for(i=0;i<ch.length;i++)
		sum=sum+ch[i];
		System.out.print(sum);
	}
}
