
package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfigFile {
    @Bean
    public Address addId(){
        Address add=new Address();
        add.setHousenum("362, Tyagi Market, Jagrati Vihar, Sector 23, SanjayNagar");
        add.setZone("GHAZIABAD");
        add.setPincode("201002");
        return  add;

    }
    @Bean("stdId")
    public Student stdS(){
        Student std=new Student();
        std.setName("Shubhangam Tyagi");
        std.setEmail("shubhangam@gmail.com");
        std.setAddress(addId());
        return std;

    }

}
