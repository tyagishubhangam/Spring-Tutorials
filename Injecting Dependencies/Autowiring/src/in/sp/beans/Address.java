package in.sp.beans;

public class Address {
    private String housenum;
    private String zone;
    private  String pincode;

    public void setHousenum(String housenum) {
        this.housenum = housenum;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return housenum+", "+zone+", "+pincode;
    }
}
