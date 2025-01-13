package org.basicjavaprogrampractice;

public class GetterAndSetter {

	private String name;
	private int age;

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public static void main(String[] args) {

		GetterAndSetter gs = new GetterAndSetter();
		gs.setName("Sachin");
		System.out.println(gs.getName());

		gs.setAge(10);
		System.out.println(gs.getAge());

	}
}
