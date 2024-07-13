package in.sp.Main;

import in.sp.beans.Student;
import in.sp.resources.javaConfigfile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(javaConfigfile.class);
        Student std=(Student)context.getBean("stdId");
        std.display();

    }
}
