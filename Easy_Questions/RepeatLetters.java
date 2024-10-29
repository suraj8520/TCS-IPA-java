//* a2b3c1 =  aabbbcc */

import java.util.*;

class RepeatLetters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for(int i = 0; i < input.length(); i += 2){
            char ch = input.charAt(i);
            // Since parseInt takes strings
            // can also use String.valueOf to convert into string.
            int times = Integer.parseInt(input.charAt(i+1) + "");
            for(int j = 1; j <= times; j++){
                result += ch;
            }
        }

        System.out.println(result);
        sc.close();
    }
}