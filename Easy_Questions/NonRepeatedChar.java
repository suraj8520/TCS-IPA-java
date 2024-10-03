/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"
*/

import java.util.Scanner;

public class NonRepeatedChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            boolean repeated = false;
            for(int j = 0; j < input.length(); j++){
                if(i != j && input.charAt(i) == input.charAt(j)){
                    repeated = true;
                    break;
                }
            }
            if(repeated == false){
                System.out.println(input.charAt(i));
                break;
            }
        }     
        sc.close();
    }
}