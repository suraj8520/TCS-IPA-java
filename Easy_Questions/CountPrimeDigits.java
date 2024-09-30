/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.Scanner;
public class CountPrimeDigits {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num > 0){
            int digit = num % 10;
            if(isPrime(digit)) count++;
            num/=10;
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean isPrime(int num){
        // ** we could also just use condition.
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        //** 2 is prime number which sqrt doesn't supports. */
        return num < 2 ?  false : true;
    }

}
