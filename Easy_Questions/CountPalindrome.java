/* Find the palindrome words from the sentence and print them and also count
 * 
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 * 
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */

import java.util.*;

class CountPalindrome{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayList<String> palindrome = new ArrayList<>();
        String[] words = input.split("\\s+");
        for(int i = 0; i < words.length; i++){  
            if(isPalindrome(words[i])){
                palindrome.add(words[i]);
            }
        }   

        for(String pal: palindrome){
            System.out.println(pal);
        }
        System.out.println(palindrome.size());
        sc.close();
    }

    public static boolean isPalindrome(String word){
        int n = word.length();
        for(int i = 0, j = n-1; i < j; i++, j--){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }
}