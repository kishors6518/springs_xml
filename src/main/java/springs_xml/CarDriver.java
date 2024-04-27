package springs_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carengine.xml");
		Car car=(Car) context.getBean("car");
		System.out.println(car);
		car.hPower();

	}

}
