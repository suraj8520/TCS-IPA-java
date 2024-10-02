// Find the first non repeated character substring
//Arijit = Arij

import java.util.Scanner;

public class NonRepeatedCharacterSubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String result = "";
        //** this is one method. another would be to use hashmap (but it doesn't support primitive directly*/
        for(int i = 0; i < word.length(); i++){
            String ch = word.substring(i, i+1);
            ///** .charAt() can be used as well. "" + .charAt() to get string. */
            if(result.contains(ch)) break;
            result += ch;
        }

        System.out.println(result);
        sc.close();
    }
}