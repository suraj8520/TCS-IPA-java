package IPA_11;

public class Player {
    private int id;
    private String skill;
    private String level;
    private int points;

    Player(int id, String skill, String level, int points){
        this.id = id;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    void setId(int id){
        this.id = id;
    }

    void setSkill(String skill){
        this.skill = skill;
    }
    void setLevel(String level){
        this.level = level;
    }

    void setPoints(int points){
        this.points = points;
    }

    int getId(){
        return id;
    }

    int getPoints(){
        return points;
    }

    String getSkill(){
        return skill;
    }

    String getLevel(){
        return level;
    }
}   
