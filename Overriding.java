class Animal
{
	public void breed()
	{
		System.out.println("breed A");
	}
	public void colour()
	{
		System.out.println("color 1");
	}
	public void speak()
	{
	
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("meow");
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("bow-bow");
	}
}
public class Overriding
{
	public static void main(String[] args)
	{
		Cat a=new Cat();
		Dog b=new Dog();
		a.breed();
		a.colour();
		a.speak();
		b.breed();
		b.colour();
		b.speak();
	}
}