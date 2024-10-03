import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter integer " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }   
        int min = arr[0], max = arr[0];
        for(int i = 1; i < n; i++){
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        //** Integer.MAX_VALUE && Integer.MIN_VALUE can be used if array is not being used. */
        System.out.println("Smallest integer: " + min);
        System.out.println("Largest integer: " + max);

        sc.close();
    }

}
