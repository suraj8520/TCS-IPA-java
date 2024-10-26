/* Find maximum prime from diagonals of a matrix
 * 7 8 9
 * 4 5 6
 * 1 2 3
 * Max prime of two diagonal = 7
 */

import java.util.*;
public class MaxPrimeInDiagonal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxPrime = -1;
        for(int i = 0; i < n; i++){
            if(isPrime(matrix[i][i])){
                maxPrime = Math.max(maxPrime, matrix[i][i]);
            }
            if(isPrime(matrix[i][n-i-1])){
                maxPrime = Math.max(maxPrime, matrix[i][n-i-1]);
            }
        }

        System.out.println(maxPrime);
        sc.close();
    }

    public static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
