
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char p=sc.nextLine().charAt(0);
	    char k=sc.nextLine().charAt(0);
	    int a=Character.getNumericValue(p);
	    int b=Character.getNumericValue(k);
		char ch[]=n.toCharArray();
		System.out.print(ch[a+b-1]);
	
	}
}
