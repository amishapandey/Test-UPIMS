import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int c=0;
	    for(char ch:str.toCharArray())
	   c+=1;
        System.out.println(c);
	}
}
