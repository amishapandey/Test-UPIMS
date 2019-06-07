import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
	    str=str.toLowerCase();
	    str1=str1.toLowerCase();
	   char ch[]=str.toCharArray();
	   char ch1[]=str1.toCharArray();
	   int i,c1=0;
	   if(ch.length!=ch1.length)
	   c1+=1;
	   else{
	    for(i=0;i<ch.length;i++){
	        if(ch[i]!=ch1[i])
	        c1+=1;
	    }
	   }if(c1>0)
           System.out.println("no");
           else
            System.out.println("yes");
	 
	}
}
