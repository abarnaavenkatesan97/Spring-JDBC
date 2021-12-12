package studentJDBCPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigClass.class);
		Student student = context.getBean("studentBean",Student.class);
		StudentDAO studentdao = context.getBean("studentdao",StudentDAO.class);
		//studentdao.insert(student);
		studentdao.findallstudents();

	}

}
