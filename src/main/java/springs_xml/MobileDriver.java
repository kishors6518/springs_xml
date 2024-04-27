package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		
//		BeanFactory factory=new ClassPathXmlApplicationContext("simmobile.xml");
//		Mobile mobile=(Mobile) factory.getBean("m");
//		mobile.info(); 
		ApplicationContext context=new ClassPathXmlApplicationContext("simmobile.xml");
		Mobile mobile=(Mobile) context.getBean("m");
		mobile.info();
		mobile.used();
		

	}

}
