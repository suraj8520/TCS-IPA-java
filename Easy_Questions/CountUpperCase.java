/* Find number of upper case in a string
 * AriJIt = 3
 */
import java.util.Scanner;
public class CountUpperCase {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch >= 'A' && ch <= 'Z') count++;
        }
        System.out.println(count);
        sc.close();
    }
}
