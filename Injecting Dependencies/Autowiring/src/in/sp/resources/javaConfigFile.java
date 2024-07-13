package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class javaConfigFile {
    @Bean("stdid")
    public Student std(){
        Student std=new Student();
        std.setName("Shubhangam TYagi");
        std.setEmail("shubhangam@gmail.com");
        return std;


    }
    @Bean
    public Address addrs(){
        Address add=new Address();
        add.setHousenum("------ tyagi market, jagrati vihar, sector 23");
        add.setZone("Sanjaynagar Ghaziabad");
        add.setPincode("201002");
        return add;
    }
    @Bean
    public Address addr(){
        Address add=new Address();
        add.setHousenum("362, tyagi market, jagrati vihar, sector 23");
        add.setZone("Sanjaynagar Ghaziabad");
        add.setPincode("201002");
        return add;
    }




}
