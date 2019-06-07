import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    char k=sc.next().charAt(0);
	   char ch[]=str.toCharArray();
	   int i,c=0;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]==k){
	        c+=1;
	        }
	   }
           System.out.println(c);
	 
	}
}
