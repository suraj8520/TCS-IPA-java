/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 
 * Output:
 ---------------
   1

 * Input2:
 ----------------
   Carrot
   z

 * Output:
  --------------
   NA
 */

 import java.util.Scanner;

 public class FindCharIndex{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.next().charAt(0);
        int index = -1;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        System.out.println((index == -1 ? "NA" : index));
        sc.close();
    }
 }