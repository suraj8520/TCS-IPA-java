import java.util.*;
public class Majority {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        
        int el = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0;i < n; i++){
            if(count == 0){
                el = numbers[i];
                count = 1;
            }else if(el == numbers[i]){
                count++;
            }else{
                count--;
            }
        }
        int elCount = 0;
        for(int i = 0; i < n; i++){
            if (numbers[i] == el){
                elCount ++;
            }
        }

        if(elCount > n/2){
            System.out.println(el);
        }else{
            System.out.println("No majority element found");
        }
        
        sc.close();
    }
}
