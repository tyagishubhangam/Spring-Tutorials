package in.sp.beans;

public class Student {
    private String name;
    private String email;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void display(){
        System.out.println("NAme: "+name);
        System.out.println("Address: "+address);
        System.out.println( "email: "+email);
    }
}
