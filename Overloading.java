class test
{
	public void print()
	{
		System.out.println("1st function called");
	}
	public void print(int a)
	{
		System.out.println("Int function called and print "+a);
	}
	public void print(float a)
	{
		System.out.println("Float function called and print "+a);
	}
}
public class Overloading
{
	public static void main(String[] args)
	{
		test obj =new test();
		obj.print();
		obj.print(3);
		obj.print(3.65f);
	}
}