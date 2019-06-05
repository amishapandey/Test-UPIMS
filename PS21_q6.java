import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
		    if((ch[i]>='0' && ch[i]<='9') || (ch[i]=='A' || ch[i]=='B' || ch[i]=='C' || ch[i]=='D' || ch[i]=='E' || ch[i]=='F'))
		    continue;
		    else
		    count+=1;
		}if(count>0)
		System.out.print("no");
		else
		System.out.print("yes");

	    }
}
