/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.Scanner;
public class CountWordVowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //** another method would be to use for loop and do it manually */
        String[] words = input.split("\\s+");
        
        int count = 0;

        // for(String word: words){
        // **   if(isVowel(word.charAt(0))) count++;
        // }

        //** */ This also works.
        for(int i = 0; i < input.length() - 1; i++){
            if(i == 0 || input.charAt(i) == ' ' && isVowel(input.charAt(i+1))) count++;
        }

        System.out.println(count);     
        sc.close();
    }

    public static boolean isVowel(char ch){
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'u':
            case 'U':
                return true;
        }

        return false;
    }
}