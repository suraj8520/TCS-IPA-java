import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Motel[] motels = new Motel[4];

        for(int i = 0; i < 4; i++){
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String bookingDate = sc.nextLine();
            int roomsBooked = sc.nextInt();
            sc.nextLine();
            String cabFacilityProvided = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();
            motels[i] = new Motel(id, name, bookingDate, roomsBooked, cabFacilityProvided, totalBill);
        }

        String qCabFacility = sc.nextLine();

        int bookedRooms = totalNumberOfRoomsBooked(motels, qCabFacility);
        if(bookedRooms == 0){
            System.out.println("No such rooms booked");
        }else{
            System.out.println(bookedRooms);
        }

        sc.close();
    }

    public static int totalNumberOfRoomsBooked(Motel[] motels, String cabFacility){
        int total = 0;
        for(Motel m: motels){
            if(m.getCabFacility().equals(cabFacility) && m.getBookedRooms() > 5){
                total += m.getBookedRooms();
            }
        }
        return total;
    }
}
