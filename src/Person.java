
public class Person {
	
	private int age;
	private String name;
	
	public void display() {
		System.out.println("name: " + name + "\t" + "age: " + age);
	}
	
	public Person() {//default constructor
		age = 10;
		name = "shubham";
	}
	
	public Person(int age, String name) {//parameterised constructor
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
