package in.sp.beans;
public class Student {
    private  String name;
    private String email;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public  void display(){
        System.out.println("name: "+name);
        System.out.println("email:"+email);
        System.out.println("Address:"+address);
    }
}
