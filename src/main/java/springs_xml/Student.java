package springs_xml;

public class Student {
	
	 String name;
	 int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void study()
	{
		System.out.println("I am from Student class in study()");
	}

}
