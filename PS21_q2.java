import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
	    String str1="";
	    String str2="";
	    int i;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
	        str1+=ch[i];
	        else
	        str2+=ch[i];
	    }System.out.print(str1+str2);
	    }
}
