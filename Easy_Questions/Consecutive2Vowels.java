/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "eating" and "meatballs".
 */
import java.util.Scanner;
public class Consecutive2Vowels {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int newCount = 0;
        boolean isPreviousVowel = false;

        //** MY METHOD */
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(isPreviousVowel) {
                    newCount++; 
                    isPreviousVowel = false;
                    while(i < input.length() && input.charAt(i) != ' ' ){
                        i++;
                    }
                }else isPreviousVowel = true;
            }else{
                isPreviousVowel = false;
            }
        }
        System.out.println(newCount);

        //** BETTER APPROACH */
        //** Like JS it has split function and even if it wasn't there even then it would've been by using loop.*/
        String[] words = input.split(" ");
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j < word.length() - 1; j++){
                if(isVowel(word.charAt(j)) && isVowel(word.charAt(j+ 1))){
                    count++;
                    break;
                }
            }
        }
        //*** use above method for exam */

        System.out.println(count);
        sc.close();
    }

    public static boolean isVowel(char ch){
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}
