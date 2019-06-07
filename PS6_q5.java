import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    char k=sc.next().charAt(0);
	   char ch[]=str.toCharArray();
	   int i;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]==k)
	        break;
	    
	   }
           System.out.println(i+1);
	 
	}
}
