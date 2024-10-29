import java.util.*;

class CountWordsSameChar{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        String[] arr = input.split("\\s+");
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].charAt(0) == arr[i].charAt(arr[i].length() -1)){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}