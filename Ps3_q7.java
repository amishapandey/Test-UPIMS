import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	 char ch[]=str.toCharArray();
	 int i;
	 for(i=0;i<ch.length;i++){
	     if(ch[i]>='a' && ch[i]<='z')
	     System.out.print((char)(ch[i]-32));
	     else
	     System.out.print((char)(ch[i]+32));
	 }
	
	}
}
