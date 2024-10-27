/**
 * We have to find if the number is perfect square or not.
 */

// Simple and straightforward answer would be to take sqrts
// convert it to int
// and then multiply it and check if that is similar to the number or not.
import java.util.*;
public class PerfectSquare{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(isPerfectSquare1(n)){
            System.out.println("Perfect Square (Approach 1)");
        }else{
            System.out.println("Not perfect Square(Approach 1)");
        }

        if(isPerfectSquare2(n)){
            System.out.println("Perfect Square(Approach 2)");
        }else{
            System.out.println("Not perfect Square(Approach 2)");
        }
    }
    // This approach is using normal approach
    public static boolean isPerfectSquare1(int n){
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    // this approach uses binary search.
    public static boolean isPerfectSquare2(int n){
        int low = 1, high = n;

        while(low <= high){
            int mid = (low + high)/2;
            if( mid * mid == n){
                return true;
            }else if(mid * mid > n){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return false;
    }
}