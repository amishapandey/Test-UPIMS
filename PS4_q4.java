import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String n=sc.nextLine();
	    char ch[]=n.toCharArray();
	    int i;
	    System.out.print(ch[0]);
	    for(i=1;i<ch.length;i++){
	        if(i%3==0){
	 	     System.out.print(ch[i]);
	        }
	        }
	    }
}
