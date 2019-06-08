import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char ch[]=n.toCharArray();
		Arrays.sort(ch);
		int c=0;
		for(int i=0;i<ch.length-1;i++){
		    if(ch[i]==ch[i+1]){
		    c+=1;
		    
		}
		}
		if(c>0)
		System.out.print("yes");
		else
		System.out.print("no");
	
	}
}
