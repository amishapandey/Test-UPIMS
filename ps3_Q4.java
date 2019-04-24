import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char [] ch=s.toCharArray();
	    int i,count=0;
	    for(i=0;i<ch.length;i++)
	    {
	        if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z'))
	        count+=1;
	        else
	        continue;
	    }
	   if(count>=1)
	    System.out.print("no");
	    else
	    System.out.print("yes");
	    
	}
}
