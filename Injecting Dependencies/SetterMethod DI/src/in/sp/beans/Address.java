package in.sp.beans;

public class Address {
    private String houseNumber;
    private String zone;
    private String pincode;

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    @Override
    public String toString() {
        return houseNumber+" , "+zone+" , "+pincode;
    }// Whenever you will call the object , this function will be called and willreturn the specified string in return statement



}
