package miniproject;

public class fact {
	static int f(int n)
	{
		if(n==0||n==1) {
			return 1;
		}
		return n*f(n-1);
	}
	public static  void main(String arg[])
	{
		System.out.println(f(5));
	}

}
