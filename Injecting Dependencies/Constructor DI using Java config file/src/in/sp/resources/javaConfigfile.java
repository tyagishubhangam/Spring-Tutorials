package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfigfile {

    @Bean("Addr")
    public Address add(){
        Address addR=new Address("362,Tyagi Market, JAgratiVihar, Sector-23","SanjayNAgar Ghaziabad","201002");
        return addR;

    }
    @Bean("stdId")
    public Student std(){
        Student std=new Student("Shubhanagm Tyagi","shubhangam@gmail.com",add());
        return std;
    }

}
