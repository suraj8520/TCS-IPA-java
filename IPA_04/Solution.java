import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();

        College[] colleges = new College[size];
        for(int i = 0; i < size; i++){
            int id = sc.nextInt();         
            sc.nextLine();
            String name = sc.nextLine();
            int contactNo = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            int pincode = sc.nextInt();

            colleges[i] = new College(id, name, contactNo, address, pincode);
        }
        sc.nextLine();
        String qAddress = sc.nextLine();
        College maxPinCollege = findCollegeWithMaximumPincode(colleges);
        College result = searchCollegeByAddress(colleges, qAddress);

        if(maxPinCollege == null){
            System.out.println("No college found with mentioned attribute");
        }else{  
            System.out.println("id-" + maxPinCollege.getId());
            System.out.println("name-" + maxPinCollege.getName());
            System.out.println("contactNo-" + maxPinCollege.getContactNo());
            System.out.println("address-" + maxPinCollege.getAddress());
            System.out.println("pincode-" +maxPinCollege.getPincode());
        }

        if(result == null){
            System.out.println("No college found with mentioned attribute");
        }else{
            System.out.println("id-" + result.getId());
            System.out.println("name-" + result.getName());
            System.out.println("contactNo-" + result.getContactNo());
            System.out.println("address-" + result.getAddress());
            System.out.println("pincode-" + result.getPincode());
        }
        sc.close();
    }

    public static College findCollegeWithMaximumPincode(College[] colleges){
        College maxPin = null;

        for(College c: colleges){
            if(maxPin == null || maxPin.getPincode() < c.getPincode()){
                maxPin = c;
            }
        }
        return maxPin;
    }

    public static College searchCollegeByAddress(College[] colleges, String address){
        College result = null;

        for(College c: colleges){
            if(c.getAddress().equalsIgnoreCase(address)) return c;
        }

        return result;
    }
    
}