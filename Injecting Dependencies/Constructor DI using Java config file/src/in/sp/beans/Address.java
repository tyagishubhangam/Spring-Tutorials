package in.sp.beans;

public class Address {
    private String houseNum;
    private String zone;
    private String pincode;

    public Address(String houseNum, String zone, String pincode) {
        this.houseNum = houseNum;
        this.zone = zone;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return houseNum+", "+zone+", "+pincode;
    }
}
