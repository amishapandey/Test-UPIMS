import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	     String str1=sc.nextLine();
	     int n=sc.nextInt();
	 char ch[]=str.toCharArray();
	 char ch1[]=str1.toCharArray();
	 int i,count=0;
	 if(ch.length>ch1.length){
	 for(i=0;i<ch.length;i++){
	     if(ch[i]!=ch1[i])
	     count+=1;
	 }
	     
	 }
	     else
	     {
	     for(i=0;i<ch1.length;i++){
	     if(ch1[i]!=ch[i])
	     count+=1;
	 }
	     
	 }if(count==n)
	 System.out.print("yes");
	 else
	System.out.print("no");
	}
}

 
