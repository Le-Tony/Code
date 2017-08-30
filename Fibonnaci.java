
public class Fibonnaci {
	public static int fibonnaci(int n)
	{
		if (n==0)
		{
			return 0;
		}
		else if (n==1)
		{
			return 1;
		}
		return fibonnaci(n-1) + fibonnaci(n-2);
	}
}
