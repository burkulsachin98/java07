package Java_Practice;

public class GetterSetter2 
{
	private String name;
	private int age;

	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public static void main(String[] args)
	{
		GetterSetter2 gt = new GetterSetter2();
		gt.setName("Sachin");
		System.out.println(gt.getName());
		gt.setAge(10);
		System.out.println(gt.getAge());
	}
}
