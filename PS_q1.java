import java.util.*;
class CatNo { 
	 int catalan(int n) { 
		int res = 0;  
		if (m <= 1) 
		{ 
			return 1; 
		} 
		else
		{
		for (int i = 0; i < m; i++) 
		{ 
			res = res+(catalan(i) * catalan(n - i - 1)); 
		} 
		}
		return res; 
	} 

	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
		 CatNo cn = new CatNo(); 
		int m=input.nextInt(); 
		if(m==0)
		{
			System.out.print(1);
		}
		else{
		for (int i = 0; i < m; i++) 
		{ 
			System.out.print(cn.catalan(i));
				if(i<m-1)
				{
					System.out.print(" ");
				}
		}
		}
		input.close();
	} 
} 
