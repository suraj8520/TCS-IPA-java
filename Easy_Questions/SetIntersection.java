// intersection of two given sets.
import java.util.*;

public class SetIntersection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for(int i = 0; i< m; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }


        sc.close();
    }

}