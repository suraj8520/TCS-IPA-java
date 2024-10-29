/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */

import java.util.*;

class RemoveConsecutiveLetters{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for(int i = 0; i < input.length(); i++){
            if(result == "" || result.charAt(result.length()-1) != input.charAt(i)){
                result += input.charAt(i);
            }
        }

        System.out.println(result);

        sc.close(); 
    }
}