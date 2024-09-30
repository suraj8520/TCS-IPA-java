/** Count number of vowel, consonants and digit into a string */
import java.util.Scanner;

public class CountVCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int vowelCount = 0, digitCount = 0, consonantsCount = 0;
        for(int i = 0; i < input.length(); i++){
            String type = getType(input.charAt(i));

            if(type.equals("digit")) digitCount++;
            if(type.equals("vowel")) vowelCount++;
            if(type.equals("consonants")) consonantsCount++;
        }

        System.out.println(digitCount);
        System.out.println(vowelCount);
        System.out.println(consonantsCount);

        sc.close();
    }

    public static String getType(char ch){
        if(ch >= '0' && ch <= '9'){
            return "digit";
        }
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "vowel";
            else 
                return "consonants";
        }
        return "specialChar";
    }
}
