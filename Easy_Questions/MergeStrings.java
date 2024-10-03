/* Marge two strings using comma

Input: 
Arijit,Ghosh
Pop:Mom

Output:
Arijit, Ghosh, Pop:Mom
*/

import java.util.Scanner;

public class MergeStrings{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        //***  String.join("characterUsedToJoin", iterable or elements separated by comma) */
        String result = String.join( ", ",input1, input2);
        String result2 = input1 + ", " + input2;
        System.out.println(result);
        System.out.println(result2);
        sc.close();
    }
}