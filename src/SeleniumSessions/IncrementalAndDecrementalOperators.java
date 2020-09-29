package SeleniumSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
			
		//post increment -> confusing topics
		
		//1. post increment
		int a=1;
		int b=a++;//++ means increment the value by 1
		//++ is written after a->post increment
		System.out.println(a);//2
		System.out.println(b);//1
		
		int m=-1;
		int n=m++;//-1+1=0
		System.out.println(m);//0
		System.out.println(n);//-1
		
		//2. pre incremnet
		int p=1;
		int q=++p;// ++p -> increment first
		System.out.println(p);
		System.out.println(q);
		
		int c=-99;
		int d=++c;//-99+1=-98
		System.out.println(c);//-98
		System.out.println(d);//-98
		
		//3. post decrement
		int r=2;
		int e=r--;//decrement -> decrease the value by 1
		System.out.println(r);//1
		System.out.println(e);//2
		
		//4. pre decrement
		int s=2;
		int f=--s;
		System.out.println(s);//1
		System.out.println(f);//1
		
		int v=2;
		System.out.println(v++);//2
		System.out.println(v);//
		System.out.println(++v);
	}

}
