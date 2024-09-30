// aabbbccc = a2b3c3
import java.util.Scanner;

//** StringBuilder comes with append function which can be used to solve this instead of the method that i used. */
public class CharRepeat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        if(word.isEmpty()) {
            System.out.println("Empty String provided.");
        }
        String result = "" + word.charAt(0);
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(result.charAt(result.length()-1) == word.charAt(i)){
                count++;
            }else{
                result = result + count + word.charAt(i);
                count = 1;
            }
        }
        result += count;
        System.out.println(result);
    }
}