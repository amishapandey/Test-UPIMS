import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int i,j;
		for(i=0;i<ch.length;i++){
		    if(ch[i]=='0')
		    continue;
		   if(ch[i]>='1' && ch[i]<='9'){
		       int a=Character.getNumericValue(ch[i]); 
		        for(j=0;j<a;j++)
		        System.out.print(ch[i-1]);
		   }
		    }
	}
}
