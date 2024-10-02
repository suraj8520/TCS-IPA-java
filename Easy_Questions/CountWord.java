/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word
Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/
import java.util.Scanner;
public class CountWord{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // This method doesn't work properly in case of multiple spaces.
        //** to split by literal *, we have to escape using two backslashes cause backslash is also an escape character in java. */
        //** \s -> means any space(tab, newline space) '\' can't be used directly in java. it is used to escape character and \ is written as \\ so we get \\s and + is for making sure that any space that preceeds it will be skipped as well. */
        String[] words = input.split("\\s+");
        System.out.println(words.length);
        
        // int count = 0;
        // for(int i = 0; i < input.length()-1; i++){
        //     if(input.charAt(i) != ' ' && input.charAt(i+1) == ' ') count++;
        // }
        // if(input.charAt(input.length() - 1) != ' ') count++;
        // System.out.println(count);
        sc.close();
    }
}