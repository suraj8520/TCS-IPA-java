import java.util.*;

public class LargestWord{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        String largestWord = words[0];
        for(int i = 1; i < words.length; i++){
            if(largestWord.length() < words[i].length()) largestWord = words[i];
        }
        System.out.println(largestWord);
        sc.close();
    }

}