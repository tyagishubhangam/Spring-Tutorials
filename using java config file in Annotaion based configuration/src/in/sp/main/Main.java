package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        String xmlConfigFile="/in/sp/resources/applicationContext.xml";
        ApplicationContext context=new AnnotationConfigApplicationContext(Student.class);
                Student sd= (Student) context.getBean("student");
        sd.display();
    }
}