import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1=sc.next();
		String[] s2=str.split("\\s");
		int c=0;
		for(String a:s2)
		{
			if(a.equals(s1))
			{
				c+=1;
			}
		}
		System.out.println(c);
	}
}
