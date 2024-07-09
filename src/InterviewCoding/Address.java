package InterviewCoding;

public class Address {
    private int pinCode;
    public Address(int pinCode){
        this.pinCode=pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                '}';
    }
}
