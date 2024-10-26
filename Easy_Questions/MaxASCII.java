/* Find the Maximum Ascii valued character in a String
 * Arijit = t
 * priyanka = y
 * Aa = a
 */

import java.util.Scanner;

public class MaxASCII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char max = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) > max){
                max = input.charAt(i);
            }
        }

        System.out.println(max);
        sc.close();
    }
}
