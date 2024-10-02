/* Find first letter of each word in a string 
    Input : Kalyani Govt. Eng. College
    Output : KGEC
*/ 

import java.util.Scanner;

public class ShortForm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        String shortForm = "";
        for(String word: words){
            shortForm += word.charAt(0);
        }
        System.out.println(shortForm.toUpperCase());
        sc.close();
    }
}