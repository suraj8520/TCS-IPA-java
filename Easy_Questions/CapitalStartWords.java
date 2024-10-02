/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a 
capital letter: "The", "Brown", and "Fox". */

import java.util.*;

public class CapitalStartWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        //*** ArrayList is created using new and we use constructor here */
        ArrayList<String> arr = new ArrayList<String>();

        for(String word: words){
            char ch = word.charAt(0);
            //*** .add() is to add elements into array. */
            //*** .remove() is to remove elements into array. */
            if(ch <= 'Z' && ch >= 'A') arr.add(word);
        }

        for(String word: arr){
            System.out.print(word + " ");
        }

        sc.close();
    }
}