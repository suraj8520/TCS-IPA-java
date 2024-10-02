
public class College{
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    College(int id, String name, int contactNo, String address, int pincode){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setContact(int contactNo){
        this.contactNo = contactNo;
    }

    public void setAddress(String add){
        this.address = add;
    }

    public void setPinCode(int pincode){
        this.pincode = pincode;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getPincode(){
        return pincode;
    }

    public int getContactNo(){
        return contactNo;
    }
}