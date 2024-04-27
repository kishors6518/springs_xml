package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("student.xml");
		Student student=(Student)factory.getBean("stud");
		student.study();
		System.out.println(student.getName());
		System.out.println(student.getAge());
		//System.out.println(student.name);
		

	}

}
