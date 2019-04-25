import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	    char []ch=s.toCharArray();
	    int i,j,count=0,prevc=0;
	    char max=' ';
	    for(i=0;i<ch.length;i++){
	        for(j=i+1;j<ch.length;j++){
	       if(ch[i]==ch[j])
	       {
	       count+=1;
	       }
	     }
	       if(count>prevc)
	       {
	       max=ch[i];
	       prevc=count;
	       }
	    }
	    System.out.println(max);
	   
	}
}
