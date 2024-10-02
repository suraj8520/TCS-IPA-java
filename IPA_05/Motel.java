
public class Motel{
    private int id;
    private String name;
    private String dob;
    private int numRoomsBooked;
    private String cabFacility;
    private double totalBill;

    Motel(int id, String name, String dob, int numRoomsBooked, String cabFacility, double totalBill){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.numRoomsBooked = numRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBookingDate(String dob){
        this.dob = dob;
    }

    public void setBookedRooms(int numRoomsBooked){
        this.numRoomsBooked = numRoomsBooked;
    }

    public void setCabFacility(String cabFacility){
        this.cabFacility = cabFacility;
    }

    public void setTotalBill(double totalBill){
        this.totalBill = totalBill;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getBookingDate(){
        return dob;
    }

    public String getCabFacility(){
        return cabFacility;
    }

    public int getBookedRooms(){
        return numRoomsBooked;
    }

    public double getTotalBill(){
        return totalBill;
    }

}