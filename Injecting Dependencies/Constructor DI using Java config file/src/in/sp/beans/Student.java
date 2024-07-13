package in.sp.beans;
public class Student {
    private String name;
    private String email;
    private  Address address;

    public Student(String name,String email,Address address){
        this.name=name;
        this.address=address;
        this.email=email;
    }
    public  void display(){
        System.out.println("name: "+name);
        System.out.println("email:"+email);
        System.out.println("Address:"+address);
    }

}
