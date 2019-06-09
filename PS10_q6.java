import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char ch[]=n.toCharArray();
		int a=Character.getNumericValue(ch[0]);
	    int b=Character.getNumericValue(ch[ch.length-1]);
		System.out.print(a+b);
	
	}
}
