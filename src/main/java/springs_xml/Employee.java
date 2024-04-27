package springs_xml;

public class Employee {
	private String name;
	private String designation;
	private double salary;
	
	public Employee(String name, String desig,double sal) {
		this.name=name;
		designation=desig;
		salary=sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	

}
