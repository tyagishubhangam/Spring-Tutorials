package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean("StudentObj1")
    public Student student1(){
        Student std=new Student();
        std.setName("Krishna Tyagi");
        std.setEmail("krishna@gmail.com");
        std.setRollno(189);
        return std;
    }
    @Bean
    public Student std2(){
        Student std=new Student();
        std.setName("Shubhangam Tyagi");
        std.setRollno(11109);
        std.setEmail("shubhangamtyagi@gmail.com");
        return std;
    }
}
