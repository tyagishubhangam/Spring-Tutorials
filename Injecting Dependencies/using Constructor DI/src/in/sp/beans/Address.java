package in.sp.beans;

public class Address {
    private String houseNumber;
    private String zone;
    private String pinCode;


    public Address (String houseNumber ,String zone ,String pinCode){
        this.houseNumber=houseNumber;
        this.zone=zone;
        this.pinCode=pinCode;
    }
    @Override
    public String toString() {
        return houseNumber+", "+zone+" , "+pinCode;
    }

}
