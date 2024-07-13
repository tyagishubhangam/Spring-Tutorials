package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Krishna Tyagi")
    private String name;
    @Value("krishna@gmail.com")
    private String email;
    @Value("189")
    private int rollno;
    @Value("99")
    private float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("RollNO: "+rollno);
        System.out.println("Marks:"+marks);
    }
}
