package IPA_08;
import java.util.Scanner;


public class Solution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];

        for(int i = 0; i < 4; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String date = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            String wifiAvailable = sc.nextLine();
            double bill = sc.nextDouble();
            sc.nextLine();

            hotels[i] = new Hotel(id, name, date, number, wifiAvailable, bill);
        }
        String month = sc.nextLine();
        String qWifi = sc.nextLine();

        int count = getNumberOfRoomsBookedInGivenMonth(hotels, month);
        Hotel sHigh = searchHotelByWifiOption(hotels, qWifi);

        if(count == 0){
            System.out.println("No rooms booked in a given month");
    
        }else{
            System.out.println(count);
        }

        if(sHigh == null){
            System.out.println("No Such option available");
        }else{
            System.out.println(sHigh.getId());
        }

        sc.close();
    }

    public static int getNumberOfRoomsBookedInGivenMonth(Hotel[] hotels, String month){
        int number = 0;
        for(Hotel h: hotels){
            String m = h.getBookingDate().split("-")[1];

            if(m.equalsIgnoreCase(month)){
                number += h.getNumberOfRoomsBooked();
            }

        }
        return number; 
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotels, String qWifi){
        Hotel highest = null, sHigh = null;

        for(Hotel h: hotels){
            if(h.getWifiFacilityDetail().equals(qWifi) == false) continue;

            if(highest == null || highest.getTotalBill() < h.getTotalBill()){
                sHigh = highest;
                highest = h;
            }else if(sHigh == null && highest.getTotalBill() > h.getTotalBill()){
                sHigh = h;
            }else if(sHigh != null && sHigh.getTotalBill() < h.getTotalBill() && h.getTotalBill() < highest.getTotalBill()){
                sHigh = h;
            }
        }

        return sHigh;
    }

}