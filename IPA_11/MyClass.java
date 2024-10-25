package IPA_11;
import java.util.*;

public class MyClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for(int i = 0; i < 4; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();
            sc.nextLine();
            players[i] = new Player(id, skill, level, points);
        }
        String qSkill = sc.nextLine();
        String qLevel = sc.nextLine();
        sc.close();

        int totalPoints = findPointsForGivenSkill(qSkill, players);
        Player result = getPlayerBasedOnLevel(qLevel, qSkill, players);

        if(totalPoints == 0){
            System.out.println("The given skill is not available");
        }else{
            System.out.println(totalPoints);
        }

        if(result == null){
            System.out.println("No player is available with specified level, skill and eligibility points");
        }else{
            System.out.println(result.getId());
        }

    }

    public static int findPointsForGivenSkill(String skill, Player[] players){
        int sum = 0;    
        for(Player p: players){
            if(p.getSkill().equalsIgnoreCase(skill)){
                sum += p.getPoints();
            }
        }  
        return sum;
    }   

    public static Player getPlayerBasedOnLevel(String level, String skill, Player[] players){
        Player result = null;

        for(Player p: players){
            if(p.getLevel().equalsIgnoreCase(level) == false) continue;
            if(p.getSkill().equalsIgnoreCase(skill) == false) continue;
            if(p.getPoints() >= 20){
                result = p;
                break;
            }
        }

        return result;
    }
}
