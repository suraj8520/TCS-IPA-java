package IPA_08;

public class Hotel{
    private int id;
    private String name;
    private String bookingDate;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    Hotel(int id, String name, String bookingDate, int noOfRoomsBooked, String wifiFacility, double totalBill){
        this.id = id;
        this.name = name;
        this.bookingDate = bookingDate;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBookingDate(String date){
        this.bookingDate = date;
    }

    public void setNumberOfRoomsBooked(int count){
        this.noOfRoomsBooked = count;
    }

    public void setWifiFacility(String wifiFacility){
        this.wifiFacility = wifiFacility;
    }

    public void setTotalBill(double bill){
        this.totalBill = bill;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getBookingDate(){
        return bookingDate;
    }

    public int getNumberOfRoomsBooked(){
        return noOfRoomsBooked;
    }

    public String getWifiFacilityDetail(){
        return wifiFacility;
    }

    public double getTotalBill(){
        return totalBill;
    }

}