 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
	   char ch[]=str.toCharArray();
	   char ch1[]=str1.toCharArray();
	   int i,c=0;
	   if(ch.length!=ch1.length)
	   c+=1;
	   else{
	    for(i=0;i<ch.length;i++){
	        if(ch[i]!=ch1[i])
	        c+=1;
	    }
	   }if(c>0)
           System.out.println("no");
           else
            System.out.println("yes");
	 
	}
}
