class Temp
{
	int x;
	{
		System.out.println("init block");
		this.x=10;
	}
	Temp()
	{
		System.out.println("default");
		System.out.println(x);
	}
	{
		System.out.println("Second");
	}
	Temp(int x)
	{
		System.out.println(x);
	}

	public static void main(String... s)
	{
		new Temp();
		new Temp(10);
		new Temp();
	}
}