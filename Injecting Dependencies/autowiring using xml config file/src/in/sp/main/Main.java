package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
        Student std=(Student )context.getBean("stdId");
        std.display();
    }
}
