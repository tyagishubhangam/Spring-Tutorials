package in.sp.beans;
public class Student {
    private String name;
    private String email;
    private Address address;

    public Student(String name, String email, Address address) {
        this.name=name;
        this.email=email;
        this.address=address;

    }// we have created constructor and set values here itself...
    // however the setterMethod DI id preffered since its code is more readible



    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Address: "+address);
    }


}
