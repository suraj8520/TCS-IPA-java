
public class Student{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    Student(int rollNo, String name, String branch, double score, boolean dayScholar){
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public void setScore(double score){
        this.score = score;
    }

    public void setDayScholar(boolean dayScholar){
        this.dayScholar = dayScholar;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public String getBranch(){
        return branch;
    }

    public double getScore(){
        return score;
    }

    public boolean getDayScholar(){
        return dayScholar;
    }
}
