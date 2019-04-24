import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String str="";
	    char [] ch=s.toCharArray();
	    int i,count=0;
	    for(i=0;i<ch.length;i++)
	    {
	        if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))
	        str+=ch[i];
	        else
	        continue;
	    }System.out.print(str);
	   
	}
}
