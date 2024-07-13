package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private String email;
    @Autowired
    @Qualifier("addrs")
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void  display(){
        System.out.println("NAme:"+ name);
        System.out.println("Email:"+email);
        System.out.println("Address:"+ address);
    }
}
