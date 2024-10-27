/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 * 
 * Input : 123
 * Output : 321
 * 
 * Input : 234
 * Output : Can not reverse
 */


import java.util.Scanner;

public class OddReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n % 2 == 0){
            System.out.println("Can not reverse");
            return;
        }

        // It would've been possible to convert to string
        // then reverse the string 
        // then convert to int
        // but we can't perform reverse onto string class. 
        // It's possible for stringBuilder and stringBuffer.

        int reverse = 0;
        while( n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        
        System.out.println(reverse);
    }
}