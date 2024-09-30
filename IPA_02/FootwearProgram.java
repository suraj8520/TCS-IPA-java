import java.util.Scanner;
import java.util.Arrays;
/*** Two footwear can't have same id and search should be case insensitive */
public class FootwearProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Footwear[] footwears = new Footwear[5];

        for(int i = 0; i < 5; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            //** this is in case we need invalid id part/
            // if(doesIdAlreadyExists(footwears, i, id)) return;
            footwears[i] = new Footwear(id, name, type, price);
        }

        String type = sc.nextLine();
        String name = sc.nextLine();

        int count = getCountByType(footwears, type);
        if(count == 0){
            System.out.println("Footwear not available");
        }else{
            System.out.println(count);
        }

        Footwear secondHighest = getSecondHighestPriceByBrand(footwears, name);

        if(secondHighest == null){
            System.out.println("Brand not available");
        }else{
            System.out.println(secondHighest.getFootwearId());
            System.out.println(secondHighest.getFootwearName());
            System.out.println(secondHighest.getPrice());
        }
        sc.close();
    }

    public static boolean doesIdAlreadyExists(Footwear[] fws, int end, int id){
        for(int i = 0; i < end; i++){
            Footwear f = fws[i];
            if(id == f.getFootwearId()) return true;
        }
        return false;
    }


    //* */ .toLowerCase() to convert it into lower case.
    //* .equalsIgnoreCase() to check by ignoring case */
    // return the count of the footwear type from the array
    public static int getCountByType(Footwear[] fws, String type){
        int count = 0;

        for(int i = 0; i < fws.length; i++){
            if(fws[i].getFootwearType().toLowerCase().equals(type.toLowerCase())){
                count++;
            }

            // // or 
            // if(fws[i].getFootwearType().equalsIgnoreCase(type)){

            // }
        }

        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] fws, String name){
        Footwear highest = null, secondHighest = null;
        for(int i = 0; i < fws.length; i++){
            if(fws[i].getFootwearName().equalsIgnoreCase(name)){
                if(highest == null || highest.getPrice() < fws[i].getPrice()){
                    secondHighest = highest;
                    highest = fws[i];
                }else if(secondHighest == null || secondHighest.getPrice() < fws[i].getPrice()){
                    secondHighest = fws[i];
                }
            }
        } 

        return secondHighest;
    }
}
