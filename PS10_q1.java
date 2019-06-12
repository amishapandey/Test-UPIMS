import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,q,r;
	    String str=" ";
	    while(n>0){
	        q=n/2;
	        r=n%2;
	        str+=r;
	        n=q;
	    }
	    char ch[]=str.toCharArray();
for(i=ch.length-1;i>=0;i--)
System.out.print(ch[i]);
	}
}
