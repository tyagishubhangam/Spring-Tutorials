package in.sp.main;
import in.sp.beans.Student;
import in.sp.resources.javaConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(javaConfigFile.class);
        Student std= (Student)context.getBean("stdId");
        std.display();

    }
}
