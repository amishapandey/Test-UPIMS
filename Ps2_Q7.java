import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int s=sc.nextInt();
	   int t=sc.nextInt();
	 int i,j=100000;
	 for(j=s;j<=100000;j++){
	     if(j%s==0 && j%t==0)
	     break;
	        }
	        System.out.println(j);
	    }
}

