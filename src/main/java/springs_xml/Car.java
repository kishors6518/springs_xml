package springs_xml;

public class Car {
	
	private String manufacture;
	private double cost;
	Engine eng;
	
	public Car(String manufacture, double cost, Engine eng) {
		super();
		this.manufacture = manufacture;
		this.cost = cost;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Car [manufacture=" + manufacture + ", cost=" + cost + ", eng=" + eng + "]";
	}
	public void hPower()
	{
		eng.power();
	}
}
