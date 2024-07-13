package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String configFile_LOC= "/in/sp/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(configFile_LOC);
      Student sd=(Student)  context.getBean("stdId");
      sd.display();
    }
}
