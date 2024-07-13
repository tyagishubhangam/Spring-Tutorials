package in.sp.main;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std= (Student) context.getBean("StudentObj1");
        std.display();
        System.out.println("---------------------------------------------");
        Student std2=(Student) context.getBean("std2");
        std2.display();
    }
}
