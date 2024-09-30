/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/
import java.util.Scanner;

public class OddPlaceChars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = "";
        for(int i = 1; i < input.length(); i += 2){
            result += input.charAt(i);
        }
        System.out.println(result);
        sc.close();
    }
}
