import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    char[] ch=str.toCharArray();
	    int i,k,count=0;
	    int l=ch.length;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]==ch[l-i-1])
	        count+=1;
	       
	        
	        }
	   System.out.println(count);
	    if(count==0)
	  	System.out.println("yes");
	  	else
	  		System.out.println("no");
	}
}
