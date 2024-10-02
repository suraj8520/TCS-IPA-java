/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 * 
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */

import java.util.*;

public class OccurrenceOfString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String word = sc.nextLine().toLowerCase();
        String[] words = input.split("\\s+");

        int count = 0;
        for(String w: words){
            //** contains() contains causes issue e.g., it will count for homeloan when we are searching for home */
            if(w.equals(word)) count++;
        }

        System.out.println(count);

        sc.close();
    }
}
