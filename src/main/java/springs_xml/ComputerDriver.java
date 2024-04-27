package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerDriver {

	public static void main(String[] args) {
//		Computer comp=new Computer();
//		comp.used();
		
		BeanFactory factory=new ClassPathXmlApplicationContext("computer.xml");
		Computer computer= (Computer) factory.getBean("comp");
		//computer.used();
		System.out.println(computer);
		Computer computer2= (Computer) factory.getBean("comp");
		System.out.println(computer2);

	}

}
