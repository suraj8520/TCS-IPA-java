/* Find the occurance of each character in a string
 * Input: Hello world
 * Output:
 *  H: 1
    e: 1
    l: 3
    o: 2
    w: 1
    r: 1
    d: 1
*/
import java.util.*;
public class CharOccurrence {

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0;i < input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }else{
                map.put(input.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> e: map.entrySet()){
            Character lower = Character.toLowerCase(e.getKey());
            if(lower >= 'a' && lower <= 'z'){
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }   

        sc.close();
    }
}
