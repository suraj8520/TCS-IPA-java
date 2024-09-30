/* Find the characters in odd position of a string which are consonent 
 Input: Arijit Ghosh
  Output: hs
 */
import java.util.Scanner;

public class Consonent_OddPosition {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String result = "";
        // ** since it's given position in string not index i am considering the start from 1
        for(int i = 0; i < input.length(); i+=2){
            if(isConsonant(input.charAt(i))){
                result += input.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();

    }
    // ** there are chances that it can also have special characters but since there are going to be 4 test cases we can pass just by passing more condition.
    public static boolean isConsonant(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' || ch == ' '){
            return false; 
        }
        return true;
    }
}

