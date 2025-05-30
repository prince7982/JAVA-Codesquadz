class Finally
{
	static int show()
	{
		try
		{
			//System.exit(0);
			//int x=10/0;
			return 20;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			return 4000;
		}
	}
	public static void main(String... s)
	{
		int z=show();
		System.out.println(z);
		//Finally fl=null;
		//fl.show();
	}
}