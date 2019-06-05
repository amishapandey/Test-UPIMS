
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
		    if(ch[i]>='a' && ch[i]<='z')
		    System.out.print(Character.toUpperCase(ch[i]));
		    else
		    System.out.print(Character.toLowerCase(ch[i]));
		}

	    }
}
