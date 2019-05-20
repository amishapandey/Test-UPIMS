import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char [] ch=s.toCharArray();
	    String str="";
	    int Findex=0,Lindex=0;
	    int i;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]==' '){
	        Findex=i;
	        break;
	        }
	    }
	        for(i=Findex;i<ch.length-1;i++){
	        if(ch[i+1]!=' '){
	        Lindex=i;
	        break;
	        }
	        }
	        for(i=0;i<ch.length;i++){
	        if(i<=Findex)
	            str+=ch[i];
	        else if(i>=Findex && i<Lindex+1)
	        continue;
	        else
	        str+=ch[i];
	        }
	        
     
System.out.print(str);

	    }
}
	       
