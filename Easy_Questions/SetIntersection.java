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

        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr1[i] == arr2[j]){
                    intersection.add(arr1[i]);
                    // ^ to make sure that we don't add elements multiple time
                    break;
                }
            }
        }

        System.out.println(intersection.toString());
        sc.close();
    }

}