import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String str="";
	    char ch[]=s.toCharArray();
	    int i;
	    char j;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]=='X')
	        System.out.print('A');
	        else if(ch[i]=='x')
	        System.out.print('A');
	        else if(ch[i]=='Y')
	        System.out.print('B');
	        else if(ch[i]=='y')
	        System.out.print('b');
	        else if(ch[i]=='Z')
	        System.out.print('C');
	        else if(ch[i]=='z')
	        System.out.print('c');
	        else 
	        System.out.print((char)(ch[i]+3));
}
}
}
