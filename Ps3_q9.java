import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> list=new ArrayList<>();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int i,k,count=0;
	    for(i=1;i<=b;i++){
	        k=i*i;
	        list.add(k);
	        if(k>=a && k<=b)
	        count+=1;
	    }
	  	System.out.println(count);
	}
}
