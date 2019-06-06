import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
	    char ch[]=str.toCharArray();
	    char ch1[]=str.toCharArray();
	    int c=0,n,i;
	    if(ch.length>ch1.length)
	        n=ch.length;
	   else if(ch.length==ch1.length)
	   n=ch.length;
	   else
	   n=ch1.length;
	    for(i=0;i<n;i++){
	        if(ch[i]==ch1[i])
	        c+=1;
	    }
	   if(c>0)
        System.out.println("yes");
        else
         System.out.println("no");
	}
}
